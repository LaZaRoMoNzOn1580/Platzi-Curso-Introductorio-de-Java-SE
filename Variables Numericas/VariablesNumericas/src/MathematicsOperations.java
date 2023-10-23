public class MathematicsOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        System.out.println(Math.ceil(x));

        System.out.println(Math.floor(x));

        System.out.println(Math.pow(y,2));

        System.out.println(Math.max(x,y));

        double CircleArea = Math.PI * Math.pow(y,2);
        System.out.println(CircleArea);

        double EsferaArea = (4*Math.PI) * Math.pow(y,2);
        System.out.println(EsferaArea);

        double EsferaVolumen = (4/3) * Math.PI * Math.pow(y,3);
        System.out.println(EsferaVolumen);

    }
}
