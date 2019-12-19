/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhojava;

import BD.BDSQLServer;
import BD.Core.MeuResultSet;
import BD.dbos.Aluno;
import BD.dbos.Fez;
import BD.daos.Alunos;
import BD.daos.Fizeste;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FezCrud extends javax.swing.JFrame 
{
    public FezCrud() 
    {
        initComponents();    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInserir = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtRa = new javax.swing.JTextField();
        txtCod = new javax.swing.JTextField();
        txtNota = new javax.swing.JTextField();
        txtFreq = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRelatorio = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnAluno = new javax.swing.JButton();
        btnMat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Notas e Frequências");

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

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtFreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFreqActionPerformed(evt);
            }
        });

        jLabel1.setText("Ra:");

        jLabel2.setText("Código:");

        jLabel3.setText("Nota:");

        jLabel4.setText("Frequência:");
        jLabel4.setToolTipText("");

        tbRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RA", "COD", "NOTA", "FREQ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbRelatorio);

        btnVoltar.setText("<<");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnAluno.setText("Ir para Alunos");
        btnAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlunoActionPerformed(evt);
            }
        });

        btnMat.setText("Ir para Matérias");
        btnMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMat, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtRa, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAtualizar, btnConsultar, btnExcluir, btnInserir});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnAtualizar)
                    .addComponent(btnConsultar)
                    .addComponent(btnExcluir))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAluno)
                        .addComponent(btnMat)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAtualizar, btnConsultar, btnExcluir, btnInserir});

        pack();
    }// </editor-fold>//GEN-END:initComponents
