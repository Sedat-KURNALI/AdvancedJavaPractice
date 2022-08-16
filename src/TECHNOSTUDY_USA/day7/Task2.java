package TECHNOSTUDY_USA.day7;

public class Task2 {
    /*
    Part1
     using text "software DEV"
     fix it to "SOFTWARE DEV"
     hint: use substring
     */
/*
package _duzenle.TECHNOSTUDY_USA.day7;

public class Task2 {
    // part 1
    // using text "software DEV inc"
    // fix it to "SOFTWARE DEV inc"
    // hint: use substring

    // part 2
    // using text "software DEVELOPER in test"
    // fix it to "SOFTWARE DEVELOPER in TEST"

    public static void main(String[] args) {
        String text = "software DEVELOPER inc";
        // 1. step: separate string in to two parts:
        // a. "software"  b. " DEVELOPER inc"
        String part1 = text.substring( 0, 8 ); // can use text.indexOf( " " ) to get correct index
        System.out.println( "part1: " + part1 );

        String part2 = text.substring( 8 );
        System.out.println( "part2: " + part2 );

        // 2 step: uppercase part1, and reassign to part1 variable
        part1 = part1.toUpperCase();

        // 3 step: print them together
        System.out.println( part1 + part2 );
 */
    //Part2
    // using text "software DEV inc"
    // fix it to "SOFTWARE DEV inc"
    // use indexOf method instead of using index number
    public static void main(String[] args) {
        String  text = "software DEVELOPER inc";
        int startingIndex = text.indexOf( 's' );
        int endingIndex = text.indexOf(' ');
String part1 = text.substring( startingIndex, endingIndex );
        System.out.println("part1: "+part1);

        startingIndex = text.indexOf( " DEVELOPER" );
        String part2 = text.substring ( startingIndex);
        System.out.println("part2: "+ part2);

        part1 = part1.toUpperCase();

        System.out.println(part1+part2);



    //Part3:
    // using text "software DEVELOPER in test"
    // fix it to "SOFTWARE DEVELOPER in TEST"
// hint: use substring
/*
    public static void main(String[] args) {
        String  text = "software DEVELOPER in test";
        String subtext = text.substring(0, 18);
        String text2 = " in ";
        String lastText = text.substring(22,26);
        System.out.println(subtext.toUpperCase()+text2+lastText.toUpperCase());
  */

    }

}
