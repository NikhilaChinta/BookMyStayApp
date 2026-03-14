class Room {
    String type;
    int beds;
    int size;
    double price;

    Room(String type, int beds, int size, double price) {
        this.type = type;
        this.beds = beds;
        this.size = size;
        this.price = price;
    }
}

class RoomInventory {
    int singleAvailable;
    int doubleAvailable;
    int suiteAvailable;

    RoomInventory(int singleAvailable, int doubleAvailable, int suiteAvailable) {
        this.singleAvailable = singleAvailable;
        this.doubleAvailable = doubleAvailable;
        this.suiteAvailable = suiteAvailable;
    }
}

public class Main {

    // Function to search available rooms
    static void searchAvailableRooms(RoomInventory inventory, Room single, Room doubleRoom, Room suite) {

        System.out.println("Room Search Results");
        System.out.println("---------------------------");

        if (inventory.singleAvailable > 0) {
            System.out.println("Room Type: " + single.type);
            System.out.println("Beds: " + single.beds);
            System.out.println("Size: " + single.size + " sqft");
            System.out.println("Price per night: " + single.price);
            System.out.println("Available Rooms: " + inventory.singleAvailable);
            System.out.println();
        }

        if (inventory.doubleAvailable > 0) {
            System.out.println("Room Type: " + doubleRoom.type);
            System.out.println("Beds: " + doubleRoom.beds);
            System.out.println("Size: " + doubleRoom.size + " sqft");
            System.out.println("Price per night: " + doubleRoom.price);
            System.out.println("Available Rooms: " + inventory.doubleAvailable);
            System.out.println();
        }

        if (inventory.suiteAvailable > 0) {
            System.out.println("Room Type: " + suite.type);
            System.out.println("Beds: " + suite.beds);
            System.out.println("Size: " + suite.size + " sqft");
            System.out.println("Price per night: " + suite.price);
            System.out.println("Available Rooms: " + inventory.suiteAvailable);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Room definitions
        Room singleRoom = new Room("Single", 1, 250, 1500.0);
        Room doubleRoom = new Room("Double", 2, 400, 2500.0);
        Room suiteRoom = new Room("Suite", 3, 750, 5000.0);

        // Inventory
        RoomInventory inventory = new RoomInventory(5, 3, 2);

        // UC4 functionality
        searchAvailableRooms(inventory, singleRoom, doubleRoom, suiteRoom);
    }
}