import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {


  loginForm: FormGroup = this.fb.group({
    email: ['', [Validators.required, Validators.email]],
    password: ['', [Validators.required]]
  })


  handleSubmit(event: Event) {
    event.preventDefault()
    if (this.loginForm.valid) {
      const credentials = this.loginForm.value;
      this.userService.doAuth(credentials)
    }
  }

  constructor(private fb: FormBuilder,private userService:UserService) { }

  ngOnInit(): void {
  }

}
