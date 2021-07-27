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
}
