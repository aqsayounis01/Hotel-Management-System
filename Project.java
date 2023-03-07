package HMS;

import java.util.Scanner;
class HotelMS {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int x;
        x= s.nextInt();
        System.out.println("Welcome to Hotel Management System!\nWe are always here to help you :)");
        System.out.println("Press 1 for customer services\nPress 0 for staff services");
        switch(x)
        {
            case 1:
                System.out.println("Dear customer, How can we help you?");
                break;
        }
    }
}