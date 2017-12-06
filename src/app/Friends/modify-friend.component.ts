import { Component, OnInit } from '@angular/core'
import { ActivatedRoute, Router } from '@angular/router'

import { Friend } from './friend'
import { FriendService } from './friend.service'
@Component({
    templateUrl: './modify-friend.component.html',
    styleUrls: ['./modify-friend.component.css']
})
export class ModifyFriend implements OnInit {

    viewFriend: Friend;
   
    deletedFriend: Friend;
    updatedFriend: Friend;
    //={
    //     id:0,
    //     firstName:"hi",
    //     lastName:"hi",
    //     contactNumber:0,
    //     mailId:"q",
    //     designation:"",
    //     homeTown:"",
    //     collegeName:"",
    //     companyLocation:"",
    //     companyName:""
    // };

    edit: boolean = false;
    viewDetails: boolean = true;
    id: number;


    constructor(private _route: ActivatedRoute, private _friendService: FriendService, private _router: Router) { }
    ngOnInit(): void {
        this.id = +this._route.snapshot.paramMap.get('id');

        this.displayFriend(this.id);
       
       

    }
    displayFriend(id) {
        this._friendService.getFriend(id).subscribe(friend => setTimeout(()=>this.viewFriend= friend,0));
    }


    enableEdit(): void {
        this.edit = true;
        this.viewDetails = false;
    }

    deleteFriend() {
        this._friendService.deleteFriend(this.id).subscribe(friend => this.deletedFriend = friend);

    }
    save() {

       // let newFriend = new Friend(this.viewFriend.id, this.viewFriend.firstName, this.viewFriend.lastName, this.viewFriend.contactNumber, this.viewFriend.mailId, this.viewFriend.designation, this.viewFriend.homeTown, this.viewFriend.collegeName, this.viewFriend.companyName, this.viewFriend.companyLocation);
        this._friendService.updateFriend(this.viewFriend).subscribe(friend => this.updatedFriend = friend);

    }

    redirectToFriend() {
        this._router.navigate(['/app']);
    }

    alertNoRecordsFound() {

        alert("OOPS!!..No Records Found!");
    }
    alertForDeletion() {
        if (this.deletedFriend.id) {
            alert("ID:" + this.deletedFriend.id + " Deleted Successfully");
            this.deletedFriend = null;
          this.redirectToFriend();
        }
        else {
            alert("OOPS!!!...Deletion Failed");
        }

    }
    alertForUpdation() {
        if (this.updatedFriend.id) {
            alert("ID:" + this.updatedFriend.id + " Updated Successfully");
            this.updatedFriend = null;
            this.redirectToFriend();
        }
        else {
            alert("OOPS!!!...Updation Failed");
            this.updatedFriend = null;
        }
    }
    alertForView(){
        if (!this.viewFriend.id) {
            alert("Records for  ID:" +this.id + " Not Found");
            this.viewFriend=null ;
            this.redirectToFriend();
        }
       
    }

}