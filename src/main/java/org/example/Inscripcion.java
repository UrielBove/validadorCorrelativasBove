package org.example;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Inscripcion{
    @lombok.Getter
    private Set<Materia> materiasDeseadas;
    @lombok.Setter
    @lombok.Getter
    private Alumno alumno;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materiasDeseadas = new HashSet<>();
    }

    public boolean estaAprobada(){
        return materiasDeseadas.stream().allMatch(materia -> materia.cumpleCorrelativas(alumno));
    }

    public void agregarMateriasDeseadas(Materia ... materias){
        Collections.addAll(this.materiasDeseadas, materias);
    }

}
