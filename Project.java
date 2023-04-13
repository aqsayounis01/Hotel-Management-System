 // exception handling
// format the time
package HMS;
import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.io.FileWriter;

class HotelMS {
    public static void main(String[] args)throws IOException
    {
        LocalDateTime t = LocalDateTime.now();
        DateTimeFormatter ft = DateTimeFormatter.ofPattern("dd/MM/yy  HH:mm:ss");
        String fordt = t.format(ft);

        Scanner s=new Scanner(System.in);
        File fch=new File("F:\\prog\\java\\javaP\\src\\HMS\\checkout.txt");
        File fc = new File("F:\\prog\\java\\javaP\\src\\HMS\\complains.txt");
        File f = new File("F:\\prog\\java\\javaP\\src\\HMS\\book.txt");
        int x,n=50;
        int []av= new int[n];
        //room no's (0-49)
        for (int i = 0; i < n ; i++) {
            av[i]=i;
        }

        System.out.println("Welcome to Hotel Management System!\nWe are always here to help you :)");
        System.out.println("-Enter 1 for customer services\n-0 for manager services:");
        try {
            x = s.nextInt();

            switch (x) {
                case 1:
                    System.out.println("Dear customer, How can we help you?");
                    System.out.println("-Enter I for Hotel Booking or Check out\n-R for requests or complains:");
                    char ch;
                    Scanner sc = new Scanner(System.in);
                    ch = sc.next().charAt(0);

                    int rn;
                    switch (ch) {
                        case 'I':

                            char c;
                            System.out.println("enter B for booking\nenter C for checkout");

                            c = s.next().charAt(0);
                            if (c == 'B') {
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
                                    return;
                                }

                                System.out.println("enter which room no you want to book (1-49):");
                                rn = s.nextInt();

                                System.out.println("enter your name:");
                                s.nextLine();
                                name = s.nextLine();

                                String book = "Room no " + rn + " is booked by " + name + " on " + fordt;


                                //append the content into the new file
                                FileWriter fw = new FileWriter("src/HMS/book.txt", true);
                                fw.write(book + "\n");
                                fw.close();

                                System.out.println("enter no of person:");
                                people = s.nextInt();
                                if (people > 3) {
                                    System.out.println("MORE THAN 3 PEOPLE NOT ALLOWED IN ONE ROOM");
                                } else if (people <= 0) {
                                    System.out.println("INVALID INPUT");
                                } else {
                                    System.out.println("Room booked Successfully");
                                }
                            } else if (c == 'C') {
                                System.out.println("Check out");

                                System.out.println("Enter your room no:");
                                int room;
                                room = s.nextInt();
                                String namech;
                                System.out.println("enter your name:");
                                s.nextLine();
                                namech = s.nextLine();

                                String avail_after_checkout = "Room no " + room + "is left by " + namech + " on " + fordt;


                                FileWriter fwc = new FileWriter("src/HMS/checkout.txt", true);
                                fwc.write(avail_after_checkout);
                                fwc.close();
                                System.out.println("You are ready for check out :)");

                            } else {
                                System.out.println("Invalid character");
                            }


                            break;
                        case 'R':
                            System.out.println("Enter your Requests/Complains");
                            String comp;
                            s.nextLine();
                            comp = s.nextLine();
                            System.out.println("enter your name_roomno:");
                            String nrm;
                            nrm = s.next();
                            FileWriter fwcp = new FileWriter("src/HMS/complains.txt", true);
                            fwcp.write(comp + "...    " + nrm + "\n");
                            fwcp.close();
                            break;


                        default:
                            System.out.println("Invalid Character");


                    }
                    break;

                case 0:
                    System.out.println("welcome to staff services : )");
                    System.out.println("-Enter C for viewing complains\n-Enter A for checking Availibility of rooms:");
                    char st = s.next().charAt(0);
                    switch (st) {
                        case 'C':
                            System.out.println("Complains:");

                            Scanner scomp = new Scanner(fc);
                            while (scomp.hasNext()) {
                                System.out.println(scomp.nextLine());
                            }
                            break;
                        case 'A':
                            System.out.println("Avalibility (booked and checked out)");
                            Scanner scn = new Scanner(f);
                            while (scn.hasNext()) {
                                System.out.println(scn.nextLine());
                            }
                            System.out.println("\n");

                            Scanner scn2 = new Scanner(fch);
                            while (scn2.hasNext()) {
                                System.out.println(scn2.nextLine());
                            }

                            break;
                        default:
                            System.out.println("Invalid character");
                    }
            }
        }
catch (InputMismatchException e)
{
    System.out.println("ERROR: You are required to enter an integer.");
}
                System.out.println("\n\nThanks for using HMS : )");

        }

}