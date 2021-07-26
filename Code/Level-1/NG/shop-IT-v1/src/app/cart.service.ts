import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CartService {

  cart: Array<any> = []

  constructor() { }


  addToCart(item: any) {
    this.cart.push(item)
    console.log(this.cart);
  }


}
