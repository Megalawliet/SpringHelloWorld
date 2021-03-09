package com.company.HelloMundo.Service;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test") //le introducimos la ruta principal para que acceda al programa una vez puestos el host y el puerto.
@CrossOrigin
public class MyService {
	
	@GetMapping("/sayHello/{name}") //mapeamos la ruta que le pondremos en el navegador despues de test
	public String sayHello(@PathVariable("name")String name) {
		return "Mensaje : "+name; //Luego, en el navegador, por metodo get le pondremos un Hola mundo (en este caso lo he implementado asi)
		//se podria quitar el {name} y en lugar de mensaje y que leyera la url, poenr directamente hello world...
	}

}
