import java.util.ArrayList;
import java.util.List;

public class main{
    public static void main(String[] args) {
        Car[] cars = new Car[]{
            new Car(1, "BMW", "M5", 2020, "BLUE", 20000.0f, "К994ЕН"),
            new Car(2, "MERCEDES", "CLS", 2015, "GREY", 25.500f, "О696СО"),
            new Car(3, "BMW", "X5M", 2021, "WHITE", 17.500f, "С472ХМ"),
            new Car(4, "LEXUS", "ISF", 2011, "BLACK", 12.500f, "С174УТ"),
            new Car(5, "BMW", "M3", 2020, "RED", 20.400f, "Н030НН")
        };

        Car[] bmwCars = getCarByMark(cars, "BMW");
        System.out.println("BMW cars:");
        for (Car car : bmwCars){
            System.out.println(car.getModel());
        } 
    }

    public static Car[] getCarByMark(Car[] cars, String mark) {
        List<Car> result = new ArrayList<>();
        for(Car car : cars) {
            if(car.getMark().equals(mark)){
                result.add(car);
            }
        }
        return result.toArray(new Car[0]);
    }    
    
}