package HMS;

import java.util.Scanner;
class HotelMS {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int x;

        System.out.println("Welcome to Hotel Management System!\nWe are always here to help you :)");
        System.out.println("Press 1 for customer services\nPress 0 for staff services");
        x= s.nextInt();
        switch(x)
        {
            case 1:
                System.out.println("Dear customer, How can we help you?");
                System.out.println("Enter F for food related services \nT for Transport related services\nC for complaints:");
                char ch;
                ch= s.next().charAt(0);
                switch(ch)
                {
                    case 'F':
                        System.out.println("food related services ");
                        break;
                    case 'T':
                        System.out.println("transport related services ");
                        break;
                    case 'C':
                        System.out.println("submit your complain");
                        break;
                        default:
                            System.out.println("Invalid Character");



                }
                break;

            case 0:
                System.out.println("welcome to staff services : )");
        }
    }
}