import { Component, OnInit } from '@angular/core';
import {AccountsService} from "../accounts.service";

@Component({
  selector: 'app-account-list',
  templateUrl: './account-list.component.html',
  styleUrls: ['./account-list.component.css']
})
export class AccountListComponent implements OnInit {

  accounts:Array<any>=[]

  constructor(private accountService:AccountsService) { }

  ngOnInit(): void {
    this.accountService.loadAccounts()
      .subscribe({
        next:(response:any)=>{
          this.accounts=response;
          console.log(this.accounts)
        }
      })
  }

}
