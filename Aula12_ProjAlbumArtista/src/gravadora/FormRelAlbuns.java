/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gravadora;

import java.util.ArrayList;
import static gravadora.FormMenu.listaAlbuns;
import static gravadora.FormMenu.listaAlbumArtista;
/**
 *
 * @author Madianita
 */
public class FormRelAlbuns extends javax.swing.JFrame {

    
    public FormRelAlbuns() {
        initComponents();
        
        imprimeAlbuns();
        
    }

public void imprimeAlbuns()    {
        String saida="";        
        for (Album album : listaAlbuns)  {
            saida +=  album.getTitulo() + "\n";
            //Para cada álbum, procura os artistas associados(relacionados) na listaAlbumArtista
            for (AlbumArtista artista : listaAlbumArtista) { 
                if (album == artista.getAlbum())
                    saida += "\t" + artista.getArtista().getNome() + "\n";
            }
            saida+="\n";
        }
        tpSaida.setText(saida);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tpSaida = new javax.swing.JTextPane();

        setTitle("Relatório de Álbuns");

        tpSaida.setEditable(false);
        tpSaida.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(tpSaida);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane tpSaida;
    // End of variables declaration//GEN-END:variables
}
