import { Component } from '@angular/core';
// create a typescript class
// use export so that can import in other files
@Component({
  // every @Component must have a view template
  selector: 'app-header',
  template: '<h3>eKart</h3>',
})
export class HeaderComponent {}
