import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[]args) {
        //declare
        Scanner keyboard;

        //initialization phase
        keyboard = new Scanner(System.in);
        System.out.println("Think of a question and give me a number between 1 and 100");
        int firstNumber = keyboard.nextInt();

        if (10 >= firstNumber && firstNumber >0){
            System.out.println("Never"); }
        else if (20 >= firstNumber && firstNumber >10){
            System.out.println("Of course"); }
        else if (30 >= firstNumber && firstNumber >20){
            System.out.println("The outlook looks good"); }
        else if (40 >= firstNumber && firstNumber >30){
            System.out.println("NO"); }
        else if (50 >= firstNumber && firstNumber >40){
            System.out.println("It looks promising"); }
        else if (60 >= firstNumber && firstNumber >50){
            System.out.println("It does not look promising"); }
        else if (70 >= firstNumber && firstNumber >60){
            System.out.println("The outlook seems pretty bad"); }
        else if (80 >= firstNumber && firstNumber >70){
            System.out.println("I feel very confident in this"); }
        else if (90 >= firstNumber && firstNumber >80){
            System.out.println("You don't want to know this answer"); }
        else if (100 >= firstNumber && firstNumber >90){
            System.out.println("Yes"); }
        else System.out.println("LoL that got you nowhere");

    }

}
