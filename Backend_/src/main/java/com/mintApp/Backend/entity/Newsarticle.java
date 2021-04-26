package com.mintApp.Backend.entity;

import javax.persistence.*;

@Entity
@Table(name = "newsarticle")
public class Newsarticle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "newsid")
    int newsid;
    @Column(name = "catid")
    int catid;
    @Column(name = "regid")
    String regid;
    @Column(name = "mainheading")
    String mainheading;
    @Column(name = " subheading1")
    String subheading1;
    @Column(name = "subheading2")
    String subheading2;
    @Column(name = "frontimage")
    String frontimage;
    @Column(name = "image1")
    String image1;
    @Column(name = "image2")
    String image2;
    @Column(name = "author")
    String author;
    @Column(name = "content")
    String content;
    @Column(name = "tags")
    String tags;
    @Column(name = "video")
    String video;
    @Column(name = "category")
    String category;
    @Column(name = "region")
    String region;


    public Newsarticle(int catid, String  regid, String mainheading, String subheading1, String subheading2,
                       String frontimage,
                       String image1, String image2, String author, String content, String tags, String video, String category, String region) {
        this.catid = catid;
        this.regid = regid;
        this.mainheading = mainheading;
        this.subheading1 = subheading1;
        this.subheading2 = subheading2;
        this.frontimage = frontimage;
        this.image1 = image1;
        this.image2 = image2;
        this.author = author;
        this.content = content;
        this.tags = tags;
        this.video = video;
        this.category = category;
        this.region = region;
    }

    public Newsarticle() {
    }

    public int getNewsid() {
        return newsid;
    }

    public void setNewsid(int newsid) {
        this.newsid = newsid;
    }

    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    public String getRegid() {
        return regid;
    }

    public void setRegid(String regid) {
        this.regid = regid;
    }

    public String getMainheading() {
        return mainheading;
    }

    public void setMainheading(String mainheading) {
        this.mainheading = mainheading;
    }

    public String getSubheading1() {
        return subheading1;
    }

    public void setSubheading1(String subheading1) {
        this.subheading1 = subheading1;
    }

    public String getSubheading2() {
        return subheading2;
    }

    public void setSubheading2(String subheading2) {
        this.subheading2 = subheading2;
    }

    public String getFrontimage() {
        return frontimage;
    }

    public void setFrontimage(String frontimage) {
        this.frontimage = frontimage;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Newsarticle{" +
                "newsid=" + newsid +
                ", catid=" + catid +
                ", regid=" + regid +
                ", mainheading='" + mainheading + '\'' +
                ", subheading1='" + subheading1 + '\'' +
                ", subheading2='" + subheading2 + '\'' +
                ", frontimage='" + frontimage + '\'' +
                ", image1='" + image1 + '\'' +
                ", image2='" + image2 + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", tags='" + tags + '\'' +
                ", video='" + video + '\'' +
                ", category='" + category + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
