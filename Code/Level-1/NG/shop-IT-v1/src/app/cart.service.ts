import { Injectable } from '@angular/core'

import { Subject } from 'rxjs'

/*

  {
    itemId:cartLine
  }

*/

@Injectable({
  providedIn: 'root',
})
export class CartService {
  cart: any = {}

  cartCountStream: Subject<number> = new Subject()

  constructor() {}

  addToCart(item: any, qty = 1) {
    let id = item.id
    let cartLine = this.cart[id]
    if (cartLine) {
      cartLine = { ...cartLine, qty: cartLine.qty + qty }
    } else {
      cartLine = { item, qty: 1 }
    }
    this.cart[id] = cartLine
    this.cartCountStream.next(Object.keys(this.cart).length)
  }

  deleteCartLine(item: any) {
    delete this.cart[item.id]
    this.cartCountStream.next(Object.keys(this.cart).length)
  }
}
