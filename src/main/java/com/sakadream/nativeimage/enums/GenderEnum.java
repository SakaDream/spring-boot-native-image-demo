package com.sakadream.nativeimage.enums;

import lombok.Getter;
import lombok.Setter;

public enum GenderEnum {

    FEMALE("Female"),
    MALE("Male"),
    OTHER("Other");

    private @Getter @Setter String value;

    GenderEnum(String value) {
        this.value = value;
    }
    
}
