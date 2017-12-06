import { Component, OnInit } from '@angular/core'
import { SearchFriendService } from './search-friend.service'
import { Friend } from '../Friends/friend'
@Component({
    selector: 'pm-search',
    templateUrl: './search-friend.component.html',
    styleUrls: ['./search-friend.componet.css']

})
export class SearchComponent implements OnInit {
    showFilters: boolean = false;

    companyName: string;
    collegeName: string;
    homeTown: string;
    friends: Friend[];
    showFilter(): void {
        this.showFilters = !this.showFilters;
    }
    constructor(private _service: SearchFriendService) { }
    ngOnInit() {

        this._service.getAll().subscribe(friends => this.friends = friends);
    }


}