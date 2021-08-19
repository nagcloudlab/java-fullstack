import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  authToken: string | null = null 

  apiUrl = 'http://localhost:8080/auth'

  constructor(private httpClient: HttpClient) { }

  doAuth(credentials: any) {
    this.httpClient.post(this.apiUrl, credentials)
      .subscribe((response: any) => {
        this.authToken = response.jwt
        localStorage.setItem("Auth-Token",this.authToken?this.authToken:'')
      })
  }

}
