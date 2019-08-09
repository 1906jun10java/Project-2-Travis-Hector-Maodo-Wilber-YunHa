import { Component, OnInit } from '@angular/core';
import { CheckoutService } from 'src/app/Servises/checkoutService/checkout.service';
import { CartServiceService } from 'src/app/Servises/CartService/cart-service.service';
import { AuthenticationService } from 'src/app/Servises/authenticationService';
import { ShippingInfoService } from 'src/app/Servises/shippingService/shipping-info.service';
import { BillingInfoService } from 'src/app/Servises/billingService/billing-info.service';
import { User } from 'src/app/Beans/User';
import { Subscription } from 'rxjs';
import { Billing } from 'src/app/Beans/Billing';

@Component({
  selector: 'app-checkout',
  templateUrl: './checkout.component.html',
  styleUrls: ['./checkout.component.css']
})
export class CheckoutComponent implements OnInit {

  currentUser: User;
  currentUserSubscription: Subscription;

  billingInfo:Billing;

  constructor(private checkoutService:CheckoutService,private cartServiceService:CartServiceService,
    private authenticationService:AuthenticationService,private shippingInfoService:ShippingInfoService,
    private billingInfoService:BillingInfoService) {
      this.currentUserSubscription = this.authenticationService.currentUser.subscribe(user => {
        this.currentUser = user;
    });
     }

  ngOnInit() {
    this.billingInfoService.getCurrentUserBilling(this.currentUser.userId)
   .subscribe(billing => this.billingInfo=billing);


  }

  ngOnDestroy() {
    // unsubscribe to ensure no memory leaks
    this.currentUserSubscription.unsubscribe();
    
    
}

}
