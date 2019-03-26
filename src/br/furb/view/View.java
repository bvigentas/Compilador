package br.furb.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;

public class View extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnSalvar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1096, 643);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setAutoscrolls(true);
		
		JPanel panel_2 = new JPanel();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 1064, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 415, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(60, Short.MAX_VALUE))
		);
		panel_2.setLayout(null);
		
		JTextPane textEditor = new JTextPane();
		textEditor.setBounds(0, 0, 1064, 413);
		panel_2.add(textEditor);
		
		JButton btnNovo = new JButton("novo [ctrl-n]");
		btnNovo.setBounds(7, 7, 128, 99);
		btnNovo.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JButton btnAbrir = new JButton("abrir [ctrl-0]");
		btnAbrir.setBounds(139, 7, 128, 99);
		btnAbrir.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JButton btnEquipe = new JButton("equipe [F1]");
		btnEquipe.setBounds(929, 7, 128, 99);
		btnEquipe.setVerticalAlignment(SwingConstants.BOTTOM);
		
		btnSalvar = new JButton("salvar [ctrl-s]");
		btnSalvar.setBounds(271, 7, 127, 99);
		btnSalvar.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JButton btnCopiar = new JButton("copiar [ctrl-c]");
		btnCopiar.setBounds(402, 7, 128, 99);
		btnCopiar.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JButton btnColar = new JButton("colar [ctrl-v]");
		btnColar.setBounds(534, 7, 128, 99);
		btnColar.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JButton btnRecortar = new JButton("recortar [ctrl-x]");
		btnRecortar.setBounds(666, 7, 128, 99);
		btnRecortar.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JButton btnCompilar = new JButton("compilar [F9]");
		btnCompilar.setBounds(798, 7, 127, 99);
		btnCompilar.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_1.setLayout(null);
		panel_1.add(btnNovo);
		panel_1.add(btnAbrir);
		panel_1.add(btnSalvar);
		panel_1.add(btnCopiar);
		panel_1.add(btnColar);
		panel_1.add(btnRecortar);
		panel_1.add(btnCompilar);
		panel_1.add(btnEquipe);
		panel.setLayout(gl_panel);
	}
}
