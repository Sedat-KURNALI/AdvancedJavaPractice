package JavaCybertekSchool_2020.day45_Constructor.replit;

public class rep219 {


        public static void main(String[] args) {

            LameCalculator lc = new LameCalculator();
            System.out.println("1+1 = "+lc.plus(1,1));
            System.out.println("2-3 = "+lc.minus(2,3));
            System.out.println("2x3 = "+lc.multiply(2,3));
            System.out.println("10:2 = "+lc.divide(10,2));




        }

    private static class LameCalculator {

        public int plus(int i, int i1) {
            return i+i1;
        }

        public int minus(int i, int i1) {
            return i-i1;
        }

        public int multiply(int i, int i1) {
            return i*i1;
        }

        public int divide(int i, int i1) {
            return i/i1;
        }
    }
}
