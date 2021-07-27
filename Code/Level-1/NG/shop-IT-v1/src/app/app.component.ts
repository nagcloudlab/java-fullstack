import { Component } from '@angular/core'
import { ItemsService } from './items.service'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  // providers: [ItemsService]
})
export class AppComponent {
  title = 'shop-IT-v1'

  items: Array<any> = []

  isCartOpen: boolean = false

  // itemsService: ItemsService = new ItemsService() // Never do

  // private itemsService: ItemsService;
  // constructor(itemserService: ItemsService) {
  //   this.itemsService = itemserService;
  // }

  // or

  // cdi
  constructor(private itemsService: ItemsService) {}

  ngOnInit() {
    this.items = this.itemsService.getItems()
  }

  toggleCart() {
    this.isCartOpen = !this.isCartOpen
  }
}
