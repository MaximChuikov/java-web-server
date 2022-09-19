package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
@Entity
public class Post implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private Integer likes = 0;
    private Date creationDate;

    public Post() {
    }

    public Post(Long id, String text, Date creationDate) {
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes){
        this.likes = likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

}