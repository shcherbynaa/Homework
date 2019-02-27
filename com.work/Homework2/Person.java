package Homework2;

public class Person {

    private final String name;
    private final String surname;
    private final String phone;
    private final String address;

    Person(final PersonBuilder personBuilder) {
        this.name = personBuilder.getName();
        this.surname = personBuilder.getSurname();
        this.phone = personBuilder.getPhone();
        this.address = personBuilder.getAddress();
    }

    public static void main(String [] args){

        Person person = new PersonBuilder().name("Mark").surname("Krok").phone("09876").address("Main 23").build();
    }
}
