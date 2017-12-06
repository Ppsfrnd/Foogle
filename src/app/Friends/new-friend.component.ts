import { Component } from '@angular/core'
import { Friend } from './friend'


import { FriendService } from './friend.service'
import { Router } from '@angular/router'
@Component({
    templateUrl: './new-friend.component.html',
    styleUrls: ['./new-friend.component.css']
})
export class NewFriendComponent {
    showForm: boolean = false;
    showView: boolean = false;
    value:boolean=false;
    firstName: string
    lastName: string
    contactNumber: number
    mailId: string
    designation: string
    homeTown: string
    collegeName: string
    companyName: string
    companyLocation: string
    inputId: number;
    addedFriend: Friend;
    constructor(private _friendService: FriendService, private _route: Router) {

    }


    showAddForm() {
        this.showView = false;
        this.showForm = true;

    }
    showViewForm() {
        this.showForm = false;
        this.showView = true;
    }

    onClickAdd() {

        debugger
        let friend = new Friend(0, this.firstName, this.lastName, this.contactNumber, this.mailId, this.designation, this.homeTown, this.collegeName, this.companyName, this.companyLocation);
        this.reset();
        this._friendService.addFriend(friend).subscribe(friend_copy => this.addedFriend = friend_copy);
        this.showForm = false;

    }
    alert() {
        if (this.addedFriend.id != 0) {
            alert("Successfully Added !!! \n Your Id:" + this.addedFriend.id+"\n\n NOTE:Remember Your ID for future references..");
            this.addedFriend = null;
        }else{
            alert(" Entered Contact Number or Email ID Already Exist ......Adding Failed!!!");
            this.addedFriend = null;
        }
        
    }
    reset() {

        this.firstName = null;
        this.lastName = null;
        this.contactNumber = null;
        this.mailId = null;
        this.designation = null;
        this.homeTown = null;
        this.collegeName = null;
        this.companyName = null;
        this.companyLocation = null;
    }





}
