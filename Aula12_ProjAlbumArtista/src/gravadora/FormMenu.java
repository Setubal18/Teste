package gravadora;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Madianita
 */
public class FormMenu extends javax.swing.JFrame {
    static ArrayList<Album> listaAlbuns;
    static ArrayList<Artista> listaArtistas;
    static ArrayList<AlbumArtista> listaAlbumArtista;
    
    FormAlbum telaAlbum;
    FormRelAlbuns telaRelAlbuns;
    
    public FormMenu() {
        initComponents();
        listaAlbuns = new ArrayList<>();
        listaArtistas = new ArrayList<>();
        listaAlbumArtista = new ArrayList<>();
        
        diretoNoCodigo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuArtistas = new javax.swing.JMenuItem();
        menuAlbuns = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuRelAlbuns = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Cadastros");

        menuArtistas.setText("Artistas");
        menuArtistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArtistasActionPerformed(evt);
            }
        });
        jMenu1.add(menuArtistas);

        menuAlbuns.setText("Álbuns");
        menuAlbuns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlbunsActionPerformed(evt);
            }
        });
        jMenu1.add(menuAlbuns);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatórios");

        menuRelAlbuns.setText("Álbuns");
        menuRelAlbuns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelAlbunsActionPerformed(evt);
            }
        });
        jMenu2.add(menuRelAlbuns);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuArtistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArtistasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuArtistasActionPerformed

    private void menuAlbunsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlbunsActionPerformed
        if (telaAlbum == null)
               telaAlbum = new FormAlbum();
        
        telaAlbum.setVisible(true);
    }//GEN-LAST:event_menuAlbunsActionPerformed

    private void menuRelAlbunsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelAlbunsActionPerformed
        if (telaRelAlbuns == null)
               telaRelAlbuns = new FormRelAlbuns();
        
        telaRelAlbuns.setVisible(true);
    }//GEN-LAST:event_menuRelAlbunsActionPerformed

    /**
     * @param args the command line arguments
     */
   
    public void diretoNoCodigo()
    {
        listaAlbuns.add(new Album(01, "Românticas de Novelas"));
        listaAlbuns.add(new Album(02, "Para dançar"));
        
        listaArtistas.add(new Artista(01, "Caetano Veloso", "caetano@caetano.com"));
        listaArtistas.add(new Artista(02, "Marisa Monte", "marisa@marisa.com"));
        listaArtistas.add(new Artista(03, "Ivete Sangalo", "ivete@sangalo.com"));
        listaArtistas.add(new Artista(04, "Lulu Santos", "lulu@santos.com"));
        
        listaAlbumArtista.add(new AlbumArtista(listaAlbuns.get(0), listaArtistas.get(0)));
        listaAlbumArtista.add(new AlbumArtista(listaAlbuns.get(0), listaArtistas.get(1)));
               
    }
    
    public static void main(String args[]) {
                new FormMenu().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuAlbuns;
    private javax.swing.JMenuItem menuArtistas;
    private javax.swing.JMenuItem menuRelAlbuns;
    // End of variables declaration//GEN-END:variables
}
