import java.util.HashMap;
import java.util.Scanner;

public class TestDriver {

    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.size = 40;
//        d.Bark();
//
//        Movie one = new Movie();
//        one.title = "damn";
//        one.genre = "comedy";
//        one.genre = "4";
//        one.playIt();
//
//        String[] arr;
//        arr = new String[7];
//        arr[1] = "string";
//        arr[2] = "array";
//        System.out.println(arr[2]);
//
//        int[] nums;
//        nums = new int[5];
//        nums[0] = 1;
//        nums[1] = 2;
//        nums[2] = 3;
//        nums[3] = 4;
//        nums[4] = 5;
//
//        testingNumber(2,6);
//        int count = 2;
////        while(count != 6){
////            System.out.println("value is " + count);
////            count++;
////        }
////        for(count = 1; count < 7; count++){
////            System.out.println("value of count is " + count);
////        }
//        do {
//            System.out.println("count value " + count);
//            count++;
//        } while (count!= 6);
//
//        isEvenNumber(1);
//        isEvenNumber(3);
//
//        int A[] = { 1, 6, 4, 6, 4, 8, 2, 4, 1, 1 };
//
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] > max)
//                max = A[i];
//        }
//
//        int B[] = new int[max + 1];
//        for (int i = 0; i < A.length; i++) {
//
//            // increment in array B for every integer
//            // in A.
//            B[A[i]]++;
//        }
//        for (int i = 0; i <= max; i++) {
//            // output only if element is more than
//            // 1 time in array A.
//            if (B[i] > 1)
//                System.out.println(i + "-" + B[i]);
//        }

//        int[] a = { 1, 6, 4, 6, 4, 8, 2, 4, 1, 1,5,3,4,1,1,2 };
//        int n = a.length; // size of array
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//
//            if (map.containsKey(a[i])) {
//
//                // if element is already in map
//                // then increase the value of element at
//                // index by 1
//
//                int c = map.get(a[i]);
//                map.replace(a[i], c + 1);
//            }
//
//            // if element is not in map than assign it by 1.
//            else
//                map.put(a[i], 1);
//        }
//        for (Map.Entry<Integer, Integer> i :
//                map.entrySet()) {
//
//            // print only if count of element is greater
//            // than 1.
//            if (i.getValue() > 1)
//                System.out.println(i.getKey() + " "
//                        + i.getValue());
//
//            else
//                continue;
//        }


//        int number = 4;
//        int finishNumber = 20;
//        int count = 0;
//        while(number <= finishNumber){
//            number++;
//
//            if(!isEvenNumber(number)){
//                continue;
//            }
//            count++;
//            System.out.println("even number " + number + " count is " + count);
//            if(count >= 5) {
//
//                break;
//            }
//        }
//        sumDigits(125);
//        sumDigits(9);
//        Scanner sc=new Scanner(System.in);
//        int[] b=new int[50];
//        System.out.println("enter size of an array");
//        int size=sc.nextInt();
//        System.out.println("enter elements of an array");
//        for(int i=0;i<size;i++)
//        {
//            b[i]=sc.nextInt();
//        }
//        Repeating(b,size);
//        sc.close();
        int number = 0;
        int sum = 0;

        // create Scanner class object
        // for reading the values
        Scanner scan =  new Scanner(System.in);

        // read input
        System.out.print("Enter an integer number:: ");
        number = scan.nextInt();

        // find sum of digits of number
        sum = sumFirstAndLastDigit(number);

        // display result
        System.out.println("The sum of first & last"
                +" digit of the number "+number
                +" = "+ sum);

        // close Scanner class object
        scan.close();


    numberPalindrome(454);


    }

    public static int sumFirstAndLastDigit(int number){

       int divisor, firstDigit;
       int sum;
       int total = findDigits(number);
        int last_digit = number % 10;
       divisor = (int)Math.pow(10, total-1);
       firstDigit = number / divisor;
       sum = firstDigit + last_digit;

       return sum;


    }

    public static int findDigits(int number){
        int count = 0;
        while(number !=0){
            count++;
            number = number/10;
        }
        return count;
    }


    public static void numberPalindrome (int n) {
        int r, sum = 0, temp;
        //It is the number variable to be checked for palindrome

        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }

    public static void Repeating(int b[],int n)
    {
        int count;
        System.out.println("Repeating number in array");
        for(int i=0;i<n;i++)
        {
            count=0;
            for (int j = i+1; j < n; j++)
            {
                if(b[i]==b[j] && i!=j)
                    System.out.print(b[i]+" ");
            }
        }
    }

    public static int sumDigits (int number){

        if(number < 10){
           return -1;
        }
        int sum = 0;
        while(number > 0){
            int digits = number % 10;
            sum += digits;
            number/=10;
        }
        System.out.println("number " + sum);
        return sum;
    }



    public static boolean isEvenNumber (int x){
        if(x % 2 == 0){

            return true;
        } else {

            return false;
        }

    }

    public static int testingNumber(int x, int y){
        int g = x + y;
        System.out.println(g);
        return g;

    }

    void  takeTwo (int x, int y){
    int z = x + y;
        System.out.println("Total is " + z);
    }




}

