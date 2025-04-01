package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Alumno{
    @Setter
    @Getter
    private String nombre;
    @Setter
    @Getter
    private String apellido;
    @Getter
    private Set<Materia> materiasAprobadas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.materiasAprobadas = new HashSet<>();
    }

    public boolean estaAprobada(Materia materia) {
        return materiasAprobadas.contains(materia);
    }

    public void agregarMateriasAprobadas(Materia ... materias){
        Collections.addAll(this.materiasAprobadas, materias);
    }
}
