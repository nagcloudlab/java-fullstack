import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {


  apiUrl = 'http://localhost:8080/auth'

  constructor(private httpClient: HttpClient) { }

  doAuth(credentials: any) {
    return this.httpClient.post(this.apiUrl, credentials)
  }

}
