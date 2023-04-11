// append // exception handling

package HMS;
import java.io.*;
import java.util.Scanner;
import java.io.PrintWriter;
import java.time.LocalDateTime;
class HotelMS {
    public static void main(String[] args)throws IOException
    {
        LocalDateTime t = LocalDateTime.now();
        Scanner s=new Scanner(System.in);
        File fch=new File("F:\\prog\\java\\javaP\\src\\HMS\\checout.txt");
        File fc = new File("F:\\prog\\java\\javaP\\src\\HMS\\complain.txt");
        File loc = new File("F:\\prog\\java\\javaP\\src\\HMS");
        File f = new File("F:\\prog\\java\\javaP\\src\\HMS\\book.txt");
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
                        if(c=='B'){
                            String name;
                            String place;
                            int people;
                            System.out.println("Hotel Booking:");


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

                            String book = "Room no " +rn+" is booked by "+name+" on "+t;
                            File ls[]= loc.listFiles();

                            for (File k :ls)           //.equals("")
                            {
                                if(k.getName().equals("book.txt"))
                                {

                                 //append the content into the new file




                                }
                            }

                            f.createNewFile();
                            PrintWriter p = new PrintWriter(f);
                            p.print(book);
                            p.close();



                            System.out.println("enter no of person:");
                            people = s.nextInt();
                            if (people>3)
                            {
                                System.out.println("MORE THAN 3 PEOPLE NOT ALLOWED IN ONE ROOM");
                            }

                            System.out.println("Room booked Successfully");
                        } else if (c=='C') {
                            System.out.println("Check out");

                            System.out.println("Enter your room no:");
                            int room;
                            room = s.nextInt();
                            String namech;
                            System.out.println("enter your name:");
                            s.nextLine();
                            namech=s.nextLine();

                            String avail_after_checkout="Room no "+room +"is left by "+namech+" on "+t;

                            File ls[]=loc.listFiles();
                            for (File k :ls)           //.equals("")
                            {
                                if(k.getName().equals("avail_after_checkout.txt") )
                                {
                                    System.out.println("append the contents");
                                }
                            }

                            f.createNewFile();
                            PrintWriter p = new PrintWriter(fch);
                            p.print(avail_after_checkout);
                            p.close();
                            System.out.println("You are ready for check out :)");

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

                        fc.createNewFile();


                        PrintWriter p=new PrintWriter(fc);
                        p.print(comp);

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
                case 'c':
                    System.out.println("complains");

                    Scanner scomp = new Scanner(fc);
                    String comp = scomp.nextLine();
                    System.out.println(comp);
                    break;
                case 'A':
                    System.out.println("check avalibility");
                    Scanner scn = new Scanner(f);
                    String bk = scn.nextLine();
                    System.out.println(bk);

                    break;
                default:
                    System.out.println("Invalid character");
            }

                System.out.println("Thanks for using HMS : )");

        }
    }
}