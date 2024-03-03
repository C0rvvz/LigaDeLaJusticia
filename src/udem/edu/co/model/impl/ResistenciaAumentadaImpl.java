package udem.edu.co.model.impl;

import udem.edu.co.model.ResistenciaAumentada;

import java.util.List;

public class ResistenciaAumentadaImpl implements ResistenciaAumentada {
    private List<SuperHeroImpl> heroes;
    public ResistenciaAumentadaImpl(List<SuperHeroImpl> heroes) {
        this.heroes = heroes;
    }
    public void agregarResistenciaAumentada(SuperHeroImpl heroe) {
        SuperHeroImpl heroeExistente = null;
        for (SuperHeroImpl existingAvenger : heroes) {
            if (existingAvenger.getName().equals(heroe.getName())) {
                heroeExistente = existingAvenger;
                break;
            }
        }
        if (heroeExistente != null) {
            heroeExistente.getClasificaciones().add("Heroe con Resistencia aumentada");
        } else {
            heroe.getClasificaciones().add("Heroe con Resistencia aumentada");
            heroes.add(heroe);
        }
    }
}
