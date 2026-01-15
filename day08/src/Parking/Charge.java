package Parking;

public class Charge {
    public void charge(Car car) {
        String type = car.getType();
        int totalMinutes = getTime(car);
        int hours = totalMinutes / 60;
        if (totalMinutes % 60 != 0) {
            hours++;
        }

        int fee;
        if (type.equals("小型车")) {
            if (hours <= 1) {
                fee = 8;
            } else {
                fee = 8 + (hours - 1) * 5;
            }
        } else {  //大型车
            if (hours <= 1) {
                fee = 15;
            } else {
                fee = 15 + (hours - 1) * 8;
            }
        }

        System.out.println(car.getPlate() + "需要交费" + fee + "元");
    }

    public int getTime(Car car) {
        int entryTotal = car.getEntryHour() * 60 + car.getEntryMinute();
        int exitTotal = car.getExitHour() * 60 + car.getExitMinute();
        return exitTotal - entryTotal;
    }
}
