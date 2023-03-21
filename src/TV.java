public class TV {
    private String date;
    private String damage;
    private String owner;

    public TV(String date, String damage, String owner) {
        this.date = date;
        this.damage = damage;
        this.owner = owner;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        System.out.println("date "+getDate());
        System.out.println("damage "+getDamage());
        System.out.println("owner "+getOwner());
        return "";
    }
}
