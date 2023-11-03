package ViewMed;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ViewTabela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel NotaTres;
	private JTable table;
	private JTextField notaUm;
	private JTextField notaDois;
	private JTextField notaTres;
	private JTextField notaQuatro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTabela frame = new ViewTabela();
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
	public ViewTabela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 464);
		NotaTres = new JPanel();
		NotaTres.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(NotaTres);
		NotaTres.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tabela de Medias");
		lblNewLabel.setBounds(10, 24, 88, 18);
		NotaTres.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 52, 458, 211);
		NotaTres.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nota 1", "Nota 2", "Nota 3", "Nota 4", "Medias"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("Nota 1");
		lblNewLabel_1.setBounds(31, 283, 45, 13);
		NotaTres.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nota 2");
		lblNewLabel_2.setBounds(137, 283, 45, 13);
		NotaTres.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nota 3");
		lblNewLabel_3.setBounds(246, 283, 45, 13);
		NotaTres.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nota 4");
		lblNewLabel_4.setBounds(341, 283, 45, 13);
		NotaTres.add(lblNewLabel_4);
		
		notaUm = new JTextField();
		notaUm.setBounds(20, 313, 69, 19);
		NotaTres.add(notaUm);
		notaUm.setColumns(10);
		
		notaDois = new JTextField();
		notaDois.setBounds(137, 313, 70, 19);
		NotaTres.add(notaDois);
		notaDois.setColumns(10);
		
		notaTres = new JTextField();
		notaTres.setBounds(245, 313, 69, 19);
		NotaTres.add(notaTres);
		notaTres.setColumns(10);
		
		notaQuatro = new JTextField();
		notaQuatro.setBounds(351, 313, 69, 19);
		NotaTres.add(notaQuatro);
		notaQuatro.setColumns(10);
		
		JButton btnCadastro = new JButton("Cadastrar");
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Receber a nota que foi digitada
				String nota1 = notaUm.getText().trim();
				String nota2 = notaDois.getText().trim();
				String nota3 = notaTres.getText().trim();
				String nota4 = notaQuatro.getText().trim();
				
				float medias = (Float.parseFloat(nota1) + Float.parseFloat(nota2) + Float.parseFloat(nota3) + Float.parseFloat(nota4) ) /4;
				
				//adicionar as notas e resultados na tela 
				
				DefaultTableModel tabelinha = (DefaultTableModel) table.getModel();
				tabelinha.addRow(new String[] {nota1, nota2, nota3 , nota4, medias + ""} );
				
				// Limpar campos
				
				notaUm.setText("");
				notaDois.setText("");
				notaTres.setText("");
				notaQuatro.setText("");
				
				notaUm.requestFocus();
				
					
			}
		});
		btnCadastro.setBounds(206, 378, 85, 21);
		NotaTres.add(btnCadastro);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((DefaultTableModel) table.getModel()).removeRow(table.getSelectedRow());
				
				
			}
		});
		btnExcluir.setBounds(335, 378, 85, 21);
		NotaTres.add(btnExcluir);
	}
}
