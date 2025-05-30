package com.junh.testdata.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class TableSchema {
    private String schemaName;
    private String userId;
    private LocalDateTime exportedAt;


    public Boolean isExported() {
        return exportedAt != null;
    }

}
