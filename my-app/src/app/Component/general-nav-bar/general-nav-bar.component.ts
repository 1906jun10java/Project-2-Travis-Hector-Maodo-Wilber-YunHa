import { Component, OnInit } from '@angular/core';
import { AuthenticationService } from 'src/app/Servises/authenticationService/authentication.service';
import { asLiteral } from '@angular/compiler/src/render3/view/util';
import { User } from 'src/app/Beans';

@Component({
  selector: 'app-general-nav-bar',
  templateUrl: './general-nav-bar.component.html',
  styleUrls: ['./general-nav-bar.component.css']
})
export class GeneralNavBarComponent implements OnInit {

  currentUser:User;
  
  constructor(private x:AuthenticationService) { }
    
  ngOnInit() {
  
  }

}
