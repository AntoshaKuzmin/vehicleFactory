import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum VehicleType {
    BUS("Автобус"),
    CAR("Автомобиль"),
    MOTORBIKE("Мотоцикл"),
    SCOOTER("Самокат");

    private final String name;
}

