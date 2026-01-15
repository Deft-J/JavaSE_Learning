package InternetBar;

public class NetAdmin {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void check(Student student) {
        int age = student.getAge();
        if(age<18){
            System.out.println("网管"+name+"检查"+student.getName()+"不能上网");
        }else{
            System.out.println("网管"+name+"检查"+student.getName()+"能上网");
        }
    }

}
