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

  billingForm: FormGroup;
  currentUser: User;
  currentUserSubscription: Subscription;

 // billinInfo:Billing;
  newBillingInfo:Billing;
  valid:boolean;

  addressInfo:Billing={
    id:22,
    userID: 55,
    cardNum: 30403043043,
    securetyNum: 234,
    nameOnCard: "Joe",
    exp: new Date()
  }

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
  this.billingForm = this.fb.group({
    cardNumber: ['',Validators.required],
    securetyNumber:['',Validators.required],
    nameOnCard:['',Validators.required],
    cardExpiration:['',Validators.required] 
  });

    /*
   this.billingInfoService.getCurrentUserBilling(this.currentUser.id)
   .subscribe(billing => this.billinInfo=billing);
   */
  }

  get f() { return this.billingForm.controls;
  }
  onSubmit(){
    
    if(this.billingForm.status==="INVALID"){
      alert("No good fam,lolololoolololool")
    }
    else{
      this.newBillingInfo=this.billingForm.value;
      this.newBillingInfo.userID=this.currentUser.id;
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
