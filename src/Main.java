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

        Player profeSergio = new Player("Sergio Medina");
        Player coordinador = new Player("Coordinador AdS");
        Player suplentePoo = new Player("Suplente POO");

        Team profes = new Team("Equipo de profes");
        profes.addPlayer(profeSergio);
        profes.addPlayer(coordinador);
        profes.addPlayer(suplentePoo);

        System.out.println(profes.getPlayers().size());

        Team estudiantes = new Team("Equipo de estudiantes");
        estudiantes.addPlayer(new Player("San Martin"));
        estudiantes.addPlayer(new Player("Manuel Belgrano"));
        estudiantes.addPlayer(new Player("Mariano Moreno"));

        //....

        Match primerParcial = new Match(
                "Aula virtual de POO jueves",
                fechaDeParcial,
                profes,
                estudiantes
        );
        torneoDaVinci.addMatch(primerParcial);
    }
}
