import { Component  } from '@angular/core';

import { SearchComponent } from '../sidebar/search/search.component';

@Component({
  selector: 'fc-sidebar',
  moduleId: module.id,
  templateUrl: './sidebar.component.html',
  directives: [ SearchComponent ]
})
export class SidebarComponent {

}
