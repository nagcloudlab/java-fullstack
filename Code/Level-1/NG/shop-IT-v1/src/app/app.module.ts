import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { Navbar } from './navbar/navbar.component';
import { ItemComponent } from './item/item.component';
import { ReviewComponent } from './review/review.component';
import { CartBadge } from './cart-badge/cart-badge.component';

@NgModule({
  declarations: [
    AppComponent,
    Navbar,
    ItemComponent,
    ReviewComponent,
    CartBadge
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
