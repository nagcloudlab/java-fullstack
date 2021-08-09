import { Component, OnInit } from '@angular/core';
import { GreetingService } from '../greeting.service';

@Component({
  selector: 'app-greeting-box',
  templateUrl: './greeting-box.component.html',
  styleUrls: ['./greeting-box.component.css']
})
export class GreetingBoxComponent implements OnInit {

  message: string = "Nil"

  constructor(private greetingService: GreetingService) { }

  ngOnInit(): void {
  }

  getGreetingMessage(lang: string) {
    this.greetingService.getMessage(lang)
      .subscribe({
        next: (message:any) => {
          this.message=message
        }
      })
  }

}
