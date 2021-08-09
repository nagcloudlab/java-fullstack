import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http'
import { AppComponent } from './app.component';
import { GreetingBoxComponent } from './greeting-box/greeting-box.component';
import { GreetingMessageComponent } from './greeting-message/greeting-message.component';

@NgModule({
  declarations: [
    AppComponent,
    GreetingBoxComponent,
    GreetingMessageComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
