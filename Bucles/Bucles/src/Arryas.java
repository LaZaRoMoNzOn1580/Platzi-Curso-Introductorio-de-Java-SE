public class Arryas {
    public static void main(String[] args) {

        String[] androidVersions = new String[17];
        String days[] = new String[7];

        String[][] cities = new String[2][2];
        int [][][] numbers = new int[2][2][2];

        cities[0][0] = "Cuba";
        cities[0][1] = "La Havana";
        cities[1][0] = "Spain";
        cities[1][1] = "Madrid";


        days[0] = "Lunes";
        days[1] = "Martes";
        days[2] = "Miercoles";
        days[3] = "Jueves";
        days[4] = "Viernes";
        days[5] = "Sabado";
        days[6] = "Domingo";

        // System.out.println(days[5]);

        for (String day: days) {
            System.out.println(day);
        }

        for (String[] pair: cities) {
            for (String element: pair) {
                System.out.println(element);
            }
        }

        for (int i = 0;i < cities.length;i++){
            for (int j = 0;j < cities.length;j++){
                System.out.println(cities[i][j]);
            }
        }


    }
}
