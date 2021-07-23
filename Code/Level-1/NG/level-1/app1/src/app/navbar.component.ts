import { Component,Input } from "@angular/core";


@Component({
    selector: 'app-navbar',
    template: `
        <hr />
            <div>{{title}}</div>
        <hr />
    `,
    styles: []
})
export class NavbarComponent {

    @Input()
    title:string="Unknown"

}
