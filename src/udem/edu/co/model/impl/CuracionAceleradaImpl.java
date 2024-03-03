package udem.edu.co.model.impl;

import udem.edu.co.model.CuracionAcelerada;

import java.util.List;

public class CuracionAceleradaImpl implements CuracionAcelerada {
    private List<SuperHeroImpl> heroes;
    public CuracionAceleradaImpl(List<SuperHeroImpl> heroes) {
        this.heroes = heroes;
    }
    public void agregarCuracionAcelerada(SuperHeroImpl heroe) {
        SuperHeroImpl heroeExistente = null;
        for (SuperHeroImpl existingAvenger : heroes) {
            if (existingAvenger.getName().equals(heroe.getName())) {
                heroeExistente = existingAvenger;
                break;
            }
        }
        if (heroeExistente != null) {
            heroeExistente.getClasificaciones().add("Heroe con Curación acelerada");
        } else {
            heroe.getClasificaciones().add("Heroe con Curación acelerada");
            heroes.add(heroe);
        }
    }
}
