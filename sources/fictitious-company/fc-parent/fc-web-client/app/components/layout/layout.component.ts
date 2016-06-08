import { Component  } from '@angular/core';
import { Router } from '@angular/router';

import { TopbarComponent } from '../topbar/topbar.component';
import { SidebarComponent } from '../sidebar/sidebar.component';


@Component({
  selector: 'fc-layout',
  moduleId: module.id,
  templateUrl: './layout.component.html',
  directives: [TopbarComponent, SidebarComponent]
})
export class LayoutComponent {

}
