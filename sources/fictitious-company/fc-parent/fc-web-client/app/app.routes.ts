import { provideRouter, RouterConfig } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { LayoutComponent } from './components/layout/layout.component';

const routes: RouterConfig = [
  { path: 'layout', component: LayoutComponent },
  { path: '**', component: LoginComponent }
];

export const appRouterProviders = [
  provideRouter(routes)
];