import { Directive, ElementRef, HostBinding, HostListener, Input } from '@angular/core';

@Directive({
  selector: '[appHighlight]'
})
export class HighlightDirective {


  @Input() appHighlight!: string

  hcolor = "#DEF"
  dcolor = "#FFF"

  @HostBinding('style.backgroundColor')
  backgroundColor!: string;

  @HostListener("mouseenter") // ele.addEventListener('mourseenter',callback)
  mouseenter() {
    this.highlight(this.hcolor)
  }

  @HostListener("mouseleave")
  mouseleave() {
    this.highlight(this.dcolor)
  }

  constructor(private el: ElementRef) {
  }

  ngOnInit() {

    if (this.appHighlight) {
      const obj = JSON.parse(this.appHighlight)
      if (obj.highlightColor) {
        this.hcolor = obj.highlightColor
      }
      if (obj.defaultColor) {
        this.dcolor = obj.defaultColor
      }
    }
    
    this.backgroundColor = this.dcolor

  }

  private highlight(color: string) {
    this.backgroundColor = color;
  }

}
