import {Component, inject, OnInit} from '@angular/core';
import {CommonModule} from "@angular/common";
import {DependenciaService} from "../../../servicios/dependencia.service";
import {Dependencia} from "../../../interfaces/dependencia";
import {ErrorCliente} from "../../../funcion/funciones";
import {AbstractControl, FormBuilder, FormGroup, ReactiveFormsModule, Validators} from "@angular/forms";
import {Persona} from "../../../interfaces/persona";
import {Usuario} from "../../../interfaces/usuario";
import {RequestUsuario} from "../../../interfaces/request-usuario";
import {UsuarioService} from "../../../servicios/usuario.service";

@Component({
  selector: 'app-registrar-usuario',
  standalone: true,
  imports: [
    CommonModule,
    ReactiveFormsModule
  ],
  templateUrl: './registrar-usuario.component.html',
  styleUrl: './registrar-usuario.component.css'
})
export class RegistrarUsuarioComponent implements OnInit {

  private dependenciaService = inject(DependenciaService);
  private usuarioService = inject(UsuarioService);

  constructor( private formBuilder: FormBuilder,) {}

  ngOnInit(): void {
    this.CrearFormulario();
    this.ListarDependencia();
  }

  listaEspecialidad: Array<any> = [
    { id: 1, value:"OM1" },
    { id: 2, value:"OM2" }
  ];
  listaGrado: Array<any> = [
    { id: 1, value:"PDA" },
    { id: 2, value:"ENFERMERIA" }
  ];
  listaTipoPersona: Array<any> = [
    { id: 1, value:"SUBALTERNO" },
    { id: 2, value:"SUPERIOR" }
  ];

  listaDependencia: Array<Dependencia> = []
  frmUsuario: FormGroup = new FormGroup({});

  ListarDependencia() {
    this.dependenciaService.Listar().subscribe(
      {
        next: (res) => {
          this.listaDependencia = res;
        },
        error: (error) => {
          ErrorCliente(error)
        }
      }
    )
  }
  Grabar(){

    if(this.frmUsuario.invalid){
      console.log("Falta completar campos")
      return;
    }
    const persona: Persona = {
      primerNombre: this.fr['primerNombre'].value,
      segundoNombre: this.fr['segundoNombre'].value,
      apellidoPaterno: this.fr['apellidoPaterno'].value,
      apellidoMaterno: this.fr['apellidoMaterno'].value,
      tipoPersonaId: this.fr['tipoPersonaId'].value,
      listaDependenciasIds: this.fr['dependenciaId'].value,
      especialidadId: this.fr['especialidadId'].value,
      gradoId: this.fr['gradoId'].value,
      activo: 1,
      usuarioRegistro: "admin",
      fechaRegistro: new Date()
    }

    const usuario:Usuario ={
      usuario: this.fr['usuario'].value,
      clave: this.fr['clave'].value,
      activo: 1,
      usuarioRegistro: "admin",
      fechaRegistro: new Date()
    }

    const request:RequestUsuario={
      usuario:usuario,
      persona:persona,
      flagGeneraError: false
    }

    console.log(request);
    this.Insertar(request);
  }

  Insertar(requestUsuario: RequestUsuario) {
    this.usuarioService.Insertar(requestUsuario).subscribe(
      {
        next: (res) => {
          console.log("Respondio el insertar usuario")
          console.log(res)
        },
        error: (error) => {
          console.log(error)
        }
      }
    )
  }


  CrearFormulario() {
    this.frmUsuario = this.formBuilder.group(
      {
        primerNombre: ['Sandro', [Validators.required]],
        segundoNombre: ['Williams', [Validators.required]],
        apellidoPaterno: ['Ponte', [Validators.required]],
        apellidoMaterno: ['', [Validators.required]],
        tipoPersonaId:['SELECCIONE', [Validators.required]],
        dependenciaId: [[], [Validators.required]],
        especialidadId: ['SELECCIONE', [Validators.required]],
        gradoId: ['SELECCIONE', [Validators.required]],
        usuario: ['', [Validators.required]],
        clave: ['', [Validators.required]]
      }
    );
  }

  get fr(): { [key: string]: AbstractControl } {
    return this.frmUsuario.controls;
  }

}
