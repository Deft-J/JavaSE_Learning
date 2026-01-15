package SetPhone;

public class Test1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.setFactory("华为");
        phone1.setColor("黑色");
        phone1.setBrand("Mate40");
        phone1.setWeight(200);
        phone1.call();
        Phone phone2 = new Phone();
        phone2.setFactory("荣耀");
        phone2.setColor("白色");
        phone2.setBrand("v70");
        phone2.setWeight(189);
        phone2.sendMessage();

    }
}
