package com.mb.dineit.responseBody;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ResponseBody {
    private String msg;

    public ResponseBody(String msg){
        this.msg = msg;
    }
}
