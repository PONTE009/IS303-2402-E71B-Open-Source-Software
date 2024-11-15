package upc.taller.proy.pap.upc_app_pap.repository.core;

import org.springframework.data.mongodb.repository.MongoRepository;
import upc.taller.proy.pap.upc_app_pap.entity.core.AuditoriaEntity;

public interface AuditoriaRepository extends MongoRepository<AuditoriaEntity,String> {
}
