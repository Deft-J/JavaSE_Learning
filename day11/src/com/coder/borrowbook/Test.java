package com.coder.borrowbook;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        BookCard bookCard = new BookCard("红","A");
        student1.setName("李白");
        student1.setBookCard(bookCard);
        LibraryAdmin libraryAdmin = new LibraryAdmin();
        libraryAdmin.setName("杜甫");
        libraryAdmin.check(student1);

    }
}
