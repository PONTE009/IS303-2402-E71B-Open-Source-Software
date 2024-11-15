package upc.taller.proy.pap.upc_app_pap;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import upc.taller.proy.pap.upc_app_pap.service.ejemplo.LibroService;

@SpringBootTest
class UpcAppPapApplicationTests {

	@Autowired
	LibroService libroService;

	@Test
	void contextLoads() {
	}

	@Test
	void InsertarLibro(){

		System.out.println("Imprimiendo prueba");
		//
		//libroService.insertar();
	}

}
