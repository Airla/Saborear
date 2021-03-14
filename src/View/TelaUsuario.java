package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Controller.PessoaControl;

public class TelaUsuario extends TelaPadrao{
	private DefaultTableModel modelo;
	private JTable tabela;
	private JTextField total;
	private int id;
//	private IngredienteDTO idto = new IngredienteDTO();
	private PessoaControl gerenteControl = new PessoaControl();
	
	public TelaUsuario() {		
		setTitle("Realizar Pedido");	  
		adicionarJL();
		adicionarCamposDeTexto();
		adicionarBotoes();
		adicionarTabela(this);
		setVisible(true);
	}

	private void adicionarJL() {	    	    
	    JLabel total = new JLabel("Total:");
	    total.setBounds(400, 250, 150, 20);
	    add(total);    
	}
	
	private void adicionarCamposDeTexto(){    
	    total = new JTextField();
	    total.setBounds(450, 250, 100, 30);
	    total.setEditable(false);
	    add(total);	 	   	    	    	    
	}
	
		private void adicionarBotoes() {
			
		 JButton criar = new JButton("Criar Pedido");
		 criar.setBounds(450, 300, 100, 30);
		 add(criar);
		 criar.addActionListener(new OuvinteCriar(this));
					 
	     JButton adicionar = new JButton("Adicionar");
	     adicionar.setBounds(10, 320, 100, 30);
	     add(adicionar);
	     adicionar.addActionListener(new OuvinteIngrediente());	
	     
	}
		public class OuvinteCriar implements ActionListener{

			private TelaUsuario novaPizza;
			
			public OuvinteCriar(TelaUsuario novaPizza) {
				this.novaPizza = novaPizza;
			}
			
			public void actionPerformed(ActionEvent e) {
				
//				PizzaDTO pdto = new PizzaDTO(tipo, tamanho, preparo,
//				quantFatias, custoFatia, Integer.toString(cod));
//				
//				for(int i=0; i<tabela.getModel().getRowCount(); i++) {
//					String[] ingrediente = new String[2];
//					ingrediente[0]=String.valueOf(tabela.getValueAt(i, 0));
//					ingrediente[1]=String.valueOf(tabela.getValueAt(i, 1));
//					idto.getIngredientes().add(ingrediente);
				}
				/*
				 * aqui eu chamo o metodo q faz decorator, ele ta no controler, ele retorna um dto(no metodo eu explico) 
				 * 
				 */
//				IngredienteDTO ingreDTO = gerenteControl.decorator(idto);
				//crio a pizza que tem a pizzadto e i ingredientedto(resultado do decorator)
//				gerenteControl.criarPizza(pdto, ingreDTO);
//				JOptionPane.showMessageDialog(novaPizza, "Novo sabor de pizza adicionado", null, JOptionPane.INFORMATION_MESSAGE);
//				TelaDeTotalAcesso telaDeTotalAcesso = new TelaDeTotalAcesso(id, cod);
//				telaDeTotalAcesso.setLocationRelativeTo(novaPizza);
//				novaPizza.dispose();
			}							
		
		private void adicionarTabela(JFrame frame) {
			
			modelo = new DefaultTableModel() {
				public boolean isCellEditable(int row, int column) {
				       //all cells false
				       return false;
				    }
			};
			modelo.addColumn("Nome");
			modelo.addColumn("Preço");
			
			tabela = new JTable(modelo);
		
			JScrollPane scroll = new JScrollPane(tabela);
			scroll.setBounds(10, 100, 320, 200);
			frame.add(scroll);
		}
		
		public class OuvinteIngrediente implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				String botao = e.getActionCommand();
				
				if(botao.equals("Adicionar")) {
					
//					idto.setNome(nomeIngredientes.getSelectedItem().toString());
//					IngredienteDTO i= gerenteControl.recuperarIngrediente(idto);
					modelo = (DefaultTableModel) tabela.getModel();	
//					float valor= i.getValor();
//					modelo.addRow(new String[] {i.getNome(), Float.toString(valor)});
//					float valorPizza= gerenteControl.adicionandoIngredientes(i);
//					custoP.setText(Float.toString(valorPizza));	
					
					
//					String clique = (String) tamanho.getSelectedItem();					
//					if(clique.equals("P (3)")) {
//						custoF.setText(Float.toString(valorPizza/3));
//					}else if(clique.equals("M (4)")) {
//						custoF.setText(Float.toString(valorPizza/4));
//					}else if(clique.equals("G (5)")) {
//						custoF.setText(Float.toString(valorPizza/5));
//					}
					
				}else if(botao.equals("Excluir")) {
					int linhaSelecionada =tabela.getSelectedRow();
					
					if(tabela.getSelectedRow()!=-1) {
						Object obj = tabela.getValueAt(tabela.getSelectedRow(), 0);
						Object obj2 = tabela.getValueAt(tabela.getSelectedRow(), 1);
						
//						IngredienteDTO i= new IngredienteDTO();
//						i.setNome(String.valueOf(obj));
//						i.setValor(Float.parseFloat(String.valueOf(obj2))); 
//
//						IngredienteDTO ing = gerenteControl.removendoIngrediente(i);

//						custoP.setText(Float.toString(ing.getValor()));	
						
						modelo.removeRow(linhaSelecionada);
					}
				}
			}
			
		}
		
		public static void main(String[] args) {
			new TelaUsuario();
		}
}
