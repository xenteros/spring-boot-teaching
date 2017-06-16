package com.github.xenteros.dto;

/**
 * Created by agurgul on 14.06.2017.
 */
public class MessageDTO {

    private Long id;
    private String message;
    private StudentDTO from;
    private StudentDTO to;

    public MessageDTO() {
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

    public StudentDTO getFrom() {
        return from;
    }

    public void setFrom(StudentDTO from) {
        this.from = from;
    }

    public StudentDTO getTo() {
        return to;
    }

    public void setTo(StudentDTO to) {
        this.to = to;
    }
}
