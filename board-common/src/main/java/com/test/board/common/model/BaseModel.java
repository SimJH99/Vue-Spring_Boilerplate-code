package com.test.board.common.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BaseModel {
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
}
