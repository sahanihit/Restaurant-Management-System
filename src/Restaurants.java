import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

public class Restaurants {

	private JFrame frame;
	private JTextField jtext_ChBurger;
	private JTextField jtext_ChBurMeal;
	private JTextField jtext_CheeBurg;
	private JTextField jtextCal;
	private JTextField jtext_Qty;
	private JTextField jtextConvert;
	
	//---------------------------------Variable Declarations for Calculator------------------------------------------
	double firstNum;					
	double secondNum;
	double result;
	String operations;
	String answer;
	
	//-----------------------------Variable Declarations for Currency Converter---------------------------------------
	double Nigerian_Naira=302.96;
	double US_Dollar=1.52;
	double Kenyan_Shilling=156.21;
	double Brazilian_Real=5.86;
	double Canadian_Dollar=2.03;
	double Indian_Rupee=100.68;
	double Phillipine_Peso=71.74;
	double Indonesian_Rupiah=20746.75;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurants window = new Restaurants();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Restaurants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368,760);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//======================================================HEADING LABEL==============================================
		JLabel lblNewLabel = new JLabel("Restaurant Management Systems");
		lblNewLabel.setBounds(69, 0, 1204, 99);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 70));
		frame.getContentPane().add(lblNewLabel);
		
		//========================================================================================================
		//Extreme Left Box Contents
		
		JPanel panel = new JPanel();											//The Whole Panel Box
		panel.setBounds(12, 101, 579, 256);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");					//The label naming chicken burger
		lblChickenBurger.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblChickenBurger.setBounds(12, 13, 271, 32);
		panel.add(lblChickenBurger);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");		//The label naming Chicken Burger meal
		lblChickenBurgerMeal.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblChickenBurgerMeal.setBounds(12, 50, 271, 32);
		panel.add(lblChickenBurgerMeal);
		
		JLabel lblCheeseBurger = new JLabel("Cheese Burger");					//The label naming Cheese Burger
		lblCheeseBurger.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblCheeseBurger.setBounds(12, 87, 271, 32);
		panel.add(lblCheeseBurger);
		
		jtext_ChBurger = new JTextField();											//textField next to chicken burger 
		jtext_ChBurger.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtext_ChBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		jtext_ChBurger.setBounds(289, 13, 254, 32);
		panel.add(jtext_ChBurger);
		jtext_ChBurger.setColumns(10);
		
		jtext_ChBurMeal = new JTextField();											//textField next to chicken burger meal
		jtext_ChBurMeal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtext_ChBurMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		jtext_ChBurMeal.setColumns(10);
		jtext_ChBurMeal.setBounds(289, 50, 254, 32);
		panel.add(jtext_ChBurMeal);
		
		jtext_CheeBurg = new JTextField();											//textField next to Cheese Burger 
		jtext_CheeBurg.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtext_CheeBurg.setHorizontalAlignment(SwingConstants.RIGHT);
		jtext_CheeBurg.setColumns(10);
		jtext_CheeBurg.setBounds(289, 87, 254, 32);
		panel.add(jtext_CheeBurg);
		
		JSeparator separator = new JSeparator();									//Line separator
		separator.setBounds(48, 126, 477, 4);
		panel.add(separator);
		
		JLabel lblDrink = new JLabel("Drink");										//label naming drink
		lblDrink.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDrink.setBounds(12, 126, 271, 32);
		panel.add(lblDrink);
		
		JLabel lblQty = new JLabel("QTY");											//label naming Quantity
		lblQty.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblQty.setBounds(289, 126, 254, 22);
		panel.add(lblQty);
		
		JComboBox jcomb_Drink = new JComboBox();									//comboBox containing names of all the Drinks
		jcomb_Drink.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jcomb_Drink.setModel(new DefaultComboBoxModel(new String[] {"Select a Drink", "Apple Juice", "Tea", "Cola", "Coke", "Coffee", "Ice Tea", "Ice Coffee", "Orange"}));
		jcomb_Drink.setBounds(12, 162, 254, 32);
		panel.add(jcomb_Drink);
		
		jtext_Qty = new JTextField();												//textField to enter number of drinks
		jtext_Qty.setHorizontalAlignment(SwingConstants.RIGHT);
		jtext_Qty.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtext_Qty.setBounds(289, 161, 254, 33);
		panel.add(jtext_Qty);
		jtext_Qty.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Home Delivery");				//Check Box for Home Delivery
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxNewCheckBox.setBounds(22, 203, 244, 32);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Tax");						//Check Box for Tax
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxNewCheckBox_1.setBounds(289, 203, 254, 32);
		panel.add(chckbxNewCheckBox_1);
		
		
		
		//=====================================================================================================
		//2nd Extreme left box down Contents
		
		JPanel panel_2 = new JPanel();											//The whole panel box
		panel_2.setBounds(12, 370, 579, 201);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");				//the label naming Cost of Delivery
		lblCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCostOfDelivery.setBounds(12, 137, 273, 51);
		panel_2.add(lblCostOfDelivery);
		
		JLabel lblCostOfMeal = new JLabel("Cost Of Meal");						//the label naming cost of meal
		lblCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCostOfMeal.setBounds(12, 77, 273, 51);
		panel_2.add(lblCostOfMeal);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");					//the label naming Cost of drinks
		lblCostOfDrinks.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCostOfDrinks.setBounds(12, 13, 273, 51);
		panel_2.add(lblCostOfDrinks);
		
		JLabel jlbl_CostofMeal = new JLabel("0");											//the calculation of cost of meal will be shown here
		jlbl_CostofMeal.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		jlbl_CostofMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlbl_CostofMeal.setFont(new Font("Tahoma", Font.PLAIN, 23));
		jlbl_CostofMeal.setBounds(297, 78, 248, 51);
		panel_2.add(jlbl_CostofMeal);
		
		JLabel jlbl_CostofDelivery = new JLabel("");										//the calculation of cost of Delivery will be shown here
		jlbl_CostofDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		jlbl_CostofDelivery.setHorizontalAlignment(SwingConstants.RIGHT);
		jlbl_CostofDelivery.setFont(new Font("Tahoma", Font.PLAIN, 23));
		jlbl_CostofDelivery.setBounds(297, 137, 248, 51);
		panel_2.add(jlbl_CostofDelivery);
		
		JLabel jlbl_CostofDrinks = new JLabel("");											//the calculation of cost of Drinks will be shown here
		jlbl_CostofDrinks.setHorizontalAlignment(SwingConstants.RIGHT);
		jlbl_CostofDrinks.setFont(new Font("Tahoma", Font.PLAIN, 23));
		jlbl_CostofDrinks.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		jlbl_CostofDrinks.setBounds(297, 13, 248, 51);
		panel_2.add(jlbl_CostofDrinks);
		
		//===========================================================================================================
		//Mid Panel containing all currency conversion contents
		
		JPanel panel_5 = new JPanel();													//the whole panel box
		panel_5.setBounds(603, 101, 363, 256);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JComboBox jcombCurrency = new JComboBox();										//Combo Box containing all the countries names
		jcombCurrency.setBounds(31, 25, 293, 41);
		jcombCurrency.setFont(new Font("Tahoma", Font.BOLD, 20));
		jcombCurrency.setModel(new DefaultComboBoxModel(new String[] {"Choose one.", "USA", "Nigeria", "Kenya", "Canada", "Brazil", "Indonesia", "Philippine", "India"}));
		panel_5.add(jcombCurrency);
		
		jtextConvert = new JTextField();												//textField to enter the number which you wan to get converted into 
		jtextConvert.setFont(new Font("Tahoma", Font.PLAIN, 20));						//another Country's currency
		jtextConvert.setHorizontalAlignment(SwingConstants.CENTER);
		jtextConvert.setBounds(53, 79, 258, 39);
		panel_5.add(jtextConvert);
		jtextConvert.setColumns(10);
		
		JLabel jlabel_Convert = new JLabel("");											//the converted amount is displayed here
		jlabel_Convert.setBounds(91, 131, 163, 51);
		jlabel_Convert.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel_Convert.setFont(new Font("Tahoma", Font.PLAIN, 23));
		jlabel_Convert.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_5.add(jlabel_Convert);
		
		
		
		JButton jbtnConvert = new JButton("Convert");									//Code for the conversion
		jbtnConvert.addActionListener(new ActionListener() {							//We just multiply the entered amount with the following country's
			public void actionPerformed(ActionEvent e) {								//exchange rate.
				double British_Pound=Double.parseDouble(jtextConvert.getText());
				if(jcombCurrency.getSelectedItem().equals("Nigeria"))
				{
					String cConvert1=String.format("N %.2f", British_Pound * Nigerian_Naira);
					jlabel_Convert.setText(cConvert1);
				}
				if(jcombCurrency.getSelectedItem().equals("USA"))
				{
					String cConvert1=String.format("$ %.2f", British_Pound * US_Dollar);
					jlabel_Convert.setText(cConvert1);
				}
				if(jcombCurrency.getSelectedItem().equals("Kenya"))
				{
					String cConvert1=String.format("KS %.2f", British_Pound * Kenyan_Shilling);
					jlabel_Convert.setText(cConvert1);
				}
				if(jcombCurrency.getSelectedItem().equals("Brazil"))
				{
					String cConvert1=String.format("BRA %.2f", British_Pound * Brazilian_Real);
					jlabel_Convert.setText(cConvert1);
				}
				if(jcombCurrency.getSelectedItem().equals("Canada"))
				{
					String cConvert1=String.format("C$ %.2f", British_Pound * Canadian_Dollar);
					jlabel_Convert.setText(cConvert1);
				}
				if(jcombCurrency.getSelectedItem().equals("India"))
				{
					String cConvert1=String.format("INR %.2f", British_Pound * Indian_Rupee);
					jlabel_Convert.setText(cConvert1);
				}
				if(jcombCurrency.getSelectedItem().equals("Phillipine"))
				{
					String cConvert1=String.format("PHP %.2f", British_Pound * Phillipine_Peso);
					jlabel_Convert.setText(cConvert1);
				}
				if(jcombCurrency.getSelectedItem().equals("Indonesia"))
				{
					String cConvert1=String.format("IDR %.2f", British_Pound * Indonesian_Rupiah);
					jlabel_Convert.setText(cConvert1);
				}
			}
		});
		jbtnConvert.setBounds(31, 195, 116, 39);
		jbtnConvert.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_5.add(jbtnConvert);
		
		JButton jbtnClose = new JButton("Close");
		jbtnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jlabel_Convert.setText(null);
				jtextConvert.setText(null);
				jcombCurrency.setSelectedItem("Choose one.");
			}
		});
		jbtnClose.setBounds(217, 195, 107, 39);
		jbtnClose.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_5.add(jbtnClose);
		
		//=====================================================================================================================
		//Mid Down Panel containing all total calculation part
		
		JPanel panel_1 = new JPanel();											//the whole panel
		panel_1.setBounds(603, 370, 363, 201);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");										//label naming tax
		lblTax.setBounds(12, 13, 153, 51);
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_1.add(lblTax);
		
		JLabel lblSubtotal = new JLabel("Subtotal\r\n");						//label naming subtotal
		lblSubtotal.setBounds(12, 77, 153, 51);
		lblSubtotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_1.add(lblSubtotal);
		
		JLabel lblTotal = new JLabel("Total");									//the label naming total
		lblTotal.setBounds(12, 137, 153, 51);
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_1.add(lblTotal);
		
		JLabel jlbl_Tax = new JLabel("");										//calculated value of the tax will be displayed here
		jlbl_Tax.setBounds(188, 13, 163, 51);
		jlbl_Tax.setHorizontalAlignment(SwingConstants.RIGHT);
		jlbl_Tax.setFont(new Font("Tahoma", Font.PLAIN, 23));
		jlbl_Tax.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.add(jlbl_Tax);
		
		JLabel jlbl_Subtotal = new JLabel("");									//calculated value of subtotal will be displayed here
		jlbl_Subtotal.setBounds(186, 78, 165, 51);
		jlbl_Subtotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlbl_Subtotal.setFont(new Font("Tahoma", Font.PLAIN, 23));
		jlbl_Subtotal.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.add(jlbl_Subtotal);
		
		JLabel jlbl_Total = new JLabel("");										//calculated value of total value will be displayed here
		jlbl_Total.setBounds(189, 137, 162, 51);
		jlbl_Total.setHorizontalAlignment(SwingConstants.RIGHT);
		jlbl_Total.setFont(new Font("Tahoma", Font.PLAIN, 23));
		jlbl_Total.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.add(jlbl_Total);
		
		//========================================================================================================================================
		//Extreme right panel for calculator and receipt part
		
		JPanel panel_4 = new JPanel();											//the whole panel
		panel_4.setBounds(975, 98, 363, 473);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);				//the tabbed pane for both the calculator and the receipts
		tabbedPane.setBounds(12, 13, 339, 447);
		panel_4.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_6, null);
		panel_6.setLayout(null);
		
		JTextArea jtxtReceipts = new JTextArea();								//the textArea for printing of the receipts
		jtxtReceipts.setBounds(12, 13, 310, 391);
		panel_6.add(jtxtReceipts);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_7, null);
		panel_7.setLayout(null);
		
		//-------------------------------------------------	CALCULATOR-------------------------------------------
		jtextCal = new JTextField();
		jtextCal.setHorizontalAlignment(SwingConstants.RIGHT);
		jtextCal.setFont(new Font("Tahoma", Font.PLAIN, 30));
		jtextCal.setColumns(10);
		jtextCal.setBounds(0, 0, 338, 55);
		panel_7.add(jtextCal);
		
		JButton jbtnbackspace = new JButton("\u2190");
		jbtnbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {								//Working of BackSpace
				String backspace=null;													//This backspace removes one character to the left with the help of
																						//StringBuilder Class. It firsts check the length of the textField
				if(jtextCal.getText().length() > 0) {									//if it is greater than 0 it means it can delete the characters 
					StringBuilder strB=new StringBuilder(jtextCal.getText());			//otherwise why would he do that.
					strB.deleteCharAt(jtextCal.getText().length()-1);					//it deletes the character and then converts it to String and paste it
					backspace=strB.toString();											//to the textField.
					jtextCal.setText(backspace);
				}
			}
		});
		jbtnbackspace.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtnbackspace.setBounds(10, 67, 68, 52);
		panel_7.add(jbtnbackspace);
		
		//**This button is for the "Cancel" option
		JButton jbtnCancel = new JButton("C");											//the working of the cancel button is simple.
		jbtnCancel.addActionListener(new ActionListener() {								//We just the set the textField to null
			public void actionPerformed(ActionEvent e) {
				jtextCal.setText(null);
			}
		});
		jbtnCancel.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtnCancel.setBounds(86, 68, 68, 52);
		panel_7.add(jbtnCancel);
		
		//**This button is for the "%" option
		JButton jbtnmod = new JButton("%");
		jbtnmod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(jtextCal.getText());
				jtextCal.setText("");
				operations="%";
			}
		});
		jbtnmod.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtnmod.setBounds(166, 68, 74, 52);
		panel_7.add(jbtnmod);
		
		//**This button is for the "Addition" button
		JButton jbtnaddition = new JButton("+");
		jbtnaddition.addActionListener(new ActionListener() {							//On clicking this button it gets the content of the textField and
			public void actionPerformed(ActionEvent e) {								//set it to the firstNum and then sets the operations variable with the
				firstNum=Double.parseDouble(jtextCal.getText());						//addition operation.and also sets the textField to just a space
				jtextCal.setText("");
				operations="+";
			}
		});
		jbtnaddition.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtnaddition.setBounds(254, 68, 68, 52);
		panel_7.add(jbtnaddition);
		
		
		//2nd row for the 7, 8, 9, -
		
		//**This button is for the numeric "7"
		JButton jbtn7 = new JButton("7");
		jbtn7.addActionListener(new ActionListener() {									//here we check the contents of textField and add with the
			public void actionPerformed(ActionEvent e) {								//digit which we want to click. In this it gets the content
				String EnterNumber = jtextCal.getText() + jbtn7.getText();				//of the textField, and then adds the character to it.
				jtextCal.setText(EnterNumber);
			}
		});
		jbtn7.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtn7.setBounds(10, 123, 68, 52);
		panel_7.add(jbtn7);
		
		JButton jbtn8 = new JButton("8");
		jbtn8.addActionListener(new ActionListener() {									//Working same as for numeric 7
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtextCal.getText() + jbtn8.getText();			
				jtextCal.setText(EnterNumber);
			}
		});
		jbtn8.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtn8.setBounds(86, 123, 68, 52);
		panel_7.add(jbtn8);
		
		JButton jbtn9 = new JButton("9");												//Working same as for numeric 7
		jbtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtextCal.getText() + jbtn9.getText();			
				jtextCal.setText(EnterNumber);
			}
		});
		jbtn9.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtn9.setBounds(166, 123, 74, 52);
		panel_7.add(jbtn9);
		
		JButton jbtnsubtraction = new JButton("-");
		jbtnsubtraction.addActionListener(new ActionListener() {						//On clicking this button it gets the content of the textField and
			public void actionPerformed(ActionEvent e) {								//set it to the firstNum and then sets the operations variable with the
				firstNum=Double.parseDouble(jtextCal.getText());						//subtraction operation.and also sets the textField to just a space
				jtextCal.setText("");
				operations="-";
			}
		});
		jbtnsubtraction.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtnsubtraction.setBounds(254, 123, 68, 52);
		panel_7.add(jbtnsubtraction);
		
		JButton jbtn4 = new JButton("4");													//Working same as for numeric 7
		jbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtextCal.getText() + jbtn4.getText();			
				jtextCal.setText(EnterNumber);
			}
		});
		jbtn4.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtn4.setBounds(10, 180, 68, 52);
		panel_7.add(jbtn4);
		
		JButton jbtn5 = new JButton("5");													//Working same as for numeric 7
		jbtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtextCal.getText() + jbtn5.getText();			
				jtextCal.setText(EnterNumber);
			}
		});
		jbtn5.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtn5.setBounds(86, 180, 68, 52);
		panel_7.add(jbtn5);
		
		JButton jbtn6 = new JButton("6");													//Working same as for numeric 7
		jbtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtextCal.getText() + jbtn6.getText();			
				jtextCal.setText(EnterNumber);
			}
		});
		jbtn6.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtn6.setBounds(166, 180, 74, 52);
		panel_7.add(jbtn6);
		
		JButton jbtnmultiply = new JButton("*");											//On clicking this button it gets the content of the textField and
		jbtnmultiply.addActionListener(new ActionListener() {								//set it to the firstNum and then sets the operations variable with the
			public void actionPerformed(ActionEvent e) {									//multiplication operation.and also sets the textField to just a space
				firstNum=Double.parseDouble(jtextCal.getText());
				jtextCal.setText("");
				operations="*";
			}
		});
		jbtnmultiply.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtnmultiply.setBounds(254, 180, 68, 52);
		panel_7.add(jbtnmultiply);
		
		JButton jbtn1 = new JButton("1");													//Working same as for numeric 7
		jbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtextCal.getText() + jbtn1.getText();			
				jtextCal.setText(EnterNumber);
			}
		});
		jbtn1.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtn1.setBounds(10, 237, 68, 52);
		panel_7.add(jbtn1);
		
		JButton jbtn2 = new JButton("2");													//Working same as for numeric 7
		jbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtextCal.getText() + jbtn2.getText();			
				jtextCal.setText(EnterNumber);
			}
		});
		jbtn2.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtn2.setBounds(86, 237, 68, 52);
		panel_7.add(jbtn2);
		
		JButton jbtn3 = new JButton("3");													//Working same as for numeric 7
		jbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jtextCal.getText() + jbtn3.getText();			
				jtextCal.setText(EnterNumber);
			}
		});
		jbtn3.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtn3.setBounds(166, 237, 74, 52);
		panel_7.add(jbtn3);
		
		JButton jbtndivide = new JButton("/");												//On clicking this button it gets the content of the textField and
		jbtndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(jtextCal.getText());
				jtextCal.setText("");
				operations="/";
			}
		});
		jbtndivide.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtndivide.setBounds(254, 237, 68, 52);
		panel_7.add(jbtndivide);
		
		JButton jbtn0 = new JButton("0");													//Working same as for numeric 7
		jbtn0.addActionListener(new ActionListener() {										//set it to the firstNum and then sets the operations variable with the
			public void actionPerformed(ActionEvent e) {									//division operation.and also sets the textField to just a space
				String EnterNumber = jtextCal.getText() + jbtn0.getText();			
				jtextCal.setText(EnterNumber);
			}
		});
		jbtn0.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtn0.setBounds(10, 293, 68, 52);
		panel_7.add(jbtn0);
		
		JButton jbtndot = new JButton(".");
		jbtndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jbtndot.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtndot.setBounds(86, 293, 68, 52);
		panel_7.add(jbtndot);
		
		JButton jbtnpm = new JButton("+-");
		jbtnpm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(jtextCal.getText()));
				ops=ops*(-1);
				jtextCal.setText(String.valueOf(ops));
			}
		});
		jbtnpm.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtnpm.setBounds(166, 293, 74, 52);
		panel_7.add(jbtnpm);
		
		JButton jbtnequal = new JButton("=");
		jbtnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {									//when the equals button is pressed then the operations variable is checked
				String answer;																//for the respective operation. And then the result is calculated and printed 
				secondNum=Double.parseDouble(jtextCal.getText());							//in the textField with 2 places of decimal.
				if(operations=="+")
				{
					result=firstNum+secondNum;
					answer=String.format("%.2f", result);
					jtextCal.setText(answer);
				}
				else if(operations=="-")
				{
					result=firstNum-secondNum;
					answer=String.format("%.2f",result);
					jtextCal.setText(answer);
				}
				else if(operations=="*")
				{
					result=firstNum*secondNum;
					answer=String.format("%.2f",result);
					jtextCal.setText(answer);
				}
				else if(operations=="/")
				{
					result=firstNum/secondNum;
					answer=String.format("%.2f", result);
					jtextCal.setText(answer);
				}
				else if(operations=="%")
				{
					result=firstNum%secondNum;
					answer=String.format("%.2f", result);
					jtextCal.setText(answer);
				}
			}
		});
		jbtnequal.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtnequal.setBounds(252, 293, 74, 52);
		panel_7.add(jbtnequal);
		
		//==================================================================================================================================
		//Bottom most panel which contains all the total, reset, receipt and exit buttons
		
		JPanel panel_3 = new JPanel();													//the whole panel
		panel_3.setBounds(12, 584, 1326, 116);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		
		JButton jbtn_Total = new JButton("Total");									//Codes for Total button
		jbtn_Total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ChicBurger=Double.parseDouble(jtext_ChBurger.getText());
				double ichicBurger=2.39;
				double Burger;
				Burger=(ChicBurger * ichicBurger);
				String pmeal=String.format("%.2f", Burger);
				jlbl_CostofMeal.setText(pmeal);
				
				double ChicBurgerMeal=Double.parseDouble(jtext_ChBurMeal.getText());
				double ichicBurgerMeal=4.39;
				double BurgerMeal;
				BurgerMeal=(ChicBurgerMeal * ichicBurgerMeal);
				String cbmeal=String.format("%.2f", BurgerMeal+Burger);
				jlbl_CostofMeal.setText(cbmeal);
				
				double CheeseBurger=Double.parseDouble(jtext_CheeBurg.getText());
				double icheeseBurger=3.39;
				double CheeBurger;
				CheeBurger=(CheeseBurger * icheeseBurger);
				String cheese=String.format("%.2f", CheeBurger+BurgerMeal+Burger);
				jlbl_CostofMeal.setText(cheese);
				
				//-----------------------------------Home Delivery-------------------------------------------------
				double iDelivery=3.39;
				if(chckbxNewCheckBox.isSelected())
				{
					String pDelivery=String.format("%.2f", iDelivery);
					jlbl_CostofDelivery.setText(pDelivery);
				}
				else
				{
					jlbl_CostofDelivery.setText("0");
				}
				
				//--------------------------------------Drinks-------------------------------------------------
				double Drinks=Double.parseDouble(jtext_Qty.getText());
				double Tea=1.20 * Drinks;
				double Ice_Tea=0.90 * Drinks;
				double Coffee=2.50 * Drinks;
				double Ice_Coffee=1.10 * Drinks;
				double Cola=2.10 * Drinks;
				double Coke=1.60 * Drinks;
				double Orange=1.70 * Drinks;
				double Apple_Juice=1.99 * Drinks;
				
				if(jcomb_Drink.getSelectedItem().equals("Apple Juice"))
				{
					String cApple_Juice=String.format("%.2f",Apple_Juice);
					jlbl_CostofDrinks.setText(cApple_Juice);
				}
				if(jcomb_Drink.getSelectedItem().equals("Tea"))
				{
					String cTea=String.format("%.2f",Tea);
					jlbl_CostofDrinks.setText(cTea);
				}
				if(jcomb_Drink.getSelectedItem().equals("Cola"))
				{
					String cCola=String.format("%.2f",Cola);
					jlbl_CostofDrinks.setText(cCola);
				}
				if(jcomb_Drink.getSelectedItem().equals("Coke"))
				{
					String cCoke=String.format("%.2f",Coke);
					jlbl_CostofDrinks.setText(cCoke);
				}
				if(jcomb_Drink.getSelectedItem().equals("Coffee"))
				{
					String cCoffee=String.format("%.2f",Coffee);
					jlbl_CostofDrinks.setText(cCoffee);
				}
				if(jcomb_Drink.getSelectedItem().equals("Ice Tea"))
				{
					String cIce_Tea=String.format("%.2f",Ice_Tea);
					jlbl_CostofDrinks.setText(cIce_Tea);
				}
				if(jcomb_Drink.getSelectedItem().equals("Ice Coffee"))
				{
					String cIce_Coffee=String.format("%.2f",Ice_Coffee);
					jlbl_CostofDrinks.setText(cIce_Coffee);
				}
				if(jcomb_Drink.getSelectedItem().equals("Orange"))
				{
					String cOrange=String.format("%.2f",Orange);
					jlbl_CostofDrinks.setText(cOrange);
				}
				if(jcomb_Drink.getSelectedItem().equals("Select a Drink"))
				{
					jlbl_CostofDrinks.setText("0");
				}
				
				//---------------------------------------TAX RATE----------------------------------------
				
				double cTotal1=Double.parseDouble(jlbl_CostofDrinks.getText());
				double cTotal2=Double.parseDouble(jlbl_CostofMeal.getText());
				double cTotal3=Double.parseDouble(jlbl_CostofDelivery.getText());
				double Alltotal=(cTotal1+cTotal2+cTotal3)/100;
					if(chckbxNewCheckBox_1.isSelected())
					{
						String itotal=String.format("%.2f",Alltotal);
						jlbl_Tax.setText(itotal);
					}
				//------------------------------------------------TOTAL-----------------------------------------------
					
					double cTotal4=Double.parseDouble(jlbl_Tax.getText());
					
					double subTotal=(cTotal1+cTotal2+cTotal3);
					String iSubTotal=String.format("£ %.2f", subTotal);
					jlbl_Subtotal.setText(iSubTotal);
					
					double allTotal=(cTotal1+cTotal2+cTotal3+cTotal4);
					String iTotal=String.format("£ %.2f",allTotal);
					jlbl_Total.setText(iTotal);
					
					String iTaxTotal=String.format("£ %.2f", cTotal4);
					jlbl_Tax.setText(iTaxTotal);
			}
		});
		jbtn_Total.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtn_Total.setBounds(162, 27, 133, 56);
		panel_3.add(jbtn_Total);
		
		
		JButton jbtn_Receipt = new JButton("Receipt");							//Codes for Receipt button
		jbtn_Receipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double Qty1=Double.parseDouble(jtext_ChBurger.getText());
				double Qty2=Double.parseDouble(jtext_ChBurMeal.getText());
				double Qty3=Double.parseDouble(jtext_CheeBurg.getText());
				
				jtxtReceipts.append("\t \n Restaurant Management Systems: \n \n" + "Chicken Burger: \t \t" + Qty1 +
						"\n Chicken Burger Meal \t \t" + Qty2 + "\n Bacon and Cheese Burger: \t \t" + Qty3 + "\n \n Thanks for using Job Estimator");
			}
		});
		jbtn_Receipt.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtn_Receipt.setBounds(435, 27, 147, 56);
		panel_3.add(jbtn_Receipt);
		
		
		JButton jbtn_Reset = new JButton("Reset");								//Codes for RESET button
		jbtn_Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jlbl_CostofDelivery.setText(null);
				jlbl_Tax.setText(null);
				jlbl_Subtotal.setText(null);
				jlbl_Total.setText(null);
				jlbl_CostofMeal.setText("0");
				jlbl_CostofDrinks.setText(null);
				jtext_ChBurger.setText(null);
				jtext_ChBurMeal.setText(null);
				jtext_CheeBurg.setText(null);
				jtextConvert.setText(null);
				jtext_Qty.setText(null);
				jcomb_Drink.setSelectedItem("Select a Drink");
				jlabel_Convert.setText(null);
				jcombCurrency.setSelectedItem("Choose one.");
				
				
			}
		});
		jbtn_Reset.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtn_Reset.setBounds(716, 27, 147, 56);
		panel_3.add(jbtn_Reset);
		
		
		JButton jbtn_Exit = new JButton("Exit");								//Codes for Exit button
		jbtn_Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		jbtn_Exit.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtn_Exit.setBounds(1002, 27, 133, 56);
		panel_3.add(jbtn_Exit);
		
	}
}
