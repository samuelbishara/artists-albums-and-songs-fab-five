package org.wcci.apimastery;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Entity
public class Album {

    @GeneratedValue
    @Id
    private Long id;
    @JsonIgnore
    @ManyToOne
    private Artist artist;
    private String title;
    private String recordLabel;
    private String image;
    @OneToMany(orphanRemoval = true)
    private Collection<Song> songs;
    private int rating;
    @ElementCollection
    private List<String> comments;

    protected Album(){}

    public Album(String title, String recordLabel, String image, Artist artist, Song... songs) {
        this.title = title;
        this.recordLabel = recordLabel;
        this.image = image;
        this.artist = artist;
        this.comments = comments;
        this.songs = new ArrayList<>(Arrays.asList(songs));
    }

    public Long getId() {
        return id;
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

    public String getTitle() {
        return title;
    }

    public String getRecordLabel() {
        return recordLabel;
    }

    public String getImage() {
        return image;
    }

    public Collection<Song> getSongs() {
        return songs;
    }

    public void addComment(String comment){
        if(comments==null){
            comments=new ArrayList<>();
        }
        comments.add(comment);
    }
}
