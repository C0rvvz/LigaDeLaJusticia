package udem.edu.co.model.impl;

import udem.edu.co.model.HabilidadesDeCombateAvanzadas;

import java.util.List;

public class HabilidadesDeCombateAvanzadasImpl implements HabilidadesDeCombateAvanzadas {
    private List<SuperHeroImpl> heroes;
    public HabilidadesDeCombateAvanzadasImpl(List<SuperHeroImpl> heroes) {
        this.heroes = heroes;
    }
    public void agregarHabilidadesDeCombateAvanzadas(SuperHeroImpl heroe) {
        SuperHeroImpl heroeExistente = null;
        for (SuperHeroImpl existingAvenger : heroes) {
            if (existingAvenger.getName().equals(heroe.getName())) {
                heroeExistente = existingAvenger;
                break;
            }
        }
        if (heroeExistente != null) {
            heroeExistente.getClasificaciones().add("Heroe con Habilidades de combate avanzadas");
        } else {
            heroe.getClasificaciones().add("Heroe con Habilidades de combate avanzadas");
            heroes.add(heroe);
        }
    }
}
