import { Component, OnInit } from '@angular/core';
import { CartServiceService } from 'src/app/Servises/CartService/cart-service.service';
import { Item } from 'src/app/Beans/Item';
import { User} from 'src/app/Beans/User';
import { AuthenticationService } from 'src/app/Servises/authenticationService';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {

  constructor(private cartService:CartServiceService,private authenticationService:AuthenticationService) { }

  ngOnInit() {
  }

}
