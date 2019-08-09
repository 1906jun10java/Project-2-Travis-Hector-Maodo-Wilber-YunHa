import { Component, OnInit, Input } from '@angular/core';
import{User}from 'src/app/Beans/User'
import { FormGroup, FormControl,FormBuilder,Validators } from '@angular/forms';
import { AuthenticationService } from 'src/app/Servises/authenticationService/authentication.service';
import { Subscription } from 'rxjs';
import { Router } from '@angular/router';
import { Billing } from 'src/app/Beans/Billing';
import { BillingInfoService } from 'src/app/Servises/billingService/billing-info.service';

@Component({
  selector: 'app-billing-info',
  templateUrl: './billing-info.component.html',
  styleUrls: ['./billing-info.component.css']
})
export class BillingInfoComponent implements OnInit {

  
  currentUser: User;
  currentUserSubscription: Subscription;

 // billinInfo:Billing;
  newBillingInfo:Billing;
  valid:boolean;

  billingInfo:Billing;

  dateString:string;
  
  billingForm=this.fb.group({
    cardNumber:['',[ Validators.required,Validators.maxLength(16),Validators.minLength(16)]],
    securityCode:['',[Validators.required,Validators.maxLength(3),Validators.minLength(3)]],
    nameOnCard:['', Validators.required],
    expirationDate:['', Validators.required]
  })

  constructor(private authenticationService: AuthenticationService,private router: Router,
    private billingInfoService:BillingInfoService,private fb:FormBuilder) { 

    this.currentUserSubscription = this.authenticationService.currentUser.subscribe(user => {
      this.currentUser = user;
      if (!this.authenticationService.currentUserValue) { 
        this.router.navigate(['/']);
    }
      
  });
  }

  ngOnInit() {
  
    
   this.billingInfoService.getCurrentUserBilling(this.currentUser.userId)
   .subscribe(billing => this.billingInfo=billing);
   
  
   
  }

  get f() { return this.billingForm.controls;
  }
  onSubmit(){
    
    if(this.billingForm.status==="INVALID"){
      alert("No good fam,lolololoolololool")
    }
    else{
      this.newBillingInfo=this.billingForm.value;
      this.newBillingInfo.user=this.currentUser;
      this.newBillingInfo.paymentId=this.billingInfo[0].paymentId;
      this.newBillingInfo.cardType=null;
      console.log(this.newBillingInfo);
      
      this.billingInfoService.putCurrentUserBilling(this.newBillingInfo)
      .subscribe(valid =>this.valid=valid);
      
      if(this.valid===true){
        alert("Billing Info Updated");
      }
      else{
        alert("Billing Not Updated");
      }
  
    }
  }

  ngOnDestroy() {
    // unsubscribe to ensure no memory leaks
    this.currentUserSubscription.unsubscribe();
  }

}
