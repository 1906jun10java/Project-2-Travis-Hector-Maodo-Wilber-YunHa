import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-art',
  templateUrl: './art.component.html',
  styleUrls: ['./art.component.css']
})
export class ArtComponent implements OnInit {

  coolNum:number=Math.floor((Math.random() * 6) + 1);
  memeNum:number=Math.floor((Math.random() * 4) + 1)
  
  constructor() { }

  ngOnInit() {
  }

}
