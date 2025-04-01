package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class InscripcionNoAprobadaTest {

    @Test
    @DisplayName("Test inscripcion no esta aprobada")
    public void inscripcionNoEstaAprobada(){

        Materia fisica1 = new Materia("Fisica1");
        Materia algoritmos = new Materia("Algoritmos");
        Materia discreta = new Materia("Discreta");
        Materia sintaxis = new Materia("Sintaxis");
        sintaxis.agregarCorrelativas(algoritmos, discreta);
        Materia fisica2 = new Materia("Fisica2");
        fisica2.agregarCorrelativas(fisica1);

        Alumno pedro = new Alumno("Pedro");
        pedro.agregarMateriasAprobadas(algoritmos, fisica1);

        Inscripcion inscripcion2 = new Inscripcion(pedro);
        inscripcion2.agregarMateriasDeseadas(sintaxis, fisica2);

        Assertions.assertFalse(inscripcion2.estaAprobada());

    }

}