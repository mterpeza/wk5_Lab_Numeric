package wk5_numeric;

import java.util.Scanner;

public class numeric {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number: ");
        long num = in.nextLong();
        System.out.print("This number can be stored in a ");
        if(num <= Byte.MAX_VALUE && num >= Byte.MIN_VALUE) {
            System.out.println("Byte of 1 byte");
        }
        else if(num <= Short.MAX_VALUE && num >= Short.MIN_VALUE) {
            System.out.println("Short of 2 bytes");
        }
        else if(num <= Integer.MAX_VALUE && num >= Integer.MIN_VALUE) {
            System.out.println("Integer of 4 bytes");
        } else {
            System.out.println("Long of 8 bytes");
        }
    }

}
