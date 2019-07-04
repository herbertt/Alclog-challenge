import { Component, OnInit, Input } from '@angular/core';
import { Unidade } from 'src/app/produto/models/unidade';

@Component({
  selector: 'app-unidade-info',
  templateUrl: './unidade-info.component.html',
  styleUrls: ['./unidade-info.component.css']
})
export class UnidadeInfoComponent implements OnInit {
  @Input() unidade: Unidade;
  constructor() { }

  ngOnInit() {
  }

}
