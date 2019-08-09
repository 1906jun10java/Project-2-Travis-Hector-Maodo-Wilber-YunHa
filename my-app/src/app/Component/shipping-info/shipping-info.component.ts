import { Component, OnInit,Input } from '@angular/core';
import { User } from 'src/app/Beans/User';
import { Subscription } from 'rxjs';
import { AuthenticationService } from 'src/app/Servises/authenticationService/authentication.service';
import { FormGroup, FormControl, Validators  ,FormBuilder } from '@angular/forms';
import { Address } from 'src/app/Beans/Address';
import { ShippingInfoService } from 'src/app/Servises/shippingService/shipping-info.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-shipping-info',
  templateUrl: './shipping-info.component.html',
  styleUrls: ['./shipping-info.component.css'],
  
})
export class ShippingInfoComponent implements OnInit {
  
  ngOnInit(): void {

  
    /*
   this.shippingInfoService.getCurrentUserShipping(this.currentUser.id)
   .subscribe(address=> this.addressInfo=address);
   */
  }

 

shippingForm=this.fb.group({
  address:['', Validators.required],
  zip:['',[Validators.required,Validators.maxLength(5),Validators.minLength(5)]]
})
  //addressInfo:Address;
  
   addressInfo:Address={
    id:22,
    userID:55,
    address:"hi",
    zip:22222
  }

  newUserAddress:Address;
  valid:boolean;

  currentUser: User;
  currentUserSubscription: Subscription;

  constructor(  private authenticationService: AuthenticationService,
    private shippingInfoService:ShippingInfoService,private router: Router,
    private fb:FormBuilder) { 
    this.currentUserSubscription = this.authenticationService.currentUser.subscribe(user => {
      this.currentUser = user;
      if (!this.authenticationService.currentUserValue) { 
        this.router.navigate(['/']);
    }
  });
}

onSubmit() {
  console.log(this.shippingForm);
  if(this.shippingForm.value.address===null || this.shippingForm.value.zip===null){
    this.shippingForm.value.address=this.addressInfo.address;
    this.shippingForm.value.zip=this.addressInfo.zip;
  }
  if(this.shippingForm.status==="INVALID"){
    alert("No good fam,lolololoolololool")
  }
  else{
    this.newUserAddress=this.shippingForm.value;
    this.newUserAddress.userID=this.currentUser.id;

    this.shippingInfoService.putCurrentUserShipping(this.newUserAddress)
    .subscribe(valid =>this.valid=valid);
    
    if(this.valid===true){
      alert("Address Info Updated");
    }
    else{
      alert("Addres Not Updated");
    }

  }
  
}

ngOnDestroy() {
  // unsubscribe to ensure no memory leaks
  this.currentUserSubscription.unsubscribe();
}



}

