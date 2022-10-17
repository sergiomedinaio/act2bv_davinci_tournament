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

        Match primerParcial = new Match("Aula virtual de POO jueves", fechaDeParcial);

        Team profes = new Team();
        Team estudiante = new Team();

        //....

        torneoDaVinci.addMatch(primerParcial);
    }
}
