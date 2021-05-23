import java.util.Scanner;

public class Primitives {
    static public void main(String[] args) {

        int number = 1000;
        // number has particular range [-214...8, 214...7], going to right or left will overflow

        // error of too big value
        //int num = 20020200200223;

        int val = 7_25_000;
        System.out.println("The above format is just for understanding easily " + val);

        byte myByteMinValue = Byte.MAX_VALUE; // -128
        byte myByteMaxValue = Byte.MIN_VALUE; // 127

        long l = 34L;
        long boxing = 12;

         char c = 'C';
         char d = '\u0049';
        char de = '\u0958';

        System.out.println(d + " " + de);

        String raki = "raki";
        System.out.println(raki);

        int myInt = 10;
        raki += myInt; // int type casted to string
        System.out.println(raki);

        // Strings are java is immutable
        // for line 31, raki is not deleted, instead it will remain in the string pool, and raki10 is also created

        boolean b = true;

        if (b = false) {
            System.out.println("Bookean");
        }


        for(int i = 0; i< 1;i++){
            System.out.println("ff");
        }

        int i = 0;
        do {
            i++;
            System.out.println("inside d while");
        }while (i  < 5);

        // hasNextInt(), checks if input has next integer

    }



}
