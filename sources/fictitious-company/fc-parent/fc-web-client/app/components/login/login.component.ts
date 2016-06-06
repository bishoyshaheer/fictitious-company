import { Component, Input  } from '@angular/core';
import { Router } from '@angular/router';

import { UserLogins } from './user-logins';
import { LoginService } from './login.service';

@Component({
  selector: 'fc-login',
  moduleId: module.id,
  templateUrl: './login.component.html',
  providers: [ LoginService ]
})
export class LoginComponent {
	@Input()
	userLogins: UserLogins = {username:'',password:''};

	constructor(private loginService: LoginService){}

	clicked(event, userLogin) {
    event.preventDefault();
    console.log(userLogin);
    var prom = this.loginService.getUser(userLogin);
    console.log(prom);
  }
}
