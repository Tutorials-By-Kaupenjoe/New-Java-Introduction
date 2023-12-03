package kaupenjoe;

public class Main {
    public static void main(String[] args) throws Exception {
        /* Exceptions & Try and Catch */
        int x = 10;
        try {
            x = 100 / 0;
        } catch(Exception e) {
            System.out.println("Caught Exception " + e.getMessage());
        }

        System.out.println("I am happy!");

        if(x < 100) {
            throw new Exception("Just throwing for fun!");
        }
    }
}