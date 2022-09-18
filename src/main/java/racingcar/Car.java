package racingcar;

/**
 * @author gutenlee
 * @since 2022/09/14
 */
public class Car {

    private Name name;
    private final Position position;


    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }


    public void move(MovingStrategy movingStrategy) {
        if (movingStrategy.movable())
            position.move();
    }

    public boolean isWinner(Position maxPosition) {
        return this.position.isSame(maxPosition);
    }

    public Name getName() {
        return name;
    }

    public int getPosition() {
        return position.getPosition();
    }

    public Position getMaxPosition(Position maxPosition) {
        if (position.lessThan(maxPosition))
            return maxPosition;
        return this.position;
    }
}
