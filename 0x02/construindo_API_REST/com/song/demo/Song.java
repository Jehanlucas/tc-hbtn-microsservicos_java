package com.example.demo;

import java.io.Serializable;
import java.util.Objects;

public class Song implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String nome;
    private String artista;
    private String album;
    private String anoLancamento;


    public Song() {

    }


    public Song(Integer id, String nome, String artista, String album, String anoLancamento) {
        super();
        this.id = id;
        this.nome = nome;
        this.artista = artista;
        this.album = album;
        this.anoLancamento = anoLancamento;
    }

    public String getAlbum() {
        return album;
    }


    public void setAlbum(String album) {
        this.album = album;
    }


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(anoLancamento, artista, id, nome);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Song other = (Song) obj;
        return Objects.equals(anoLancamento, other.anoLancamento) && Objects.equals(artista, other.artista)
                && Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
    }

    @Override
    public String toString() {
        return "Musica: " + getNome() + "\n Artista: " + getArtista() +"\n Album: "+ getAlbum() +"\n Lancamento: "+getAnoLancamento();
    }


}