import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class IHM extends JFrame implements ActionListener{

	private JButton [] tabButton;
	private JPanel panelNumbers;

	private JPanel panelSigne;
	private JButton buttonMinus;
	private JButton buttonPlus;
	private JButton buttonEqual;
	private JPanel panelReset;

	private JPanel panelEgal;

	private JPanel panelZ;
	private JButton buttonZ;
	private JTextField txtResult;

	private JButton buttonReset;

	public IHM()
	{
		this.setLayout(new GridLayout(6, 1, 0, 0));

		this.tabButton = new JButton[10];
		this.buttonZ = new JButton("0");

		this.panelNumbers = new JPanel(new GridLayout(3, 3, 0, 0));
		this.panelSigne = new JPanel(new GridLayout(1,3, 0, 0));
		this.panelEgal = new JPanel(new GridLayout(1, 1));
		this.panelZ = new JPanel(new GridLayout(1, 1));
		this.panelReset = new JPanel(new GridLayout(1, 1));
		this.txtResult = new JTextField();
		this.txtResult.setFont(new Font("Serif", Font.BOLD, 30));
		this.txtResult.setForeground(Color.BLACK);
		this.txtResult.setEditable(false);

		for(int cpt = 1; cpt < 10; cpt++)
		{
			this.tabButton[cpt] = new JButton("" + cpt);
			this.panelNumbers.add(this.tabButton[cpt]);
			this.tabButton[cpt].addActionListener(this);
		}
		
		this.buttonReset = new JButton("C");

		this.buttonMinus = new JButton("-");
		this.buttonPlus = new JButton("+");
		this.buttonEqual = new JButton("=");

		this.buttonMinus.addActionListener(this);	
		this.buttonPlus.addActionListener(this);
		this.buttonEqual.addActionListener(this); //button egal
		this.buttonReset.addActionListener(this); //button C
		this.buttonZ.addActionListener(this); //button 0

		this.panelSigne.add(this.buttonMinus);
		this.panelSigne.add(this.buttonPlus);
		this.panelEgal.add(this.buttonEqual);

		this.panelReset.add(this.buttonReset);

		this.panelZ.add(this.buttonZ);

		this.panelNumbers.add(this.panelZ);



		this.add(this.txtResult);
		this.add(this.panelNumbers);
		this.add(this.panelZ);
		this.add(this.panelSigne);
		this.add(this.panelEgal);
		this.add(this.panelReset);

		this.pack();
		this.setVisible(true);

	}

	public void majResult(String number)
	{
		this.txtResult.setText(this.txtResult.getText() + number);
	}

	public void actionPerformed(ActionEvent e)
	{

			if(e.getSource() == this.tabButton[1]  )
			{
				majResult(this.tabButton[1].getText());
				System.out.println("Bouton nombre appuyé");
			}

			if(e.getSource() == this.tabButton[2]  )
			{
				majResult(this.tabButton[2].getText());
				System.out.println("Bouton nombre appuyé");
			}

			if(e.getSource() == this.tabButton[3]  )
			{
				majResult(this.tabButton[3].getText());
				System.out.println("Bouton nombre appuyé");
			}

			if(e.getSource() == this.tabButton[4]  )
			{
				majResult(this.tabButton[4].getText());
				System.out.println("Bouton nombre appuyé");
			}

			if(e.getSource() == this.tabButton[5]  )
			{
				majResult(this.tabButton[5].getText());
				System.out.println("Bouton nombre appuyé");
			}

			if(e.getSource() == this.tabButton[6]  )
			{
				majResult(this.tabButton[6].getText());
				System.out.println("Bouton nombre appuyé");
			}

			if(e.getSource() == this.tabButton[7]  )
			{
				majResult(this.tabButton[7].getText());
				System.out.println("Bouton nombre appuyé");
			}

			if(e.getSource() == this.tabButton[8]  )
			{
				majResult(this.tabButton[8].getText());
				System.out.println("Bouton nombre appuyé");
			}

			if(e.getSource() == this.tabButton[9]  )
			{
				majResult(this.tabButton[9].getText());
				System.out.println("Bouton nombre appuyé");
			}

			if(e.getSource() == this.tabButton[9]  )
			{
				majResult(this.tabButton[9].getText());
				System.out.println("Bouton nombre appuyé");
			}

			if(e.getSource() == this.buttonZ)
			{
				majResult("0");
				System.out.println("Bouton nombre appuyé");
			}

			if(e.getSource() == this.buttonPlus)
			{
				majResult("+");
				System.out.println("Bouton + appuyé");
			}

			if(e.getSource() == this.buttonMinus)
			{
				majResult("-");
				System.out.println("Bouton - appuyé");
			}

			if(e.getSource() == this.buttonReset)
			{
				this.txtResult.setText("");
			}

			if(e.getSource() == this.buttonEqual)
			{
				int res;
				String txt = this.txtResult.getText();
				String tabVal[] = new String[3];
				tabVal = txt.split("[+- ]");
				String tabSigne[] = new String[3];
				tabSigne = txt.split("[0123456789]");

				System.out.println(tabVal[0]);
				System.out.println(tabVal[1]);

				res = Integer.parseInt(tabVal[0]) + Integer.parseInt(tabVal[1]) + Integer.parseInt(tabVal[2]);
				
				majResult(res + "");
			}
			






	}




}