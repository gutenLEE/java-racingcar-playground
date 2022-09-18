package racingcar;

import java.util.Objects;

/**
 * @author gutenlee
 * @since 2022/09/15
 */
public class Name {
    private String name;
    public Name(String name) {
        if (name.length() > 5)
            throw new RuntimeException();
        if (name == null)
            throw new RuntimeException();
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
