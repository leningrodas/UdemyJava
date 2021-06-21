package variables;

public class numericalValues {

    public static void main (String[] args){
        short myMaxShort = Short.MAX_VALUE;
        short myMinShort = Short.MIN_VALUE;
        System.out.println(myMaxShort);
        System.out.println(myMinShort);

        byte myMaxByte = Byte.MAX_VALUE;
        byte myMinByte = Byte.MIN_VALUE;
        System.out.println(myMaxByte);
        System.out.println(myMinByte);

        long myLongValue = 100L;
//        long needs a capitalize L at the end of the number if not the IDe will consider it an INTEGER and tha is not what we want

    byte myNewByteValue = (byte) (myMaxByte / 2);
//    the extra byte or extra numerical variable in the parentheses tells, the computer to treat the number value as a byte.


        byte myChallege = 12;
        short myShortChallenge = 1234;
        int myIntNumber = 124354;
        long totalNumber = (long)  5000 + (10 * (myChallege + myShortChallenge + myIntNumber));
        System.out.println(totalNumber);

    }
}
