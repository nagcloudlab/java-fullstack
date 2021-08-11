import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-item-list',
  templateUrl: './item-list.component.html',
  styleUrls: ['./item-list.component.css']
})
export class ItemListComponent implements OnInit {

  itemsType: string | null = "unknown"
  items: Array<any> = [];

  constructor(
    private activatedRoute: ActivatedRoute,
    private httpClient: HttpClient
  ) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe(params => {
      this.itemsType = params.get("itemsType")

      this.httpClient.get(`http://localhost:8080/api/products?type=${this.itemsType}`)
        .subscribe((response: any) => {
          this.items = response
        })

    })
  }

}
