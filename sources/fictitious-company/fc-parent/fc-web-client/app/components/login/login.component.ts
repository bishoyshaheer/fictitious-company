import { Component  } from '@angular/core';
import { Router } from '@angular/router';
import { Response } from '@angular/http';

import { UserLogins } from './user-logins';
import { LoginService } from './login.service';
import { LayoutComponent } from '../layout/layout.component';

@Component({
  selector: 'fc-login',
  moduleId: module.id,
  templateUrl: './login.component.html',
  // template: `sdafklnaklkdjgl;kkjadgl;h`,
  // directives: [ROUTER_DIRECTIVES],
  providers: [
    // ROUTER_PROVIDERS, 
    LoginService
  ]
})
export class LoginComponent {
  userLogins: UserLogins = { username: '110', password: 'password' };

  constructor(private loginService: LoginService, private router: Router) { 
  }

  clicked(event, userLogin) {
    event.preventDefault();
      // this.router.navigateByUrl('/layout');
    var prom = this.loginService.getUser(userLogin).then(function(data: Response) {
      console.log(data.json());
    });
  }
}
