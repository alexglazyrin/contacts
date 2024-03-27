package com.example.Service;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ValidationService {
    public final String LAST_NAME_PATTERN = "^[a-zA-Zа-яА-Я]+([\\s-][a-zA-Zа-яА-Я]+)*$";
    public final String FIRST_NAME_PATTERN = "^[a-zA-Zа-яА-Я]+$";
    public final String EMAIL_PATTERN = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    public final String PHONE_NUMBER_PATTERN = "\\+?\\d{3,}";

}
