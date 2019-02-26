package Homework2;

public class PersonBuilder {

    private  String name;
    private  String surname;
    private  String phone;
    private  String address;

    public PersonBuilder name(final String name){
        this.name = name;
        return this;
    }

    public PersonBuilder surname(final String surname){
        this.surname = surname;
        return this;
    }

    public PersonBuilder phone(final String phone){
        this.phone = phone;
        return this;
    }

    public PersonBuilder address(final String address){
        this.address = address;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}
