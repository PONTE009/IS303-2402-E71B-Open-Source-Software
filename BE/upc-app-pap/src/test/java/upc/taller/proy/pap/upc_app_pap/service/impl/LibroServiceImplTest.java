package upc.taller.proy.pap.upc_app_pap.service.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import upc.taller.proy.pap.upc_app_pap.entity.ejemplo.LibrosEntity;
import upc.taller.proy.pap.upc_app_pap.repository.ejemplo.LibroRepository;
import upc.taller.proy.pap.upc_app_pap.service.ejemplo.impl.LibroServiceImpl;

import java.time.Duration;
import java.util.Date;

import static org.mockito.Mockito.when;

@SpringBootTest
class LibroServiceImplTest {

    @MockBean
    private LibroRepository libroRepository;

    @Autowired
    private LibroServiceImpl libroServiceImpl;


    @BeforeEach
    void setUp() {
        System.out.println("Iniciando el test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Finalizando el test");
    }

    @Test
    void listar() {
    }

    @Test
    void insertar() {
        System.out.println("Test en curso");

        Date fechaActual = new Date();

        LibrosEntity eLibro = new LibrosEntity();
        eLibro.setLibroId(1L);
        eLibro.setAutor("Williams");
        eLibro.setDescripcion("Fundamentos de programación");
        eLibro.setPrecio(230.45);
        eLibro.setFechaPublicacion(fechaActual);

        //libroServiceImpl.CalculaVenta();

        when(libroRepository.save(eLibro)).thenReturn(eLibro);

        LibrosEntity eLibroResponse = libroServiceImpl.insertar(eLibro);

        Assertions.assertEquals(eLibro.getLibroId(), eLibroResponse.getLibroId());
        Assertions.assertTimeout(Duration.ofSeconds(1), ()-> {
            Thread.sleep(5000);
        });
        System.out.println("Test en curso");

    }

    @Test
    void consultarPorAutor() {
    }

    @Test
    void eliminar() {
    }
}