package com.mintApp.Backend.entity;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoryid")
    int categoryid;
    @Column(name = "categoryname")
    String categoryname;

    public Category() {
    }

    public Category( String categoryName) {
        this.categoryname = categoryName;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryid +
                ", categoryName='" + categoryname + '\'' +
                '}';
    }
}
