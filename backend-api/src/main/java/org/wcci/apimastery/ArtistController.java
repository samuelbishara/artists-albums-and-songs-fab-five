package org.wcci.apimastery;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class ArtistController {
    ArtistStorage artistStorage;
    AlbumStorage albumStorage;

    public ArtistController(ArtistStorage artistStorage, AlbumStorage albumStorage) {
        this.artistStorage = artistStorage;
        this.albumStorage = albumStorage;
    }

    @GetMapping("/api/artists/{id}")
    public Artist findArtistById(@PathVariable Long id) {
        return artistStorage.findArtistById(id);
    }

    @GetMapping("/api/artists")
    public Collection<Artist> findAllArtists() {
        return artistStorage.findAllArtists();
    }

    @PostMapping("/api/artists/add")
    public Artist addArtists(@RequestBody Artist artistName) {
        return artistStorage.save(artistName);
    }

    @PatchMapping("/api/artists/{id}/album")
    public Artist addAlbumToArtist(@PathVariable Long id, @RequestBody Album album){
        Artist artist =  artistStorage.findArtistById(id);
        Album albumToAdd = new Album(album.getTitle(), album.getRecordLabel(),album.getImage(), artist, (Song) album.getSongs());
        albumStorage.save(albumToAdd);
        return albumToAdd.getArtist();
    }

    @PatchMapping("/api/artists/{artistId}/comment")
    public Artist addCommentToArtist(@PathVariable Long artistId, @RequestBody String comment){
        Artist artist = artistStorage.findArtistById((artistId));
        artist.addComment(comment);
        artistStorage.save(artist);
        return artist;
    }

    @DeleteMapping("/api/artists/{artistId}")
    public Collection<Artist> deleteArtist(@PathVariable Long artistId) {
        artistStorage.delete(artistId);
        return artistStorage.findAllArtists();
    }

}
