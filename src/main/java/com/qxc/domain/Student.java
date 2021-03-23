package com.qxc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer id;
    private String sn;//学号
    private String username;
    private String password;
    private Integer classId;
    private String sex = "男";
    private String mobile;
    private String qq;
    private String photo;//头像
}
