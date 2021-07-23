import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
})
export class ItemComponent {

  @Input("value")
  item: any;

  currentTab: number = 1

  changeTab(event: Event, tabIndex: number) {
    this.currentTab = tabIndex
  }

}
