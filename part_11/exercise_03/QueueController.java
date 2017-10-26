package part_11.exercise_03;

public class QueueController {


    public static void main(String[] args) {

        GenericQueue<Car> cars = new GenericQueue();
        Car toyota = new Car("Toyota", "4Runner");
        Car nissan = new Car("Nissan", "XTerra");
        Car lambo = new Car("Lamborghini", "Fancy");

        try {
            cars.put(toyota);
            cars.put(nissan);
            cars.put(lambo);
        } catch (QueueFullException e) {
            e.printStackTrace();
        }

        showCars(cars);

    }



    public static  <T extends Car> void showCars(GenericQueue<T> cars) {
        Car nextCar;
        while (cars.hasNext()) {
            try {
                nextCar = cars.get();
                System.out.println(nextCar.make + " " + nextCar.model + "!");
            } catch (QueueEmptyException e) {
                e.printStackTrace();
            }
        }

        System.out.println("No more cars to show.");
    }
}
