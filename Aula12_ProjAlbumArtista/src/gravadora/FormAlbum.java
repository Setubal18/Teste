/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gravadora;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static gravadora.FormMenu.listaAlbuns;
import static gravadora.FormMenu.listaArtistas;
import static gravadora.FormMenu.listaAlbumArtista;

/**
 *
 * @author Madianita
 */
public class FormAlbum extends javax.swing.JFrame {

    Album alb;

    public FormAlbum() {
        initComponents();
        cbxArtistas.removeAllItems();
        for (Artista a : listaArtistas) {
            cbxArtistas.addItem(a.getNome());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfTitulo = new javax.swing.JTextField();
        btnIncluir = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        panelArtistas = new javax.swing.JPanel();
        btnInserirArtista = new javax.swing.JButton();
        cbxArtistas = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbArtistas = new javax.swing.JTable();
        btnRemoverArtista = new javax.swing.JButton();
        btnConcluir = new javax.swing.JButton();

        setTitle("Cadastro de Álbuns");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });

        jLabel1.setText("Código:");

        jLabel2.setText("Título:");

        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        panelArtistas.setBorder(javax.swing.BorderFactory.createTitledBorder("Artistas "));
        panelArtistas.setEnabled(false);

        btnInserirArtista.setText("Inserir");
        btnInserirArtista.setEnabled(false);
        btnInserirArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirArtistaActionPerformed(evt);
            }
        });

        cbxArtistas.setEnabled(false);
        cbxArtistas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxArtistasMouseClicked(evt);
            }
        });
        cbxArtistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxArtistasActionPerformed(evt);
            }
        });

        tbArtistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "e-mail"
            }
        ));
        tbArtistas.setEnabled(false);
        jScrollPane1.setViewportView(tbArtistas);

        btnRemoverArtista.setText("Remover");
        btnRemoverArtista.setEnabled(false);
        btnRemoverArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverArtistaActionPerformed(evt);
            }
        });

        btnConcluir.setText("Concluir");
        btnConcluir.setEnabled(false);
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelArtistasLayout = new javax.swing.GroupLayout(panelArtistas);
        panelArtistas.setLayout(panelArtistasLayout);
        panelArtistasLayout.setHorizontalGroup(
            panelArtistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArtistasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelArtistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(panelArtistasLayout.createSequentialGroup()
                        .addComponent(cbxArtistas, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInserirArtista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoverArtista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConcluir)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelArtistasLayout.setVerticalGroup(
            panelArtistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArtistasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelArtistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxArtistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInserirArtista)
                    .addComponent(btnRemoverArtista)
                    .addComponent(btnConcluir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btnIncluir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPesquisar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAlterar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnExcluir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCancelar))
                                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelArtistas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluir)
                    .addComponent(btnPesquisar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addComponent(panelArtistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        incluirAlbum();
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void cbxArtistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxArtistasActionPerformed

    }//GEN-LAST:event_cbxArtistasActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        pesquisarAlbum();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluirAlbum();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnInserirArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirArtistaActionPerformed
        inserirArtista();
    }//GEN-LAST:event_btnInserirArtistaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed
        limpar();
    }//GEN-LAST:event_btnConcluirActionPerformed

    private void btnRemoverArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverArtistaActionPerformed
        removerArtista();
    }//GEN-LAST:event_btnRemoverArtistaActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterarAlbum();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated

    }//GEN-LAST:event_formWindowDeactivated

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing


    }//GEN-LAST:event_formWindowClosing

    private void cbxArtistasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxArtistasMouseClicked

    }//GEN-LAST:event_cbxArtistasMouseClicked

    public Album existeAlbum(int codigo) {
        for (Album a : listaAlbuns) {
            if (a.getCod() == codigo) {
                return a;
            }
        }
        return null;
    }

    public void incluirAlbum() {
        if (tfCodigo.getText().equals("") || tfTitulo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Os dois campos devem estar preenchidos!");
        } else {
            alb = new Album(Integer.parseInt(tfCodigo.getText()), tfTitulo.getText());
            listaAlbuns.add(alb);

            btnIncluir.setEnabled(false);
            btnPesquisar.setEnabled(false);
            cbxArtistas.setEnabled(true);
            btnInserirArtista.setEnabled(true);
            btnRemoverArtista.setEnabled(true);
            btnConcluir.setEnabled(true);
            panelArtistas.setEnabled(true);
            tbArtistas.setEnabled(true);
        }
    }

    public void pesquisarAlbum() {
        if (tfCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo código deve estar preenchido!");
        } else {
            alb = existeAlbum(Integer.parseInt(tfCodigo.getText()));
            if (alb == null) {
                JOptionPane.showMessageDialog(null, "Álbum não existe!");
            } else {
                tfTitulo.setText(alb.getTitulo());

                //Adiciona os listaArtistas relacionados ao album na tabela
                Artista art;
                DefaultTableModel modelo = (DefaultTableModel) tbArtistas.getModel();
                for (AlbumArtista albArt : listaAlbumArtista) //Pesquisa a lista que relaciona Álbum à Artista
                {
                    if (alb == albArt.getAlbum()) {
                        art = albArt.getArtista();
                        String[] linha = {art.getCod() + "", art.getNome(), art.geteMail()};
                        modelo.addRow(linha);
                    }
                }
                btnIncluir.setEnabled(false);
                btnPesquisar.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
                cbxArtistas.setEnabled(true);
                btnInserirArtista.setEnabled(true);
                btnRemoverArtista.setEnabled(true);
                btnConcluir.setEnabled(true);
                panelArtistas.setEnabled(true);
                tbArtistas.setEnabled(true);
            }
        }
    }

    public void alterarAlbum() {
        alb.setTitulo(tfTitulo.getText());
        limpar();
    }

    public void excluirAlbum() {
        for (AlbumArtista aa : listaAlbumArtista) {
            if (alb == aa.getAlbum()) {
                System.out.println("\nRemover: " + aa.getAlbum().getTitulo() + " " + aa.getArtista().getNome());
                listaAlbumArtista.remove(alb);
            }
        }
        //Remove o álbum que foi localizado na pesquisa
        listaAlbuns.remove(alb);
        limpar();
    }

    public void inserirArtista() {
        //Pega referência do objeto de artista selecionado na combo box
        int pos = cbxArtistas.getSelectedIndex();
        Artista art = listaArtistas.get(pos);

        //Relaciona o artista com o álbum --> insere no arrayList aa
        listaAlbumArtista.add(new AlbumArtista(alb, art));

        //Adiciona o artista na tabela
        DefaultTableModel modelo = (DefaultTableModel) tbArtistas.getModel();
        String[] linha = {art.getCod() + "", art.getNome(), art.geteMail()};
        modelo.addRow(linha);
    }

    public void removerArtista() {
        int numLinha = tbArtistas.getSelectedRow(); //Retorna o número da linha selecionada
        DefaultTableModel modelo = (DefaultTableModel) tbArtistas.getModel();

        //Remove do ArrayList listaAlbumArtista
        int codArt = Integer.parseInt(modelo.getValueAt(numLinha, 0).toString());
        for (AlbumArtista albArt : listaAlbumArtista) //Pesquisa a lista que relaciona Álbum à Artista
        {
            if (albArt.getAlbum() == alb && albArt.getArtista().getCod() == codArt) {
                listaAlbumArtista.remove(albArt);
                modelo.removeRow(numLinha);
                break;
            }
        }
    }

    public void limpar() {
        tfCodigo.setText("");
        tfTitulo.setText("");
        DefaultTableModel modelo = (DefaultTableModel) tbArtistas.getModel();
        modelo.setRowCount(0);
        btnIncluir.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        cbxArtistas.setEnabled(false);
        btnInserirArtista.setEnabled(false);
        btnRemoverArtista.setEnabled(false);
        btnConcluir.setEnabled(false);
        panelArtistas.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConcluir;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnInserirArtista;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRemoverArtista;
    private javax.swing.JComboBox cbxArtistas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelArtistas;
    private javax.swing.JTable tbArtistas;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfTitulo;
    // End of variables declaration//GEN-END:variables
}
