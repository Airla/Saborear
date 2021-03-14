package View;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Controller.PessoaControl;
import DTO.PessoaDTO;


public class TelaDeLogin extends TelaPadrao{
	private JTextField campoEmail;
	private JLabel cadastrar;
	private JPasswordField  campoSenha;
	
	public TelaDeLogin() {
		super.setTitle("Tela de Login");
		adicionarJLabel();
		adicionarCamposDeTexto();
		adicionarBotoes();
		adicionarJLFucionais();
		setVisible(true);
		
	}
	
	public void adicionarJLabel() {
		
		 JLabel login = new JLabel("Bem Vindo!");
		 login.setBounds(250, 40, 200, 30);
		 login.setFont(new Font("Arial", Font.BOLD, 14));
		 add(login);
		 
		 JLabel textoEmail = new JLabel("Email");
		 textoEmail.setBounds(20, 120, 40, 20);
	     add(textoEmail);
	     
	     JLabel textoSenha = new JLabel("Senha");
	     textoSenha.setBounds(20, 180, 50, 20);
	     add(textoSenha);	    	     
     
	}
	
	private void adicionarCamposDeTexto() {
		 campoEmail = new JTextField();
	     campoEmail.setBounds(90, 110, 200, 30);
	     add(campoEmail);
	     
	     campoSenha = new JPasswordField();
	     campoSenha.setBounds(90, 170, 200, 30);
	     add(campoSenha);
	}
	
	private void adicionarBotoes() {
		
		 JButton botaoEntrar = new JButton("Entrar");
	     botaoEntrar.setBounds(90, 250, 90, 35);
	     add(botaoEntrar);
	     botaoEntrar.addActionListener(new Ouvinte(this));
	     
		 JButton botaoCancelar = new JButton("Cancelar");
	     botaoCancelar.setBounds(200, 250, 90, 35);
	     add(botaoCancelar);
	     botaoCancelar.addActionListener(new Ouvinte(this));
	     
	}
	
	private void adicionarJLFucionais() {
		
		 cadastrar = new JLabel("Cadastre-se");
		 cadastrar.setBounds(350, 125, 80, 20);
		 cadastrar.setForeground(Color.BLUE);
	     add(cadastrar);
	     cadastrar.addMouseListener(new OuvinteCadastrar(this));	     
		 
	}
	
	public JTextField getCampoEmail() {
		return campoEmail;
	}

	public void setCampoEmail(JTextField campoEmail) {
		this.campoEmail = campoEmail;
	}

	private class OuvinteCadastrar implements MouseListener{

		private TelaDeLogin telaDeLogin;
		   public OuvinteCadastrar(TelaDeLogin telaDeLogin) {
		       this.telaDeLogin = telaDeLogin;
		   }
		   
		public void mouseClicked(MouseEvent e) {
				TelaDeCadastro  telaDeCadastro = new TelaDeCadastro(1);
				telaDeCadastro.setLocationRelativeTo(telaDeLogin);
				telaDeLogin.dispose();						
			
		}
		
		public void mouseEntered(MouseEvent e) {
			cadastrar.setText("<html><u>Cadastre-se</u></html>");
			cadastrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
			
		}
		
		public void mouseExited(MouseEvent e) {
			cadastrar.setText("Cadastre-se");
			cadastrar.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
			
		}

		public void mousePressed(MouseEvent arg0) {
			
			
		}

		public void mouseReleased(MouseEvent arg0) {
			
		}
		
	}
	
	public class Ouvinte implements ActionListener{

		private TelaDeLogin telaDeLogin;

		public Ouvinte(TelaDeLogin telaDeLogin) {
				this.telaDeLogin = telaDeLogin;
			}
			 
		public void actionPerformed(ActionEvent e) {
		String botao = e.getActionCommand();
				   
			if(botao.equals("Entrar")) {																		
					
				if(campoEmail.getText().equals("") || campoSenha.getSelectedText().equals("")) {
					JOptionPane.showMessageDialog(telaDeLogin, "Preencha todos os dados!", "Erro!", JOptionPane.ERROR_MESSAGE);
				}else{
					PessoaControl pessoaControl = new PessoaControl();
					PessoaDTO pdto = new PessoaDTO();
					pdto.setEmail(campoEmail.getText());
					pdto.setSenha(campoSenha.getSelectedText());
					PessoaDTO pessoaDTO =pessoaControl.recuperarPessoa(pdto);
					int tipo =pessoaDTO.getTipo();
					int id = pessoaDTO.getId();
					if(tipo==1) {
						TelaUsuario telaUsuario = new TelaUsuario();
						telaUsuario.setLocationRelativeTo(telaDeLogin);
					}										
				} 				   							
			}else if(botao.equals("Cancelar")) {
				TelaInicio inicio = new TelaInicio();
				inicio.setLocationRelativeTo(telaDeLogin);
				}
			telaDeLogin.dispose();
			}
	}
	
	public static void main(String[] args) {
	new TelaDeLogin();
	}
}
