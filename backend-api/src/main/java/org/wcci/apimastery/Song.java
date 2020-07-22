package org.wcci.apimastery;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


@Entity
public class Song {

    @GeneratedValue
    @Id
    private Long id;
    private String title;
    private String link;
    private String duration;
    @ManyToOne
    private Album album;
    @ManyToOne
    private Artist artist;
    private int rating;
    @ElementCollection
    private List<String> comments;

    protected Song() {
    }

    public Song(String title, String link, String duration, Album album, Artist artist) {
        this.title = title;
        this.link = link;
        this.duration = duration;
        this.album = album;
        this.artist = artist;
        this.rating = rating;
        this.comments = comments;
    }

    public Song(String title, String link, String duration) {
        this.title = title;
        this.link = link;
        this.duration = duration;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getDuration() {
        return duration;
    }

    public Album getAlbum() {
        return album;
    }

    public Artist getArtist() {
        return artist;
    }

    public int getRating() {
        return rating;
    }

    public List<String> getComments() {
        return comments;
    }

    public void addComment(String comment){
        if(comments==null){
            comments=new ArrayList<>();
        }
        comments.add(comment);
    }


}
