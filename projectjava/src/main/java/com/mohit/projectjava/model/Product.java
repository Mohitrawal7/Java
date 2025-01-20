//package com.mohit.projectjava.model;
//
//import com.fasterxml.jackson.annotation.JsonFormat;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.math.BigDecimal;
//import java.util.Date;
//
//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Product {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    private String name;
//    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    private String desc;
//    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    private String brand;
//    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
//    private BigDecimal price;
//    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    private String category;
//    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
//    private Date releaseDate;
//    @JsonFormat(shape = JsonFormat.Shape.BOOLEAN)
//    private boolean available;
//    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
//    private int quantity;
//    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    private String imageName;
//    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    private String imageType;
//@Lob
//@JsonFormat(shape = JsonFormat.Shape.NUMBER)
//    private byte[] imageDate;
//
//
//}
//

//
//package com.mohit.projectjava.model;
//
//import com.fasterxml.jackson.annotation.JsonFormat;
//import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
//import com.fasterxml.jackson.databind.annotation.JsonSerialize;
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.math.BigDecimal;
//import java.util.Base64;
//import java.util.Date;
//
//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Product {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    private String name;
//    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    private String description;
//    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    private String brand;
//    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
//    private BigDecimal price;
//    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    private String category;
//    @JsonFormat(shape = JsonFormat.Shape.NUMBER,pattern = "dd-mm-yyyy")
//    private Date releaseDate;
//    @JsonFormat(shape = JsonFormat.Shape.BOOLEAN)
//    private boolean productAvailable;
//    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
//    private int stockQuantity;
//
//
//    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    private String imageName;
//
//    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    private String imageType;
//
//
//    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @Lob
//    public byte[] imageData;
//
//    public byte[] getImageData() {
//        return imageData;
//    }
//    public void setImageData(byte[] imageData) {
//        this.imageData = imageData;
//    }
//
//    public String getImageType() {
//        return imageType;
//    }
//
//    public void setImageType(String imageType) {
//        this.imageType = imageType;
//    }
//
//    public String getImageName() {
//        return imageName;
//    }
//
//    public void setImageName(String imageName) {
//        this.imageName = imageName;
//    }
//}


package com.mohit.projectjava.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

    @Id
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String name;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String description;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String brand;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private BigDecimal price;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String category;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER,pattern = "dd-mm-yyyy")
    private Date releaseDate;
    @JsonFormat(shape = JsonFormat.Shape.BOOLEAN)
    private boolean productAvailable;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private int stockQuantity;

    private String imageName;
    private String imageType;

    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Lob
    private byte[] imageData;
}