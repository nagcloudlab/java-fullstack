import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { UserService } from '../user.service';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {


  loginErrorMessage: string | null = ""

  loginForm: FormGroup = this.fb.group({
    email: ['Nag@example.com', [Validators.required, Validators.email]],
    password: ['', [Validators.required]]
  })


  handleSubmit(event: Event) {
    event.preventDefault()
    if (this.loginForm.valid) {
      const credentials = this.loginForm.value;
      this.userService.doAuth(credentials)
        .subscribe({
          next: (response: any) => {
            this.loginErrorMessage=null;
            localStorage.setItem("Auth-Token", response.jwt)
            this.router.navigate(['dashboard'])
          },
          error: (err: any) => {
            this.loginErrorMessage=err.error.messsage
          }
        })
    }
  }

  constructor(
    private fb: FormBuilder, 
    private userService: UserService,
    private router:Router) { }

  ngOnInit(): void {
  }

}
