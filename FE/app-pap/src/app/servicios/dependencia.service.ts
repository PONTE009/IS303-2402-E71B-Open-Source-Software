import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Dependencia} from "../interfaces/dependencia";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class DependenciaService {

  constructor(private httpClient: HttpClient) { }

  endpoint = "http://localhost:8099/api"
  variable1 :string = "123"

  Listar(): Observable<Dependencia[]> {
    console.log("Servicio/Listar");
    const url = `${this.endpoint}/dependencias/Listar`;
    return this.httpClient.get<Dependencia[]>(url);
  }

}
