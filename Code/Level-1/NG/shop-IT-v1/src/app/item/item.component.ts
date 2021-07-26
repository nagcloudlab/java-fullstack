import { Component, Input, Output, EventEmitter, OnInit } from '@angular/core';

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
})
export class ItemComponent {

  @Input("value")
  item: any = {};

  @Output("buy")
  buy = new EventEmitter()


  currentTab = 1; //  state

  reviews: Array<any> = [
    { stars: 5, body: 'sample-review-1', author: 'who1' },
    { stars: 1, body: 'sample-review-2', author: 'who2' }
  ]

  handleTabChange(event: Event, tabIdx: number) {
    this.currentTab = tabIdx
  }

  isTabSelected(tabIdx: number): boolean {
    return this.currentTab === tabIdx;
  }

  handleBuy(event: any) {
    let e = {
      item: this.item
    }
    this.buy.emit(e)
  }

}
