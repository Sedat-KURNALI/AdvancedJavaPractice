package TECHNOSTUDY_USA.example;


public class middle_String_Example {


        public String middleWord(String name){

            String result = null;

            String[] resArr = name.split(" ");

            if( resArr.length % 2 == 0 ){

                result = resArr[(resArr.length/2)-1];

            }else{

                result = resArr[(resArr.length/2)];

            }

            return result;
        }

    public static void main(String[] args) {

    }

    }
