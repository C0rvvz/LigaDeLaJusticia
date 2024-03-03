package udem.edu.co.model.impl;

import udem.edu.co.model.Volador;

import java.util.List;

public class VoladorImpl implements Volador {
    private List<SuperHeroImpl> heroes;
    public VoladorImpl(List<SuperHeroImpl> heroes) {
        this.heroes = heroes;
    }
    public void agregarVolador(SuperHeroImpl heroe) {
        SuperHeroImpl heroeExistente = null;
        for (SuperHeroImpl existingAvenger : heroes) {
            if (existingAvenger.getName().equals(heroe.getName())) {
                heroeExistente = existingAvenger;
                break;
            }
        }
        if (heroeExistente != null) {
            heroeExistente.getClasificaciones().add("Heroe volador");
        } else {
            heroe.getClasificaciones().add("Heroe volador");
            heroes.add(heroe);
        }
    }
}
