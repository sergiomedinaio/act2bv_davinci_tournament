import java.util.Date;

public class Main {
    public static void main(String args[]) {
        System.out.println("Da vinci tournament");
        Season torneoDaVinci = new Season();
        torneoDaVinci.setName("Torneo POO 2022, 2do Cuatri");

        Date comienzoDeCuatri = new Date();
        comienzoDeCuatri.setYear(2022);
        comienzoDeCuatri.setMonth(7); // Enero es 0, Agosto es 7
        comienzoDeCuatri.setDate(16); //Date es fecha (1, 31), Day dia de la semana Domingo es 0
        torneoDaVinci.setStartDate(comienzoDeCuatri);

        Date finDelCuatri = new Date();
        finDelCuatri.setYear(2022);
        finDelCuatri.setMonth(11); // Dic es 11
        finDelCuatri.setDate(5);
        torneoDaVinci.setEndDate(finDelCuatri);

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
