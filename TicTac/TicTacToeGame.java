import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.*;
import java.awt.event.ActionListener;

class TicGame  extends JFrame{
    int i = 0,j = 0,count = 0;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,btn;
    JTextField t;

    TicGame() 
    {   
		//Creating a text field
        t=new JTextField();
	    t.setBounds(20,370,250,30);
	    t.setEditable(false);
        btn=new JButton("Start New Game");
	    btn.setBounds(90,320,130,30);
		btn.setBackground(Color.lightGray);
		btn.setForeground(Color.blue);
        b1=new JButton();
	    b1.setBounds(13,13,90,90);
		b1.setBackground(Color.BLUE);
        b2=new JButton();
	    b2.setBounds(110,13,90,90);
		b2.setBackground(Color.BLUE);
	    b3=new JButton();
	    b3.setBounds(207,13,90,90); 
		b3.setBackground(Color.BLUE);
	    b4=new JButton();
	    b4.setBounds(13,110,90,90); 
		b4.setBackground(Color.BLUE);
	    b5=new JButton();
	    b5.setBounds(110,110,90,90);
		b5.setBackground(Color.BLUE);
	    b6=new JButton();
	    b6.setBounds(207,110,90,90); 
		b6.setBackground(Color.BLUE);
	    b7=new JButton();
	    b7.setBounds(13,207,90,90);
		b7.setBackground(Color.BLUE);
	    b8=new JButton();
	    b8.setBounds(110,207,90,90);
		b8.setBackground(Color.BLUE);
	    b9=new JButton();
	    b9.setBounds(207,207,90,90);
		b9.setBackground(Color.BLUE);
        add(t);
        add(btn);
        add(b1);
	    add(b2);
	    add(b3);
	    add(b4);
	    add(b5);
	    add(b6);
	    add(b7);
	    add(b8);
	    add(b9);
        btn.addActionListener(new C()); 
        b1.addActionListener(new C1());
	    b2.addActionListener(new C2());
	    b3.addActionListener(new C3());
	    b4.addActionListener(new C4());
	    b5.addActionListener(new C5());
	    b6.addActionListener(new C6());
	    b7.addActionListener(new C7());
	    b8.addActionListener(new C8());
	    b9.addActionListener(new C9());
    }

