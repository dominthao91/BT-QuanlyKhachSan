package QuanLyKhachSan;

public class Hotel {
    private int day ;
    private String typee;
    private double price;
    private Person person;

    public Hotel() {
    }

    public Hotel(int day, String typee, double price, Person person) {
        this.day = day;
        this.typee = typee;
        this.price = price;
        this.person = person;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getTypee() {
        return typee;
    }

    public void setTypee(String typee) {
        this.typee = typee;
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
                ", typee='" + typee + '\'' +
                ", price=" + price +
                ", person=" + person +
                '}';
    }
}
