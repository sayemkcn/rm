package net.toracode.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by sayemkcn on 3/11/17.
 */
@Entity
public class Report extends BaseEntity{
    @Column(name = "report_name")
    private String name;
    @Column(name = "solved")
    private boolean solved;

    @ManyToOne
    private Comment comment;
    @ManyToOne
    private Resource resource;
    @ManyToOne
    private User user;

    public Report(String name, boolean solved, Comment comment, Resource resource, User user) {
        this.name = name;
        this.solved = solved;
        this.comment = comment;
        this.resource = resource;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public String toString() {
        return "Report{" +
                "name='" + name + '\'' +
                ", solved=" + solved +
                ", comment=" + comment +
                ", resource=" + resource +
                ", user=" + user +
                "} " + super.toString();
    }
}
