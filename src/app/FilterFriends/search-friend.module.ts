import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router'

import { FormsModule } from '@angular/forms'
import { HttpModule } from '@angular/http'
import { SearchComponent } from './search-friend.component'
import { FriendFilterPipe } from '../FilterFriends/friend-filter.pipe'

import { SearchFriendService } from './search-friend.service'

@NgModule({
  declarations: [
    SearchComponent, FriendFilterPipe
  ],
  imports: [
    FormsModule,
    HttpModule,
    BrowserModule,
    RouterModule.forChild([
      { path: 'search', component: SearchComponent }
    ])
  ],
  providers: [SearchFriendService],
  bootstrap: []
})
export class SearchModule { }
