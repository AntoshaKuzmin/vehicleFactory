import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Scooter extends Vehicle {
    private int batteryLifeHours;
    private boolean gpsSensor;

    public Scooter(int wheelsNumber, int maxSpeed, int batteryLifeHours, boolean gpsSensor) {
        super(wheelsNumber, maxSpeed);
        this.batteryLifeHours = batteryLifeHours;
        this.gpsSensor = gpsSensor;
    }

    @Override
    public VehicleType getType() {
        return VehicleType.SCOOTER;
    }

    @Override
    public String toString() {
        return String.format("Наименование транспорта: %s\n" +
                        "Количество колес: %d\n" +
                        "Максимальная скорость: %dкм/ч\n" +
                        "Уникальные характеристики самоката:\n"+
                        "Время автономной работы %d часов\n" +
                        "Hаличие GPS-датчика %b\n",
                VehicleType.SCOOTER.getName(), getWheelsNumber(), getMaxSpeed(), getBatteryLifeHours(), isGpsSensor());
    }
}

