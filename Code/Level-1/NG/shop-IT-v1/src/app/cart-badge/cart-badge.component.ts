import { Component, Input } from "@angular/core";
import { CartService } from "../cart.service";


@Component({
    selector: 'app-cart-badge',
    template: `
    
    <hr />
    <span class="badge bg-dark">
        {{count}}
    </span>
    item(s) in cart
    <hr />
    
    `
})
export class CartBadge {

    @Input("value")
    count = 0;

    constructor(private cartService: CartService) { }

    // Attn: dont-use like this 
    ngDoCheck() {
        this.count = this.cartService.cart.length;
    }

}