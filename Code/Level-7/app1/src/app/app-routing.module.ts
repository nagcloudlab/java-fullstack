import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginFormComponent } from './login-form/login-form.component';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { DashboardComponent } from './dashboard/dashboard.component';
import { AuthGuardGuard } from './auth-guard.guard';


const routes: Routes = [
  { path: '', pathMatch: "full", redirectTo: 'login' },
  { path: 'login', component: LoginFormComponent },
  { 
    path: 'dashboard', 
    component:  DashboardComponent,
    canActivate:[AuthGuardGuard]
  }
];

@NgModule({
  declarations: [
    LoginFormComponent,
    DashboardComponent,
  ],
  imports: [
    CommonModule,
    HttpClientModule,
    ReactiveFormsModule,
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
