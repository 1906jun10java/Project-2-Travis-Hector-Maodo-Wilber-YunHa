import { Component, OnInit } from '@angular/core';
import { ApparelServiceService } from 'src/app/Servises/apparelService/apparel-service.service';
import { Observable } from 'rxjs';
import { Item } from 'src/app/Beans/Item';

@Component({
  selector: 'app-apparel',
  templateUrl: './apparel.component.html',
  styleUrls: ['./apparel.component.css']
})
export class ApparelComponent implements OnInit {

  constructor(private apparelServiceService:ApparelServiceService) { }

  colors:String[];
  types:String[];
  sizes:String[];
  items:Item[];
  currentColor:String='*';
  currentType:String='*';
  currentSize:String='*';
  currentGender:String='unisex';

  change(){
    this.apparelServiceService.getItems(this.currentColor,this.currentGender,this.currentType,this.currentSize)
    .subscribe(items=>this.items=items);
  }


  ngOnInit() {
    this.apparelServiceService.getColorList()
    .subscribe(items => this.colors=items);

    this.apparelServiceService.getSizeList()
    .subscribe(items => this.sizes=items);

    this.apparelServiceService.getTypeList()
    .subscribe(items => this.types=items);


    this.apparelServiceService.getItems(this.currentColor,this.currentGender,this.currentType,this.currentSize)
    .subscribe(items=>this.items=items);
}
}
