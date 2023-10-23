public class SwitchSentence {
    public static void main(String[] args) {

        String[] Themes = {"Light","Dark","BlueDark","Night"};

        switch (Themes[3]){
            case "Light":
                System.out.println("Seleccionaste el modo Light");
                break;
            case "Dark":
                System.out.println("Seleccionaste el modo Dark");
                break;
            case "BlueDark":
                System.out.println("Seleccionaste el modo BlueDark");
                break;
            case "Night":
                System.out.println("Seleccionaste el modo Night");
                break;
            default:
                System.out.println("Selecciona una opcion");
        }
    }
}
