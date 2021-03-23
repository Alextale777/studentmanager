package com.qxc.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private int id;
    private String name;
    private int teacherId;
    private String courseDate;
    private int selectedNum;
    private int maxNum;
    private  String info;

}
