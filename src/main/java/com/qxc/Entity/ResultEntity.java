package com.qxc.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
*
*
* */

@Data
@AllArgsConstructor
public class ResultEntity {
    private int code;
    private String msg;
    private Object data;
}
