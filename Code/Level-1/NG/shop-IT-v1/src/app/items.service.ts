import { Injectable } from "@angular/core";


@Injectable({
    providedIn:'root'
})
export class ItemsService {

    items = [
        {
            id: 1,
            name: 'Laptop',
            price: 1000.00,
            discount: 10,
            currencyCode: 'INR',
            description: 'New Mac pro',
            img_path: 'assets/Laptop.png',
            makeDate: Date.now()
        },
        {
            id: 2,
            name: 'Mobile',
            price: 500.00,
            discount: 30,
            currencyCode: 'INR',
            description: 'New pro',
            img_path: 'assets/Mobile.png',
            makeDate: Date.now()
        }
    ]

    getItems() {
        return this.items;
    }

}