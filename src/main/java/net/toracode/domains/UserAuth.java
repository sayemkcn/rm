package net.toracode.domains;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * Created by sayemkcn on 3/11/17.
 */
@Entity
public class UserAuth extends BaseEntity{
    private String token;
    @OneToOne
    private User user;

    public UserAuth(String token, User user) {
        this.token = token;
        this.user = user;
    }

    public UserAuth(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserAuth{" +
                "token='" + token + '\'' +
                ", user=" + user +
                "} " + super.toString();
    }
}
