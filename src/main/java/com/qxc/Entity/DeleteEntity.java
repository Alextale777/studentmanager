package com.qxc.Entity;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class DeleteEntity {
    private List<Long> ids;
    private Map<String,Object> map;
}
