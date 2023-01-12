package com.example.userevaluation.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class RequestUserEvaluation {

    private Long evaluationId;
    private String userId;
    private String evaluator;
    private Integer grade;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "Asia/Seoul")
    private Date createAt;
}
