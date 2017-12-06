import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import{FormsModule} from '@angular/forms'
import{RouterModule} from '@angular/router'
import{SearchModule} from './FilterFriends/search-friend.module';
import{FriendModule} from './Friends/friend.module'

import { AppComponent } from './app.component';
import { WelcomeComponent } from './home/welcome.component';

@NgModule({
  declarations: [
    AppComponent,WelcomeComponent
  ],
  imports: [
    SearchModule,
    FormsModule,
    FriendModule,
    BrowserModule,
    RouterModule.forRoot([
      {path:'welcome',component:WelcomeComponent},
      {path:'',redirectTo:'welcome',pathMatch:'full'},
      {path:'**',redirectTo:'welcome',pathMatch:'full'}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
