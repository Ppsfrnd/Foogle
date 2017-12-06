import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router'
import { FormsModule } from '@angular/forms'
import { HttpModule } from '@angular/http'

import { NewFriendComponent } from './new-friend.component'
import { ModifyFriend } from './modify-friend.component'


import { FriendService } from './friend.service'

@NgModule({
  declarations: [
    NewFriendComponent, ModifyFriend
  ],
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule,
    RouterModule.forChild([
      { path: 'app/add', component: NewFriendComponent },
      { path: 'app', component: NewFriendComponent },
      { path: 'app/display/:id', component: ModifyFriend }
    

    ])
  ],
  providers: [FriendService],
  bootstrap: []
})
export class FriendModule {

}