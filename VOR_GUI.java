import java.awt.EventQueue;


public class VOR_GUI extends JFrame
{
	public VOR_GUI()
	{
		setTitle("Tutorial");
		setSize(480,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		//btnNewButton.setSize(20,20);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		getContentPane().add(btnNewButton);
		btnNewButton.setBounds(310,195, 30,30);
		
	}
	
	public static void main(String[] args)
	{
		
		
	}
}

