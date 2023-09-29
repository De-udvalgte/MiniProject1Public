package com.deudvalgte.miniproject1.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class HttpResponse {
    protected String timeStamp;
    protected int statusCode;
    protected String message;
    protected String requestMethod;
}