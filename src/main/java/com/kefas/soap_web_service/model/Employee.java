package com.kefas.soap_web_service.model;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;

    @NotEmpty(message = "Name cannot be Empty")
    private String name;

    @NotEmpty(message = "Department cannot be Empty")
    private String department;

    @NotEmpty(message = "Phone Number cannot be Empty")
    private String phone;

    @NotEmpty(message = "Address cannot be Empty")
    private String address;
}
