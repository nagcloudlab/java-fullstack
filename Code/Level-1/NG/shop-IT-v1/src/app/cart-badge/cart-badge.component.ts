import { Component, Input } from '@angular/core'
import { CartService } from '../cart.service'

@Component({
  selector: 'app-cart-badge',
  template: `
    <hr />
    <span class="badge bg-dark">
      {{ count }}
    </span>
    item(s) in cart
    <hr />
  `,
})
export class CartBadge {
  count = 0

  constructor(private cartService: CartService) {}

  ngOnInit() {
    this.cartService.cartCountStream.subscribe({
      next: (count) => {
        this.count = count
      },
    })
  }
}
