public class Funciones {

    public static void main(String[] args) {

        System.out.println(circleArea(3));
        System.out.println(sphereArea(3));
        System.out.println("Pesos a dolar: " + convertToDollar(200, "CUB"));


    }

    public static double circleArea(double radio){
        return Math.PI * Math.pow(radio,2);
    }

    public static double sphereArea(double radio){
        return 4 * Math.PI * Math.pow(radio,2);
    }


    /**
     * <p>Descripcion: Funcion que espesificando su moneda convierte una cantidad de dinero a <strong>dolares</strong></p>
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de Moneda: Solo acepta MXN, COP y CUB
     * @return quantity Devuelve la cantidad actualizada en dolares
     * */
    public static double convertToDollar(double quantity, String currency){

        switch (currency){
            case "MXN":
                quantity *= 0.052;
                break;
            case "COP":
                quantity *= 0.00031;
                break;
            case "CUB":
                quantity *= 0.0417369;
                break;

        }

        return quantity;


    }


}
