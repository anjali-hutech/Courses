package com.example.spring.courses.exception;

import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {

	private Date timeStamp;

	private String message;

	private String details;

	private int status;

}
