import { Component, OnInit } from '@angular/core';
import { Item } from 'src/app/Beans/Item';
import {ItemService} from 'src/app/Servises/itemServices/item.service';

@Component({
  selector: 'app-carousel',
  templateUrl: './carousel.component.html',
  styleUrls: ['./carousel.component.css']
})
export class CarouselComponent implements OnInit {

  constructor( private itemService:ItemService) { }

  items:Item[];

  ngOnInit() {

    this.itemService.getTopItems()
    .subscribe(items => this.items=items);
  }

}
