
public class VehicleFactory {

    public Vehicle createVehicle (VehicleType type) {
        Vehicle vehicle = null;
        switch (type) {
            case BUS:
                vehicle = new Bus(8, 100, "Урожайный-Спартак2", 30);
                break;
            case CAR:
                vehicle = new Car(4, 150, "Универсал", 10);
                break;
            case MOTORBIKE:
                vehicle = new Motorbike(2, 180, 4, 1200);
                break;
            case SCOOTER:
                vehicle = new Scooter(2, 30, 10, true);
                break;
            default:
                throw new IllegalStateException("Unknown type of transport!");
        }
        return vehicle;
    }
}

