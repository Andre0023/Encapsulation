//Метод move(int floor), перемещающий лифт на заданный в параметре этаж, если он задан верно. Если параметр у метода задан неверно,
//        ничего не делать и выводить в консоль сообщение об ошибке. Этот метод может перемещать лифт только последовательно, по одному этажу
//        с помощью циклов и методов moveUp и moveDown, и он должен выводить в консоль текущий этаж после каждого перемещения между этажами.
public class Elevator {
    public int currentFloor = 1;
    public int minFloor = -3;
    public int maxFloor = 26;
    public String error = "Не верно введён этаж";
    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public void getCurrentFloor(){
        System.out.println(currentFloor);
    }
    public void moveDown(){
        currentFloor -= 1;

    }
    public int moveUp(){
        return currentFloor += 1;

    }
    public  void move(int floor){
        if (floor <= 26 && floor >= -3){

            while (currentFloor > floor) {
                moveDown();
                getCurrentFloor();
            }

            while (currentFloor < floor) {
                moveUp();
                getCurrentFloor();
            }}
        else
            System.out.println(error);


    }

}
