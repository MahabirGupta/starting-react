import { Component } from '@angular/core';
// create a typescript class
// use export so that can import in other files
@Component({
  // every @Component must have a view template
  selector: 'app-header',
  // template: '<h3>eKart</h3>',
  templateUrl: './header.component.html',
  // styles: [
  //   'a{text-decoration:none; margin:0 10px;}',
  //   'button{padding: 10px 20px;}',
  //   '.ekart--header{width: 100%; height:70px}',
  // ]
  styleUrls: ['./header.component.css'],
})
export class HeaderComponent {}
