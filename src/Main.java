import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }


        Dimensions dimensions = new Dimensions(3,4,8); //создаю объект класса Dimensions.
        Dimensions copy = new Dimensions(4,3,6);


        Cargo cargo = new Cargo(dimensions,10,"Melaxen, d 43, of 9", true, "2083507797688", true );
        System.out.println(cargo);
        System.out.println();
        cargo = cargo.setWeight(15); //меняю параметр  класса Cargo
        System.out.println(cargo);



    }
}