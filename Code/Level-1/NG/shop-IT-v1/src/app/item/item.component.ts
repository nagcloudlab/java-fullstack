import { Component, Input } from '@angular/core';
import { CartService } from '../cart.service';

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
})
export class ItemComponent {

  @Input("value")
  item: any = {};

  currentTab = 1; //  state

  reviews: Array<any> = [
    { stars: 5, body: 'sample-review-1', author: 'who1' },
    { stars: 1, body: 'sample-review-2', author: 'who2' }
  ]

  constructor(private cartService: CartService) { }

  handleTabChange(event: Event, tabIdx: number) {
    this.currentTab = tabIdx
  }

  isTabSelected(tabIdx: number): boolean {
    return this.currentTab === tabIdx;
  }

  handleBuy(event: any) {
    this.cartService.addToCart(this.item)
  }

}
