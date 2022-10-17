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


        Match primerParcial = new Match();
        primerParcial.setLocation("Aula virtual de POO jueves");

        Date fechaDeParcial = new Date();
        fechaDeParcial.setYear(2022);
        fechaDeParcial.setMonth(8); // Sep es 8
        fechaDeParcial.setDate(29);
        primerParcial.setDate(fechaDeParcial);

        Team profes = new Team();
        Team estudiante = new Team();

        //....

        torneoDaVinci.addMatch(primerParcial);
    }
}
