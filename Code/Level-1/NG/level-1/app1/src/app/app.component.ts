import { Component } from '@angular/core';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title: string = "shop-IT"

  items: Array<any> = [
    {
      id: 1,
      name: 'Laptop',
      price: 249000,
      description: 'New Mac pro',
      canBuy: true,
      imagePath: 'assets/Laptop.png',
    },
    {
      id: 2,
      name: 'Mobile',
      price: 29000,
      description: 'New pro',
      canBuy: true,
      imagePath:'assets/Mobile.png',
    }
  ]

  currentTab: number = 1

  changeTab(event: Event, tabIndex: number) {
    this.currentTab = tabIndex
  }


}
