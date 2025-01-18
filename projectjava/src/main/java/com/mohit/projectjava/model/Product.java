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


package com.mohit.projectjava.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String name;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String desc;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String brand;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private BigDecimal price;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String category;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER,pattern = "dd-mm-yyyy")
    private Date releaseDate;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private boolean available;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private int quantity;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String imageName;
   public void setImageName(String originalFilename) {
    }
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    public void setImageType(String contentType) {
    }

    public void setImageData(byte[] bytes) {
    }
//    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    private String imageName;
//    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    private String imageType;
//    @Lob
//    private byte[] imageData;


}
