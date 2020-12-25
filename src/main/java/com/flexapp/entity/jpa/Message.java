package com.flexapp.entity.jpa;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Message")
@Table(name = "message")
public class Message {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "message_id")
    private int clientId;

    @ManyToOne
    @JoinColumn(name = "user_id_from", referencedColumnName = "client_id")
    private Client userIdFrom;

    @ManyToOne
    @JoinColumn(name = "user_id_to", referencedColumnName = "client_id")
    private Client userIdTo;

    @Column(name = "content")
    private String content;

    @Column(name = "message_time")
    private Date message_time;

    public Message() {
        super();
    }

    public Message(Client userIdFrom, Client userIdTo, String content, Date message_time) {
        this.userIdFrom = userIdFrom;
        this.userIdTo = userIdTo;
        this.content = content;
        this.message_time = message_time;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public Client getUserIdFrom() {
        return userIdFrom;
    }

    public void setUserIdFrom(Client userIdFrom) {
        this.userIdFrom = userIdFrom;
    }

    public Client getUserIdTo() {
        return userIdTo;
    }

    public void setUserIdTo(Client userIdTo) {
        this.userIdTo = userIdTo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getMessage_time() {
        return message_time;
    }

    public void setMessage_time(Date message_time) {
        this.message_time = message_time;
    }
}
