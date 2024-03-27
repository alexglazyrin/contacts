package com.example.model;

import com.example.Service.ValidationService;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;
import net.sf.jsqlparser.util.validation.ValidationUtil;

@Data
@FieldNameConstants
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Contact {

    private Long id;
    @Pattern(regexp = ValidationService.FIRST_NAME_PATTERN)
    private String firstName;
    @Pattern(regexp = ValidationService.LAST_NAME_PATTERN)
    private String lastName;
    @Pattern(regexp = ValidationService.EMAIL_PATTERN)
    private String email;
    @Pattern(regexp = ValidationService.PHONE_NUMBER_PATTERN)
    private String phone;
}
