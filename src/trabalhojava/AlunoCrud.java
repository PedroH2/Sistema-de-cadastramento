package trabalhojava;

import BD.BDSQLServer;
import BD.Core.MeuResultSet;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import BD.daos.Alunos;
import BD.dbos.Aluno;

public class AlunoCrud extends javax.swing.JFrame {

    public AlunoCrud()
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInserir = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        txtRa = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblRa = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRelatorio = new javax.swing.JTable();
        btnRelatar = new javax.swing.JButton();
        btnRelatarTodos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbFreq = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alunos");

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblRa.setText("Ra:");

        lblNome.setText("Nome:");

        lblEmail.setText("E-mail:");

        tbRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ra", "Nome", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbRelatorio);

        btnRelatar.setText("Relatar Frequencias = 0");
        btnRelatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatarActionPerformed(evt);
            }
        });

        btnRelatarTodos.setText("Relatar Todos os Alunos");
        btnRelatarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatarTodosActionPerformed(evt);
            }
        });

        tbFreq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ra", "Nome", "Email", "Ra", "Codigo", "Nota", "Frequencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbFreq);

        btnVoltar.setText("<<");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jButton1.setText("Ir para Notas e Frequências");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ir Para Matérias");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(lblEmail)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addGap(34, 34, 34)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(39, 39, 39)
                        .addComponent(btnRelatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(63, 63, 63))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtRa, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnRelatarTodos))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar)
                    .addComponent(btnDeletar))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRa)
                    .addComponent(lblNome)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnRelatarTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRelatar)
                    .addComponent(btnVoltar)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 //  método para mostrar todos os alunos na tabela   
    private void readTable()
    {      
        DefaultTableModel mod = (DefaultTableModel)tbRelatorio.getModel();
        mod.setNumRows(0);
        
        tbRelatorio.getColumnModel().getColumn(0);
        tbRelatorio.getColumnModel().getColumn(1);
        tbRelatorio.getColumnModel().getColumn(2);
        MeuResultSet rs = null;
        try
        {
            String sql = "Select * from alunos";
            
            BDSQLServer.COMANDO.prepareStatement(sql);
            rs = (MeuResultSet)BDSQLServer.COMANDO.executeQuery();
           
            while(rs.next())
            {
                mod.addRow(new Object[]{
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3)           
                });
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erro ao carregar tabela de Alunos"+e,"ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //método para selecionar um aluno específico
    private void readAluno()
    {
        DefaultTableModel mod = (DefaultTableModel)tbRelatorio.getModel();
        mod.setNumRows(0);  
        tbRelatorio.getColumnModel().getColumn(0);
        tbRelatorio.getColumnModel().getColumn(1);
        tbRelatorio.getColumnModel().getColumn(2);
        MeuResultSet rs = null;
        int ra = Integer.parseInt(txtRa.getText());
        try
        {
            String sql = "Select * from alunos where ra="+ ra;
            BDSQLServer.COMANDO.prepareStatement(sql); 
            rs = (MeuResultSet)BDSQLServer.COMANDO.executeQuery();
            while(rs.next())
            { 
                mod.addRow(new Object[]{
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3)      
                });      
            }        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erro ao carregar tabela de Alunos"+e,"ERRO",JOptionPane.ERROR_MESSAGE);
        }  
    }
    //método para mostrar os alunos com freq igual a 0
    
     private void readFreq()
     {
        DefaultTableModel mod = (DefaultTableModel)tbFreq.getModel();
        mod.setNumRows(0);
        
        tbFreq.getColumnModel().getColumn(0);
        tbFreq.getColumnModel().getColumn(1);
        tbFreq.getColumnModel().getColumn(2);
        tbFreq.getColumnModel().getColumn(3);
        tbFreq.getColumnModel().getColumn(4);
        tbFreq.getColumnModel().getColumn(5);
        tbFreq.getColumnModel().getColumn(6);
        MeuResultSet rs = null;      
        try
        {         
            String sql = "Select * from alunos a, fezz f where a.ra = f.ra and f.frequencia =0";
            BDSQLServer.COMANDO.prepareStatement(sql);      
            rs = (MeuResultSet)BDSQLServer.COMANDO.executeQuery();      
            
            while(rs.next())
            {
                mod.addRow(new Object[]{
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getInt(4),
                    rs.getInt(5),
                    rs.getFloat(6),
                    rs.getFloat(7)

                });  
            }   
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erro ao carregar tabela de Alunos"+e,"ERRO",JOptionPane.ERROR_MESSAGE);
        }
    } 
    // Insere o aluno no Banco de dados
    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        JFrame frameError = new JFrame();
        JFrame frameSucesso = new JFrame();            
        try
        {
            if(!Alunos.cadastrado(Integer.parseInt(txtRa.getText())))
            {
                Aluno alu = new Aluno(Integer.parseInt(txtRa.getText()), txtNome.getText(), txtEmail.getText());
                Alunos.incluir(alu);
                JOptionPane.showMessageDialog(frameSucesso, "Aluno de RA " + Integer.parseInt(txtRa.getText()) +" Inserido com sucesso!  "  , "   Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }

         }
         catch(Exception error)
         {
             JOptionPane.showMessageDialog(frameError, "Erro" + "Aluno não é válido","Tente outro Ra", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_btnInserirActionPerformed
   
    //Busca o aluno pelo RA
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try
        {
               readAluno(); 
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, "Erro" + "Aluno não é válido","Tente outro Ra", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        String erro = "Erro 404";
        JFrame frame = new JFrame("Error");
        JFrame sucesso = new JFrame();
        try
        {
            if(Alunos.cadastrado(Integer.parseInt(txtRa.getText())))
            {
                Alunos.excluir(Integer.parseInt(txtRa.getText()));
                JOptionPane.showMessageDialog(sucesso, " " + "Excluido com sucesso!  ", "Sucesso", JOptionPane.INFORMATION_MESSAGE); 
            }
            else
                 JOptionPane.showMessageDialog(frame,
                    "Aluno não encontrado:\n\n '" + erro + "'.", //mensagem
                    "Erro 404",
                    JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception error)
        {
                JOptionPane.showMessageDialog(frame,
            "Aluno não encontrado:\n\n '" + erro + "'.", //mensagem
            "Erro 404",
            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeletarActionPerformed
    //atualiza os dados do aluno
    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        String erro = "Erro 404";
        JFrame frame = new JFrame("Error");
        JFrame frameSucesso = new JFrame();
        
        try
        { 
            Aluno al = new Aluno(Integer.parseInt(txtRa.getText()),txtNome.getText(),txtEmail.getText());

            Alunos.alterar(al);
            JOptionPane.showMessageDialog(frameSucesso, " " + "Atualizado com sucesso!  ", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        }
        catch(Exception error)
        {
            JOptionPane.showMessageDialog(frame,
            "Erro ao atualizar dados:\n\n '" + erro + "'.", //mensagem
            "Erro 404",
            JOptionPane.ERROR_MESSAGE);

        }
    
    }//GEN-LAST:event_btnAtualizarActionPerformed
    //Mostra os alunos com frequência = 0
    private void btnRelatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatarActionPerformed
        try
        {
                readFreq();
        }
        catch(Exception error)
        {}
    }//GEN-LAST:event_btnRelatarActionPerformed
    // mostra todos os alunos na tabela
    private void btnRelatarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatarTodosActionPerformed
            readTable();
    }//GEN-LAST:event_btnRelatarTodosActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
    }//GEN-LAST:event_txtEmailActionPerformed
    // volta para o JFrame inicial
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        FormCrud crud = new FormCrud();
        crud.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed
        // vai para o "Relatar notas e frequências"
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FezCrud fez =  new FezCrud();
        fez.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    // vai para Matérias
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MateriaCrud mat = new MateriaCrud();
        mat.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new AlunoCrud().setVisible(true);      
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnRelatar;
    private javax.swing.JButton btnRelatarTodos;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRa;
    private javax.swing.JTable tbFreq;
    private javax.swing.JTable tbRelatorio;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRa;
    // End of variables declaration//GEN-END:variables
}
