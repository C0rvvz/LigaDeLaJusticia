package udem.edu.co.controller.impl;
import java.util.List;
import java.util.Scanner;
import udem.edu.co.controller.LJMenu;
import udem.edu.co.model.impl.SuperHeroImpl;

public class LJMenuImpl implements LJMenu {
    private Scanner scanner;

    public LJMenuImpl(Scanner scanner) {
        this.scanner = new Scanner(System.in);
    }

    public int VerMenu() {
        System.out.println("Super Heroes de la Liga De La Justicia");
        System.out.println("1) Todos los Heroes Disponibles");
        System.out.println("2) Heroes con Fuerza sobrehumana");
        System.out.println("3) Heroes que vuelan");
        System.out.println("4) Heroes con Resistencia aumentada");
        System.out.println("5) Heroes con Habilidades de combate avanzadas");
        System.out.println("6) Heroes con Velocidad sobrehumana");
        System.out.println("7) Heroes con Curación acelerada");
        System.out.println("8) Salir");
        System.out.print("Elija un numero: ");
        return scanner.nextInt();
    }

    public void verHeroes(List<SuperHeroImpl> heroes) {
        System.out.println("Heroes Disponibles");
        for (SuperHeroImpl heroe : heroes) {
            System.out.println(heroe.getName() + " =>> " + heroe.getClasificaciones());
        }
    }

    public void verMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
