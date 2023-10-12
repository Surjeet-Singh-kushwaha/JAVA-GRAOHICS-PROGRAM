import javax.swing.*;


public class MyFrameExample {
	public static void main(String args[]){
		JFrame jframe = new JFrame();
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel name = new JLabel("NAME");
		jframe.add(name);
		jframe.setVisible(true);
	
	}
}
