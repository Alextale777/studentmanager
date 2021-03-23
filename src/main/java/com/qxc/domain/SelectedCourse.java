package com.qxc.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class SelectedCourse {
    Integer id;
    Integer studentId;

    @TableId("course_id")
    Integer courseId;
}
