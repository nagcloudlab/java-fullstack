import { Component, Input } from "@angular/core";



@Component({
    selector:"app-navbar",
    template:`
    
    <hr />
    <div>{{title}}</div>
    <hr />
    
    `
})
export class Navbar{

    @Input()
    title:string="";

}