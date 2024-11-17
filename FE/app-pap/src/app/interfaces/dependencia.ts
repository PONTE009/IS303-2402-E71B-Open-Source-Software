export interface Dependencia {
  dependenciaId: number;
  descripcion?: string;
  sigla?: string;
  usuarioRegistro?: string;
  fechaRegistro?: Date;
  usuarioModifica?: string;
  fechaModifica?: Date;
  activo?: number
}
