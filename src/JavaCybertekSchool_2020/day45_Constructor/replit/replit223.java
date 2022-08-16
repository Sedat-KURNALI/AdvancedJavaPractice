package JavaCybertekSchool_2020.day45_Constructor.replit;

public class replit223 {
    public static void main(String[] args) {

        Calc a = new Calc();
        a.setX(1);
        a.setY(1);
        a.plus();
        System.out.println("1+1 = "+ a.getResult());//1+1 = 2

    }


    private static class Calc {
        private int x;
        private int y;
        private int result;

        public void setX(int x){
            this.x=x;
        }
        public void setY(int y){
            this.y = y;
        }
        public int getResult(){
            return result;
        }
        public void plus(){
            result=x+y;
        }
        public void minus(){
            result=x-y;
        }


    }
}
