import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { GeneralNavBarComponent } from './Component/general-nav-bar/general-nav-bar.component';
import { GeneralFooterComponent } from './Component/general-footer/general-footer.component';
import { HomePageComponent } from './Component/home-page/home-page.component';
import { AppRoutingModule } from './Servises/app-routing/app-routing.module';
import { ApparelComponent } from './Component/apparel/apparel.component';
import { HttpClientModule }    from '@angular/common/http';
import { LoginComponent } from './Component/login/login.component';
import { SignupComponent } from './Component/signup/signup.component';
import { CartComponent } from './Component/cart/cart.component';
import { ArtComponent } from './Component/art/art.component';
import { CollectibleComponent } from './Component/collectible/collectible.component';
import { UserPageComponent } from './Component/user-page/user-page.component';
import { ItemPageComponent } from './Component/item-page/item-page.component';
import { BankFormComponent } from './Component/bank-form/bank-form.component';
import { AddressFormComponent } from './Component/address-form/address-form.component';
import { BillingInfoComponent } from './Component/billing-info/billing-info.component';
import { ShippingInfoComponent } from './Component/shipping-info/shipping-info.component';


@NgModule({
  declarations: [
    AppComponent,
    GeneralNavBarComponent,
    GeneralFooterComponent,
    HomePageComponent,
    ApparelComponent,
    LoginComponent,
    SignupComponent,
    CartComponent,
    ArtComponent,
    CollectibleComponent,
    UserPageComponent,
    ItemPageComponent,
    BankFormComponent,
    AddressFormComponent,
    BillingInfoComponent,
    ShippingInfoComponent,
   
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
