import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Motorbike extends Vehicle {
    private int accelerationTo100KmSeconds;
    private int engineVolumeCubicCent;

    public Motorbike(int wheelsNumber, int maxSpeed, int accelerationTo100KmSeconds, int engineVolumeCubicCent) {
        super(wheelsNumber, maxSpeed);
        this.accelerationTo100KmSeconds = accelerationTo100KmSeconds;
        this.engineVolumeCubicCent = engineVolumeCubicCent;
    }

    @Override
    public VehicleType getType() {
        return VehicleType.MOTORBIKE;
    }

    @Override
    public String toString() {
        return String.format("Наименование транспорта: %s\n" +
                        "Количество колес: %d\n" +
                        "Максимальная скорость: %dкм/ч\n" +
                        "Уникальные характеристики мотоцикла:\n" +
                        "Разгон до 100 км за %d секунды\n" +
                        "Объём двигателя %d литров\n",
                VehicleType.MOTORBIKE.getName(), getWheelsNumber(), getMaxSpeed(), getAccelerationTo100KmSeconds(), getEngineVolumeCubicCent());
    }
}

