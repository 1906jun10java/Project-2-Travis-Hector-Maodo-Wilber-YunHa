import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-bank-form',
  templateUrl: './bank-form.component.html',
  styleUrls: ['./bank-form.component.css']
})
export class BankFormComponent implements OnInit {

  @Input("nameOnCard") nameOnCard:string;
  @Input("cardExporation") cardExporation:Date;

  constructor() { }

  ngOnInit() {
    console.log(this.nameOnCard);
  }

}
