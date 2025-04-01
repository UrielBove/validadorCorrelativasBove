package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InscripcionTest {

    @Test
    @DisplayName("Test Inscripcion esta aprobada")
    public void inscripcionEstaAprobada(){

        Materia fisica1 = new Materia("Fisica1");
        Materia algoritmos = new Materia("Algoritmos");
        Materia discreta = new Materia("Discreta");
        Materia paradigmas = new Materia("Paradigmas");
        paradigmas.agregarCorrelativas(algoritmos,discreta);
        Materia sintaxis = new Materia("Sintaxis");
        sintaxis.agregarCorrelativas(algoritmos,discreta);
        Materia disenio = new Materia("Disenio");
        disenio.agregarCorrelativas(paradigmas);

        Alumno juan = new Alumno("Juan");
        juan.agregarMateriasAprobadas(algoritmos, discreta, fisica1, paradigmas, sintaxis);

        Inscripcion inscripcion1 = new Inscripcion(juan);
        inscripcion1.agregarMateriasDeseadas(disenio);

        Assertions.assertTrue(inscripcion1.estaAprobada());
    }

}