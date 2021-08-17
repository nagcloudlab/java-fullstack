import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormArray, Validators } from '@angular/forms';

@Component({
  selector: 'app-user-profile-form',
  templateUrl: './user-profile-form.component.html',
  styleUrls: ['./user-profile-form.component.css']
})
export class UserProfileFormComponent implements OnInit {


  profileFormGroup: FormGroup = this.fb.group({
    name: ['Nag', [Validators.required]],
    email: ['nag@example.com', [Validators.required, Validators.email]],
    mobile: ['9945674228', [Validators.required, Validators.pattern(/\d{10}/)]],
    skills: this.fb.array([])
  });


  get skills(){
    return this.profileFormGroup.controls['skills'] as FormArray
  }

  handleSubmit(event: any) {
    if (this.profileFormGroup.valid) {
      console.log(this.profileFormGroup.value);
    }
  }


  addNewSkill() {
    const skillForm: FormGroup = this.fb.group({
      name: [''],
      exp: [0]
    })
    this.skills.push(skillForm)
  }


  removeSkill(idx:number) {
    this.skills.removeAt(idx)
  }

  constructor(private fb: FormBuilder) { }

  ngOnInit(): void {
  }

}
