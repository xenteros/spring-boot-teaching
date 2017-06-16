package com.github.xenteros.model;

import javax.persistence.*;

/**
 * Created by agurgul on 14.06.2017.
 */
@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String message;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "student_from")
    private Student from;

    @ManyToOne
    @JoinColumn(name = "student_to")
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
