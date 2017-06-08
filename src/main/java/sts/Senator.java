package sts;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

/**
 * Created by daire3 on 6/7/17.
 */
public class Senator {

    private long id;

    @Length(max = 3)
    private String content;

    public Senator() {
        // Jackson deserialization
    }

    public Senator(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }
}
