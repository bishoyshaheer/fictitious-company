import { Component  } from '@angular/core';
import { Router, ROUTER_DIRECTIVES, ROUTER_PROVIDERS, Routes } from '@angular/router';

import { UserLogins } from './user-logins';
import { LoginService } from './login.service';
import { LayoutComponent } from '../layout/layout.component';

@Component({
  selector: 'fc-login',
  moduleId: module.id,
  templateUrl: './login.component.html',
  providers: [ LoginService, ROUTER_PROVIDERS ],
  directives: [ ROUTER_DIRECTIVES ]
})
@Routes{[
  {
    path: '/layout',
    component: LayoutComponent
  }
]}
export class LoginComponent {
	userLogins: UserLogins = {username:'',password:''};

	constructor(private loginService: LoginService, private router: Router){}

	clicked(event, userLogin) {
    event.preventDefault();
    var prom = this.loginService.getUser(userLogin).then(function (data){
      this.router.navigateByUrl('/layout');
    });
    console.log(prom);
  }
}
