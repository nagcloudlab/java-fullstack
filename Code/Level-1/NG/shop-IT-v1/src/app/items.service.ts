import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";

import {map} from 'rxjs/operators'

@Injectable({
    providedIn: 'root'
})
export class ItemsService {

    items = []

    constructor(private httpClient: HttpClient) { }

    getItems() {
        const url = "/assets/data/items.json";
        return this.httpClient.get(url)// async 
    }

    getReviews(itemId: number) {
        const url = "/assets/data/reviews.json";
        return this.httpClient.get(url)
            .pipe(map((response:any)=>response.reviews[itemId]))
    }


}