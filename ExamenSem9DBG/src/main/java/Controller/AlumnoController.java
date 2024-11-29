package Controller;

import Entity.Alumno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @GetMapping("/alumno")
    public Alumno getAlumno() {
        return new Alumno("Diego Bellina", 22, "Ingenieria de Sistemas");
    }
}
