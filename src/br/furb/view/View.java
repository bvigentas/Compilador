package br.furb.view;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;

import br.furb.analisador_lexico.*;

/**
 *
 * @author Bruno G. Vigentas, Gustavo Westarb & Luciane Tedesco
 */
public class View extends javax.swing.JFrame {

    private boolean isNewFile = true;
    private File currentFile = null;

    public View() {
        initComponents();
        this.initShortcuts();
        textAreaEditor.setBorder(new NumberedBorder());
    }

    private void initShortcuts() {
        this.keyCrtlN();
        this.keyCrtlO();
        this.keyCrtlS();
        this.keyCrtlF9();
        this.keyCrtlF1();
    }

    private void keyCrtlN() {
        Action action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonNewActionPerformed(e);
            }
        };
        action.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control N"));
        buttonNew.getActionMap().put("Novo", action);
        buttonNew.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                (KeyStroke) action.getValue(Action.ACCELERATOR_KEY), "Novo");
    }

    private void keyCrtlO() {
        Action action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonOpenActionPerformed(e);
            }
        };
        action.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control O"));
        buttonOpen.getActionMap().put("Abrir", action);
        buttonOpen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                (KeyStroke) action.getValue(Action.ACCELERATOR_KEY), "Abrir");
    }

    private void keyCrtlS() {
        Action action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonSaveActionPerformed(e);
            }
        };
        action.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control S"));
        buttonSave.getActionMap().put("Salvar", action);
        buttonSave.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                (KeyStroke) action.getValue(Action.ACCELERATOR_KEY), "Salvar");
    }

    private void keyCrtlF9() {
        Action action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonCompileActionPerformed(e);
            }
        };
        action.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("F9"));
        buttonCompile.getActionMap().put("Comiplar", action);
        buttonCompile.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                (KeyStroke) action.getValue(Action.ACCELERATOR_KEY), "Comiplar");
    }

    private void keyCrtlF1() {
        Action action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonTeamActionPerformed(e);
            }
        };
        action.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("F1"));
        buttonTeam.getActionMap().put("Equipe", action);
        buttonTeam.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                (KeyStroke) action.getValue(Action.ACCELERATOR_KEY), "Equipe");
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelMenu = new javax.swing.JPanel();
        buttonNew = new javax.swing.JButton();
        buttonOpen = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();
        buttonCopy = new javax.swing.JButton();
        buttonCut = new javax.swing.JButton();
        buttonCompile = new javax.swing.JButton();
        buttonTeam = new javax.swing.JButton();
        buttonPaste = new javax.swing.JButton();
        jScrollPaneEditor = new javax.swing.JScrollPane();
        textAreaEditor = new javax.swing.JTextArea();
        jScrollPaneMessage = new javax.swing.JScrollPane();
        textAreaMessage = new javax.swing.JTextArea();
        jPanelStatus = new javax.swing.JPanel();
        labelStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compilador");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(916, 650));
        setModalExclusionType(null);
        setName("view"); // NOI18N
        setPreferredSize(new java.awt.Dimension(916, 650));
        setSize(new java.awt.Dimension(900, 700));

        JPanelMenu.setMinimumSize(new java.awt.Dimension(900, 600));
        JPanelMenu.setPreferredSize(new java.awt.Dimension(900, 70));

        buttonNew.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        buttonNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/furb/view/img/novo.png"))); // NOI18N
        buttonNew.setText("Novo [ctrl-n]");
        buttonNew.setToolTipText("Novo");
        buttonNew.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonNew.setMaximumSize(new java.awt.Dimension(110, 60));
        buttonNew.setMinimumSize(new java.awt.Dimension(110, 60));
        buttonNew.setName("novo"); // NOI18N
        buttonNew.setPreferredSize(new java.awt.Dimension(110, 65));
        buttonNew.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        buttonNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewActionPerformed(evt);
            }
        });

        buttonOpen.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        buttonOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/furb/view/img/abrir.png"))); // NOI18N
        buttonOpen.setText("Abrir [ctrl-o]");
        buttonOpen.setToolTipText("Abrir");
        buttonOpen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonOpen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonOpen.setInheritsPopupMenu(true);
        buttonOpen.setMaximumSize(new java.awt.Dimension(110, 60));
        buttonOpen.setMinimumSize(new java.awt.Dimension(110, 60));
        buttonOpen.setName("abrir"); // NOI18N
        buttonOpen.setPreferredSize(new java.awt.Dimension(110, 65));
        buttonOpen.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        buttonOpen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOpenActionPerformed(evt);
            }
        });

        buttonSave.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        buttonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/furb/view/img/salvar.png"))); // NOI18N
        buttonSave.setText("Salvar [ctrl-s]");
        buttonSave.setToolTipText("Salvar");
        buttonSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonSave.setMaximumSize(new java.awt.Dimension(110, 60));
        buttonSave.setMinimumSize(new java.awt.Dimension(110, 60));
        buttonSave.setName("salvar"); // NOI18N
        buttonSave.setPreferredSize(new java.awt.Dimension(110, 65));
        buttonSave.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        buttonSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        buttonCopy.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        buttonCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/furb/view/img/copiar.png"))); // NOI18N
        buttonCopy.setText("Copiar [ctrl-c]");
        buttonCopy.setToolTipText("Copiar");
        buttonCopy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonCopy.setMaximumSize(new java.awt.Dimension(110, 60));
        buttonCopy.setMinimumSize(new java.awt.Dimension(110, 60));
        buttonCopy.setName("copiar"); // NOI18N
        buttonCopy.setPreferredSize(new java.awt.Dimension(110, 65));
        buttonCopy.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        buttonCopy.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCopyActionPerformed(evt);
            }
        });

        buttonCut.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        buttonCut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/furb/view/img/recortar.png"))); // NOI18N
        buttonCut.setText("Recortar [ctrl-x]"); // NOI18N
        buttonCut.setToolTipText("Recortar");
        buttonCut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonCut.setMaximumSize(new java.awt.Dimension(110, 60));
        buttonCut.setMinimumSize(new java.awt.Dimension(110, 60));
        buttonCut.setName("recortar"); // NOI18N
        buttonCut.setPreferredSize(new java.awt.Dimension(110, 65));
        buttonCut.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        buttonCut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCutActionPerformed(evt);
            }
        });

        buttonCompile.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        buttonCompile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/furb/view/img/compilar.png"))); // NOI18N
        buttonCompile.setText("Compilar [F9]");
        buttonCompile.setToolTipText("Compilar");
        buttonCompile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonCompile.setMaximumSize(new java.awt.Dimension(110, 60));
        buttonCompile.setMinimumSize(new java.awt.Dimension(110, 60));
        buttonCompile.setName("Compilar"); // NOI18N
        buttonCompile.setPreferredSize(new java.awt.Dimension(110, 65));
        buttonCompile.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        buttonCompile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonCompile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCompileActionPerformed(evt);
            }
        });

        buttonTeam.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        buttonTeam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/furb/view/img/equipe.png"))); // NOI18N
        buttonTeam.setText("Equipe [F1]");
        buttonTeam.setToolTipText("Equipe");
        buttonTeam.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonTeam.setMaximumSize(new java.awt.Dimension(110, 60));
        buttonTeam.setMinimumSize(new java.awt.Dimension(110, 60));
        buttonTeam.setName("Equipe"); // NOI18N
        buttonTeam.setPreferredSize(new java.awt.Dimension(110, 65));
        buttonTeam.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        buttonTeam.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTeamActionPerformed(evt);
            }
        });

        buttonPaste.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        buttonPaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/furb/view/img/colar.png"))); // NOI18N
        buttonPaste.setText("Colar [ctrl-v]");
        buttonPaste.setToolTipText("Colar");
        buttonPaste.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonPaste.setMaximumSize(new java.awt.Dimension(110, 60));
        buttonPaste.setMinimumSize(new java.awt.Dimension(110, 60));
        buttonPaste.setName("colar"); // NOI18N
        buttonPaste.setPreferredSize(new java.awt.Dimension(110, 65));
        buttonPaste.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        buttonPaste.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPasteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelMenuLayout = new javax.swing.GroupLayout(JPanelMenu);
        JPanelMenu.setLayout(JPanelMenuLayout);
        JPanelMenuLayout.setHorizontalGroup(
            JPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelMenuLayout.createSequentialGroup()
                .addComponent(buttonNew, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buttonOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buttonCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buttonPaste, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buttonCut, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buttonCompile, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buttonTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JPanelMenuLayout.setVerticalGroup(
            JPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelMenuLayout.createSequentialGroup()
                .addGroup(JPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonNew, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPaste, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCut, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCompile, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTeam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPaneEditor.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPaneEditor.setToolTipText("");
        jScrollPaneEditor.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPaneEditor.setMaximumSize(null);
        jScrollPaneEditor.setMinimumSize(new java.awt.Dimension(900, 400));
        jScrollPaneEditor.setOpaque(false);
        jScrollPaneEditor.setPreferredSize(new java.awt.Dimension(900, 400));

        textAreaEditor.setColumns(20);
        textAreaEditor.setRows(5);
        textAreaEditor.setTabSize(4);
        textAreaEditor.setMinimumSize(null);
        textAreaEditor.setPreferredSize(null);
        jScrollPaneEditor.setViewportView(textAreaEditor);

        jScrollPaneMessage.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPaneMessage.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPaneMessage.setMaximumSize(null);
        jScrollPaneMessage.setMinimumSize(new java.awt.Dimension(900, 100));
        jScrollPaneMessage.setPreferredSize(new java.awt.Dimension(900, 100));

        textAreaMessage.setEditable(false);
        textAreaMessage.setColumns(20);
        textAreaMessage.setRows(5);
        jScrollPaneMessage.setViewportView(textAreaMessage);

        jPanelStatus.setMinimumSize(new java.awt.Dimension(900, 30));
        jPanelStatus.setPreferredSize(new java.awt.Dimension(900, 30));

        labelStatus.setMaximumSize(null);
        labelStatus.setMinimumSize(new java.awt.Dimension(900, 30));
        labelStatus.setPreferredSize(new java.awt.Dimension(900, 30));

        javax.swing.GroupLayout jPanelStatusLayout = new javax.swing.GroupLayout(jPanelStatus);
        jPanelStatus.setLayout(jPanelStatusLayout);
        jPanelStatusLayout.setHorizontalGroup(
            jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelStatusLayout.setVerticalGroup(
            jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatusLayout.createSequentialGroup()
                .addComponent(labelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneEditor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPaneMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPaneEditor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPaneMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewActionPerformed
        this.textAreaEditor.setText("");
        this.textAreaMessage.setText("");
        this.labelStatus.setText("");

        isNewFile = true;
        currentFile = null;
    }//GEN-LAST:event_buttonNewActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        String content = textAreaEditor.getText();

        if (isNewFile) {
            JFileChooser fileChooser = new JFileChooser();
            if (JFileChooser.APPROVE_OPTION == fileChooser.showSaveDialog(this)) {
                String fileName = fileChooser.getSelectedFile() + ".txt";
                try {
                    this.writeFile(fileName, content);
                    textAreaMessage.setText("");
                    labelStatus.setText(fileName);
                    isNewFile = false;
                    currentFile = new File(fileName);
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "Erro ao salvar arquivo: " + e.getMessage());
                }
            }
        } else {
            try {
                this.writeFile(currentFile.getAbsolutePath(), content);
                textAreaMessage.setText("");
                currentFile = new File(currentFile.getAbsolutePath());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar arquivo: " + e.getMessage());
            }
        }
    }

    private void writeFile(String nameFile, String content) throws IOException {
        try (
                BufferedReader reader = new BufferedReader(new StringReader(content));
                PrintWriter writer = new PrintWriter(new FileWriter(nameFile));) {
            reader.lines().forEach(line -> writer.println(line));

            JOptionPane.showMessageDialog(this, "Arquivo salvo com sucesso!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar arquivo: " + e.getMessage());
        }
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonCompileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCompileActionPerformed
        
    	textAreaMessage.setText("");
    	String text = textAreaEditor.getText();
    	StringBuilder resultCompile = new StringBuilder();
    	
    	if (!text.isEmpty() && !text.matches("^[\\n|\\t|\\s]*$")) {
			Lexico lexico = new Lexico();
			Sintatico sintatico = new Sintatico();
            Semantico semantico = new Semantico();
			lexico.setInput(text);

			try {
				 sintatico.parse(lexico, semantico);
				
				Token token = null;

//				while ((token = lexico.nextToken()) != null) {
//					resultCompile.append(("Linha " + token.getRow(text) + " - " + token.getClasse(token.getId()) + " "
//							+ token.getLexeme() + "\n"));
//				}
//
//				textAreaMessage.append(resultCompile.toString());
				textAreaMessage.append("Programa compilado com sucesso.");
			} catch (LexicalError erro) {
				textAreaMessage.append(("Erro na linha " + erro.getPosition() + " - " + erro.getMessage()));
			} catch (SyntaticError erro) {
				textAreaMessage.append("Erro na linha " + erro.getPosition() + " - " + erro.getMessage());
			} catch (SemanticError erro) {
				textAreaMessage.append("Erro na linha " + erro.getPosition() + " - " + erro.getMessage());
			}
		}
    	else {
    		textAreaMessage.append("Nenhum programa para compilar.");
    	}

    }//GEN-LAST:event_buttonCompileActionPerformed

    private void buttonOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOpenActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text files", "txt"));

        if (JFileChooser.APPROVE_OPTION == fileChooser.showOpenDialog(this)) {
            File file = fileChooser.getSelectedFile();
            String content;
            String absolutePath = file.getAbsolutePath();
            
            try {
                content = Files.readAllLines(Paths.get(absolutePath)).stream().collect(Collectors.joining("\r\n"));

                textAreaEditor.setText(content);
                this.textAreaMessage.setText("");
                this.labelStatus.setText(absolutePath);

                currentFile = file;
                isNewFile = false;
                
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Erro ao abrir arquivo: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_buttonOpenActionPerformed

    private void buttonCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCopyActionPerformed
        this.textAreaEditor.copy();
    }//GEN-LAST:event_buttonCopyActionPerformed

    private void buttonPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPasteActionPerformed
        this.textAreaEditor.paste();
    }//GEN-LAST:event_buttonPasteActionPerformed

    private void buttonCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCutActionPerformed
        textAreaEditor.cut();
    }//GEN-LAST:event_buttonCutActionPerformed

    private void buttonTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTeamActionPerformed
    	textAreaMessage.setText("");
    	textAreaMessage.append("Componentes da equipe: Bruno G. Vigentas, Gustavo Westarb & Luciane Tedesco.\n");
    }//GEN-LAST:event_buttonTeamActionPerformed

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
            java.util.logging.Logger.getLogger(View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelMenu;
    private javax.swing.JButton buttonCompile;
    private javax.swing.JButton buttonCopy;
    private javax.swing.JButton buttonCut;
    private javax.swing.JButton buttonNew;
    private javax.swing.JButton buttonOpen;
    private javax.swing.JButton buttonPaste;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonTeam;
    private javax.swing.JPanel jPanelStatus;
    private javax.swing.JScrollPane jScrollPaneEditor;
    private javax.swing.JScrollPane jScrollPaneMessage;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JTextArea textAreaEditor;
    private javax.swing.JTextArea textAreaMessage;
    // End of variables declaration//GEN-END:variables
}
