import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'priceDiscount'
})
export class PriceDiscountPipe implements PipeTransform {

  transform(value: number, ...args: number[]): number {
    if(args.length===0)
    return value-1;
    else{
      // value= 1000, discount=10%
      return (value-args[0])*value/100
    }
  }

}
