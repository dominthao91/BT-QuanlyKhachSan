package model;

public class Person {
    private String name;
    private String datOfBirth;
    private String identity;

    public Person() {
    }

    public Person(String name, String datOfBirth, String identity) {
        this.name = name;
        this.datOfBirth = datOfBirth;
        this.identity = identity;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatOfBirth() {
        return datOfBirth;
    }

    public void setDatOfBirth(String datOfBirth) {
        this.datOfBirth = datOfBirth;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", datOfBirth='" + datOfBirth + '\'' +
                ", identity='" + identity + '\'' +
                '}';
    }
}
