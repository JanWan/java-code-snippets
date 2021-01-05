import javax.swing.*;

import nn.NewJFrame1;

import java.awt.event.*;
public class Calculator extends JFrame {
                        
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btn0;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btndivide;
    private JButton btndot;
    private JButton btnequal;
    private JButton btnminus;
    private JButton btnmultiply;
    private JButton btnplus;
    private JButton ntnclear;
    private JTextField txtbox;  
    
   float num1 = 0;
   int count = 0;
   float result = 0;
        
        
      public Calculator() 
      {
        txtbox = new JTextField();
        ntnclear = new JButton();
        btndivide = new JButton();
        btn4 = new JButton();
        btnplus = new JButton();
        btn9 = new JButton();
        btn7 = new JButton();
        btn5 = new JButton();
        btn6 = new JButton();
        btnmultiply = new JButton();
        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        btnminus = new JButton();
        btn0 = new JButton();
        btndot = new JButton();
        btnequal = new JButton();
        btn8 = new JButton();

        getContentPane().add(txtbox);
       txtbox.setBounds(1, 0, 319, 40);

        ntnclear.setText("Clear");
        ntnclear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ntnclearActionPerformed(evt);
            }
        });
        
        getContentPane().add(ntnclear);
        ntnclear.setBounds(0, 50, 320, 40);
        ntnclear.getAccessibleContext().setAccessibleName("btnClear");

        btndivide.setText("/");
        btndivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivideActionPerformed(evt);
            }
        });
        
        getContentPane().add(btndivide);
        btndivide.setBounds(240, 90, 80, 60);

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4);
        btn4.setBounds(0, 150, 80, 60);

        btnplus.setText("+");
        btnplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplusActionPerformed(evt);
            }
        });
        getContentPane().add(btnplus);
        btnplus.setBounds(240, 270, 80, 60);

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9);
        btn9.setBounds(160, 90, 80, 60);

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7);
        btn7.setBounds(0, 90, 80, 60);

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5);
        btn5.setBounds(80, 150, 80, 60);

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6);
        btn6.setBounds(160, 150, 80, 60);

        btnmultiply.setText("*");
        btnmultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiplyActionPerformed(evt);
            }
        });
        getContentPane().add(btnmultiply);
        btnmultiply.setBounds(240, 150, 80, 60);

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(0, 210, 80, 60);

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(80, 210, 80, 60);

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(160, 210, 80, 60);

        btnminus.setText("-");
        btnminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnminusActionPerformed(evt);
            }
        });
        getContentPane().add(btnminus);
        btnminus.setBounds(240, 210, 80, 60);

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0);
        btn0.setBounds(0, 270, 80, 60);

        btndot.setText(".");
        btndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndotActionPerformed(evt);
            }
        });
        getContentPane().add(btndot);
        btndot.setBounds(80, 270, 80, 60);

        btnequal.setText("=");
        btnequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnequalActionPerformed(evt);
            }
        });
        getContentPane().add(btnequal);
        btnequal.setBounds(160, 270, 80, 60);

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8);
        btn8.setBounds(80, 90, 80, 60);

        
                
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        pack();
        setSize(336,370);
        setVisible(true);
    }                        

    private void ntnclearActionPerformed(java.awt.event.ActionEvent evt) {                                         
    txtbox.setText(""); 
    num1 = 0;
    count = 0;
    }                                        

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
    txtbox.setText(txtbox.getText() + "7");  
    }                                    

    private void btnplusActionPerformed(java.awt.event.ActionEvent evt) { 
    try{
    num1 = Float.parseFloat(txtbox.getText());
    txtbox.setText("");
    count = 2;        
    }
    catch (Exception e){
        
    }
    }                                       

    private void btnminusActionPerformed(java.awt.event.ActionEvent evt) {    
    try{
    num1 = Float.parseFloat(txtbox.getText());
    txtbox.setText("");
    count = 1;           
    }
    catch (Exception e){
        
    }
    }                                        

    private void btnmultiplyActionPerformed(java.awt.event.ActionEvent evt) {  
    try{
    num1 = Float.parseFloat(txtbox.getText());
    txtbox.setText("");
    count = 3;      
    }
    catch (Exception e){
        
    }
    
    }                                           

    private void btndivideActionPerformed(java.awt.event.ActionEvent evt) {  
    try{
    num1 = Float.parseFloat(txtbox.getText());
    txtbox.setText("");
    count = 4;         
    }
    catch (Exception e){
        
    }
    }
                                            

    private void btnequalActionPerformed(java.awt.event.ActionEvent evt) {                                         
       compute(count);
    }                                        

    private void btndotActionPerformed(java.awt.event.ActionEvent evt) {                                       
            int c = txtbox.getText().length();
            int flag = 0;
            String text = txtbox.getText();
            for (int i = 0; i < c; i++)
            { 
                if (text.charAt(i) == '.') 
                { 
                    flag = 1; break;
                   
                } 
                else 
                { 
                    flag = 0; 
                } 
            }
            if (flag == 0)
            { 
                txtbox.setText(txtbox.getText() + "."); 
            }
    }                                      

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtbox.setText(txtbox.getText() + "0"); 
    }                                    

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
    txtbox.setText(txtbox.getText() + "8");        
    }                                    

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtbox.setText(txtbox.getText() + "9"); 
    }                                    

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtbox.setText(txtbox.getText() + "4"); 
    }                                    

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtbox.setText(txtbox.getText() + "5"); 
    }                                    

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtbox.setText(txtbox.getText() + "6"); 
    }                                    

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtbox.setText(txtbox.getText() + "1"); 
    }                                    

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
       txtbox.setText(txtbox.getText() + "2"); 
    }                                    

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
      txtbox.setText(txtbox.getText() + "3"); 
    }                                    

    public void compute(int count)
        {
            switch (count)
            {
                case 1:
                    result = num1 - Float.parseFloat(txtbox.getText());
                    txtbox.setText(Float.toString(result));         
                    break;
                case 2:
                    result = num1 + Float.parseFloat(txtbox.getText());
                    txtbox.setText(Float.toString(result));  
                    break;
                case 3:
                    result = num1 * Float.parseFloat(txtbox.getText());
                    txtbox.setText(Float.toString(result));  
                    break;
                case 4:
                    result = num1 / Float.parseFloat(txtbox.getText());
                    txtbox.setText(Float.toString(result));  
                    break;
                default:
                    break;
            }
        }
    public static void main(String args[]) {
                
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

         new Calculator();

    }
    
                
}
