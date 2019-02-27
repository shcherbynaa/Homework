package Homework2;

public final class ImmutableClass {

    private final String name;
    private final String surname;
    private final MutableClass mutableClass;

    public ImmutableClass(String name, String surname, MutableClass mutableClass) {
        this.name = name;
        this.surname = surname;
        this.mutableClass = (new MutableClass(mutableClass.getAge()));
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public MutableClass getMutableClass() {
        return (new MutableClass(mutableClass.getAge()));
    }
}
