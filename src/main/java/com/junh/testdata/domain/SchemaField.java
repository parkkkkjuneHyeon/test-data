package com.junh.testdata.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class SchemaField {

    private String fieldName;
    private String mockDataType;
    private Integer fieldOrder;
    private Integer blankPercent;

    private String typeOptionJson;
    private String forceValue;

}
