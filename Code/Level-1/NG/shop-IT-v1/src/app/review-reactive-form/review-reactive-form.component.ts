import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

/*


  how to wotk with Reactive form module ?

  step-1 : create form-group with form-control(s)
  step-2 : bind form-group and form controls with template elements
  step-3 : watch form-controls, we can react to that

  react means,

    -> validating form fields
    -> comminicate with server, suggestions
    -> pre-fill other form fields


*/

@Component({
  selector: 'app-review-reactive-form',
  templateUrl: './review-reactive-form.component.html',
  styleUrls: ['./review-reactive-form.component.css']
})
export class ReviewReactiveFormComponent {


  reviewFormGroup = this.fb.group({
    author: ['', [Validators.required, Validators.minLength(3)]],
    stars: ["5"],
    body: ['', [Validators.required, Validators.maxLength(250)]]
  });

  @Output("new-review")
  newReview = new EventEmitter()

  isFormOpen = false

  constructor(private fb: FormBuilder) { }


  toggleIsFormOpen() {
    this.isFormOpen = !this.isFormOpen
  }

  handleSubmit(event: Event) {
    if (this.reviewFormGroup.valid) {
      let review = this.reviewFormGroup.value
      this.newReview.emit(review)
      this.reviewFormGroup.reset()
      this.toggleIsFormOpen()

    }
  }

}
