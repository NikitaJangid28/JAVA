import java.util.ArrayList;
import java.util.List;
class Hotel {
    private List<Room> rooms = new ArrayList<>();

    public Hotel(int numberOfRooms) {
        for (int i = 1; i <= numberOfRooms; i++) {
            rooms.add(new Room(i, 1000.0 + (i * 100)));
        }
    }

    public void displayRooms() {
        for (Room room : rooms) {
            System.out.println("Room Number: " + room.getRoomNumber() + ", Price: Rs." + room.getPrice() + ", Booked: " + (room.isBooked() ? "Yes" : "No"));
        }
    }

    public void bookRoom(int roomNumber) {
        if (roomNumber > 0 && roomNumber <= rooms.size()) {
            rooms.get(roomNumber - 1).bookRoom();
        } else {
            System.out.println("Invalid Room Number!");
        }
    }

    public void cancelBooking(int roomNumber) {
        if (roomNumber > 0 && roomNumber <= rooms.size()) {
            rooms.get(roomNumber - 1).cancelBooking();
        } else {
            System.out.println("Invalid Room Number!");
        }
    }
}

