package model;

public class Hotel extends Person {
    private  String id;
    private int day ;
    private String type;
    private double price;
    private Person person;

    public Hotel() {
    }

    public Hotel(String id,int day, String type, double price, Person person) {
        this.day = day;
        this.id =id;
        this.type = type;
        this.price = price;
        this.person = person;
    }

    public int getDay() {
        return day;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "day=" + day +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", person=" + person +
                '}';
    }
}
