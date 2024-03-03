package udem.edu.co.model.impl;

import udem.edu.co.model.FuerzaSobreHumana;

import java.util.List;

public class FuerzaSobreHumanaImpl implements FuerzaSobreHumana {
    private List<SuperHeroImpl> heroes;
    public FuerzaSobreHumanaImpl(List<SuperHeroImpl> heroes) {
        this.heroes = heroes;
    }
    public void agregarFuerzaSobreHumana(SuperHeroImpl heroe) {
        SuperHeroImpl heroeExistente = null;
        for (SuperHeroImpl existingAvenger : heroes) {
            if (existingAvenger.getName().equals(heroe.getName())) {
                heroeExistente = existingAvenger;
                break;
            }
        }
        if (heroeExistente != null) {
            heroeExistente.getClasificaciones().add("Avenger Inteligente");
        } else {
            heroe.getClasificaciones().add("Avenger Inteligente");
            heroes.add(heroe);
        }
    }
}
