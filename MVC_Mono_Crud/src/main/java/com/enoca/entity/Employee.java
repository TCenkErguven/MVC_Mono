package com.enoca.entity;

import com.enoca.entity.enums.EGender;
import com.enoca.entity.enums.EPosition;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
@Entity
public class Employee extends Base{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String employeeName;
    @Enumerated(EnumType.STRING)
    private EGender gender;
    @Enumerated(EnumType.STRING)
    private EPosition position;
    private Double salary;
    private Long companyId;
}
