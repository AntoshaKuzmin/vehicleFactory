import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bus extends Vehicle {
    private String route;
    private int seatsNumber;

    public Bus(int wheelsNumber, int maxSpeed, String route, int seatsNumber) {
        super(wheelsNumber, maxSpeed);
        this.route = route;
        this.seatsNumber = seatsNumber;
    }

    @Override
    public VehicleType getType() {
        return VehicleType.BUS;
    }

    @Override
    public String toString() {
        return String.format("Наименование транспорта: %s\n" +
                        "Количество колес: %d\n" +
                        "Максимальная скорость: %dкм/ч\n" +
                        "Уникальные характеристики автобуса:\n" +
                        "Маршрут %s\n" +
                        "Количество посадочных мест %d\n",
                VehicleType.BUS.getName(), getWheelsNumber(), getMaxSpeed(), getRoute(), getSeatsNumber());
    }
}

