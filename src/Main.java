import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Dimensions dimensions = new Dimensions(3,4,8); //создаю объект класса Dimensions.
        Dimensions copy = dimensions.setWidth(9);
        System.out.println(dimensions.getWidth() + " Адрес" + dimensions);
        System.out.println(copy.getWidth()+ " Адрес" + copy);


        Cargo cargo = new Cargo(dimensions,10,"Melaxen, d 43, of 9", true, "2083507797688", true );
        System.out.println(cargo);
        System.out.println();
        Cargo cargo1 = cargo.setWeight(15); //меняю параметр  класса Cargo
        System.out.println(cargo.getWeight());
        System.out.println(cargo1.getWeight());

//        Elevator elevator = new Elevator(-3, 26);
//        while (true) {
//            System.out.print("Введите номер этажа: ");
//            int floor = new Scanner(System.in).nextInt();
//            elevator.move(floor);
//        }



    }
}