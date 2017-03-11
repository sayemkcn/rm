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
    @ManyToOne
    private Comment comment;
    @ManyToOne
    private User user;

    public Report(String name, Comment comment, User user) {
        this.name = name;
        this.comment = comment;
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

    @Override
    public String toString() {
        return "Report{" +
                "name='" + name + '\'' +
                ", comment=" + comment +
                ", user=" + user +
                "} " + super.toString();
    }
}
