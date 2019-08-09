import { Injectable } from '@angular/core';
import { Item } from 'src/app/Beans/Item';

@Injectable({
  providedIn: 'root'
})


export class CartServiceService {

   cartList:Item[];
  constructor() { }

  seeItemList():Item[]{
    this.cartList=JSON.parse(localStorage.getItem("cartList"));
    return this.cartList;
  }

  addToList(item:Item):Item[]{
    this.cartList.push(item);
    localStorage.setItem("cartList",JSON.stringify(this.cartList));
    return this.cartList;
  }

  deleteFromList(id:number):Item[]{
    this.cartList=JSON.parse(localStorage.getItem("cartList"));
    for(let i=0;i<this.cartList.length;i++){
      let currentIteratedItem=this.cartList[i];
      if(currentIteratedItem.productId===id){
        this.cartList.splice(i,1);
      }
    }
    localStorage.setItem("cartList",JSON.stringify(this.cartList));
    return this.cartList;
  }

  clearList():Item[]{
    this.cartList=JSON.parse(localStorage.getItem("cartList"));
    this.cartList.splice(0,this.cartList.length);
    localStorage.setItem("cartList",JSON.stringify(this.cartList));
    return this.cartList;

  }

  getElementsInCartList():number{
    this.cartList=JSON.parse(localStorage.getItem("cartList"));
    return this.cartList.length;
  }



}
