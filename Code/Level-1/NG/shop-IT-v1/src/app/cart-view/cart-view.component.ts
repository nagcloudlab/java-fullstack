import { Component, OnInit } from '@angular/core'
import { CartService } from '../cart.service'

@Component({
  selector: 'app-cart-view',
  templateUrl: './cart-view.component.html',
  styleUrls: ['./cart-view.component.css'],
})
export class CartViewComponent implements OnInit {
  constructor(private cartService: CartService) {}

  cart: Array<any> = []

  ngOnInit(): void {
    this.cart = this.cartService.cart
  }
}
