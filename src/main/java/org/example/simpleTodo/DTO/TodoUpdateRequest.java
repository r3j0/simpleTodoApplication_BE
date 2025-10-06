package org.example.simpleTodo.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TodoUpdateRequest {
    private String title;
    private Boolean isCompleted;
}
