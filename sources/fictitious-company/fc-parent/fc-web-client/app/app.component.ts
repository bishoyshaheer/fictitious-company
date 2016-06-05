import { Component } from '@angular/core';
import { Routes, ROUTER_DIRECTIVES, ROUTER_PROVIDERS } from '@angular/router';
import { LoginComponent } from './components/login/login.component';

@Component({
  selector: 'fc-app',
  template:  `Loading...`,
  directives: [ROUTER_DIRECTIVES],
  providers: [
    ROUTER_PROVIDERS
  ]
})
@Routes([
  {
    path: '/login',
    component: LoginComponent
  }
])
export class AppComponent {
  title = 'Fictitious Company';
}
