import { Component, OnInit,Input } from '@angular/core';
import { User } from 'src/app/Beans/User';


@Component({
  selector: 'app-shipping-info',
  templateUrl: './shipping-info.component.html',
  styleUrls: ['./shipping-info.component.css'],
  
})
export class ShippingInfoComponent implements OnInit {

 @Input('currentUser') currentUser:User;
  userEmail:string;
  userShippingAddress:string;
  userZippCode:number;

  constructor() { }

  ngOnInit() {
  }

}
