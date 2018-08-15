package com.syaaa.demo02;

import lombok.*;

/**
 * @ClassName Student
 * @Description TODO
 * @Author APPO
 * @Date 11:42   2018-8-15
 * @Version 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {

    /***
     * 姓名
     */
    private String studentName;
    /**
     * 年龄
     */
    private Integer studentAge;
    /**
     * 分数
     */
    private Double studentScore;

}
