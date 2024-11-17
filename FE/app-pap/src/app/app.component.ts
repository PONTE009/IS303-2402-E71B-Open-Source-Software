import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    RouterOutlet,
    CommonModule
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  constructor() {
  console.log("Constructor del AppComponent");
  }

  titulo = 'Bienvenidooo!!!';

}

/*
interface Dependencia {
  dependenciaId: number;
  descripcion: string;
  sigla: string;
  usuarioRegistro: string;
  fechaRegistro: Date;
  usuarioModifica: string;
  fechaModifica: Date;
  activo: number
}
*/
