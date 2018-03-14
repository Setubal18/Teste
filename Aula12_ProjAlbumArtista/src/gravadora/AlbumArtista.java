/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gravadora;

/**
 *
 * @author Madianita
 */
class AlbumArtista{
    private Album album;
    private Artista artista;

    public AlbumArtista() {
    }
    
    public AlbumArtista(Album album, Artista artista) {
        this.artista = artista;
        this.album = album;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "\nAlbumArtista{" + "album=" + album + ", artista=" + artista + '}';
    }
      
}

