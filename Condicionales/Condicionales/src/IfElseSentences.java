public class IfElseSentences {
    public static void main(String[] args) {

        boolean isBluetoothEnabled = true;
        int fileSend = 3;

        int a = 5;
        int b = 4;

        // Operadores asignacion
        System.out.println("a es igual a b?: " + (a == b));
        System.out.println("a es diferente de b?: " + (a != b));

        // Operadores relacionales
        System.out.println("a es mayor a b? -> " + (a > b));
        System.out.println("a es mayor o igual a b? -> " + (a >= b));
        System.out.println("a es menor a b? -> " + (a < b));
        System.out.println("a es menor o igual a b? -> " + (a <= b));



        if(isBluetoothEnabled){
            fileSend++;
            System.out.println("Archivo Enviado");
        } else {
            System.out.println("Enciende el Bluetooth");
        }
    }
}
