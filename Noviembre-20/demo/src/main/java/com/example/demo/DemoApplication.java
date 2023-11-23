package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/* GET obtener o leer informacion */
	@GetMapping("/")
	public String holaMundo() {
		return "HOLA A TODOS";
	}

	/* POST Enviar o crear informacion */
	@PostMapping("/")
	public String createMundo() {
		return "MUNDO CREADO";
	}

	/* PUT Editar información */
	@PutMapping("/")
	public String editarMundo() {
		return "MUNDO EDITADO";
	}

	/* DELETE eliminar o destruir informacion */
	@DeleteMapping("/")
	public String eliminarMundo() {
		return "MUNDO DESTRUIDO";
	}

	@GetMapping("/buscar")
	public String buscar(@RequestParam(value = "busqueda", required = false) String busqueda,
			@RequestParam(value = "paginas", required = false) Integer paginas) {
		if (paginas < 1) {
			paginas = 1;
		}
		return "Buscando: " + busqueda + " en " + paginas + " paginas";
	}

	@GetMapping("/producto/{id}/categoria/{categoria}")
	public String productos(@PathVariable("id") Integer id, @PathVariable("categoria") String categoria) {
		return "Producto #" + id + " en la categoria " + categoria;
	}

}
