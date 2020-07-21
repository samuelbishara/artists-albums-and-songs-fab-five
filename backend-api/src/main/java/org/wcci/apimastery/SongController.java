package org.wcci.apimastery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class SongController {
SongStorage songStorage;

    public SongController(SongStorage songStorage) {
        this.songStorage = songStorage;
    }

    @GetMapping("/api/songs/{songId}")
    public Song findSongByTitle(@PathVariable Long songId){
        return songStorage.findSongById(songId);
    }

    @GetMapping("/api/songs")
    public Collection<Song> findAllSongs(){
        return songStorage.findAllSongs();
    }

    @PostMapping("/api/songs/add")
    public Song addSongs(@RequestBody Song songName) {
        return songStorage.save(songName);
    }

    @PatchMapping("/api/songs/{songId}/comment")
    public Song addCommentToSong(@PathVariable Long songId, @RequestBody String comment){
        Song song = songStorage.findSongById((songId));
        song.addComment(comment);
        songStorage.save(song);
        return song;
    }

    @DeleteMapping("/api/songs/{songId}")
    public Collection<Song> deleteSongs(@PathVariable Long songId) {
        Song songToRemove = songStorage.findSongById(songId);
        songStorage.delete(songToRemove);
        return songStorage.findAllSongs();
    }
}
