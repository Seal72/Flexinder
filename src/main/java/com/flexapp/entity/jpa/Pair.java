package com.flexapp.entity.jpa;

import javax.persistence.*;

@Entity(name = "Pair")
@Table(name = "pair")
public class Pair {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "pair_id")
    private int pairId;

    @ManyToOne
    @JoinColumn(name = "first_user_id", referencedColumnName = "client_id")
    private Client firstUserId;

    @ManyToOne
    @JoinColumn(name = "second_user_id", referencedColumnName = "client_id")
    private Client secondUserId;

    public Pair() {
        super();
    }

    public Pair(Client firstUserId, Client secondUserId) {
        this.firstUserId = firstUserId;
        this.secondUserId = secondUserId;
    }

    public int getPairId() {
        return pairId;
    }

    public void setPairId(int likeId) {
        this.pairId = likeId;
    }

    public Client getFirstUserId() {
        return firstUserId;
    }

    public void setFirstUserId(Client userId) {
        this.firstUserId = userId;
    }

    public Client getSecondUserId() {
        return secondUserId;
    }

    public void setSecondUserId(Client targetUserId) {
        this.secondUserId = targetUserId;
    }
}
