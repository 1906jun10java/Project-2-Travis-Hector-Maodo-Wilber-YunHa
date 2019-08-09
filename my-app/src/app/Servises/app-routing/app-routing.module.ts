import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomePageComponent} from 'src/app/Component/home-page/home-page.component'
import {ApparelComponent} from 'src/app/Component/apparel/apparel.component'
import {LoginComponent} from 'src/app/Component/login/login.component'
import {SignupComponent} from 'src/app/Component/signup/signup.component'
import {CartComponent} from 'src/app/Component/cart/cart.component'
import {ArtComponent} from 'src/app/Component/art/art.component'
import {CollectibleComponent} from 'src/app/Component/collectible/collectible.component'
import{UserPageComponent} from 'src/app/Component/user-page/user-page.component'
import{BillingInfoComponent} from'src/app/Component/billing-info/billing-info.component'
import{ShippingInfoComponent} from'src/app/Component/shipping-info/shipping-info.component'
import { ItemDetailComponent } from 'src/app/Component/item-detail/item-detail.component';
import { CheckoutComponent } from 'src/app/Component/checkout/checkout.component';


const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  {  path: 'home', component: HomePageComponent },
  {  path: 'Apparel', component: ApparelComponent },
  {  path: 'LogIn', component: LoginComponent },
  {  path: 'SignUp', component: SignupComponent },
  {  path: 'Cart', component: CartComponent },
  {  path: 'Art', component: ArtComponent },
  {  path: 'Collectibles', component: CollectibleComponent },
  {  path: 'UserPage', component: UserPageComponent },
  {  path: 'Billing', component: BillingInfoComponent },
  {  path: 'Shipping', component: ShippingInfoComponent },
  {  path: 'item/:id', component: ItemDetailComponent },
  {  path: 'checkout', component: CheckoutComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
