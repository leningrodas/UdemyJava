package variables;

public class NumericalValues2 {
    public static void main (String[] args){
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println(myMaxFloatValue);
        System.out.println(myMinFloatValue);


        float myFloatNumber = 4.54f;
        double myDoubleNumber = 4.65d;

        double numberOfPounds = 5;
        double convertedValue = (double) (numberOfPounds * .4535);


        System.out.println(convertedValue);

        char myChar = 'd';
        char myUniCde = '\u0044';
        System.out.println(myChar);
        System.out.println(myUniCde);


    }
}
