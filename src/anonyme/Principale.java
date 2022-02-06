package anonyme;

import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;




public class Principale  extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Principale() {
		
	   
	    //setLayout( new LayoutManager());
	     JTextField text = new JTextField("Hello");
		 JButton btn = new JButton("Envoyer");
		  add(btn);
		 
		 //la classe anonyme
//		 btn.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("clic moi là");
//				
//			}		 
//		 });
		 
		 // expression lambda en remplacement de la fn anonyme
		  
		    btn.addActionListener(ae -> text.setText("Bonjour") );	 
		    btn.addActionListener(e -> System.out.println("clic moi ça marche") );
		
		     pack();
	}
	
	
	public static void main(String[] args) {
	
        Principale fn = new Principale();
        fn.setTitle("test de Bouton");
        fn.setSize(600,400);
        fn.setVisible(true);
     
	}

}