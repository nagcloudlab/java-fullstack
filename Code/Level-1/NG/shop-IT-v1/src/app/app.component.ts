import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title = 'shop-IT-v1';

  cart: Array<any> = []

  items: Array<any> = [
    {
      id: 1,
      name: 'Laptop',
      price: 1000.00,
      description: 'New Mac pro',
      img_path: 'assets/Laptop.png'
    },
    {
      id: 2,
      name: 'Mobile',
      price: 500.00,
      description: 'New pro',
      img_path: 'assets/Mobile.png'
    }
  ]

  addToCart(item: any) {
    this.cart.push(item)
  }

  handleBuy(event: any) {
    let item = event.item;
    this.addToCart(item)
  }

}
