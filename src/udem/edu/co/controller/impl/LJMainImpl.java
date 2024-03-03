package udem.edu.co.controller.impl;

import udem.edu.co.controller.LJMain;
import udem.edu.co.model.impl.SuperHeroImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LJMainImpl implements LJMain {
    private LJMenuImpl ljMenuImpl;
    private List<SuperHeroImpl> heroes;

    public LJMainImpl(LJMenuImpl ljMenuImpl, List<SuperHeroImpl> heroes) {
        this.ljMenuImpl = ljMenuImpl;
        this.heroes = heroes;
    }

    public void comenzar() {
        int choice;
        do {
            choice = ljMenuImpl.verMenu();
            switch (choice) {
                case 1:
                    verTodosHeroes();
                    break;
                case 2:
                    verHeroesPorClasificacion("Heroe con Fuerza sobrehumana");
                    break;
                case 3:
                    verHeroesPorClasificacion("Heroe volador");
                    break;
                case 4:
                    verHeroesPorClasificacion("Heroe con Resistencia aumentada");
                    break;
                case 5:
                    verHeroesPorClasificacion("Heroe con Habilidades de combate avanzadas");
                    break;
                case 6:
                    verHeroesPorClasificacion("Heroe con Velocidad sobrehumana");
                    break;
                case 7:
                    verHeroesPorClasificacion("Heroe con Curación acelerada");
                    break;
                case 8:
                    LJMenuImpl.verMensaje("Adios :)");
                    break;
                default:
                    LJMenuImpl.verMensaje("OEEEE Coloque bien lo que le piden maninnn Mch");
            }
        } while (choice != 8);
    }

    private void verTodosHeroes() {
        LJMenuImpl.verHeroes(heroes);
    }

    private void verHeroesPorClasificacion(String clasificacion) {
        List<SuperHeroImpl> heroesFiltrados = new ArrayList<>();
        for (SuperHeroImpl superHeroImpl : heroes) {
            if (superHeroImpl.getClasificaciones().contains(clasificacion)) {
                if (clasificacion.equals("Heroe volador")) {
                    heroesFiltrados.add(new SuperHeroImpl(superHeroImpl.getName(), Collections.singletonList(clasificacion)));
                } else if (clasificacion.equals("Heroe con Resistencia aumentada")) {
                    heroesFiltrados.add(new SuperHeroImpl(superHeroImpl.getName(), Collections.singletonList(clasificacion)));
                } else if (clasificacion.equals("Heroe con Habilidades de combate avanzadas")) {
                    heroesFiltrados.add(new SuperHeroImpl(superHeroImpl.getName(), Collections.singletonList(clasificacion)));
                } else if (clasificacion.equals("Heroe con Velocidad sobrehumana")) {
                    heroesFiltrados.add(new SuperHeroImpl(superHeroImpl.getName(), Collections.singletonList(clasificacion)));
                } else if (clasificacion.equals("Heroe con Curación acelerada")) {
                        heroesFiltrados.add(new SuperHeroImpl(superHeroImpl.getName(), Collections.singletonList(clasificacion)));
                } else {
                    heroesFiltrados.add(superHeroImpl );
                }
            }
        }
        LJMenuImpl.verHeroes(heroesFiltrados);
    }
}
