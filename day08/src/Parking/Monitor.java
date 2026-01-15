package Parking;

import java.util.Scanner;

public class Monitor {
    public Car getCar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请扫描车牌号码");
        String plate = scanner.next();

        System.out.println("车辆类型（小型车/大型车）？");
        String type = scanner.next();

        System.out.println("请输入驶入时间（小时 分钟）");
        int entryHour = scanner.nextInt();
        int entryMinute = scanner.nextInt();

        System.out.println("请输入驶出时间（小时 分钟）");
        int exitHour = scanner.nextInt();
        int exitMinute = scanner.nextInt();
        return new Car(plate, type, entryHour, entryMinute, exitHour, exitMinute);
    }
}
