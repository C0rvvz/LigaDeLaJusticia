package udem.edu.co.model.impl;

import udem.edu.co.model.SuperHero;

import java.util.List;

public class SuperHeroImpl implements SuperHero {

    private String name;
    private List<String> clasificaciones;

    public SuperHeroImpl(String name, List<String> clasificaciones) {
        this.name = name;
        this.clasificaciones = clasificaciones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getClasificaciones() {
        return clasificaciones;
    }

    public void setClasificaciones(List<String> clasificaciones) {
        this.clasificaciones = clasificaciones;
    }
}
