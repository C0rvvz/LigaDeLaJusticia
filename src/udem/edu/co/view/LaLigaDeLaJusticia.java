package udem.edu.co.view;
import udem.edu.co.controller.impl.LJMenuImpl;
import udem.edu.co.controller.impl.LJMainImpl;
import udem.edu.co.model.impl.*;

import java.util.ArrayList;
import java.util.List;

public class LaLigaDeLaJusticia {
    public static void main(String[] args) {
        List<SuperHeroImpl> heroes = new ArrayList<>();
        LJMenuImpl ljMenuImpl = new LJMenuImpl();
        LJMainImpl ljMainImpl = new LJMainImpl(ljMenuImpl, heroes);
        CuracionAceleradaImpl curacionAceleradaImpl = new CuracionAceleradaImpl(heroes);
        FuerzaSobreHumanaImpl fuerzaSobreHumanaImpl = new FuerzaSobreHumanaImpl(heroes);
        HabilidadesDeCombateAvanzadasImpl habilidadesDeCombateAvanzadasImpl = new HabilidadesDeCombateAvanzadasImpl(heroes);
        ResistenciaAumentadaImpl resistenciaAumentadaImpl = new ResistenciaAumentadaImpl(heroes);
        VelocidadSobrehumanaImpl velocidadSobrehumanaImpl = new VelocidadSobrehumanaImpl(heroes);
        VoladorImpl voladorImpl = new VoladorImpl(heroes);

        curacionAceleradaImpl.agregarCuracionAcelerada(new SuperHeroImpl("Superman", new ArrayList<>()));
        curacionAceleradaImpl.agregarCuracionAcelerada(new SuperHeroImpl("Martian Manhunter", new ArrayList<>()));

        fuerzaSobreHumanaImpl.agregarFuerzaSobreHumana(new SuperHeroImpl("Superman", new ArrayList<>()));
        fuerzaSobreHumanaImpl.agregarFuerzaSobreHumana(new SuperHeroImpl("Wonder Woman", new ArrayList<>()));
        fuerzaSobreHumanaImpl.agregarFuerzaSobreHumana(new SuperHeroImpl("Aquaman", new ArrayList<>()));
        fuerzaSobreHumanaImpl.agregarFuerzaSobreHumana(new SuperHeroImpl("Martian Manhunter", new ArrayList<>()));

        habilidadesDeCombateAvanzadasImpl.agregarHabilidadesDeCombateAvanzadas(new SuperHeroImpl("Batman", new ArrayList<>()));
        habilidadesDeCombateAvanzadasImpl.agregarHabilidadesDeCombateAvanzadas(new SuperHeroImpl("Wonder Woman", new ArrayList<>()));
        habilidadesDeCombateAvanzadasImpl.agregarHabilidadesDeCombateAvanzadas(new SuperHeroImpl("Green Lantern", new ArrayList<>()));

        resistenciaAumentadaImpl.agregarResistenciaAumentada(new SuperHeroImpl("Batman", new ArrayList<>()));
        resistenciaAumentadaImpl.agregarResistenciaAumentada(new SuperHeroImpl("Wonder Woman", new ArrayList<>()));
        resistenciaAumentadaImpl.agregarResistenciaAumentada(new SuperHeroImpl("Green Lantern", new ArrayList<>()));
        resistenciaAumentadaImpl.agregarResistenciaAumentada(new SuperHeroImpl("Martian Manhunter", new ArrayList<>()));
        resistenciaAumentadaImpl.agregarResistenciaAumentada(new SuperHeroImpl("Aquaman", new ArrayList<>()));

        velocidadSobrehumanaImpl.agregarVelocidadSobrehumana(new SuperHeroImpl("Flash", new ArrayList<>()));
        velocidadSobrehumanaImpl.agregarVelocidadSobrehumana(new SuperHeroImpl("Superman", new ArrayList<>()));

        voladorImpl.agregarVolador(new SuperHeroImpl("Superman", new ArrayList<>()));
        voladorImpl.agregarVolador(new SuperHeroImpl("Martian Manhunter", new ArrayList<>()));
        voladorImpl.agregarVolador(new SuperHeroImpl("Green Lantern", new ArrayList<>()));

        ljMainImpl.comenzar();
    }
}
