package com.estelle.principle.ocp;

//打折价格
public class JavaDiscountCourse extends JavaCourse {
    
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
