package com.coder.user;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.ResourceBundle;

public class MakeProperties {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       Users user = Sign.login();
       Student student=new Student();
       student.setName(getInfo("student.name"));
       student.setGender(getInfo("student.gender"));
       student.setAge(Integer.parseInt(getInfo("student.age")));
       serialize(student);
       Teacher teacher=new Teacher(getInfo("teacher.name"),
               getInfo("teacher.gender"),Integer.parseInt(getInfo("teacher.age")));
       saveTeacherInfo(teacher);
       log(user);

}
public static void deserialize() throws IOException, ClassNotFoundException {
    ObjectInputStream ois=
            new ObjectInputStream(new FileInputStream("d:/b/student"));
    Student student=(Student)ois.readObject();
    System.out.println(student);
    ois.close();
    DataInputStream dis=new DataInputStream(new FileInputStream("d:/b/teacher"));
    String name = dis.readUTF();
    int age=dis.readInt();
    System.out.println(name+"\t"+age);
}

public static String getInfo(String key){
    ResourceBundle bundle=ResourceBundle.getBundle("com.coder.user.info");
    return bundle.getString(key);
}
public static void serialize(Student student) throws IOException {
    ObjectOutputStream oos=
            new ObjectOutputStream(new FileOutputStream("d:/b/student"));
    oos.writeObject(student);
    oos.close();
}
public static void saveTeacherInfo(Teacher teacher) throws IOException {
    DataOutputStream dos=new DataOutputStream(new FileOutputStream("d:/b/teacher"));
    dos.writeUTF(teacher.getName());
    dos.writeInt(teacher.getAge());
    dos.close();
}
public static void log(Users user) throws IOException {
    BufferedWriter bw=new BufferedWriter(new FileWriter("d:/b/person.log"));
    bw.write("操作人:"+user.getName());
    bw.newLine();
    bw.write("系统时间:"+ LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    bw.newLine();
    File file1=new File("d:/b/student");
    File file2=new File("d:/b/teacher");
    bw.write(file1.getName()+",文件大小:"+file1.length());
    bw.newLine();
    bw.write(file2.getName()+",文件大小:"+file2.length());
    bw.newLine();
    bw.close();
}
}