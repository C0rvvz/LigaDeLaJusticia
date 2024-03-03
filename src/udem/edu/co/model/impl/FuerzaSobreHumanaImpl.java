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
            heroeExistente.getClasificaciones().add("Heroe con Fuerza sobrehumana");
        } else {
            heroe.getClasificaciones().add("Heroe con Fuerza sobrehumana");
            heroes.add(heroe);
        }
    }
}
