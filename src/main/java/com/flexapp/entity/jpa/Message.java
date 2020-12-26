package com.flexapp.entity.jpa;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Message")
@Table(name = "message")
public class Message {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "message_id")
    private int messageId;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "USER_ID_FROM", referencedColumnName = "CLIENT_ID")
    @Column(name = "USER_ID_FROM")
    private Client userIdFrom;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "USER_ID_FROM", referencedColumnName = "CLIENT_ID")
    @Column(name = "USER_ID_TO")
    private Client userIdTo;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "MESSAGE_TIME")
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

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int clientId) {
        this.messageId = clientId;
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
