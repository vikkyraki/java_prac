
// Keywords are class sensitive
// public - access modifier

// order does not matter, but return type should be before function

import oops.Base;

import java.util.Scanner;

public class Hello {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println("Hello " + name);

//        Base base = new Base();
//        Base.testStatic();

    }

}