    public void setEnable()
	{
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
	}
    public int checkCondition()
	{
		count++;		
		if(b1.getText() == "X" && b2.getText() == "X" && b3.getText() == "X")
			return 1;
		else if(b1.getText() == "X" && b4.getText() == "X" && b7.getText() == "X")
			return 1;
		else if(b1.getText() == "X" && b5.getText() == "X" && b9.getText() == "X")
			return 1;
		
		else if(b2.getText() == "X" && b5.getText() == "X" && b8.getText() == "X")
			return 1;
		
		else if(b3.getText() == "X" && b6.getText() == "X" && b9.getText() == "X")
			return 1;
		else if(b3.getText() == "X" && b5.getText() == "X" && b7.getText() == "X")
			return 1;
		
		else if(b4.getText() == "X" && b5.getText() == "X" && b6.getText() == "X")
			return 1;
		
		else if(b7.getText() == "X" && b8.getText() == "X" && b9.getText() == "X")
			return 1;
		else if(b1.getText() == "0" && b2.getText() == "0" && b3.getText() == "0")
			return 2;
		else if(b1.getText() == "0" && b4.getText() == "0" && b7.getText() == "0")
			return 2;
		else if(b1.getText() == "0" && b5.getText() == "0" && b9.getText() == "0")
			return 2;
		
		else if(b2.getText() == "0" && b5.getText() == "0" && b8.getText() == "0")
			return 2;
		
		else if(b3.getText() == "0" && b6.getText() == "0" && b9.getText() == "0")
			return 2;
		else if(b3.getText() == "0" && b5.getText() == "0"&&b7.getText() == "0")
			return 2;
		
		else if(b4.getText() == "0" && b5.getText() == "0" && b6.getText() == "0")
			return 2;
		
		else if(b7.getText() == "0" && b8.getText() == "0" && b9.getText() == "0")
			return 2;
		
		else{
		  if(count==9)
			t.setText("Game Draw ");
		  return 3;
		}				
		
	}
    class C implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
		   i=0;j=0;count=0;
		   b1.setText("");
		   b2.setText("");
		   b3.setText("");
		   b4.setText("");
		   b5.setText("");
		   b6.setText("");
		   b7.setText("");
		   b8.setText("");
		   b9.setText("");
		   b1.setEnabled(true);
		   b2.setEnabled(true);
		   b3.setEnabled(true);
		   b4.setEnabled(true);
		   b5.setEnabled(true);
		   b6.setEnabled(true);
		   b7.setEnabled(true);
		   b8.setEnabled(true);
		   b9.setEnabled(true);
		   t.setText("");
		}	
	}
	// Adding actionListener for b1
    class C1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(i==0){

			    b1.setText("X");
				i=1;
				b1.setEnabled(false);
				j=checkCondition();
				if(j==1){
					t.setText("Player 1 Won");
					setEnable();
				}
				else if(j==2){
					t.setText("Player 2 Won");
					setEnable();
				}
				else;
			}
			else{
				b1.setText("0"); 
				i=0;
				b1.setEnabled(false);
				j=checkCondition();
				if(j==1){
					t.setText("Player 1 Won");
					setEnable();
				}
				else if(j==2){
					t.setText("Player 2 Won");
					setEnable();
				}
				else;
			}	
		 }
	}
	// Adding actionListener for b2
    class C2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(i==0){
			    b2.setText("X"); 
				i=1;
				b2.setEnabled(false);
				j=checkCondition();
				if(j==1){
					t.setText("Player 1 Won");
					setEnable();
				}
				else if(j==2){
					t.setText("Player 2 Won");
					setEnable();
				}
				else;
			}
			else{
				b2.setText("0"); 
				i=0;
				b2.setEnabled(false);
				j=checkCondition();
				if(j==1){
					t.setText("Player 1 Won");
					setEnable();
				}
				else if(j==2){
					t.setText("Player 2 Won");
					setEnable();
				}
				else;
			}	
		 }
	}
	// Adding actionListener for b3
    class C3 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(i==0){
			    b3.setText("X"); 
				i=1;
				b3.setEnabled(false);
				j=checkCondition();
				if(j==1){
					t.setText("Player 1 Won");
					setEnable();
				}
				else if(j==2){
					t.setText("Player 2 Won");
					setEnable();
				}
				else;				
			}
			else{
				b3.setText("0"); 
				i=0;
				b3.setEnabled(false);
				j=checkCondition();
				if(j==1){
					t.setText("Player 1 Won");
					setEnable();
				}
				else if(j==2){
					t.setText("Player 2 Won");
					setEnable();
				}
				else;
			}	
		 }
	} 
	// Adding actionListener for b4
	 class C4 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(i==0){
			    b4.setText("X"); 
				i=1;
				b4.setEnabled(false);
				j=checkCondition();
				if(j==1){
					t.setText("Player 1 Won");
					setEnable();
				}
				else if(j==2){
					t.setText("Player 2 Won");
					setEnable();
				}
				else;
			}
			else{
				b4.setText("0"); 
				i=0;
				b4.setEnabled(false);
				j=checkCondition();
				if(j==1){
					t.setText("Player 1 Won");
					setEnable();
				}
				else if(j==2){
					t.setText("Player 2 Won");
					setEnable();
				}
				else;
			}	
		 }
	}
	// Adding actionListener for b5
    class C5 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(i==0){
			    b5.setText("X"); 
				i=1;
				b5.setEnabled(false);
				j=checkCondition();
				if(j==1){
					t.setText("Player 1 Won");
					setEnable();
				}
				else if(j==2){
					t.setText("Player 2 Won");
					setEnable();
				}
				else;
			}
			else{
				b5.setText("0"); 
				i=0;
				b5.setEnabled(false);
				j=checkCondition();
				if(j==1){
					t.setText("Player 1 Won");
					setEnable();
				}
				else if(j==2){
					t.setText("Player 2 Won");
					setEnable();
				}
				else;
			}	
		 }
	}
	// Adding actionListener for b6
    class C6 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(i==0){
			    b6.setText("X"); 
				i=1;
				b6.setEnabled(false);
				j=checkCondition();
				if(j==1){
					t.setText("Player 1 Won");
					setEnable();
				}
				else if(j==2){
					t.setText("Player 2 Won");
					setEnable();
				}
				else;
			}
			else{
				b6.setText("0"); 
				i=0;
				b6.setEnabled(false);
				j=checkCondition();
				if(j==1){
					t.setText("Player 1 Won");
					setEnable();
				}
				else if(j==2){
					t.setText("Player 2 Won");
					setEnable();
				}
				else;
			}	
		 }
	}
	// Adding actionListener for b7
    class C7 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(i==0){
			    b7.setText("X"); 
				i=1;
				b7.setEnabled(false);
				j=checkCondition();
				if(j==1){
					t.setText("Player 1 Won");
					setEnable();
				}
				else if(j==2){
					t.setText("Player 2 Won");
					setEnable();
				}
				else;
			}
			else{
				b7.setText("0"); 
				i=0;
				b7.setEnabled(false);
				j=checkCondition();
				if(j==1){
					t.setText("Player 1 Won");
					setEnable();
				}
				else if(j==2){
					t.setText("Player 2 Won");
					setEnable();
				}
				else;
			}	
		 }
	}
	// Adding actionListener for b8
    class C8 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(i==0){
			    b8.setText("X"); 
				i=1;
				b8.setEnabled(false);
				j=checkCondition();
				if(j==1){
					t.setText("Player 1 Won");
					setEnable();
				}
				else if(j==2){
					t.setText("Player 2 Won");
					setEnable();
				}
				else;
			}
			else{
				b8.setText("0"); 
				i=0;
				b8.setEnabled(false);
				j=checkCondition();
				if(j==1){
					t.setText("Player 1 Won");
					setEnable();
				}
				else if(j==2){
					t.setText("Player 2 Won");
					setEnable();
				}
				else;
			}	
		 }
	}
	// Adding actionListener for b9
    class C9 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(i==0){
			    b9.setText("X"); 
				i=1;
				b9.setEnabled(false);
				j=checkCondition();
				if(j==1){
					t.setText("Player 1 Won");
					setEnable();
				}
				else if(j==2){
					t.setText("Player 2 Won");
					setEnable();
				}
				else;
			}
			else{
				b9.setText("0"); 
				i=0;
				b9.setEnabled(false);
				j=checkCondition();
				if(j==1){
					t.setText("Player 1 Won");
					setEnable();
					
				}
				else if(j==2){
					t.setText("Player 2 Won");
					setEnable();
				}
				else;
			}	
		 }
	}  
}
public class TicTacToeGame{
    public static void main(String[] args){
        TicGame f = new TicGame();
        f.setSize(325,450);
        f.setLocation(100,100);
        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(false);
        f.setTitle("Tic Tac Toe");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

    }

}
