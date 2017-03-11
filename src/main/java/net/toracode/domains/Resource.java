package net.toracode.domains;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;

/**
 * Created by sayemkcn on 3/11/17.
 */
@Entity(name = "resources")
public class Resource extends BaseEntity {
    private String name;
    private String path;

    @ManyToOne
    private AppCategory category;
    @ManyToOne
    private User user;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "resource")
    private Collection<Comment> commentList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "resource")
    private Collection<Like> likeList;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "resource")
    private Collection<Report> reportList;

    public Resource(String name, String path, AppCategory category, User user, Collection<Comment> commentList, Collection<Like> likeList, Collection<Report> reportList) {
        this.name = name;
        this.path = path;
        this.category = category;
        this.user = user;
        this.commentList = commentList;
        this.likeList = likeList;
        this.reportList = reportList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public AppCategory getCategory() {
        return category;
    }

    public void setCategory(AppCategory category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Collection<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(Collection<Comment> commentList) {
        this.commentList = commentList;
    }

    public Collection<Like> getLikeList() {
        return likeList;
    }

    public void setLikeList(Collection<Like> likeList) {
        this.likeList = likeList;
    }


    public Collection<Report> getReportList() {
        return reportList;
    }

    public void setReportList(Collection<Report> reportList) {
        this.reportList = reportList;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", category=" + category +
                ", user=" + user +
                ", commentList=" + commentList +
                ", likeList=" + likeList +
                ", reportList=" + reportList +
                "} " + super.toString();
    }
}
