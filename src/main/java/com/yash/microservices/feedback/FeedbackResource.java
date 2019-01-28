package com.yash.microservices.feedback;

import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.ResourceSupport;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FeedbackResource extends ResourceSupport {
    private String username;
    private String source;
    private Integer rating;
    private String comment;
    private Date createdTime;
    
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FeedbackResource other = (FeedbackResource) obj;
			
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
}
