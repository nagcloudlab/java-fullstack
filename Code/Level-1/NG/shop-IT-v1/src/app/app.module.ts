import { NgModule } from '@angular/core'
import { BrowserModule } from '@angular/platform-browser'
import { RouterModule, Routes } from '@angular/router'
import { HttpClientModule } from '@angular/common/http'

import { AppComponent } from './app.component'
import { Navbar } from './navbar/navbar.component'
import { ItemComponent } from './item/item.component'
import { ReviewComponent } from './review/review.component'
import { CartBadge } from './cart-badge/cart-badge.component'
import { PriceDiscountPipe } from './price-discount.pipe'
import { HighlightDirective } from './highlight.directive'
import { CartViewComponent } from './cart-view/cart-view.component'
import { HomeComponent } from './home/home.component'
import { ItemListComponent } from './item-list/item-list.component'
import { NotFoundComponent } from './not-found/not-found.component'
// import { ItemsService } from './items.service';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'items', component: ItemListComponent },
  { path: 'cart', component: CartViewComponent },
  { path: '**', component: NotFoundComponent },
]

@NgModule({
  declarations: [
    AppComponent,
    Navbar,
    ItemComponent,
    ReviewComponent,
    CartBadge,
    CartViewComponent,
    HomeComponent,
    ItemListComponent,
    PriceDiscountPipe,
    HighlightDirective,
    NotFoundComponent,
  ],
  imports: [BrowserModule,HttpClientModule,RouterModule.forRoot(routes)],
  // providers: [ItemsService],
  bootstrap: [AppComponent],
})
export class AppModule {}
