package com.jpisistemas.dscommerce.dto;

public class FieldMessage {
    private String fieldName;
    private String messsage;

    public FieldMessage(String fieldName, String messsage) {
        this.fieldName = fieldName;
        this.messsage = messsage;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getMesssage() {
        return messsage;
    }
}
