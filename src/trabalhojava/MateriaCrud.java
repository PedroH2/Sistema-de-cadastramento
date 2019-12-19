package trabalhojava;

import BD.BDSQLServer;
import BD.Core.MeuResultSet;
import BD.dbos.Aluno;
import BD.dbos.Materia;
import BD.daos.Alunos;
import BD.daos.Materias;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class MateriaCrud extends javax.swing.JFrame {

    public MateriaCrud()
    {
        initComponents();
    }
    //ConsultarMateriaEspecifica
    private void readConsultaEspecifica()
    {
        DefaultTableModel mod = (DefaultTableModel)tbRelatorio.getModel();
        mod.setNumRows(0);
        
        tbRelatorio.getColumnModel().getColumn(0);
        tbRelatorio.getColumnModel().getColumn(1);
       
        MeuResultSet rs = null;
        int cod = Integer.parseInt(txtCodigo.getText());
        
        try
        {
            String sql;
            sql = "Select * from materia where codigo=" + cod;

            BDSQLServer.COMANDO.prepareStatement(sql);           
            rs = (MeuResultSet)BDSQLServer.COMANDO.executeQuery();
            while(rs.next()){
                
                mod.addRow(new Object[]{
                    rs.getInt(1),
                    rs.getString(2)
                    
                });    
            }    
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erro ao carregar tabela de Alunos"+e,"ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbRelatorio = new javax.swing.JTable();
        btnRelatar2 = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbRelatNotas = new javax.swing.JTable();
        btnRelatarMatSemReprovacao = new javax.swing.JButton();
        btnRelatarOrdMediaMaterias = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnAluno = new javax.swing.JButton();
        btnNota = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Materias");

        tbRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cod", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbRelatorio);

        btnRelatar2.setText("Relatar aprovados ord. média");
        btnRelatar2.setActionCommand("Relatorio 2");
        btnRelatar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatar2ActionPerformed(evt);
            }
        });

        btnInserir.setText("Inserir");
        btnInserir.setMaximumSize(new java.awt.Dimension(116, 15));
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.setMaximumSize(new java.awt.Dimension(116, 15));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.setMaximumSize(new java.awt.Dimension(116, 15));
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.setMaximumSize(new java.awt.Dimension(116, 15));
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        lblNome.setText("Nome:");

        jLabel2.setText("Código:");

        tbRelatNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Ra", "CodMateria", "Nota", "Frequência"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbRelatNotas);

        btnRelatarMatSemReprovacao.setText("Relatar matérias sem reprovacao");
        btnRelatarMatSemReprovacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatarMatSemReprovacaoActionPerformed(evt);
            }
        });

        btnRelatarOrdMediaMaterias.setText("Relatar alunos ordenados por médias das matérias");
        btnRelatarOrdMediaMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatarOrdMediaMateriasActionPerformed(evt);
            }
        });

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

        btnNota.setText("Ir para Notas e Frequências");
        btnNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo))
                                .addGap(31, 31, 31)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(txtNome))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(lblNome)))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRelatarOrdMediaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnRelatar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRelatarMatSemReprovacao, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAtualizar, btnConsultar, btnDeletar, btnInserir});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRelatarMatSemReprovacao)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRelatar2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(btnVoltar)))
                        .addGap(11, 11, 11)
                        .addComponent(btnRelatarOrdMediaMaterias)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAtualizar, btnConsultar, btnDeletar, btnInserir});

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Mostra os alunos aprovados pela nota na tabela
    private void btnRelatar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatar2ActionPerformed
        try
        {
           readAprovadoNota();
        }
        catch(Exception error)
        {}
    }//GEN-LAST:event_btnRelatar2ActionPerformed
