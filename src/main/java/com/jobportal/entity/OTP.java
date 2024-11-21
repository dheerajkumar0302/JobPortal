package com.jobportal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "otp")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OTP {
    private  String email;
    private  String otpCode;
    private LocalDateTime creationTime;

}