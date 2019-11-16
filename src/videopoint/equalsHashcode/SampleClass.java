package videopoint.equalsHashcode;

import java.util.Objects;

public class SampleClass {
    String name;
    String surname;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SampleClass that = (SampleClass) o;
        return age == that.age &&
                name.equals(that.name) &&
                surname.equals(that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}
