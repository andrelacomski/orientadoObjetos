package view;

import controller.AlunoEventoControll;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class HomeProgramaView extends javax.swing.JFrame {

    /**
     * Creates new form Aplicacao
     */
    public HomeProgramaView() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        painelCadastroAluno = new javax.swing.JPanel();
        textCadastroAluno = new javax.swing.JLabel();
        painelCadastroEvento = new javax.swing.JPanel();
        textCadastroEvento = new javax.swing.JLabel();
        inputControle = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        painelEditAluno = new javax.swing.JPanel();
        textEditAluno = new javax.swing.JLabel();
        painelEditEvento = new javax.swing.JPanel();
        textEditEvento = new javax.swing.JLabel();
        painelSorteio = new javax.swing.JPanel();
        textSorteio = new javax.swing.JLabel();
        painelRelatorio = new javax.swing.JPanel();
        textRelatorio = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Editar Aluno");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(44, 62, 80));

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        Title.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Dashboard");

        painelCadastroAluno.setBackground(new java.awt.Color(30, 136, 229));
        painelCadastroAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelCadastroAlunoMouseClicked(evt);
            }
        });

        textCadastroAluno.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        textCadastroAluno.setForeground(new java.awt.Color(255, 255, 255));
        textCadastroAluno.setText("Cadastrar Aluno");
        textCadastroAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textCadastroAlunoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelCadastroAlunoLayout = new javax.swing.GroupLayout(painelCadastroAluno);
        painelCadastroAluno.setLayout(painelCadastroAlunoLayout);
        painelCadastroAlunoLayout.setHorizontalGroup(
            painelCadastroAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroAlunoLayout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addComponent(textCadastroAluno)
                .addGap(16, 16, 16))
        );
        painelCadastroAlunoLayout.setVerticalGroup(
            painelCadastroAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroAlunoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(textCadastroAluno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelCadastroEvento.setBackground(new java.awt.Color(94, 53, 177));
        painelCadastroEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelCadastroEventoMouseClicked(evt);
            }
        });

        textCadastroEvento.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        textCadastroEvento.setForeground(new java.awt.Color(255, 255, 255));
        textCadastroEvento.setText("Cadastrar Evento");
        textCadastroEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textCadastroEventoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelCadastroEventoLayout = new javax.swing.GroupLayout(painelCadastroEvento);
        painelCadastroEvento.setLayout(painelCadastroEventoLayout);
        painelCadastroEventoLayout.setHorizontalGroup(
            painelCadastroEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroEventoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textCadastroEvento)
                .addGap(20, 20, 20))
        );
        painelCadastroEventoLayout.setVerticalGroup(
            painelCadastroEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroEventoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(textCadastroEvento)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        inputControle.setBackground(new java.awt.Color(67, 160, 71));
        inputControle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputControleMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Controle de Presença");

        javax.swing.GroupLayout inputControleLayout = new javax.swing.GroupLayout(inputControle);
        inputControle.setLayout(inputControleLayout);
        inputControleLayout.setHorizontalGroup(
            inputControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputControleLayout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(19, 19, 19))
        );
        inputControleLayout.setVerticalGroup(
            inputControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputControleLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        painelEditAluno.setBackground(new java.awt.Color(244, 81, 30));
        painelEditAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelEditAlunoMouseClicked(evt);
            }
        });

        textEditAluno.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        textEditAluno.setForeground(new java.awt.Color(255, 255, 255));
        textEditAluno.setText("Editar Aluno");
        textEditAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textEditAlunoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelEditAlunoLayout = new javax.swing.GroupLayout(painelEditAluno);
        painelEditAluno.setLayout(painelEditAlunoLayout);
        painelEditAlunoLayout.setHorizontalGroup(
            painelEditAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEditAlunoLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(textEditAluno)
                .addGap(18, 18, 18))
        );
        painelEditAlunoLayout.setVerticalGroup(
            painelEditAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEditAlunoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(textEditAluno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelEditEvento.setBackground(new java.awt.Color(255, 179, 0));
        painelEditEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelEditEventoMouseClicked(evt);
            }
        });

        textEditEvento.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        textEditEvento.setForeground(new java.awt.Color(255, 255, 255));
        textEditEvento.setText("Editar Evento");
        textEditEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textEditEventoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelEditEventoLayout = new javax.swing.GroupLayout(painelEditEvento);
        painelEditEvento.setLayout(painelEditEventoLayout);
        painelEditEventoLayout.setHorizontalGroup(
            painelEditEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEditEventoLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(textEditEvento)
                .addGap(15, 15, 15))
        );
        painelEditEventoLayout.setVerticalGroup(
            painelEditEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEditEventoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(textEditEvento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelSorteio.setBackground(new java.awt.Color(109, 76, 65));
        painelSorteio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelSorteioMouseClicked(evt);
            }
        });

        textSorteio.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        textSorteio.setForeground(new java.awt.Color(255, 255, 255));
        textSorteio.setText("Sorteio");
        textSorteio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textSorteioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelSorteioLayout = new javax.swing.GroupLayout(painelSorteio);
        painelSorteio.setLayout(painelSorteioLayout);
        painelSorteioLayout.setHorizontalGroup(
            painelSorteioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSorteioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textSorteio)
                .addGap(17, 17, 17))
        );
        painelSorteioLayout.setVerticalGroup(
            painelSorteioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSorteioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(textSorteio)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        painelRelatorio.setBackground(new java.awt.Color(84, 110, 122));
        painelRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelRelatorioMouseClicked(evt);
            }
        });

        textRelatorio.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        textRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        textRelatorio.setText("Gerar Relatório");
        textRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textRelatorioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelRelatorioLayout = new javax.swing.GroupLayout(painelRelatorio);
        painelRelatorio.setLayout(painelRelatorioLayout);
        painelRelatorioLayout.setHorizontalGroup(
            painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRelatorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textRelatorio)
                .addGap(17, 17, 17))
        );
        painelRelatorioLayout.setVerticalGroup(
            painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRelatorioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(textRelatorio)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(painelCadastroAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(painelEditEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(painelEditAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(painelRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelSorteio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelCadastroEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputControle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelCadastroEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelCadastroAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelEditAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputControle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelEditEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelSorteio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void painelCadastroAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelCadastroAlunoMouseClicked
        FormularioAlunoView form = new FormularioAlunoView();
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_painelCadastroAlunoMouseClicked

    private void textCadastroAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textCadastroAlunoMouseClicked
        FormularioAlunoView form = new FormularioAlunoView();
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_textCadastroAlunoMouseClicked

    private void painelEditAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelEditAlunoMouseClicked
        HomeAlunoView form = new HomeAlunoView();
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_painelEditAlunoMouseClicked

    private void textEditAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEditAlunoMouseClicked
        HomeAlunoView form = new HomeAlunoView();
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_textEditAlunoMouseClicked

    private void painelCadastroEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelCadastroEventoMouseClicked
        HomeEventoView form = new HomeEventoView();
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_painelCadastroEventoMouseClicked

    private void textCadastroEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textCadastroEventoMouseClicked
        FormularioEventoView form = new FormularioEventoView();
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_textCadastroEventoMouseClicked

    private void textEditEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEditEventoMouseClicked
        HomeEventoView form = new HomeEventoView();
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_textEditEventoMouseClicked

    private void painelEditEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelEditEventoMouseClicked
        HomeEventoView form = new HomeEventoView();
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_painelEditEventoMouseClicked

    private void inputControleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputControleMouseClicked
        FormularioPresencaView form =  new FormularioPresencaView();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_inputControleMouseClicked

    private void painelSorteioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelSorteioMouseClicked
        HomeSorteioView sorteio = new HomeSorteioView();
        sorteio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_painelSorteioMouseClicked

    private void textSorteioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSorteioMouseClicked
        HomeSorteioView sorteio = new HomeSorteioView();
        sorteio.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_textSorteioMouseClicked

    private void painelRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelRelatorioMouseClicked
       try {

            int confirmacao = 0;
            String extensao = "";
            JFileChooser jFileChooser = new JFileChooser();

            FileNameExtensionFilter filtroTxt = new FileNameExtensionFilter("Documento de texto (*.txt)", "txt");
            FileNameExtensionFilter filtroDoc = new FileNameExtensionFilter("Documento do word (*.doc)", "txt");
            FileNameExtensionFilter filtroXls = new FileNameExtensionFilter("Pasta de Trabalho do Excel (*.xls)", "txt");
            
            jFileChooser.setFileFilter(filtroDoc);
            jFileChooser.setFileFilter(filtroXls);
            jFileChooser.setFileFilter(filtroTxt);
            
            int valorRetorno = jFileChooser.showSaveDialog(null);

            if (valorRetorno == JFileChooser.APPROVE_OPTION) {

                if (jFileChooser.getFileFilter().getDescription().equals("Documento de texto (*.txt)")) {

                    extensao = ".txt";

                } else if (jFileChooser.getFileFilter().getDescription().equals("Documento do word (*.doc)")) {

                    extensao = ".doc";

                } else if (jFileChooser.getFileFilter().getDescription().equals("Pasta de Trabalho do Excel (*.xls)")) {

                    extensao = ".xls";

                }
                
                String nomeArquivo = jFileChooser.getSelectedFile().getAbsolutePath() + extensao;

                AlunoEventoControll alunoEventoControl = new AlunoEventoControll();
                boolean arquivoExiste = alunoEventoControl.verificarExistencia(nomeArquivo);
                if (arquivoExiste) {

                    confirmacao = JOptionPane.showConfirmDialog(null, jFileChooser.getSelectedFile().getName() + " já existe.\nDeseja substituí-lo?", "Confirmar Salvar Arquivo", JOptionPane.YES_NO_OPTION);
                }

                if (confirmacao == 0) {
                    alunoEventoControl.gerarRelatorio(nomeArquivo);
                    JOptionPane.showMessageDialog(null, "Relatório gerado com sucesso!", "Gerar Relatório", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        } catch (IOException ioe) {

            JOptionPane.showMessageDialog(null, "Erro: " + ioe.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        
        } catch (SQLException sqle) {

            JOptionPane.showMessageDialog(null, "Erro: " + sqle.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_painelRelatorioMouseClicked

    private void textRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textRelatorioMouseClicked
       try {

            int confirmacao = 0;
            String extensao = "";
            JFileChooser jFileChooser = new JFileChooser();

            FileNameExtensionFilter filtroTxt = new FileNameExtensionFilter("Documento de texto (*.txt)", "txt");
            FileNameExtensionFilter filtroDoc = new FileNameExtensionFilter("Documento do word (*.doc)", "txt");
            FileNameExtensionFilter filtroXls = new FileNameExtensionFilter("Pasta de Trabalho do Excel (*.xls)", "txt");
            
            jFileChooser.setFileFilter(filtroDoc);
            jFileChooser.setFileFilter(filtroXls);
            jFileChooser.setFileFilter(filtroTxt);
            
            int valorRetorno = jFileChooser.showSaveDialog(null);

            if (valorRetorno == JFileChooser.APPROVE_OPTION) {

                if (jFileChooser.getFileFilter().getDescription().equals("Documento de texto (*.txt)")) {

                    extensao = ".txt";

                } else if (jFileChooser.getFileFilter().getDescription().equals("Documento do word (*.doc)")) {

                    extensao = ".doc";

                } else if (jFileChooser.getFileFilter().getDescription().equals("Pasta de Trabalho do Excel (*.xls)")) {

                    extensao = ".xls";

                }
                
                String nomeArquivo = jFileChooser.getSelectedFile().getAbsolutePath() + extensao;

                AlunoEventoControll alunoEventoControl = new AlunoEventoControll();
                boolean arquivoExiste = alunoEventoControl.verificarExistencia(nomeArquivo);
                if (arquivoExiste) {

                    confirmacao = JOptionPane.showConfirmDialog(null, jFileChooser.getSelectedFile().getName() + " já existe.\nDeseja substituí-lo?", "Confirmar Salvar Arquivo", JOptionPane.YES_NO_OPTION);
                }

                if (confirmacao == 0) {
                    alunoEventoControl.gerarRelatorio(nomeArquivo);
                    JOptionPane.showMessageDialog(null, "Relatório gerado com sucesso!", "Gerar Relatório", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        } catch (IOException ioe) {

            JOptionPane.showMessageDialog(null, "Erro: " + ioe.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        
        } catch (SQLException sqle) {

            JOptionPane.showMessageDialog(null, "Erro: " + sqle.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }       
    }//GEN-LAST:event_textRelatorioMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeProgramaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeProgramaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeProgramaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeProgramaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeProgramaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JPanel inputControle;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel painelCadastroAluno;
    private javax.swing.JPanel painelCadastroEvento;
    private javax.swing.JPanel painelEditAluno;
    private javax.swing.JPanel painelEditEvento;
    private javax.swing.JPanel painelRelatorio;
    private javax.swing.JPanel painelSorteio;
    private javax.swing.JLabel textCadastroAluno;
    private javax.swing.JLabel textCadastroEvento;
    private javax.swing.JLabel textEditAluno;
    private javax.swing.JLabel textEditEvento;
    private javax.swing.JLabel textRelatorio;
    private javax.swing.JLabel textSorteio;
    // End of variables declaration//GEN-END:variables
}