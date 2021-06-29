public class codingChallenges {
    public static void main(String[] args) {
//        checkNumber(3);
//        checkNumber(0);
//        checkNumber(-04);



//        shouldWakeUp(true, 1);
//        shouldWakeUp(false,3);
//        shouldWakeUp(true, 23);
//        shouldWakeUp(false, 23);
//
//        isLeapyear(1600);
//        isLeapyear(1200);
//        isLeapyear(2000);

        char switchValue = 'a';
        switch(switchValue) {
            case 'b':
                System.out.println("value was is not b");
                break;
            case 'c':
                System.out.println("value was not c");
                break;
            case 'd': case 'e': case 'f':
                System.out.println("value is not d nor e nor f");
                break;
            default:
                System.out.println("value was actually a");
                break;
        }


    }


    public static void checkNumber (int e){
        if(e > 0){
            System.out.println("positive");
        } else if (e < 0){
            System.out.println("negative");
        } else if (e == 0){
            System.out.println("number is equal to 0");
        }
    }

    public static void isLeapyear(int year){
        if(year >= 1 || year <= 9999){
            if((year % 400 == 0 || (year % 4 == 0) && !(year % 100 == 0))) {
                System.out.println("true");
            }
        } else  {
        System.out.println("false");
    } }


//    public static long toMilesPerHour(double  kilometersPerHour){
//        if(kilometersPerHour < 0){
//          return -1;
//        }
//        return Math.round(kilometersPerHour / 1.609);
//    }
//
//    public static void printConversion (double kilometersPerHour ){
//        if(kilometersPerHour < 0){
//            System.out.println("invalid value");
//        } else {
//            long milesperHour = toMilesPerHour(kilometersPerHour);
//            System.out.println(kilometersPerHour +  "km/h = " + milesperHour + "mi/h");
//        }
//    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid value");
        } else {
            long megaBytes = kiloBytes / 1024;
            System.out.println(kiloBytes + "KB =" + megaBytes + " Mb"  );
        }
    }

    public static void shouldWakeUp(boolean barking, int hourOfDay){
        if(barking && hourOfDay < 8 || hourOfDay > 22){

            System.out.println("true");
        } else {
            System.out.println("false");

        }
    }








}
