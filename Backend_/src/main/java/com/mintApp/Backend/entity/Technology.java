package com.mintApp.Backend.entity;

import javax.persistence.*;

@Entity
@Table(name = "technology")
public class Technology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "technologyid")
    int techid;

    @Column(name = "technologyname")
    String techname;

    public Technology() {
    }

    @Override
    public String toString() {
        return "Technology{" +
                "techid=" + techid +
                ", techname='" + techname + '\'' +
                '}';
    }

    public Technology(String techname) {
        this.techname = techname;
    }

    public int getTechid() {
        return techid;
    }

    public void setTechid(int techid) {
        this.techid = techid;
    }

    public String getTechname() {
        return techname;
    }

    public void setTechname(String techname) {
        this.techname = techname;
    }
}
