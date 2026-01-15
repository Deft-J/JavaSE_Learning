package Parking;

public class Car {
    private String plate; // 车牌号
    private String type; // 车辆类型
    private int entryHour; // 驶入小时
    private int exitHour; // 离开小时
    private int entryMinute; // 驶入分钟
    private int exitMinute; // 离开分钟

    public Car(String plate, String type, int entryHour, int entryMinute, int exitHour, int exitMinute) {
        this.plate = plate;
        this.type = type;
        this.entryHour = entryHour;
        this.entryMinute = entryMinute;
        this.exitHour = exitHour;
        this.exitMinute = exitMinute;
    }


    public String getPlate() {return plate;}
    public void setPlate(String plate) {this.plate = plate;}
    public String getType() {return type;}
    public void setType(String type) {this.type = type;}
    public int getEntryHour() {return entryHour;}
    public void setEntryHour(int entryHour) {this.entryHour = entryHour;}
    public int getExitHour() {return exitHour;}
    public void setExitHour(int exitHour) {this.exitHour = exitHour;}
    public int getEntryMinute() {return entryMinute;}
    public void setEntryMinute(int entryMinute) {this.entryMinute = entryMinute;}
    public int getExitMinute() {return exitMinute;}
    public void setExitMinute(int exitMinute) {this.exitMinute = exitMinute;}
}
