import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule,Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AccountListComponent } from './account-list/account-list.component';

const routes:Routes=[
  {path:'',component:HomeComponent},
  {path:'accounts',component:AccountListComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AccountListComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
