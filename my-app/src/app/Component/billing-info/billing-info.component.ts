import { Component, OnInit, Input } from '@angular/core';
import{User}from 'src/app/Beans/User'

@Component({
  selector: 'app-billing-info',
  templateUrl: './billing-info.component.html',
  styleUrls: ['./billing-info.component.css']
})
export class BillingInfoComponent implements OnInit {

  @Input('currentUser') currentUser:User;
  @Input('title') title:string;

  nameOnCard:string='546546';
  
  cardExporation:Date;

  constructor() { }

  ngOnInit() {
    console.log(this.nameOnCard);
  }

}
