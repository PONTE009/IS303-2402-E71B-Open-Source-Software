import { Routes } from '@angular/router';
import {AppComponent} from "./app.component";
import {ListarDependenciaComponent} from "./componentes/Dependencias/listar-dependencia/listar-dependencia.component";
import {RegistrarUsuarioComponent} from "./componentes/usuario/registrar-usuario/registrar-usuario.component";

export const routes: Routes = [
  {
    path : '*',
    component : AppComponent
  },
  {
    path : 'dependencia/listar',
    component: ListarDependenciaComponent
  },
  {
    path: 'usuario',
    children: [
      {
        path: 'registrar',
        component: RegistrarUsuarioComponent
      }
    ]
  }
];
