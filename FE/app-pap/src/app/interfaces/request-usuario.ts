import {Persona} from "./persona";
import {Usuario} from "./usuario";

export interface RequestUsuario {
  persona : Persona;
  usuario: Usuario;
  flagGeneraError:boolean;
}
