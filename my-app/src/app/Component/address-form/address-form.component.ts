import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-address-form',
  templateUrl: './address-form.component.html',
  styleUrls: ['./address-form.component.css']
})
export class AddressFormComponent implements OnInit {

  @Input('userEmail') userEmail:string;
  @Input('userShippingAddress') userShippingAddress:string;
  @Input('userZippCode') userZippCode:string;

  constructor() { }

  ngOnInit() {
  }

}
