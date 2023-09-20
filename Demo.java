public class Demo {
    public static void main(String args[]) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0)
                throw new ArithmeticException("I dont wnat to 0");
        }
        catch(ArithmeticException e) {
            // System.out.println("Can not divide by zero.." + e);
            j = 18/1;
            System.out.println("that the default" + e);
        }
        catch(Exception e) {
            System.out.println("Something went wrong.." + e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}