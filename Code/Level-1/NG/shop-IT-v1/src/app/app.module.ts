import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { Navbar } from './navbar/navbar.component';
import { ItemComponent } from './item/item.component';
import { ReviewComponent } from './review/review.component';
import { CartBadge } from './cart-badge/cart-badge.component';
import { PriceDiscountPipe } from './price-discount.pipe';
// import { ItemsService } from './items.service';

@NgModule({
  declarations: [
    AppComponent,
    Navbar,
    ItemComponent,
    ReviewComponent,
    CartBadge,
    PriceDiscountPipe
  ],
  imports: [
    BrowserModule
  ],
  // providers: [ItemsService],
  bootstrap: [AppComponent]
})
export class AppModule { }
