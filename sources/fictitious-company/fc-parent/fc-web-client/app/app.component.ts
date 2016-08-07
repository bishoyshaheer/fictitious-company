import { Component, OnInit } from '@angular/core';
import { ROUTER_DIRECTIVES } from '@angular/router';
import { LoginComponent } from './components/login/login.component';

@Component({
  selector: 'fc-app',
  template: `<router-outlet></router-outlet>`,
  directives: [ROUTER_DIRECTIVES],
  precompile: [LoginComponent]
})
export class AppComponent {
  title = 'Fictitious Company';
}
