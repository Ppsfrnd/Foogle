import { Component } from '@angular/core';

@Component({
  selector: 'pm-root',
  template: `
  <nav class="navbar navbar-default">
    <div class="container-fluid">
      <ul class="nav nav-tabs">
        <li><a data-toggle="tab" [routerLink]="['/welcome']">Home</a></li> 
        <li><a  data-toggle="tab" [routerLink]="['/search']">SearchFriends</a></li>
        <li><a data-toggle="tab" [routerLink]="['/app']">Friend</a></li>
     </ul>
    </div>
  </nav>
 
  <div>
      <router-outlet></router-outlet>
  </div>
  `

})
export class AppComponent {
  
}
