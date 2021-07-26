import { Component, Input } from "@angular/core";


@Component({
    selector:'app-cart-badge',
    template:`
    
    <hr />
    <span class="badge bg-dark">
        {{count}}
    </span>
    item(s) in cart
    <hr />
    
    `
})
export class CartBadge{

    @Input("value")
    count=0;

}