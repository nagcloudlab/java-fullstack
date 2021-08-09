import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class GreetingService {

  constructor(private httpClient:HttpClient) { }

  getMessage(lang:string){
    return this.httpClient.get(`http://65.1.106.243:8181/api/greeting/${lang}`,{
     responseType:'text'
    })
  }

}
