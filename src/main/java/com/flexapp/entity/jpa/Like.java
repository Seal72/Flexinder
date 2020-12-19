package com.flexapp.entity.jpa;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Like")
@Table(name = "like")
public class Like {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "like_id")
    private int likeId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "client_id")
    private Client userId;

    @ManyToOne
    @JoinColumn(name = "target_user_id", referencedColumnName = "client_id")
    private Client targetUserId;

    public Like() {
        super();
    }

    public Like(Client userId, Client targetUserId) {
        this.userId = userId;
        this.targetUserId = targetUserId;
    }

    public int getLikeId() {
        return likeId;
    }

    public void setLikeId(int likeId) {
        this.likeId = likeId;
    }

    public Client getUserId() {
        return userId;
    }

    public void setUserId(Client userId) {
        this.userId = userId;
    }

    public Client getTargetUserId() {
        return targetUserId;
    }

    public void setTargetUserId(Client targetUserId) {
        this.targetUserId = targetUserId;
    }
}
