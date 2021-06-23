import java.util.Scanner;

public class IFStatement {

    public static void main (String[] args){


        boolean isAlien = false;
        if(isAlien == false)
            System.out.println("it is not an alien");
        System.out.println("these two souts will populate due to being false");

        int topScore = 90;
        if(topScore >= 100){
            System.out.println("high score");
        }
        if(topScore <= 100) {
            System.out.println("correct");
        }

        double firstVariable = 20.00d;
        double secondVariable = 80.00d;
        double resultFirst =  (firstVariable + secondVariable) * 100.00d;
        System.out.println(resultFirst);
        double theRemainder = resultFirst % 40.00d;
        System.out.println(theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println(isNoRemainder);
        if(!isNoRemainder){
            System.out.println("got some remainder");
        }



    }
}
