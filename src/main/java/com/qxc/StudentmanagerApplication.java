package com.qxc;

import com.qxc.property.FileStorageProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

//扫描mapper文件夹
@MapperScan("com.qxc.mapper")
@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class StudentmanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentmanagerApplication.class, args);
    }

}