// inserir RA,cod, nota e frequência dos alunos
    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        JFrame frameError = new JFrame();
        JFrame frameSucesso = new JFrame();
        try
        {
            if(!Fizeste.cadastrado(Integer.parseInt(txtRa.getText()), Integer.parseInt(txtCod.getText()))){
               Fez feito = new Fez(Integer.parseInt(txtRa.getText()),Integer.parseInt(txtCod.getText()), Float.parseFloat(txtNota.getText()), Float.parseFloat(txtFreq.getText()));
               Fizeste.incluir(feito);
               JOptionPane.showMessageDialog(frameSucesso, "Aluno de RA " + Integer.parseInt(txtRa.getText()) + " Inserido com sucesso!  " , "   Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
            else
            {
                 JOptionPane.showMessageDialog(null,"Aluno e matéria já inserido :\n\n '"  , "",JOptionPane.ERROR_MESSAGE);

            }
        }
        catch(Exception error)
        {
            JOptionPane.showMessageDialog(frameError, "Erro " + "Aluno já existe no banco de dados ou não é válido","Tente outro Ra", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnInserirActionPerformed
// Consultar alunos, médias e frequências anotadas
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
    try
    {
            if(txtRa.getText().isEmpty())
                alunosComNotasFrequenciasRegistradas();   // se estiver vazio, mostra todos
            else if(Fizeste.cadastrado(Integer.parseInt(txtRa.getText())))
              consultarAlunoEspecifico(); // se não, consulta um RA especifico
            if(Fizeste.cadastrado(Integer.parseInt(txtRa.getText()), Integer.parseInt(txtCod.getText())))
            consultarMateriaEspecifica();
          
            else 
                JOptionPane.showMessageDialog(null, "Erro " + "Aluno não é válido","Tente outro Ra", JOptionPane.ERROR_MESSAGE);
    }
    catch(Exception e)
    {}
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        String erro = "Erro 404";
        JFrame frame = new JFrame("Error");
        JFrame frameSucesso = new JFrame();
        try
        {  
            if(Fizeste.cadastrado(Integer.parseInt(txtRa.getText()), Integer.parseInt(txtCod.getText())))
            {
            Fez f =  new Fez(Integer.parseInt(txtRa.getText()), Integer.parseInt(txtCod.getText()),Float.parseFloat(txtNota.getText()),Float.parseFloat(txtFreq.getText()));
            Fizeste.alterarNota(f); 
            JOptionPane.showMessageDialog(frameSucesso, " " + "Atualizado com sucesso!  ", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }   
        }
        catch(Exception error)
        {
            JOptionPane.showMessageDialog(frame,
            "Erro ao atualizar dados!:\n\n '" + erro + "'.", //mensagem
            "Erro 404",
            JOptionPane.ERROR_MESSAGE);
    
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String erro = "Erro 404";
        JFrame frame = new JFrame("Error");
        JFrame sucesso = new JFrame();
        try
        {
            if(Fizeste.cadastrado(Integer.parseInt(txtRa.getText()),Integer.parseInt(txtCod.getText())))
            {
            Fizeste.excluir(Integer.parseInt(txtRa.getText()), Integer.parseInt(txtCod.getText()));
            JOptionPane.showMessageDialog(sucesso, " " + "Excluido com sucesso!  ", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(Exception error)
        {
            JOptionPane.showMessageDialog(frame,
        "Aluno não encontrado:\n\n '" + erro + "'.", //mensagem
        "Erro 404",
        JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtFreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFreqActionPerformed

    }//GEN-LAST:event_txtFreqActionPerformed
    //Redirecionar para JFrame original
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        FormCrud crud = new FormCrud();
        crud.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnVoltarActionPerformed
       //redirecionar para Alunos
    private void btnAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlunoActionPerformed
        AlunoCrud aluno = new AlunoCrud();
        aluno.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAlunoActionPerformed
        //Redirecionar para Matérias
    private void btnMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatActionPerformed
        MateriaCrud mat = new MateriaCrud();
        mat.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnMatActionPerformed
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new FezCrud().setVisible(true);
            }
        });
    }
    //Mostrar todos os alunos da tabela
     private void alunosComNotasFrequenciasRegistradas()
     {
        DefaultTableModel mod = (DefaultTableModel)tbRelatorio.getModel();
        mod.setNumRows(0);
        
        tbRelatorio.getColumnModel().getColumn(0);
        tbRelatorio.getColumnModel().getColumn(1);
        tbRelatorio.getColumnModel().getColumn(2);
         tbRelatorio.getColumnModel().getColumn(3);
        MeuResultSet rs = null;
       
        try
        {
            String sql = "Select * from fezz";
            BDSQLServer.COMANDO.prepareStatement(sql);           
            rs = (MeuResultSet)BDSQLServer.COMANDO.executeQuery();
            while(rs.next())
            {             
                mod.addRow(new Object[]{
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getFloat(3),
                    rs.getFloat(4)
                });    
            }    
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erro ao carregar tabela de Alunos"+e,"ERRO",JOptionPane.ERROR_MESSAGE);
        }
    } 
       //busca um aluno específico na tabela
       private void consultarAlunoEspecifico()
       {
            DefaultTableModel mod = (DefaultTableModel)tbRelatorio.getModel();
            mod.setNumRows(0);

            tbRelatorio.getColumnModel().getColumn(0);
            tbRelatorio.getColumnModel().getColumn(1);
            tbRelatorio.getColumnModel().getColumn(2);
             tbRelatorio.getColumnModel().getColumn(3);
            MeuResultSet rs = null;
            int ra = Integer.parseInt(txtRa.getText());
            try
            {
                String sql = "Select * from fezz where ra =" + ra;
                BDSQLServer.COMANDO.prepareStatement(sql);           
                rs = (MeuResultSet)BDSQLServer.COMANDO.executeQuery();
                while(rs.next())
                {

                    mod.addRow(new Object[]{
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getFloat(3),
                        rs.getFloat(4)
                    });    
                }    
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Erro ao carregar tabela de Alunos"+e,"ERRO",JOptionPane.ERROR_MESSAGE);
            }
        }
       
        private void consultarMateriaEspecifica()
        {
            DefaultTableModel mod = (DefaultTableModel)tbRelatorio.getModel();
            mod.setNumRows(0);

            tbRelatorio.getColumnModel().getColumn(0);
            tbRelatorio.getColumnModel().getColumn(1);
            tbRelatorio.getColumnModel().getColumn(2);
             tbRelatorio.getColumnModel().getColumn(3);
            MeuResultSet rs = null;
            int ra = Integer.parseInt(txtRa.getText());
            int cod = Integer.parseInt(txtCod.getText());
            
            try
            {
                String sql = "Select * from fezz where ra =  " + ra+"and cod="+ cod;
                BDSQLServer.COMANDO.prepareStatement(sql);           
                rs = (MeuResultSet)BDSQLServer.COMANDO.executeQuery();
                while(rs.next())
                {

                    mod.addRow(new Object[]{
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getFloat(3),
                        rs.getFloat(4)
                    });    
                }    
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Erro ao carregar tabela de Alunos"+e,"ERRO",JOptionPane.ERROR_MESSAGE);
            }
        }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAluno;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnMat;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbRelatorio;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtFreq;
    private javax.swing.JTextField txtNota;
    private javax.swing.JTextField txtRa;
    // End of variables declaration//GEN-END:variables
}
