import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class AccountsService {

  constructor(private httpClient:HttpClient) { }

  loadAccounts(){
   return this.httpClient.get("http://localhost:8080/api/accounts")
  }

}
