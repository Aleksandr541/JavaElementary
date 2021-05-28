package curce2.lesson2.homeWork;

public class Car implements Comparable<Car>{
    @Override
    public int compareTo(Car car) {
        return carBrand.compareTo(car.getCarBrand());
    }

    private String carBrand;
    private String model;
    private int yearOfIssue;
    private int volume;
    private int speed;

    public Car(String carBrand, String model, int yearOfIssue, int volume, int speed) {
        this.carBrand = carBrand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.volume = volume;
        this.speed = speed;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", volume=" + volume +
                ", speed=" + speed +
                '}';
    }
}
