import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Vehicle {
    private int wheelsNumber;
    private int maxSpeed;

    public abstract VehicleType getType();
}

