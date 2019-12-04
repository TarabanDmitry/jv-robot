package core.basesyntax;

/**
 * <p>На игровом поле находится робот. Позиция робота на поле описывается двумя
 * целочисленным координатами: X и Y. 
 * Ось X смотрит слева направо, ось Y — снизу вверх.(Помните, как рисовали 
 * графики функций в школе?)
 * В начальный момент робот находится в некоторой позиции на поле.
 * Также известно, куда робот смотрит: вверх, вниз, направо или налево.
 * Ваша задача — привести робота в заданную точку игрового поля.
 * Реализуйте метод moveRobot()</p>
 */
public class FieldXY {

    public void moveRobot(Robot robot, int toX, int toY) {

        int currentPosX = robot.getX();
        int currentPosY = robot.getY();
        Direction currentDirection = robot.getDirection();

        if (currentPosX >= toX) {
            while (currentDirection != Direction.LEFT) {
                robot.turnLeft();
            }
        } else {
            while (currentDirection != Direction.RIGHT) {
                robot.turnRight();
            }
        }
        while (currentPosX != toX) {
            robot.stepForward();
        }
        if (currentPosY >= toY) {
            while (currentDirection != Direction.DOWN) {
                robot.turnRight();
            }
        } else {
            while (currentDirection != Direction.DOWN) {
                robot.turnLeft();
            }
        }
        while (currentPosY != toY) {
            robot.stepForward();
        }
    }
}

