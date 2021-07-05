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

//        char switchValue = 'd';
//        switch(switchValue) {
//            case 'b':
//                System.out.println("value was is not b");
//                break;
//            case 'c':
//                System.out.println("value was not c");
//                break;
//            case 'd': case 'e': case 'f':
//                System.out.println("value is not d nor e nor f");
//                break;
//            default:
//                System.out.println("value was actually a");
//                break;
//        }
//        printDayOfTheWeek(5);
//        printDayOfTheWeek(7);

//        printNUmberInWord(2);
//
//        for(double i=2; i<9; i++){
//            System.out.println("interest rate for " + i + " are " + calculateInterest(10000, i));
//        }
//        System.out.println("in reverse");
//        for(double i=9; i>=2; i--){
//            System.out.println("interest rate for " + i + " are " + calculateInterest(10000, i));
//        }
//
//        int count = 0;
//        int sum = 0;
//        for(int i=1; i<=1000; i++){
//            if((i % 3 == 0) && (i % 5 == 0)){
//                count++;
//                sum += i;
//                System.out.println("number is " + i);
//            }
//            if(count == 5){
//                break;
//            }
//        }
//        System.out.println("sum = " + sum);
        isOdd(-1);
        isOdd(2);
        isOdd(3);
        sumOdd(1, 39);
    }

    public static void isOdd(int number){
        if(number < 0){
            System.out.println("false");
        } else if(number % 2 == 1){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    public static int sumOdd(int start, int end){
        int count=0;
        int sum = 0;
        for(int i=start; i<end; i++) {

                count++;
                sum += i;

            }
        return sum;
        }



    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }




    public static void printDayOfTheWeek (int day){
              switch(day){
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    public static void printNUmberInWord(int num){
        switch(num){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THree");
                break;
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("out of scope");

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
