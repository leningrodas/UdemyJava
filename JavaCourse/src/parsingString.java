public class parsingString {
    public static void main(String[] args) {
        String numberAsString ="2018";
        System.out.println("numberasString= " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);
//this numberasString += 1 adds the number to the number string at the end of the last number
        numberAsString += 1;

//        this sums up the number to the number it is being added to.
        number += 1;

        System.out.println("number as string =" + numberAsString);
        System.out.println("number 2 = " + number);



        canPack(1,0,5);


    }

    public static void canPack (int bigCount, int smallCount, int goal){


        int sum = bigCount + smallCount;
        if(goal == sum) {
            System.out.println("true");
        } else {
                System.out.println("false");
            }




    }



}
