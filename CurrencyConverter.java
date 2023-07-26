import javax.swing.*;    
import java.awt.event.*;

public class CurrencyConverter 
{    
	JFrame f; 
	JLabel l1,l2,x1,x2;
	JTextField t1;
	
	public CurrencyConverter()
	{    
	    f=new JFrame("Currency Converter");   
	    f.setResizable(false);
	    l1=new JLabel("Enter Amount:");  
	    l1.setBounds(50,50, 300,30); 
	    t1=new JTextField(20);
	    t1.setBounds(250,50, 300,30);
	    
	    String currencies[]={"INR","USD","EURO","POUND"};  
	    
	    x1=new JLabel("FROM :");
	    JComboBox<String> cb1 = new JComboBox<>(currencies); 
	    
	    cb1.setBounds(50,100, 100,30); 
	
	    x2=new JLabel("TO :");
	    JComboBox<String> cb2 = new JComboBox<>(currencies);  
	    cb2.setBounds(50,150, 100,30); 
	    
	    JButton b=new JButton("Show");  
	    b.setBounds(50,200, 100,30);
	    
	    
	    l2=new JLabel("");  
	    l2.setBounds(50,250, 300,30); 
	      
	    b.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              double v;
              if(t1.getText().length()==0)
              {
                   JOptionPane.showMessageDialog(b,"Sorry , Enter Amount");
              }
              else if(cb1.getSelectedItem()==cb2.getSelectedItem())
              {
                      JOptionPane.showMessageDialog(b,"Sorry..from & to should be different");
              }
              
              if(cb1.getSelectedItem()=="INR")
              {
                     if(cb2.getSelectedItem()=="USD")
                     {
                         v = 0.012 * Double.parseDouble(t1.getText());                         v = Math.round(v*100)/100.0;
                         v = Math.round(v*100)/100.0;
                         l2.setText(t1.getText() + " " +  cb1.getSelectedItem() + " = " + v + " " +  cb2.getSelectedItem());
                     }
                     
                     else if(cb2.getSelectedItem()=="EURO")
                     {
                         v = 0.011 * Double.parseDouble(t1.getText());
                         v = Math.round(v*100)/100.0;
                         l2.setText(t1.getText() + " " +  cb1.getSelectedItem() + " = " + v + " " +  cb2.getSelectedItem());
                     }
                     
                     else if(cb2.getSelectedItem()=="POUND")
                     {
                        
                         v = 0.0098 * Double.parseDouble(t1.getText());
                         v = Math.round(v*100)/100.0;
                         
                         l2.setText(t1.getText() + " " +  cb1.getSelectedItem() + " = " + v + " " +  cb2.getSelectedItem());
                     }
              }
              else if(cb1.getSelectedItem()=="USD")
              {
                     if(cb2.getSelectedItem()=="INR")
                     {
                         v = 82.11 * Double.parseDouble(t1.getText());
                         v = Math.round(v*100)/100.0;
                         l2.setText(t1.getText() + " " +  cb1.getSelectedItem() + " = " + v + " " +  cb2.getSelectedItem());
                     }
                     
                     else if(cb2.getSelectedItem()=="EURO")
                     {
                        
                         v = 0.93 * Double.parseDouble(t1.getText());
                         v = Math.round(v*100)/100.0;
                         l2.setText(t1.getText() + " " +  cb1.getSelectedItem() + " = " + v + " " +  cb2.getSelectedItem());
                     }
                     
                     else if(cb2.getSelectedItem()=="POUND")
                     {
                         
                         v = 0.81 * Double.parseDouble(t1.getText());
                         v = Math.round(v*100)/100.0;
                         l2.setText(t1.getText() + " " +  cb1.getSelectedItem() + " = " + v + " " +  cb2.getSelectedItem());
                     }
              }
              
              else if(cb1.getSelectedItem()=="EURO")
              {
                     if(cb2.getSelectedItem()=="USD")
                     {
                         v = 1.08 * Double.parseDouble(t1.getText());
                         v = Math.round(v*100)/100.0;
                         l2.setText(t1.getText() + " " +  cb1.getSelectedItem() + " = " + v + " " +  cb2.getSelectedItem());
                     }
                     
                     else if(cb2.getSelectedItem()=="INR")
                     {
                         v = 88.85 * Double.parseDouble(t1.getText());
                         v = Math.round(v*100)/100.0;
                         l2.setText(t1.getText() + " " +  cb1.getSelectedItem() + " = " + v + " " +  cb2.getSelectedItem());
                     }
                     
                     else if(cb2.getSelectedItem()=="POUND")
                     {
                        
                         v = 0.88 * Double.parseDouble(t1.getText());
                         v = Math.round(v*100)/100.0;
                         l2.setText(t1.getText() + " " +  cb1.getSelectedItem() + " = " + v + " " +  cb2.getSelectedItem());
                     }
              }
              
              else if(cb1.getSelectedItem()=="POUND")
              {
                     if(cb2.getSelectedItem()=="INR")
                     {
                         v = 101.09 * Double.parseDouble(t1.getText());
                         v = Math.round(v*100)/100.0;
                         l2.setText(t1.getText() + " " +  cb1.getSelectedItem() + " = " + v + " " +  cb2.getSelectedItem());
                     }
                     
                     else if(cb2.getSelectedItem()=="USD")
                     {
                         v = 1.23 * Double.parseDouble(t1.getText());
                         v = Math.round(v*100)/100.0;
                         l2.setText(t1.getText() + " " +  cb1.getSelectedItem() + " = " + v + " " +  cb2.getSelectedItem());
                     }
                     
                     else if(cb2.getSelectedItem()=="EURO")
                     { 
                         v = 1.14 * Double.parseDouble(t1.getText());
                         v = Math.round(v*100)/100.0;
                         l2.setText(t1.getText() + " " +  cb1.getSelectedItem() + " = " + v + " " +  cb2.getSelectedItem());
                     }
              }
          }
      });
	    
	f.add(x1);
    f.add(cb1);
    f.add(x2);
    f.add(cb2);
    
    f.add(l1); 
    f.add(t1);
    f.add(b);
   
    f.add(l2);
    
    f.setDefaultCloseOperation(3);
    f.setSize(700,400);  
    f.setLayout(null);  
    f.setVisible(true); 
}
  
