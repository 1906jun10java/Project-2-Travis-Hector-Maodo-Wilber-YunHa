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
    this.cartList=JSON.parse(localStorage.getItem("cartList"));
    console.log(this.cartList);
    item.quantityInCart=1;

    if(this.cartList.length===0){
      this.cartList.push(item);
    }
    else{
      for(let i=0;i<this.cartList.length;i++){
        console.log(item.productId);
        console.log(this.cartList[i].productId);
        let counted=false;
        if(item.productId===this.cartList[i].productId){
          item.quantityInCart=this.cartList[i].quantityInCart+1;
          this.cartList[i]=item;
          counted=true;
          break;
        }
        else if(counted===false && i===this.cartList.length-1 ){
          this.cartList.push(item);
        }
      }
    }
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

  getElementsInCartList():number{
    this.cartList=JSON.parse(localStorage.getItem("cartList"));
    return this.cartList.length;
  }



}
