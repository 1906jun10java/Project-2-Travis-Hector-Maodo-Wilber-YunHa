import { Component, OnInit, Input } from '@angular/core';
import { User } from 'src/app/Beans';

@Component({
  selector: 'app-address-form',
  templateUrl: './address-form.component.html',
  styleUrls: ['./address-form.component.css']
})
export class AddressFormComponent implements OnInit {

  @Input() currentUser:User;
  @Input('userShippingAddress') userShippingAddress:string;
  @Input('userZippCode') userZippCode:string;

  constructor() { }

  ngOnInit() {
  }

}
