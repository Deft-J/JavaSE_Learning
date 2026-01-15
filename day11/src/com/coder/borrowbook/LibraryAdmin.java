package com.coder.borrowbook;

public class LibraryAdmin {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void check(Student student){
        BookCard bookCard=student.getBookCard();
        if (bookCard.getColor().equals("红色")){
            if (bookCard.getType().equals("A")){
                System.out.println(student.getName()+"借到《java基础》");
            }else if (bookCard.getType().equals("B")){
                System.out.println(student.getName()+"借到《mysql数据库》");
            }
        }else{
            System.out.println(student.getName()+"借到《java编程思想》");
        }
    }
}
