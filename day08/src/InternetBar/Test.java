package InternetBar;

public class Test {
    public static void main(String[] args) {
        Student student=new Student("李白",18);
        NetAdmin name=new NetAdmin();
        name.setName("白居易");
        name.check(student);
    }
}
