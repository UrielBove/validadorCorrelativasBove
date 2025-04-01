package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Materia{
    @Setter
    @Getter
    private String nombre;
    @Getter
    private Set<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new HashSet<>();
    }

    public boolean cumpleCorrelativas(Alumno alumno){
        return correlativas.stream().allMatch(alumno::estaAprobada);
    }

    public void agregarCorrelativas(Materia ... correlativas){
        Collections.addAll(this.correlativas, correlativas);
    }

}

