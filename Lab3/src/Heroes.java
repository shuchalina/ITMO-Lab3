public abstract class Heroes {

    private String name;
    private Location location;

    public Heroes(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return this.name;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public abstract void changeLocation(Location location);

}

