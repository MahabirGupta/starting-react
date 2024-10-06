import { Component } from '@angular/core';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css'],
})
export class ProductListComponent {
  // name: string = 'iphone 13';
  // price: number = 999;
  // color: string = 'Red';
  // creating a product object
  product = {
    name: 'iphone X',
    price: 789,
    color: 'black',
    discount: 8.5,
    inStock: 0,
  };
  getDiscountedPrice() {
    return (
      this.product.price - (this.product.price * this.product.discount) / 100
    );
  }
}
