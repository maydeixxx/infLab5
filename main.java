import java.util.ArrayList;
import java.util.List;

public class main{
    public static void main(String[] args) {
        Car[] cars = new Car[]{
            new Car(1, "BMW", "M5", 2020, "BLUE", 20000.0f, "К994ЕН", 4),
            new Car(2, "MERCEDES", "CLS", 2015, "GREY", 25.500f, "О696СО", 8),
            new Car(3, "BMW", "X5M", 2021, "WHITE", 17.500f, "С472ХМ", 3),
            new Car(4, "LEXUS", "ISF", 2011, "BLACK", 12.500f, "С174УТ", 13),
            new Car(5, "BMW", "M3", 2020, "RED", 20.400f, "Н030НН", 4)
        };

        Car[] bmwCars = getCarByMark(cars, "BMW");
        System.out.println("BMW машины:");
        for (Car car : bmwCars){
            System.out.println(car.getModel());
        } 

        Car[] bmwCarsExpl = getCarByBrendAndYearOperational(cars, "BMW", 2);
        System.out.println("Машины которые эксплуатируются больше 2 лет:");
        for (Car car : bmwCarsExpl) {
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
    
    public static Car[] getCarByBrendAndYearOperational(Car[] cars, String brand, int expl) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMark().equals(brand) && (2024 - car.getYear()) > expl) {
                result.add(car);
            }
        }
        return result.toArray(new Car[0]);
    }
}