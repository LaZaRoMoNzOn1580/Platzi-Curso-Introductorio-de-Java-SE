public class Casting {
    public static void main(String[] args) {
       // char c = ‘z’; conviertelo a int
       // int i = 250; conviertelo a long y luego de long a short
       // double d = 301.067; conviertelo a long
       // int i = 100; súmale 5000.66 y conviertelo a float
       // int i = 737; multiplícalo por 100 y conviertelo a byte
       // double d = 298.638; divídelo entre 25 y conviertelo a long

        char c = 'z';
        int c2 = (int) c;
        System.out.println(c2);

        int i = 250;
        long a = i;
        short b = (short) a;
        System.out.println(b);

        double d = 3001.067;
        long e = (long) d;
        System.out.println(e);

        int i2 = 1000;
        i2 += 5000.66;
        float i3 = (float) i2;
        System.out.println(i3);

        int i4 = 737;
        i4 *= 100;
        byte i5 = (byte) i4;
        System.out.println(i5);

        double d2 = 298.638;
        d2 /= 25;
        long d3 = (long) d2;
        System.out.println(d3);

    }
}
