class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    HotelBooking() {
        this("Guest", "Standard", 1);
    }

    // Parameterized constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    HotelBooking(HotelBooking hb) {
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }

    void display() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }
}

public class HostelBooking {
    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking("Amit", "Deluxe", 3);
        HotelBooking h2 = new HotelBooking(h1); // copy constructor

        h1.display();
        h2.display();
    }
}

