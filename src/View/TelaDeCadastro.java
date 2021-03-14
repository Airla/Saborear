package View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Controller.PessoaControl;
import DTO.PessoaDTO;

public class TelaDeCadastro extends TelaPadrao{
	
	private JTextField nome;
	private JTextField cpf;
	private JTextField email;
	private JPasswordField senha;
	private JButton botaoCadastrar;
	private JButton botaoCancelar;
	private int tipo;

	public TelaDeCadastro(int tipo) {
		ImageIcon imagem = new ImageIcon("cadastro.png");
        JLabel imagemFundo = new JLabel(imagem);
        imagemFundo.setBounds(0,0, 640, 420);
        setContentPane(imagemFundo);
       
		this.tipo=tipo;
		super.setTitle("Cadastrar");
		adicionarJL();
		adicionarCamposDeTexto();
		adicionarBotoes();
		setVisible(true);
	}

	private void adicionarJL() {
		JLabel textoNome = new JLabel("Nome");
		textoNome.setBounds(50, 90, 100, 20);
		textoNome.setFont(new Font("Calibri Light", Font.PLAIN, 18));
		textoNome.setForeground(Color.BLACK);
	    add(textoNome);	
	    
	    JLabel cpf = new JLabel("CPF");
		cpf.setBounds(50, 130, 100, 20);
		cpf.setFont(new Font("Calibri Light", Font.PLAIN, 18));
		cpf.setForeground(Color.BLACK);
	    add(cpf);
	    
	    JLabel email = new JLabel("E-mail");
	    email.setBounds(50, 170, 100, 20);
	    email.setFont(new Font("Calibri Light", Font.PLAIN, 18));
	    email.setForeground(Color.BLACK);
	    add(email);
		
	    JLabel senha = new JLabel("Senha");
	    senha.setBounds(50, 210, 100, 20);
	    senha.setFont(new Font("Calibri Light", Font.PLAIN, 18));
	    senha.setForeground(Color.BLACK);
	    add(senha);	    
	    
	}
	
	private void adicionarCamposDeTexto(){
		
		nome = new JTextField();
		nome.setBounds(110, 90, 200, 30);
	    add(nome);
	    
	    cpf = new JTextField();
	    cpf.setBounds(110, 130, 200, 30);
	    add(cpf);
	    
	    email = new JTextField();
	    email.setBounds(110, 170, 200, 30);
	    add(email);
	    
	    senha = new JPasswordField();
	    senha.setBounds(110, 210, 200, 30);
	    add(senha);
		
	}
	
	private void adicionarBotoes() {
		
		 botaoCadastrar = new JButton("Cadastrar");
		 botaoCadastrar.setBounds(50, 290, 100, 35);
		 botaoCadastrar.setFont(new Font("Arial Narrow", Font.PLAIN, 12));
	     add(botaoCadastrar);
	     botaoCadastrar.addActionListener(new Ouvinte(this));

	     botaoCancelar = new JButton("Cancelar");
	     botaoCancelar.setBounds(210, 290, 100, 35);
	     botaoCancelar.setFont(new Font("Arial Narrow", Font.PLAIN, 12));
	     add(botaoCancelar);
	     botaoCancelar.addActionListener(new Ouvinte(this));		
	}

	public class Ouvinte implements ActionListener{

		private TelaDeCadastro telaDeCadastro;
		public Ouvinte(TelaDeCadastro telaDeCadastro) {
			this.telaDeCadastro = telaDeCadastro;
		}
		
		public void actionPerformed(ActionEvent e) {
			
			String botao = e.getActionCommand();
			
			if(botao.equals("Cancelar")) {
				TelaDeLogin login = new TelaDeLogin();
				login.setLocationRelativeTo(telaDeCadastro);
				telaDeCadastro.dispose();
			}else {
				
				if(tipo==1) {
					PessoaDTO pdto = new PessoaDTO(email.getText(), senha.getSelectedText(), 1);
					PessoaControl pc = new PessoaControl();
					pc.cadastrarPessoa(pdto);
					TelaDeLogin login = new TelaDeLogin();
					login.getCampoEmail().setText(email.getText());
					telaDeCadastro.dispose();
				}else if(tipo==2) {
					
				}
			}						
		}		
	}
	
	public static void main(String[] args) {
		new TelaDeCadastro(1);
	}
}
