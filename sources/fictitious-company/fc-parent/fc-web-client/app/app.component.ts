import { Component, OnInit } from '@angular/core';
import { Routes, ROUTER_DIRECTIVES, ROUTER_PROVIDERS, Router } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { LayoutComponent } from './components/layout/layout.component';

@Component({
  selector: 'fc-app',
  template: `<router-outlet></router-outlet>`,
  directives: [ROUTER_DIRECTIVES],
  providers: [
    ROUTER_PROVIDERS
  ]
})
@Routes([
  {
    path: '/login',
    component: LoginComponent
  },
  {
    path: '/layout',
    component: LayoutComponent
  }
])
export class AppComponent implements OnInit {
  title = 'Fictitious Company';
  constructor(private router: Router) { }
  ngOnInit() {
    this.router.navigateByUrl('/login');
  }
}
