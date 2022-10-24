import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String args[]) {
        System.out.println("Da vinci tournament");
        // Enero es 0, Agosto es 7 Date es fecha (1, 31), Day dia de la semana Domingo es 0
        Date comienzoDeCuatri = new Date(2022, 7, 16);

        Date finDelCuatri = new Date(2022, 11, 5);

        Season torneoDaVinci = new Season(
            "Torneo POO 2022, 2do Cuatri",
            comienzoDeCuatri,
            finDelCuatri
        );

        Date fechaDeParcial = new Date(2022, 8, 29);

        Team profes = new Team("Equipo de profes");
        profes.addPlayer(new Player("Profe Poo"));
        profes.addPlayer(new Player("Profe Adp"));
        profes.addPlayer(new Player("Profe pw1"));
        profes.addPlayer(new Player("Profe ux"));
        profes.addPlayer(new Player("Profe pw2"));

        Team estudiantes = new Team("Equipo de estudiantes");
        estudiantes.addPlayer(new Player("Estudiante Martin"));
        estudiantes.addPlayer(new Player("Estudiante Manuel"));
        estudiantes.addPlayer(new Player("Estudiante Marcos"));
        estudiantes.addPlayer(new Player("Estudiante Santino"));
        estudiantes.addPlayer(new Player("Estudiante Mateo"));

        //....

        Match primerParcial = new Match(
                "Aula virtual de POO jueves",
                fechaDeParcial,
                profes,
                estudiantes
        );
        torneoDaVinci.addMatch(primerParcial);

        System.out.println(primerParcial.generateMarker());


    }
}
