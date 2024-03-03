package udem.edu.co.view;

import udem.edu.co.controller.LJMain;
import udem.edu.co.controller.impl.LJMainImpl;
import udem.edu.co.controller.impl.LJMenuImpl;
import udem.edu.co.model.Volador;
import udem.edu.co.model.impl.*;

import java.util.ArrayList;
import java.util.List;

public class LaLigaDeLaJusticia {
    public static void main(String[] args) {
        List<SuperHeroImpl> avengers = new ArrayList<>();
        LJMenuImpl ljMenuImpl = new LJMenuImpl();
        LJMainImpl avengersControllerImpl = new LJMainImpl(LJMenuImpl, heroes);
        CuracionAceleradaImpl curacionAceleradaImpl = new CuracionAceleradaImpl(heroes);
        FuerzaSobreHumanaImpl fuerzaSobreHumanaImpl = new FuerzaSobreHumanaImpl(heroes);
        HabilidadesDeCombateAvanzadasImpl habilidadesDeCombateAvanzadasImpl = new HabilidadesDeCombateAvanzadasImpl(heroes);
        ResistenciaAumentadaImpl resistenciaAumentadaImpl = new ResistenciaAumentadaImpl(heroes);
        VelocidadSobrehumanaImpl velocidadSobrehumanaImpl = new VelocidadSobrehumanaImpl(heroes);
        VoladorImpl voladorImpl = new VoladorImpl(heroes);

        CuracionAceleradaImpl.agregarCuracionAcelerada(new SuperHeroImpl("Superman", new ArrayList<>()));
        CuracionAceleradaImpl.agregarCuracionAcelerada(new SuperHeroImpl("Martian Manhunter", new ArrayList<>()));

        FuerzaSobreHumanaImpl.agregarFuerzaSobreHumana(new SuperHeroImpl("Superman", new ArrayList<>()));
        FuerzaSobreHumanaImpl.agregarFuerzaSobreHumana(new SuperHeroImpl("Wonder Woman", new ArrayList<>()));
        FuerzaSobreHumanaImpl.agregarFuerzaSobreHumana(new SuperHeroImpl("Aquaman", new ArrayList<>()));
        FuerzaSobreHumanaImpl.agregarFuerzaSobreHumana(new SuperHeroImpl("Martian Manhunter", new ArrayList<>()));

        HabilidadesDeCombateAvanzadasImpl.agregarHabilidadesDeCombateAvanzadas(new SuperHeroImpl("Batman", new ArrayList<>()));
        HabilidadesDeCombateAvanzadasImpl.agregarHabilidadesDeCombateAvanzadas(new SuperHeroImpl("Wonder Woman", new ArrayList<>()));
        HabilidadesDeCombateAvanzadasImpl.agregarHabilidadesDeCombateAvanzadas(new SuperHeroImpl("Green Lantern", new ArrayList<>()));

        ResistenciaAumentadaImpl.agregarResistenciaAumentada(new SuperHeroImpl("Batman", new ArrayList<>()));
        ResistenciaAumentadaImpl.agregarResistenciaAumentada(new SuperHeroImpl("Wonder Woman", new ArrayList<>()));
        ResistenciaAumentadaImpl.agregarResistenciaAumentada(new SuperHeroImpl("Green Lantern", new ArrayList<>()));
        ResistenciaAumentadaImpl.agregarResistenciaAumentada(new SuperHeroImpl("Martian Manhunter", new ArrayList<>()));
        ResistenciaAumentadaImpl.agregarResistenciaAumentada(new SuperHeroImpl("Aquaman", new ArrayList<>()));

        VelocidadSobrehumanaImpl.agregarVelocidadSobrehumana(new SuperHeroImpl("Flash", new ArrayList<>()));

        VoladorImpl.agregarVolador(new SuperHeroImpl("Superman", new ArrayList<>()));
        VoladorImpl.agregarVolador(new SuperHeroImpl("Martian Manhunter", new ArrayList<>()));
        VoladorImpl.agregarVolador(new SuperHeroImpl("Green Lantern", new ArrayList<>()));

        avengersControllerImpl.Comenzar();
    }
}
