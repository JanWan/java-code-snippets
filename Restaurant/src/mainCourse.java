import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.event.*;
	
public class mainCourse extends JPanel
{
	//Instantiate variables
			private JLabel mCourse, Bev, sides, OTFood, Size;
			private JPanel subPanel1, subPanel2, subPanel3, subPanel4;
			private JPanel mainPanel, ProteinPanel, StarchPanel, GravyPanel, foodPanel, Toppings;
			private JLabel NumOfMeal, TPrice;
			
			private JButton orderThisFood;
			
			private JCheckBox ArtHearts, RGarlic, RRPeppers, ROnion, SDTomatoes, FTomatoes, Olives, Mushrooms, Eggplant, Arugula;
			private JCheckBox Cellery, Pepper,Tangy, SSauce, SmokedFlavor;
			
			private JRadioButton Personal, Small, Medium, Large;
			private JRadioButton BBQChicken, BChicken, SSTofu,JerkedTofu, SteamedFish;
			private JRadioButton RPeas, Festival, GRice, YamDump, FFries;
			
			private int NoM = 0;
			private int price = 0;
			private JLabel NMeal;
			
		
	//********************** Constructor *****************************
		public mainCourse()
		{
			
			
		//******************** Button & Button Listener ***********************
			orderThisFood = new JButton("Order This Food");
		subPanel1 = new JPanel();
		subPanel1.setPreferredSize(new Dimension(500, 30));
		subPanel1.setLayout(new GridLayout(1, 1));
				
			buttonListener order = new buttonListener();
			orderThisFood.addActionListener(order);
			subPanel1.add(orderThisFood);
			
		//***************************** Size ***********************************
		//Radio Button
			
		subPanel3 = new JPanel();
			subPanel3.setBorder (BorderFactory.createTitledBorder (""));
			Size = new JLabel("Size:");
			subPanel3.add(Size);
			Personal = new JRadioButton("Personal");
			Small = new JRadioButton("Small");
			Medium = new JRadioButton("Medium");
			Large = new JRadioButton("Large");
			
			ButtonGroup group = new ButtonGroup();
			group.add(Personal);
			group.add(Small);
			group.add(Medium);
			group.add(Large);
			
			radioButtonListener handler = new radioButtonListener();
			Personal.addActionListener(handler);
			Small.addActionListener(handler);
			Medium.addActionListener(handler);
			Large.addActionListener(handler);
			
			subPanel3.add(Personal);
			subPanel3.add(Small);
			subPanel3.add(Medium);
			subPanel3.add(Large);
			
		//************************** Protein
		ProteinPanel = new JPanel();
		ProteinPanel.setPreferredSize(new Dimension(250, 100));
		ProteinPanel.setBorder (BorderFactory.createTitledBorder ("Protein"));
		ProteinPanel.setLayout(new GridLayout(5, 5));
			BBQChicken = new JRadioButton("Barbeque Chicken");
			BChicken = new JRadioButton("Baked Chicken");
			SSTofu = new JRadioButton("Sweet & Sour Tofu");
			JerkedTofu = new JRadioButton("Jerked Tofu");
			SteamedFish = new JRadioButton("Steamed Fish");
			
			ButtonGroup proGroup = new ButtonGroup();
			proGroup.add(BBQChicken);
			proGroup.add(BChicken);
			proGroup.add(SSTofu);
			proGroup.add(JerkedTofu);
			proGroup.add(SteamedFish);
			
			radioButtonListener manage = new radioButtonListener();
			BBQChicken.addActionListener(manage);
			BChicken.addActionListener(manage);
			SSTofu.addActionListener(manage);
			JerkedTofu.addActionListener(manage);
			SteamedFish.addActionListener(manage);
			
			ProteinPanel.add(BBQChicken);
			ProteinPanel.add(BChicken);
			ProteinPanel.add(SSTofu);
			ProteinPanel.add(JerkedTofu);
			ProteinPanel.add(SteamedFish);
			
			
		//********************** Starch
		StarchPanel = new JPanel();
		StarchPanel.setPreferredSize(new Dimension(100, 100));
		StarchPanel.setBorder (BorderFactory.createTitledBorder ("Starch"));
		StarchPanel.setLayout(new BoxLayout(StarchPanel, BoxLayout.Y_AXIS));
			RPeas = new JRadioButton("Rice & Peas");
			Festival = new JRadioButton("Festival");
			GRice = new JRadioButton("Garden Rice");
			YamDump = new JRadioButton("Yam & Dumpling");
			FFries = new JRadioButton("French Fries");
			
			ButtonGroup starchGroup = new ButtonGroup();
			starchGroup.add(RPeas);
			starchGroup.add(Festival);
			starchGroup.add(GRice);
			starchGroup.add(YamDump);
			starchGroup.add(FFries);
			
			radioButtonListener control = new radioButtonListener();
			RPeas.addActionListener(control);
			Festival.addActionListener(control);
			GRice.addActionListener(control);
			YamDump.addActionListener(control);
			FFries.addActionListener(control);
			
			StarchPanel.add(RPeas);
			StarchPanel.add(Festival);
			StarchPanel.add(GRice);
			StarchPanel.add(YamDump);
			StarchPanel.add(FFries);
			
		//******************** Gravy
		GravyPanel = new JPanel();
		GravyPanel.setPreferredSize(new Dimension(150, 100));
		GravyPanel.setBorder (BorderFactory.createTitledBorder ("Gravy"));
		GravyPanel.setLayout(new BoxLayout(GravyPanel, BoxLayout.Y_AXIS));
			Cellery = new JCheckBox("Cellery");
			Pepper = new JCheckBox("Pepper");
			Tangy = new JCheckBox("Tangy");
			SSauce = new JCheckBox("Sweet Sauce");
			SmokedFlavor = new JCheckBox("Smoked Flavor");
			
			foodListener select = new foodListener();
			Cellery.addItemListener(select);
			Pepper.addItemListener(select);
			Tangy.addItemListener(select);
			SSauce.addItemListener(select);
			SmokedFlavor.addItemListener(select);
			
			GravyPanel.add(Cellery);
			GravyPanel.add(Pepper);
			GravyPanel.add(Tangy);
			GravyPanel.add(SSauce);
			GravyPanel.add(SmokedFlavor);
			
		//**************************
		foodPanel = new JPanel();
		foodPanel.setPreferredSize(new Dimension(450, 150));
		foodPanel.setLayout(new GridLayout(1, 3));
			foodPanel.add(ProteinPanel);
			foodPanel.add(StarchPanel);
			foodPanel.add(GravyPanel);
			
		
		//******************** Toppings Border Panel *******************************
			
			ArtHearts = new JCheckBox("Artichoke Hearts");
			RGarlic = new JCheckBox("Roasted Garlic");
			RRPeppers = new JCheckBox("Roasted Red Peppers");
			ROnion = new JCheckBox("Red Onion");
			SDTomatoes = new JCheckBox("Sun-dried Tomatoes");
			FTomatoes = new JCheckBox("Fresh Tomatoes");
			Olives = new JCheckBox("Olives");
			Mushrooms = new JCheckBox("Mushrooms");
			Eggplant = new JCheckBox("Eggplant");
			Arugula = new JCheckBox("Arugula");
			
			foodListener listener = new foodListener();
			
			ArtHearts.addItemListener(listener);
			RGarlic.addItemListener(listener);
			RRPeppers.addItemListener(listener);
			ROnion.addItemListener(listener);
			SDTomatoes.addItemListener(listener);
			FTomatoes.addItemListener(listener);
			Olives.addItemListener(listener);
			Mushrooms.addItemListener(listener);
			Eggplant.addItemListener(listener);
			Arugula.addItemListener(listener);
			
			
		subPanel2 = new JPanel();
		subPanel2.setLayout(new GridLayout(5, 5));
		subPanel2.setPreferredSize(new Dimension(300, 150));
		subPanel2.setBorder (BorderFactory.createTitledBorder ("Veggies"));
		
		Toppings = new JPanel();
		Toppings.setLayout(new GridLayout(1, 1));
		Toppings.setPreferredSize(new Dimension(330, 150));
		Toppings.setBorder (BorderFactory.createTitledBorder ("Topping"));
		Toppings.add(subPanel2);
		
			subPanel2.add(ArtHearts);
			subPanel2.add(RGarlic);
			subPanel2.add(RRPeppers);
			subPanel2.add(ROnion);
			subPanel2.add(SDTomatoes);
			subPanel2.add(FTomatoes);
			subPanel2.add(Olives);
			subPanel2.add(Mushrooms);
			subPanel2.add(Eggplant);
			subPanel2.add(Arugula);
	//*********************************************************************
			subPanel4 = new JPanel();
			subPanel4.setPreferredSize(new Dimension(500, 100));
			subPanel4.setBorder(BorderFactory.createTitledBorder("Current Order"));
			subPanel4.setLayout(new GridLayout(2, 2));
			NumOfMeal = new JLabel("Number of Meals: ", NoM);
		    TPrice = new JLabel("Total Price of Food: ", price);
			subPanel4.add(NumOfMeal);
			subPanel4.add(TPrice);
			
	//************************* Add to main panel **************************
			mainPanel = new JPanel();
			mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
			mainPanel.add(subPanel3);
			mainPanel.add(foodPanel);
			
			add(mainPanel);
			add(Toppings);
			add(subPanel1);
			add(subPanel4);
			
			setPreferredSize(new Dimension(500, 500));
		}
		
	//********************* Listener *********************************
		private class foodListener implements ItemListener
		{
			public void itemStateChanged(ItemEvent e)
			{
				if(ArtHearts.isSelected())
					NoM++;
				if(RGarlic.isSelected())
					NoM++;
				if(RRPeppers.isSelected())
					NoM++;
				if(ROnion.isSelected())
					NoM++;
				if(SDTomatoes.isSelected())
					NoM++;
				if(FTomatoes.isSelected())
					NoM++;
				if(Olives.isSelected())
					NoM++;
				if(Mushrooms.isSelected())
					NoM++;
				if(Eggplant.isSelected())
					NoM++;
				if(Arugula.isSelected())
					NoM++;
				
			}
		}
		
	//****************************************************************	
		private class radioButtonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent radio)
			{
				
			}
		}
//*********************************************************************		
		private class buttonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent button)
			{
				
			}
		}
}

