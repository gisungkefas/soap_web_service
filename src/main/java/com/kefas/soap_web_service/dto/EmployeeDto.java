package com.kefas.soap_web_service.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class EmployeeDto {

    private String name;

    private String department;

    private String phone;

    private String address;
}
