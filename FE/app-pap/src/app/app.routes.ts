import { Routes } from '@angular/router';
import {AppComponent} from "./app.component";
import {ListarDependenciaComponent} from "./componentes/Dependencias/listar-dependencia/listar-dependencia.component";

export const routes: Routes = [
  {
    path : '',
    component : AppComponent
  },
  {
    path : 'dependencia/listar',
    component: ListarDependenciaComponent
    ,
  }
];
