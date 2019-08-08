import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ItemService } from 'src/app/Servises/itemServices/item.service';
import { Item } from 'src/app/Beans/Item';

@Component({
  selector: 'app-item-detail',
  templateUrl: './item-detail.component.html',
  styleUrls: ['./item-detail.component.css']
})
export class ItemDetailComponent implements OnInit {

  public href: String = "";
  constructor(private router: Router,private itemService:ItemService) { }
  currentItem:Item;

  

  addToCart(){
    console.log("Works");
  }
  
  ngOnInit() {
    this.href = this.router.url;
    let split=this.href.split("/item/",2);
    
        console.log(split[1]);
        this.itemService.getItemById(split[1])
        .subscribe(item=>this.currentItem=item);
  }

}
