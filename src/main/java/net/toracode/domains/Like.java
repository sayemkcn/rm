package net.toracode.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by sayemkcn on 3/11/17.
 */
@Entity(name = "likes")
public class Like extends BaseEntity {
    @Column(name = "toggle_flag")
    private boolean liked;
    @ManyToOne
    private Resource resource;

    public Like(boolean liked, Resource resource) {
        this.liked = liked;
        this.resource = resource;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public String toString() {
        return "Like{" +
                "liked=" + liked +
                ", resource=" + resource +
                "} " + super.toString();
    }
}
