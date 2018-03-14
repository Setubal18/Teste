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
class Album
{
   private  int cod;
   private String titulo;

    public Album() {
    }

   
    public Album(int cod, String titulo) {
        this.cod = cod;
        this.titulo = titulo;
    }
   
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "\nAlbum{" + "cod=" + cod + ", titulo=" + titulo + '}';
    }
     
}
