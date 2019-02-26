package Homework2;

public final class ImmutableClass {

    private final String name;
    private final String surname;

    public ImmutableClass(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public static void main(String[] args){

        ImmutableClass immutableClass = new ImmutableClass("Mark", "Krok");
        System.out.println(immutableClass.getName());
        System.out.println(immutableClass.getSurname());
    }
}