public static void main(String[] args) {    
    new CurrencyConverter();         
}    
}
[5:23 PM, 7/26/2023] Lasya: import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class TicTacToe extends JPanel {

    char playerSign = 'x';
    int totalCells = 9;
    int totalRows = 3;
    int totalColumns = 3;
    JButton[] jButtons = new JButton[totalCells];

    public TicTacToe() {
        GridLayout ticTacToeGridLayout = new GridLayout(totalRows, totalColumns);
        setLayout(ticTacToeGridLayout);

        createButtons();

    }

    public void createButtons() {
        for (int i = 0; i <= 8; i++) {

            jButtons[i] = new JButton();

            jButtons[i].setText("");

            jButtons[i].addActionListener(e -> {

                JButton clickedBtn = (JButton) e.getSource();
                clickedBtn.setText(String.valueOf(playerSign));
                clickedBtn.setEnabled(false);


                if (playerSign == 'x')
                    playerSign = 'o';
                else
                    playerSign = 'x';

                showWinner();
            });

            add(jButtons[i]);
        }
    }


    public void showWinner() {

        if (checkForWinner()) {

            if (playerSign == 'x') playerSign = 'o';
            else playerSign = 'x';

            JOptionPane jOptionPane = new JOptionPane();
            int dialog = JOptionPane.showConfirmDialog(jOptionPane, "Game Over. " + "The winner is " + playerSign + " ", "Result",
                    JOptionPane.DEFAULT_OPTION);

            if (dialog == JOptionPane.OK_OPTION)
                System.exit(0);


        } else if (checkIfMatchDraw()) {
            JOptionPane jOptionPane = new JOptionPane();
            int dialog = JOptionPane.showConfirmDialog(jOptionPane, "Game Draw", "Result", JOptionPane.DEFAULT_OPTION);

            if (dialog == JOptionPane.OK_OPTION)
                System.exit(0);
        }
    }


    public boolean checkIfMatchDraw() {
        boolean gridsFull = true;
        for (int i = 0; i < totalCells; i++) {
            if (jButtons[i].getText().equals("")) {
                gridsFull = false;
            }
        }
        return gridsFull;
    }

    public boolean checkForWinner() {
        return checkAllRows() || checkAllColumns() || checkTheDiagonals();
    }

    public boolean checkAllRows() {
        int i = 0;
        for (int j = 0; j < 3; j++) {
            if (jButtons[i].getText().equals(jButtons[i + 1].getText()) && jButtons[i].getText().equals(jButtons[i + 2].getText())
                    && !jButtons[i].getText().equals("")) {
                return true;
            }
            i = i + 3;

        }
        return false;
    }


    public boolean checkAllColumns() {

        int i = 0;
        for (int j = 0; j < 3; j++) {

            if (jButtons[i].getText().equals(jButtons[i + 3].getText()) && jButtons[i].getText().equals(jButtons[i + 6].getText())
                    && !jButtons[i].getText().equals("")) {
                return true;
            }
            i++;
        }
        return false;
    }

    public boolean checkTheDiagonals() {
        if (jButtons[0].getText().equals(jButtons[4].getText()) && jButtons[0].getText().equals(jButtons[8].getText())
                && !jButtons[0].getText().equals(""))
            return true;
        else
            return jButtons[2].getText().equals(jButtons[4].getText()) && jButtons[2].getText().equals(jButtons[6].getText())
                    && !jButtons[2].getText().equals("");
    }


    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Tic Tac Toe Game");

        jFrame.getContentPane().add(new TicTacToe());
        jFrame.setBounds(500, 500, 600, 550);
        jFrame.setVisible(true);
        jFrame.setLocationRelativeTo(null);
    }

}
