import { Component } from '@angular/core';

@Component({
  // use as a html tag
  // selector: 'app-top-header',
  // use like a html attribute
  // selector: '[app-top-header]',
  // use as a css class
  // selector: '.app-top-header',
  // use as a css id
  selector: '#app-top-header',
  templateUrl: './top-header.component.html',
  styleUrls: ['./top-header.component.css'],
})
export class TopHeaderComponent {}
