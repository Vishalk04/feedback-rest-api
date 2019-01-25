package com.yash.microservices.feedback;

import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.ResourceSupport;

import java.util.Date;

@Getter
@Setter
public class FeedbackResource extends ResourceSupport {
    private String username;
    private String source;
    private Integer rating;
    private String comment;
    private Date createdTime;
}
