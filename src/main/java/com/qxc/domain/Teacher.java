package com.qxc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    private int id;
    private String sn;
    private String username;
    private String password;
    private int classId;
    private String sex = "男";
    private String mobile;
    private String qq;
    private String photo;

}