// Insere os dados
    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        JFrame frameError = new JFrame();
        JFrame frameSucesso = new JFrame();
 
        try
        {
            if(!Materias.cadastrada(Integer.parseInt(txtCodigo.getText())))
            {
            Materia mat = new Materia(Integer.parseInt(txtCodigo.getText()),txtNome.getText());
           
            Materias.incluir(mat);
             JOptionPane.showMessageDialog(frameSucesso, "Materia de COD: "+ txtCodigo.getText() + 
                     " Inserido com sucesso!  " , "   Sucesso", JOptionPane.INFORMATION_MESSAGE);
            
            }
        }
        catch(Exception error)
        {
            JOptionPane.showMessageDialog(null, " Erro" + "Matéria já existe no banco de dados ou não é válida",null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnInserirActionPerformed
// Consulta os dados
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try
        {
            
           if(txtCodigo.getText().isEmpty())// se estiver vazio
             readTable();   //mostra todos os dados na tabela
           else // se nao
                readConsultaEspecifica();// busca um especifico
         
           
                       
        }
        catch(Exception Erro)
        {
             JOptionPane.showMessageDialog(null,
            "Houve um problema ao procurar a materia:\n\n '" + Erro + "'.", //mensagem
            "Erro 404",
            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed
    //atualiza os dados
    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        String erro = "Erro 404";
        JFrame frame = new JFrame("Error");
        JFrame frameSucesso = new JFrame();
        try
        {      
            Materia mat = new Materia(Integer.parseInt(txtCodigo.getText()),txtNome.getText());
            Materias.alterar(mat);
            JOptionPane.showMessageDialog(frameSucesso, " " + "Atualizado com sucesso!  ", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception error)
        {
            JOptionPane.showMessageDialog(frame,
                "Matéria não encontrada:\n\n '" + erro + "'.", //mensagem
                "Erro 404",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed
    // deleta os dados
    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        String erro = "Erro 404";
        JFrame frame = new JFrame("Error");
        JFrame sucesso = new JFrame();
        try
        {
            if(!txtCodigo.getText().isEmpty())
            {
            Materias.excluir(Integer.parseInt(txtCodigo.getText()));
            JOptionPane.showMessageDialog(sucesso, " " + "Excluido com sucesso!  ", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
         else
                JOptionPane.showMessageDialog(null,"Erro ao deletar matéria, ","Insira uma matéria já existente para excluir",JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception error)
        {
            JOptionPane.showMessageDialog(frame,
                "ERRO AO DELETAR:\n\n '" + erro + "'.", //mensagem
                "Erro 404",
                JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnDeletarActionPerformed
    // relata todos os aprovados (partindo do principio q nota azul é 5 e máximo de ausência permitida é 25%
    private void readAprovado()
    {
        DefaultTableModel mod = (DefaultTableModel)tbRelatNotas.getModel();
        mod.setNumRows(0);

        tbRelatNotas.getColumnModel().getColumn(0);
        tbRelatNotas.getColumnModel().getColumn(1);
        tbRelatNotas.getColumnModel().getColumn(2);
        tbRelatNotas.getColumnModel().getColumn(3);
        tbRelatNotas.getColumnModel().getColumn(4);

        MeuResultSet rs = null;
        String sql = null;
        try
        {
            sql = "SELECT nome, ra,cod ,nota, frequencia from fezz as b,Materia as c WHERE nota >= 5 and frequencia >=75 and b.cod = c.codigo order by nota\n" + "";

            BDSQLServer.COMANDO.prepareStatement(sql);
            rs = (MeuResultSet)BDSQLServer.COMANDO.executeQuery();
            while(rs.next())
            {

                mod.addRow(new Object[]{
                    rs.getString(1),
                    rs.getInt(2),
                    rs.getInt(3),
                    rs.getFloat(4),
                    rs.getFloat(5)

                });
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erro ao carregar tabela de Alunos"+e,"ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }
   // mostra todos os dados na tabela
    private void readTable()
    {
        DefaultTableModel mod = (DefaultTableModel)tbRelatorio.getModel();
        mod.setNumRows(0);
        
        tbRelatorio.getColumnModel().getColumn(0);
        tbRelatorio.getColumnModel().getColumn(1);
       
        MeuResultSet rs = null;
       
        try
        {
            String sql = "Select * from materia";
            BDSQLServer.COMANDO.prepareStatement(sql);           
            rs = (MeuResultSet)BDSQLServer.COMANDO.executeQuery();
            while(rs.next()){
                
                mod.addRow(new Object[]{
                    rs.getInt(1),
                    rs.getString(2),
                    
                });    
            }    
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erro ao carregar tabela de Alunos"+e,"ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Mostra todas as materias aprovadas ordenadas pela nota de seus alunos
    private void readAprovadoNota()
    {
        DefaultTableModel mod = (DefaultTableModel)tbRelatNotas.getModel();
        mod.setNumRows(0);
        
        tbRelatNotas.getColumnModel().getColumn(0);
        tbRelatNotas.getColumnModel().getColumn(1);
        tbRelatNotas.getColumnModel().getColumn(2);
        tbRelatNotas.getColumnModel().getColumn(3);
        tbRelatNotas.getColumnModel().getColumn(4);
       
        MeuResultSet rs = null;
       
        try
        {
            String sql = "Select a.nome,c.ra,b.codigo, nota, frequencia from alunos as a, fezz as c, materia as b where c.ra = a.ra and b.codigo != c.cod and nota>=5 and frequencia>=75 order by nota DESC";
            BDSQLServer.COMANDO.prepareStatement(sql);           
            rs = (MeuResultSet)BDSQLServer.COMANDO.executeQuery();
            while(rs.next()){
                
                mod.addRow(new Object[]{
                    rs.getString(1),
                    rs.getInt(2),
                    rs.getInt(3),
                    rs.getFloat(4),
                    rs.getFloat(5),
                    
                });    
            }    
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erro ao carregar tabela de Alunos"+e,"ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }
    //Mostra de forma decrescente todos os alunos aprovados
    private void readAprovadoNotaDosAlunos()
    {
        DefaultTableModel mod = (DefaultTableModel)tbRelatNotas.getModel();
        mod.setNumRows(0);
        
        tbRelatNotas.getColumnModel().getColumn(0);
        tbRelatNotas.getColumnModel().getColumn(1);
        tbRelatNotas.getColumnModel().getColumn(2);
        tbRelatNotas.getColumnModel().getColumn(3);
        tbRelatNotas.getColumnModel().getColumn(4);
       
        MeuResultSet rs = null;
       
        try
        {
            String sql = "Select nome,a.ra,cod, nota, frequencia from alunos as a, fezz as b where a.ra = b.ra order by nota DESC";
            BDSQLServer.COMANDO.prepareStatement(sql);            
            rs = (MeuResultSet)BDSQLServer.COMANDO.executeQuery();
            while(rs.next()){
                
                mod.addRow(new Object[]{
                    rs.getString(1),
                    rs.getInt(2),
                    rs.getInt(3),
                    rs.getFloat(4),
                    rs.getFloat(5)
                    
                });    
            }    
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Erro ao carregar tabela de Alunos"+e,"ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }
    //materias sem reprovação
    private void btnRelatarMatSemReprovacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatarMatSemReprovacaoActionPerformed
        // TODO add your handling code here:
        try
        {
        readAprovado();
        }
        catch(Exception e){
            
        }
        
    }//GEN-LAST:event_btnRelatarMatSemReprovacaoActionPerformed
    
    private void btnRelatarOrdMediaMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatarOrdMediaMateriasActionPerformed
       try
       {
           readAprovadoNotaDosAlunos();
       }
       catch(Exception error)
       {}
    }//GEN-LAST:event_btnRelatarOrdMediaMateriasActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        FormCrud crud = new FormCrud();
        crud.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotaActionPerformed
        // TODO add your handling code here:
        FezCrud fez = new FezCrud();
                fez.setVisible(true);
                dispose();
    }//GEN-LAST:event_btnNotaActionPerformed

    private void btnAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlunoActionPerformed
        // TODO add your handling code here:
        
        AlunoCrud aluno = new AlunoCrud();
                  aluno.setVisible(true);
                  dispose();
                   
        
    }//GEN-LAST:event_btnAlunoActionPerformed
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MateriaCrud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAluno;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnNota;
    private javax.swing.JButton btnRelatar2;
    private javax.swing.JButton btnRelatarMatSemReprovacao;
    private javax.swing.JButton btnRelatarOrdMediaMaterias;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tbRelatNotas;
    private javax.swing.JTable tbRelatorio;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
