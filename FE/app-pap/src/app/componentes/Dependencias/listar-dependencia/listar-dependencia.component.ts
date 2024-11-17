import {Component, OnInit} from '@angular/core';
import {Dependencia} from "../../../interfaces/dependencia";
import { CommonModule } from '@angular/common';
import {DependenciaService} from "../../../servicios/dependencia.service";

@Component({
  selector: 'app-listar-dependencia',
  standalone: true,
  imports: [
    CommonModule
  ],
  templateUrl: './listar-dependencia.component.html',
  styleUrl: './listar-dependencia.component.css'
})
export class ListarDependenciaComponent implements OnInit {

  constructor(private depedenciaService: DependenciaService ) {
    console.log("estamos en constructor");
    //this.Listar()
  }

  ngOnInit(): void {
    console.log("estamos en  ngOnInit");
    this.Listar();
  }

  titulo:string = "Listado de Dependencias";


  Listar(){
    this.depedenciaService.Listar().subscribe(
      {
        next:(response)=>{
          console.table(response);
        },
        error:(error)=>{
          console.log(error);
        }
      }
    )
  }

  protected readonly arrayDependencia = arrayDependencia;


}


let arrayDependencia: Array<Dependencia> = [
  {
    dependenciaId: 1,
    descripcion: "DIRECCIÓN DE TELEMÁTICA",
    sigla: "DIRTEL",
    usuarioRegistro: "admin",
    fechaRegistro: new Date(),
    usuarioModifica: "admin",
    fechaModifica: new Date(),
    activo: 1
  },
  {
    dependenciaId: 2,
    descripcion: "DIRECCIÓN DE TELEMÁTICA",
    sigla: "DIRTEL",
    usuarioRegistro: "admin",
    fechaRegistro: new Date(),
    usuarioModifica: "admin",
    fechaModifica: new Date(),
    activo: 1
  }
]
