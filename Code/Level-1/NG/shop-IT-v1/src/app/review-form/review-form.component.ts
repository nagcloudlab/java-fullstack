import { Component, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-review-form',
  templateUrl: './review-form.component.html',
  styleUrls: ['./review-form.component.css']
})
export class ReviewFormComponent implements OnInit {


  @Output("new-review")
  newReview = new EventEmitter()

  author = ""
  stars = 5
  body = ""

  constructor() { }

  ngOnInit(): void {
  }

  isFormOpen = false

  toggleIsFormOpen() {
    this.isFormOpen = !this.isFormOpen
  }

  handleSubmit(event: Event) {
    let review = {
      author: this.author,
      stars: this.stars,
      body: this.body
    }
    this.newReview.emit(review)
    this.toggleIsFormOpen()
  }

}
