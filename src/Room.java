public class Room {
    private static int id = 0;
    private int uniqueID;
    private String name = "";
    private Boolean roomStatus[];

    public Room(String name, Boolean[] roomStatus) {
        this.uniqueID = id;
        this.name = name;
        this.roomStatus = new boolean[] roomStatus;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean[] getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(Boolean[] roomStatus) {
        this.roomStatus = roomStatus;
    }
}
