public class Room {
    private static int id = 0;
    private int uniqueID;
    private String roomName = "";
    private Boolean roomStatus[] = new Boolean[]{false, false, false, false, false, false, false, false,};

    public Room(String name) {
        this.uniqueID = id;
        this.roomName = name;
        this.roomStatus = roomStatus;
        id++;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String name) {
        this.roomName = name;
    }

    public Boolean[] getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(Boolean[] roomStatus) {
        this.roomStatus = roomStatus;
    }
}
