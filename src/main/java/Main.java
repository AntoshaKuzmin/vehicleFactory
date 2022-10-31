
public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Укажите 1 или более типов транспорта в параметрах метода:\n" +
                    "0 - Мотоцикл\n" +
                    "1 - Самокат\n" +
                    "2 - Автомобиль\n" +
                    "3 - Автобус\n");
            return;
        }

        VehicleFactory factory = new VehicleFactory();
        for (String arg : args) {
            int vehicleType = Integer.parseInt(arg);
            if (vehicleType >= 0 && vehicleType < VehicleType.values().length) {
                Vehicle vehicle = factory.createVehicle(VehicleType.values()[vehicleType]);
                System.out.println(vehicle);
            } else {
                System.out.println("НЕИЗВЕСТНЫЙ ТИП ТРАНСПОРТА\n");
            }
        }
    }
}

