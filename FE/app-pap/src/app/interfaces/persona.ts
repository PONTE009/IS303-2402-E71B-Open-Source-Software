export interface Persona {
  personaId?: number;
  primerNombre: string;
  segundoNombre: string;
  apellidoPaterno: string;
  apellidoMaterno: string;
  activo: number;

  usuarioRegistro?: string;
  fechaRegistro?: Date;
  usuarioModifica?: string;
  fechaModifica?: Date;

  especialidadId?: number;
  tipoPersonaId?: number;
  dependenciaId?: number;
  listaDependenciasIds?: Array<number>
  gradoId?: number;
}
