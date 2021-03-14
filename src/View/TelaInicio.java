package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class TelaInicio extends TelaPadrao{
	
	public TelaInicio() {
		ImageIcon imagem = new ImageIcon("saborear.png");
        JLabel imagemFundo = new JLabel(imagem);
        imagemFundo.setBounds(0,0, 640, 420);
        setContentPane(imagemFundo);
        JButton botao = new JButton("Entrar ou Cadastrar");
        botao.setBounds(210, 20, 170, 35);
        add(botao);
        botao.addActionListener(new Ouvinte(this));
		setVisible(true);
	}
	
	public class Ouvinte implements ActionListener{

		private TelaInicio janela;
		public Ouvinte(TelaInicio telaInicio) {
			this.janela = telaInicio;
		}
		public void actionPerformed(ActionEvent e) {
			TelaDeLogin login = new TelaDeLogin();
			login.setLocationRelativeTo(janela);
			janela.dispose();
		}
		
	}

	public static void main(String[] args) {
		new TelaInicio();
	}
}
