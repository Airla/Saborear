package View;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaPadrao extends JFrame{
	
	public TelaPadrao() {
	        setSize(640, 420);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setResizable(false);
	        setLocationRelativeTo(null);
	        setLayout(null);
	        
	        // SETA LOOK AND FEEL
	        try {
	            // AQUI VOCÊ SETA O NOME DA CLASSE REFERENTE A CADA TEMA !
			String tema =  "com.jtattoo.plaf.mint.MintLookAndFeel";
			
	            // AQUI VC SETA O LOOK AND FEEL
	            UIManager.setLookAndFeel(tema);
	        } catch (InstantiationException | IllegalAccessException  |
	                     UnsupportedLookAndFeelException | ClassNotFoundException e) {
	            System.out.println("Erro LAF : " + e.getMessage());
	        }
	        
	        getContentPane().setBackground(Color.WHITE);		   
	    }
}