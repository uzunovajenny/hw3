public class lesson3 {

        public static void main(String[] args) {

            //System.out.println("Hello, World!");
            //System.out.println("Привет, Java!");
            //System.out.print("Hello, ");
            //System.out.print("World!\n");

            //int x = 10;

            //System.out.println("Значение x = " + x);

            //double d = 14.7;

            //String str = "";

            //System.out.printf("%5s %10d %5.3f\n", str, x, d);

            System.out.println("-----------------------------------------------------------------"+
                    "--------------------------------------------------------------------------------+");

            System.out.printf("%10s | %10s | %10s | %10s | %10s | %10s | %10s | %10s |\n", "byte", "short", "int", "long", "float", "double",
                    "char", "boolean");
            byte b = 1;
            short s = 2000;
            int i = 1000000000;
            long l = 10000000000l;
            float f = 12.345f;
            double d1 = 25.64775;
            char c = 's';
            boolean bool = true;

            System.out.println("----------------------------------------------------------------" +
                    "--------------------------------------------------------------------------------+");

            System.out.printf("%10d | %10d | %10d | %10d | %10f | %10f | %10c | %10b |", b, s, i, l, f, d1, c, bool);


        }

}
