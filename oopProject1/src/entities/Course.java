package entities;

import javax.print.DocFlavor;

public class Course {
    private int id;
    private String name;
    private String instructor;
    private double price;

    public Course(int id, String name, String instructor, double price) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.price=price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}
