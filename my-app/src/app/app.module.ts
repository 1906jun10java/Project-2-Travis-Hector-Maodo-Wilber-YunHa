import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule,FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { GeneralNavBarComponent } from './Component/general-nav-bar/general-nav-bar.component';
import { GeneralFooterComponent } from './Component/general-footer/general-footer.component';
import { HomePageComponent } from './Component/home-page/home-page.component';
import { AppRoutingModule } from './Servises/app-routing/app-routing.module';
import { ApparelComponent } from './Component/apparel/apparel.component';
import { HttpClientModule, HTTP_INTERCEPTORS }    from '@angular/common/http';
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
import { AlertComponent } from './Component/alert/alert.component';
import { ErrorInterceptor } from './Servises/authenticationService/error.interceptor';
import { ItemDetailComponent } from './Component/item-detail/item-detail.component';
import { ItemListComponent } from './Component/item-list/item-list.component';
import { StorageServiceModule } from 'ngx-webstorage-service';
import { CarouselComponent } from './Component/carousel/carousel.component';
import { CheckoutComponent } from './Component/checkout/checkout.component';


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
    AlertComponent,
    ItemDetailComponent,
    ItemListComponent,
    CarouselComponent,
    CheckoutComponent,
   
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    AppRoutingModule,
    HttpClientModule,
    StorageServiceModule,
    FormsModule
  ],
  providers: [
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
