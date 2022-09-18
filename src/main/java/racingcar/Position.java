package racingcar;

import java.util.Objects;

/**
 * @author gutenlee
 * @since 2022/09/15
 */
public class Position {

    private String name;
    private final int position;

    public Position(int position) {
        if (position < 0)
            throw new RuntimeException();
        this.position = position;
    }

    public Position move() {
        return new Position(this.position + 1);
    }

    public int getPosition() {
        return this.position;
    }

    public boolean isSame(Position maxPosition) {
        return this.equals(maxPosition);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position && Objects.equals(name, position1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }

    public boolean lessThan(Position maxPosition) {
        return this.position < maxPosition.position;
    }
}
