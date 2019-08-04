import { Component, OnInit } from '@angular/core';
import { Item } from 'src/app/Beans/Item';
import {ItemService} from 'src/app/Servises/itemServices/item.service';
import {Employee} from "src/app/Beans/EmployeeTest";
import { CompileShallowModuleMetadata } from '@angular/compiler';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit {

  items:Item[];
  employees:Employee[];

  constructor(private itemService:ItemService ) { }

  ngOnInit() {
    /*
    this.itemService.getTopItems()
    .subscribe(items => this.items=items);
    */
   this.itemService.getEmployees()
   .subscribe(employees => this.employees=employees);
  
  }

}
