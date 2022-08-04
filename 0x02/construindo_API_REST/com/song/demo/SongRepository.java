package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongRepository {
    private List<Song> list = new ArrayList<Song>();

    public List<Song> getAllSongs() {
        return list;
    }

    public Song getSongById(Integer id) {
        for (Song song : list) {
            if (song.getId() == id) {
                return new Song(song.getId(), song.getNome(), song.getArtista(), song.getAlbum(), song.getAnoLancamento());
            }
        }
        return null;
    }

    public void addSong(Song s) {
        list.add(s);
    }

    public void updateSong(Song s) {
        for (Song song : list) {
            if (song.getId() == s.getId()) {
                int i = list.indexOf(song);
                list.set(i, s);
            }
        }
    }

    public void removeSong(Song s) {
        list.remove(s);
    }
}