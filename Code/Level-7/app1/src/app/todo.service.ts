import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TodoService {

  apiUrl = "http://localhost:8080/api/todos"

  constructor(private httpClient: HttpClient) { }

  getTodos() {
    return this.httpClient.get(this.apiUrl,{headers:{
      'Authorization':'Bearer '+localStorage.getItem("Auth-Token")
    }})
  }

}
