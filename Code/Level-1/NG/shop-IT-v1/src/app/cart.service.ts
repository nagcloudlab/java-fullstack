import { Injectable } from '@angular/core'

import { Subject } from 'rxjs'

@Injectable({
  providedIn: 'root',
})
export class CartService {
  cart: Array<any> = []

  cartCountStream: Subject<number> = new Subject()

  constructor() {}

  addToCart(item: any) {
    this.cart.push(item)
    this.cartCountStream.next(this.cart.length)
  }
}
