package HMS;

import java.util.Scanner;
class HotelMS {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int x;
        int []av= new int[50];
        //room no's
        for (int i = 0; i < 50 ; i++) {
            av[i]=i+1;
        }
        System.out.println("Welcome to Hotel Management System!\nWe are always here to help you :)");
        System.out.println("Press 1 for customer services\nPress 0 for staff services");
        x= s.nextInt();
        switch(x)
        {
            case 1:
                System.out.println("Dear customer, How can we help you?");
                System.out.println("Enter B for Hotel Booking \nC for check out\nR for requests or complains:");
                char ch;
                ch= s.next().charAt(0);

                switch(ch)
                {
                    case 'B':
                        int rn;
                        String name;

                        String place;
                        int people;
                        System.out.println("Hotel Booking:");
                        System.out.println("enter which room no you want to book (1-50):");
                        rn=s.nextInt();


                        System.out.println("enter your name:");
                        s.nextLine();
                        name=s.nextLine();


                        System.out.println(name);
                        System.out.println("enter your place:");


                        place=s.nextLine();
                        System.out.println(place);


                        System.out.println("enter no of person:");
people=s.nextInt();

                        System.out.println(people);



                        // enter details in the file with room no

                        int ac=2500,pay,corr;
                        System.out.println("Your payment is Rs 2500");
                        pay=s.nextInt();
                        if (pay <2500 && pay>0) {
                            System.out.println("please pay the left amount i.e " + (ac-pay));
                            corr=s.nextInt();
                            System.out.println("Transaction successful...");
                            System.out.println("Room booked Successfully");

                        }
                        else if(pay ==2500)
                        {
                            System.out.println("Transaction successful...");
                            System.out.println("Room booked Successfully");
                        }
                        else
                        {
                            System.out.println("invalid amount, Transaction unsuccessful...");
                        }



                        break;
                    case 'R':
                        System.out.println("Requests/Complains");
                        //user will enter the string mentioning the room no and that will be copied into the file
                        break;
                    case 'C':
                        System.out.println("Check out");
                        // just realese the room in the array
                        break;
                        default:
                            System.out.println("Invalid Character");



                }
                break;

            case 0:
                System.out.println("welcome to staff services : )");
                System.out.println("Enter C for viewing complains\nA for checking Availibility of rooms:");
                char st= s.next().charAt(0);
                switch (st)
            {
                case 'C':
                    System.out.println("complains");
                    //files in the location will be read
                    break;
                case 'A':
                    System.out.println("check avalibility");
                    //array with the room no's will be checked
                    break;
                default:
                    System.out.println("Invalid character");
            }

                System.out.println("Thanks for using HMS : )");

        }
    }
}