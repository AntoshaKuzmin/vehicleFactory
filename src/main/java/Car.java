import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car extends Vehicle {
    private String carBody;
    private int fuelConsumption100Km;

    public Car(int wheelsNumber, int maxSpeed, String carBody, int fuelConsumption100Km) {
        super(wheelsNumber, maxSpeed);
        this.carBody = carBody;
        this.fuelConsumption100Km = fuelConsumption100Km;
    }

    @Override
    public VehicleType getType() {
        return VehicleType.CAR;
    }

    @Override
    public String toString() {
        return String.format("Наименование транспорта: %s\n" +
                        "Количество колес: %d\n" +
                        "Максимальная скорость: %dкм/ч\n" +
                        "Уникальные характеристики автомобиля:\n" +
                        "Кузов %s\n" +
                        "Расход топлива %d литров на 100 километров\n",
                VehicleType.CAR.getName(), getWheelsNumber(), getMaxSpeed(), getCarBody(), getFuelConsumption100Km());
    }
}

