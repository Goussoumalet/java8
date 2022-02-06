package sam;


import javax.swing.*;

public class Launcher  extends JFrame{

	
	public Launcher() {
		
		JButton btn = new JButton("Clic");
		add(btn);
		
		//expression lambda
		btn.addActionListener( e -> System.out.println("Bonjour SAM"));
		
		
		pack();
	}
	
	public static void appelInterfaceSAM( InterfaceSam i ) {
		i.execute();
	}
	
	public static void main(String[] args) {
		appelInterfaceSAM( () -> System.out.println("exécution"));

	}

}