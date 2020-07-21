package org.wcci.apimastery;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class Artist {

    @GeneratedValue
    @Id
    private Long id;
    private String name;
    private String image;
    @OneToMany (mappedBy = "artist", orphanRemoval = true)
    private Collection<Album> albums;
    private String description;
    private String genre;
    private String recordLabel;
    @ElementCollection
    private List<String> ratings;
    @ElementCollection
    private List<String> comments;

    protected Artist() {}

    public Artist(String name, String image,String description, String genre, String recordLabel) {
        this.name = name;
        this.image = image;
        this.albums = albums;
        this.description = description;
        this.genre = genre;
        this.recordLabel = recordLabel;
        this.comments = comments;
        this.ratings = ratings;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public Collection<Album> getAlbums() {
        return albums;
    }

    public String getDescription() {
        return description;
    }

    public String getGenre() {
        return genre;
    }

    public String getRecordLabel() {
        return recordLabel;
    }

    public List<String> getRatings() {
        return ratings;
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

    public void addRating(String rating){
        if(ratings==null){
            ratings=new ArrayList<>();
        }
        ratings.add(rating);
    }
}
