package udem.edu.co.model.impl;

import udem.edu.co.model.VelocidadSobrehumana;

import java.util.List;

public class VelocidadSobrehumanaImpl implements VelocidadSobrehumana {
    private List<SuperHeroImpl> heroes;
    public VelocidadSobrehumanaImpl(List<SuperHeroImpl> heroes) {
        this.heroes = heroes;
    }
    public void agregarVelocidadSobrehumana(SuperHeroImpl heroe) {
        SuperHeroImpl heroeExistente = null;
        for (SuperHeroImpl existingAvenger : heroes) {
            if (existingAvenger.getName().equals(heroe.getName())) {
                heroeExistente = existingAvenger;
                break;
            }
        }
        if (heroeExistente != null) {
            heroeExistente.getClasificaciones().add("Heroe con Velocidad sobrehumana");
        } else {
            heroe.getClasificaciones().add("Heroe con Velocidad sobrehumana");
            heroes.add(heroe);
        }
    }
}
}
