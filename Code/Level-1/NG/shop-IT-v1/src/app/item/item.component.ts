import { Component, Input } from '@angular/core'
import { CartService } from '../cart.service'
import { ItemsService } from '../items.service'

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css'],
})
export class ItemComponent {
  @Input('value')
  item: any = {}

  currentTab = 1 //  state

  reviews: Array<any> = []

  constructor(private cartService: CartService, private itemsService: ItemsService) { }

  handleTabChange(event: Event, tabIdx: number) {
    event.preventDefault()
    this.currentTab = tabIdx
    if (this.currentTab === 3) {
      this.itemsService.getReviews(this.item.id)
        .subscribe((reviews: any) => {
          this.reviews = reviews
        })
    }
  }

  isTabSelected(tabIdx: number): boolean {
    return this.currentTab === tabIdx
  }

  handleBuy(event: any) {
    this.cartService.addToCart(this.item)
  }


  handleNewReview(review: any) {
    this.itemsService.addNewReview(this.item.id,review)
    this.reviews.unshift(review);
  }

}
