package com.github.xenteros.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by agurgul on 14.06.2017.
 */
@Entity
@Table(name = "Msg")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Lob
    private String message;

    @ManyToOne
    @JoinColumn(name = "from")
    private Student from;

    @ManyToOne
    @JoinColumn(name = "to")
    private Student to;

    public Message() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Student getFrom() {
        return from;
    }

    public void setFrom(Student from) {
        this.from = from;
    }

    public Student getTo() {
        return to;
    }

    public void setTo(Student to) {
        this.to = to;
    }
}
