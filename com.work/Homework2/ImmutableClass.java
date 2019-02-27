package Homework2;

public final class ImmutableClass {

    private final String name;
    private final String surname;
    private final MutableClass mutableClass;

    public ImmutableClass(String name, String surname, MutableClass mutableClass) {
        this.name = name;
        this.surname = surname;
        this.mutableClass = mutableClass;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

}
