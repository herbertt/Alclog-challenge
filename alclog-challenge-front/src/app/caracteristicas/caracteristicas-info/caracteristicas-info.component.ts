import { Component, OnInit, Input } from '@angular/core';
import { Caracteristica } from 'src/app/produto/models/caracteristica';

@Component({
  selector: 'app-caracteristicas-info',
  templateUrl: './caracteristicas-info.component.html',
  styleUrls: ['./caracteristicas-info.component.css']
})
export class CaracteristicasInfoComponent implements OnInit {
  @Input() caracteristica: Caracteristica;
  constructor() { }

  ngOnInit() {
  }

}
