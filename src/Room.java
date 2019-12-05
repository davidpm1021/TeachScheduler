public class Room {
    private int id = 0;
    private String name = "";
    private Boolean roomStatus[];

    public Room(int id, String name, Boolean[] roomStatus) {
        this.id = id;
        this.name = name;
        this.roomStatus = roomStatus;
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
