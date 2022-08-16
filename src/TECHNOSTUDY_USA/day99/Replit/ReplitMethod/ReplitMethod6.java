package TECHNOSTUDY_USA.day99.Replit.ReplitMethod;

public class ReplitMethod6 {
    /*
    create one method which is EvenOddNums ***
    this method will accept one parameter which is String ***
    In this String there will be 10 digit numbers like 1234567890 ???
    Take the each digit from the number and if the digit is an even add the digits, ***
    if the digit is an odd subtract the digits. ***
    Print the total.
    Hint: You need to convert your digits from string to integer
    For _duzenle.TECHNOSTUDY_USA.example
    String is "6678421312"
    6+6-7+8+4+2-1-3-1+2
    result should be 16
     */
    public static int EvenOddNums (String word){
        int sum = 0;
        char [] chr = new char[word.length()];
        int [] arrNum = new int [word.length()];
        for (int i = 0; i <word.length() ; i++) { // iteration
             chr[i] = word.charAt(i);
             arrNum[i] = Integer.valueOf(chr[i]-'0'); // '0'=59
             if ( arrNum[i]%2 == 0 ) {
                 sum += arrNum[i];
             }else {
                 sum -= arrNum[i];
             }
        }

        return sum;
    }

    public static void main(String[] args) {
            String a = "6678421312";
        System.out.println(EvenOddNums(a));
    }
}
