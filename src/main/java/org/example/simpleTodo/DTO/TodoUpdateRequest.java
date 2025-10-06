package org.example.simpleTodo.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TodoUpdateRequest {
    private String title;
    private Boolean isCompleted;
    private String startDate;
    private String endDate;
    private String description;
    private String tags;
}
