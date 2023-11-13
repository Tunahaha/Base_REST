package org.example.models;


import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ApiResponse {

    private Boolean success;

//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    private T result;
//
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    private List<Errors> errors;
}
