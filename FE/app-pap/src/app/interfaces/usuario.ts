export interface Usuario {
  usuarioId?: number;
  usuario: string;
  clave: string;
  activo: number;
  usuarioRegistro:string;
  fechaRegistro:Date;
  usuarioModifica?: string;
  fechaModifica?: Date;
}
