package HMS;
import java.io.*;
import java.util.Scanner;
import java.io.PrintWriter;

class HotelMS {
    public static void main(String[] args)throws IOException
    {
        Scanner s=new Scanner(System.in);
        File loc = new File("F:\\prog\\java\\javaP\\src\\HMS");

        int x,n=50;
        int []av= new int[n];
        //room no's (0-49)
        for (int i = 0; i < n ; i++) {
            av[i]=i;
        }
        System.out.println("Welcome to Hotel Management System!\nWe are always here to help you :)");
        System.out.println("Press 1 for customer services\nPress 0 for staff services");
        x= s.nextInt();
        switch(x)
        {
            case 1:
                System.out.println("Dear customer, How can we help you?");
                System.out.println("Enter I for Hotel Booking or Check out\nR for requests or complains:");
                char ch;
Scanner sc = new Scanner(System.in);

                ch= sc.next().charAt(0);

                int rn;
                switch(ch)
                {
                    case 'I':

                        char c;
                        System.out.println("enter B for booking\nenter C for checkout");
                        c=s.next().charAt(0);
                        if(c=='B') {
                            String name;
                            String place;
                            int people;
                            System.out.println("Hotel Booking:");
                            // enter details in the file with room no

                            int ac = 2500, pay, corr;
                            System.out.println("Pay Rs 2500");
                            pay = s.nextInt();
                            if (pay < 2500 && pay > 0) {
                                System.out.println("please pay the left amount i.e " + (ac - pay));
                                corr = s.nextInt();
                                System.out.println("Transaction successful...");


                            } else if (pay == 2500) {
                                System.out.println("Transaction successful...");

                            } else {
                                System.out.println("invalid amount, Transaction unsuccessful...");
                            }

                            System.out.println("enter which room no you want to book (1-49):");

                            rn = s.nextInt();

                            System.out.println("enter your name:");
                            s.nextLine();
                            name = s.nextLine();

                            String book = "Room no " +rn+" is booked by "+name;
                            File ls[]= loc.listFiles();
                            for (File k :ls)           //.equals("")
                            {
                                if(k.getName().equals("book.txt"))
                                {
                                    System.out.println("append the content into the new file");//append the content into the new file
                                }
                            }
                            File f = new File("F:\\prog\\java\\javaP\\src\\HMS\\book.txt");
                            f.createNewFile();
                            PrintWriter p = new PrintWriter(f);
                            p.print(book);
                            p.close();




//                            System.out.println(name);
                            System.out.println("enter your place:");


                            place = s.nextLine();
//                            System.out.println(place);


                            System.out.println("enter no of person:");
                            people = s.nextInt();
//                            System.out.println(people);
                            System.out.println("Room booked Successfully");
                        } else if (c=='C') {
                            System.out.println("Check out");
                            // just release the room in the array

                            System.out.println("Enter your room no:");
                            int room;
                            room = s.nextInt();
                            av[room]=room;
                            String namech;

                            System.out.println("enter your name:");
                            s.nextLine();
                            namech=s.nextLine();

String avail_after_checkout="Room no "+room +"is left by "+namech;

                            File ls[]=loc.listFiles();
                            for (File k :ls)           //.equals("")
                            {
                                if(k.getName().equals("avail_after_checkout.txt") )
                                {
                                    System.out.println("appen the contents");
                                }
                            }
                            File f = new File("F:\\prog\\java\\javaP\\src\\HMS\\avail_after_checkout.txt");
                            f.createNewFile();
                            PrintWriter p = new PrintWriter(f);
                            p.print(avail_after_checkout);
                            p.close();

                        }
                        else
                        {
                            System.out.println("Invalid character");
                        }


                        break;
                    case 'R':
                        System.out.println("Enter your Requests/Complains");
                        String comp;
                        s.nextLine();
                        comp=s.nextLine();
                        System.out.println("enter your name_roomno:");
                        String nrm;
                        nrm= s.next();
                        File f = new File("F:\\prog\\java\\javaP\\src\\HMS\\"+nrm);
                        f.createNewFile();


                        PrintWriter p=new PrintWriter(f);
                        p.print(comp);
                        //user will enter the string mentioning the room no and that will be copied into the file
                        p.close();

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
                    //read the content of book and avail after check out

                    break;
                default:
                    System.out.println("Invalid character");
            }

                System.out.println("Thanks for using HMS : )");

        }
    }
}