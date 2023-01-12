package com.example.userevaluation.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class ResponseUserEvaluation {

    private Long evaluationId;
    private String userId;
    private String evaluator;
    private Integer grade;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date createAt;
}
