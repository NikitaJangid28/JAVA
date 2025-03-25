import java.util.Scanner;
public class HotelBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel(5); // Create 5 Rooms

        while (true) {
            System.out.println("\n1. View Rooms\n2. Book Room\n3. Cancel Booking\n4. Exit");
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear buffer
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    hotel.displayRooms();
                    break;
                case 2:
                    System.out.print("Enter Room Number to Book: ");
                    if (scanner.hasNextInt()) {
                        int bookRoomNumber = scanner.nextInt();
                        hotel.bookRoom(bookRoomNumber);
                    } else {
                        System.out.println("Invalid Room Number.");
                        scanner.nextLine();
                    }
                    break;
                case 3:
                    System.out.print("Enter Room Number to Cancel Booking: ");
                    if (scanner.hasNextInt()) {
                        int cancelRoomNumber = scanner.nextInt();
                        hotel.cancelBooking(cancelRoomNumber);
                    } else {
                        System.out.println("Invalid Room Number.");
                        scanner.nextLine();
                    }
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid Choice. Please try again.");
            }
        }
    }
}
