package com.mintApp.Backend.entity;

import javax.persistence.*;

@Entity
@Table(name = "region")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "regionid")
    int regionid;
    @Column(name = "regionname")
    String regionname;

    public Region() {
    }

    public Region( String regionName) {
        this.regionname = regionName;
    }

    public int getRegionid() {
        return regionid;
    }

    public void setRegionid(int regionid) {
        this.regionid = regionid;
    }

    public String getRegionname() {
        return regionname;
    }

    public void setRegionname(String regionname) {
        this.regionname = regionname;
    }

    @Override
    public String toString() {
        return "Region{" +
                "regionId=" + regionid +
                ", regionName='" + regionname + '\'' +
                '}';
    }
}
