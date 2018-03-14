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
class Artista
{
   private  int cod;
   private String nome;
   private String eMail;

    public Artista() {
    }

    public Artista(int cod, String nome, String eMail) {
        this.cod = cod;
        this.nome = nome;
        this.eMail = eMail;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    
    @Override
    public String toString() {
        return "\nArtista{" + "cod=" + cod + ", nome=" + nome + ", eMail=" + eMail + '}';
    }
     
}

