import { Injectable } from '@angular/core';
import {RequestUsuario} from "../interfaces/request-usuario";
import {Observable} from "rxjs";
import {Usuario} from "../interfaces/usuario";
import {globalConfig} from "../constantes/config.constant";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  constructor(private httpClient: HttpClient) { }

  endpoint: string = `${globalConfig.uriBase}/usuarios`;

  Insertar(requestUsuario: RequestUsuario): Observable<Usuario> {
    const url = `${this.endpoint}/Insertar`;
    return this.httpClient.post<Usuario>(url, requestUsuario)
  }
}
