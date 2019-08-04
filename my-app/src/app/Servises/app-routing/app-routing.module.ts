import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomePageComponent} from 'src/app/Component/home-page/home-page.component'
import {ApparelComponent} from 'src/app/Component/apparel/apparel.component'
import {LoginComponent} from 'src/app/Component/login/login.component'
import {SignupComponent} from 'src/app/Component/signup/signup.component'
import {CartComponent} from 'src/app/Component/cart/cart.component'
import {ArtComponent} from 'src/app/Component/art/art.component'
import {CollectibleComponent} from 'src/app/Component/collectible/collectible.component'


const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  {  path: 'home', component: HomePageComponent },
  {  path: 'Apparel', component: ApparelComponent },
  {  path: 'LogIn', component: LoginComponent },
  {  path: 'SignUp', component: SignupComponent },
  {  path: 'Cart', component: CartComponent },
  {  path: 'Art', component: ArtComponent },
  {  path: 'Collectibles', component: CollectibleComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
