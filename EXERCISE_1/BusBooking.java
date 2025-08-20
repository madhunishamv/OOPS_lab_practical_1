import java.util.Scanner;

public class BusBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalAmount = 0.0;
        int seatAvailable = 10; // Total seats

        System.out.println(" Welcome to Madhu Travels");

        //  Do-While for login
        int mainChoice;
        do {
            System.out.println("\n1. Book Ticket");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            mainChoice = sc.nextInt();

            if (mainChoice == 1) {
                //  While loop to allow booking while seats are available
                while (seatAvailable > 0) {
                    System.out.println("\nSeats Available: " + seatAvailable);
                    System.out.println("---- DESTINATIONS ----");
                    System.out.println("1. City A - Rs.200");
                    System.out.println("2. City B - Rs.300");
                    System.out.println("3. City C - Rs.400");
                    System.out.println("4. Cancel Booking");
                    System.out.print("Select destination (1-4): ");
                    int destChoice = sc.nextInt();

                    //  Switch-case for destinations
                    switch (destChoice) {
                        case 1:
                            System.out.println(" Ticket to City A booked.");
                            totalAmount += 200;
                            seatAvailable--;
                            break;
                        case 2:
                            System.out.println(" Ticket to City B booked.");
                            totalAmount += 300;
                            seatAvailable--;
                            break;
                        case 3:
                            System.out.println(" Ticket to City C booked.");
                            totalAmount += 400;
                            seatAvailable--;
                            break;
                        case 4:
                            System.out.println(" Booking cancelled.");
                            continue; // Skip rest of this loop
                        default:
                            System.out.println("Invalid Choice! Try again.");
                            continue;
                    }

                    //  If-Else for special discount
                    if (totalAmount >= 1000) {
                        System.out.println(" You unlocked a ₹100 discount!");
                        totalAmount -= 100;
                    }

                    System.out.print("Do you want to book another ticket? (yes=1 / no=0): ");
                    int anotherTicket = sc.nextInt();
                    if (anotherTicket == 0) {
                        break; //  Exit while loop
                    }
                }

                if (seatAvailable == 0) {
                    System.out.println("\n All seats booked! Try again later.");
                }

                //  For loop to print booking confirmation
                System.out.println("\n---- Printing Ticket ----");
                for (int i = 1; i <= 3; i++) {
                    System.out.println(" Ticket Copy " + i);
                }

            } else if (mainChoice == 2) {
                System.out.println("Thank you for visiting Madhu Travels. Goodbye!");
                break; //  Exit do-while loop
            } else {
                System.out.println("Invalid Choice! Please try again.");
            }

        } while (true);

        //  Final Amount
        System.out.println("\n Payment ");
        System.out.println("Total Amount: Rs" + totalAmount);
        System.out.println("Enjoy your trip!");

        sc.close();
    }
}
