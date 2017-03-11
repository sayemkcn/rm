package net.toracode.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by sayemkcn on 3/11/17.
 */
@Entity(name = "comments")
public class Comment extends BaseEntity{
    @Column(name = "omment_msg")
    private String commentMessage;
    @ManyToOne
    private Resource resource;

    public Comment(String commentMessage, Resource resource) {
        this.commentMessage = commentMessage;
        this.resource = resource;
    }

    public String getCommentMessage() {
        return commentMessage;
    }

    public void setCommentMessage(String commentMessage) {
        this.commentMessage = commentMessage;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentMessage='" + commentMessage + '\'' +
                ", resource=" + resource +
                "} " + super.toString();
    }
}
