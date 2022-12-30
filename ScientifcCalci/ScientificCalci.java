import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScientificCalci extends JFrame implements ActionListener{
     JButton btn1 = new JButton("1");
	 JButton btn2 = new JButton("2");
	 JButton btn3 = new JButton("3");
	 JButton btn4 = new JButton("4");
	 JButton btn5 = new JButton("5");
	 JButton btn6 = new JButton("6");
	 JButton btn7 = new JButton("7");
     JButton btn8 = new JButton("8");
	 JButton btn9 = new JButton("9");
	 JButton btn0 = new JButton("0");
     JButton bDel = new JButton("DE");
	 JButton bClr = new JButton("Clr");
     JButton bMul = new JButton("X");
     JButton bDiv = new JButton("\u00F7");
     JButton bSqr = new JButton("x\u00B2");
     JButton bAdd = new JButton("+");
     JButton bSub = new JButton("-");
     JButton bCube = new JButton("x\u00B3");
     JButton bEqual = new JButton("=");
     JButton bfact = new JButton("n!");
     JButton bPoint = new JButton(".");
     JButton bPlusMinus = new JButton("\u00B1");
     JButton bOneByN = new JButton("1/n");
     JButton bPercent = new JButton("%");
     JButton bSqrt = new JButton("\u221A");
     JButton bSin = new JButton("sin");
	 JButton bCos = new JButton("cos");
	 JButton bTan = new JButton("tan");
	 JButton bAsin = new JButton("asin");
     JButton bAcos = new JButton("acos");
	 JButton bAtan = new JButton("atan");
	 JButton bSinH = new JButton("sinh");
	 JButton bCosH = new JButton("cosh");
	 JButton bTanH = new JButton("tanh");
	 JButton bPowerOfTen = new JButton("10^n");
	 JButton bLog = new JButton("log");
	 JButton bLn = new JButton("ln");
	 JButton bEx = new JButton("ex");
	 JButton bExit = new JButton("EXIT");
     static Color windowColor = new Color(110, 119, 129);
     private JTextField txtfield = new JTextField();
        double first;
        double second;
        double result;
        String operation;
        String ans;
        ScientificCalci(){
        setBackground(windowColor);
        setLayout(null);

        JPanel panel = new JPanel(); // The screen that shows the result
        add(panel).setBounds(0, 30, 343, 50);
		panel.add(txtfield);
		panel.setLayout(null);
       
        JPanel panel1 = new JPanel(); // The panel that contain the common buttons
		JPanel panel2 = new JPanel(); // The panel that contains the scientific buttons.

        txtfield.setBounds(0, 0, 343, 50);
		txtfield.setHorizontalAlignment(JTextField.RIGHT);
		txtfield.setText("0");
		txtfield.setEditable(false);

        // Designing panel1 
        add(panel1).setBounds(0, 100, 343, 190);
		panel1.setLayout(null);
        panel1.setBackground(windowColor);

        // 1st row
		panel1.add(bDel).setBounds(226, 0, 54, 38);
        bDel.setBackground(Color.black);
        bDel.setForeground(Color.white);		
        panel1.add(bClr).setBounds(280, 0, 54, 38);
        bClr.setBackground(Color.red);
        
        // 2nd row
        panel1.add(btn7).setBounds(10, 38, 54, 38);
        btn7.setBackground(Color.black);
        btn7.setForeground(Color.white);
        panel1.add(btn8).setBounds(64, 38, 54, 38);
        btn8.setBackground(Color.black);
        btn8.setForeground(Color.white);
        panel1.add(btn9).setBounds(118, 38, 54, 38);
        btn9.setBackground(Color.black);
        btn9.setForeground(Color.white);	
		panel1.add(bMul).setBounds(172, 38, 54, 38);
        bMul.setBackground(Color.white);
        panel1.add(bDiv).setBounds(226, 38, 54, 38);
        bDiv.setBackground(Color.white);
        panel1.add(bSqr).setBounds(280, 38, 54, 38);
        bSqr.setBackground(Color.white);

        // 3rd row
        panel1.add(btn4).setBounds(10, 76, 54, 38);
        btn4.setBackground(Color.black);
        btn4.setForeground(Color.white);
        panel1.add(btn5).setBounds(64, 76, 54, 38);
        btn5.setBackground(Color.black);
        btn5.setForeground(Color.white);
        panel1.add(btn6).setBounds(118, 76, 54, 38);
        btn6.setBackground(Color.black);
        btn6.setForeground(Color.white);
        panel1.add(bAdd).setBounds(172, 76, 54, 38);
        bAdd.setBackground(Color.white);
        panel1.add(bSub).setBounds(226, 76, 54, 38);
        bSub.setBackground(Color.white);
        panel1.add(bCube).setBounds(280, 76, 54, 38);
        bCube.setBackground(Color.white);

        // 4th row
        panel1.add(btn1).setBounds(10, 114, 54, 38);
        btn1.setBackground(Color.black);
        btn1.setForeground(Color.white);
        panel1.add(btn2).setBounds(64, 114, 54, 38);
        btn2.setBackground(Color.black);
        btn2.setForeground(Color.white);
        panel1.add(btn3).setBounds(118, 114, 54, 38);
        btn3.setBackground(Color.black);
        btn3.setForeground(Color.white);
        panel1.add(bEqual).setBounds(172, 114, 108, 38);
        bEqual.setBackground(Color.red);
        panel1.add(bfact).setBounds(280, 114, 54, 38);
        bfact.setBackground(Color.white);

        // 5th row
        panel1.add(btn0).setBounds(10, 152, 54, 38);
        btn0.setBackground(Color.black);
        btn0.setForeground(Color.white);
        panel1.add(bPoint).setBounds(64, 152, 54, 38);
        bPoint.setBackground(Color.black);
        bPoint.setForeground(Color.white);
        panel1.add(bPlusMinus).setBounds(118, 152, 54, 38);
        bPlusMinus.setBackground(Color.black);
        bPlusMinus.setForeground(Color.white);
        panel1.add(bOneByN).setBounds(172, 152, 54, 38);
        bOneByN.setBackground(Color.white);
        panel1.add(bPercent).setBounds(226, 152, 54, 38);
        bPercent.setBackground(Color.white);
        panel1.add(bSqrt).setBounds(280, 152, 54, 38);
        bSqrt.setBackground(Color.white);

        // Designing panel2
        add(panel2).setBounds(0, 310, 343, 145);
		panel2.setLayout(null);
		panel2.setBackground(windowColor);

        //	1st row
		panel2.add(bSin).setBounds(10, 0, 65, 38);
        bSin.setBackground(Color.white);
        panel2.add(bCos).setBounds(75, 0, 65, 38);
        bCos.setBackground(Color.white);
        panel2.add(bTan).setBounds(140, 0, 65, 38);
        bTan.setBackground(Color.white);
		panel2.add(bLog).setBounds(205, 0, 65, 38);
        bLog.setBackground(Color.white);
        panel2.add(bLn).setBounds(270, 0, 64, 38);
        bLn.setBackground(Color.white);

        //	2nd row
        panel2.add(bAsin).setBounds(10, 38, 65, 38);
        bAsin.setBackground(Color.white);
        panel2.add(bAcos).setBounds(75, 38, 65, 38);
        bAcos.setBackground(Color.white);
        panel2.add(bAtan).setBounds(140, 38, 65, 38);
        bAtan.setBackground(Color.white);
		panel2.add(bPowerOfTen).setBounds(205, 38, 65, 38);
        bPowerOfTen.setBackground(Color.white);
        panel2.add(bEx).setBounds(270, 38, 64, 38);
        bEx.setBackground(Color.white);

        //	3rd row
		panel2.add(bSinH).setBounds(10, 76, 65, 38);
        bSinH.setBackground(Color.white);
        panel2.add(bCosH).setBounds(75, 76, 65, 38);
        bCosH.setBackground(Color.white);
        panel2.add(bTanH).setBounds(140, 76, 65, 38);
        bTanH.setBackground(Color.white);
		panel2.add(bExit).setBounds(205, 76, 130, 38);
        bExit.setBackground(Color.black);
        bExit.setForeground(Color.white);
        // Adding actionlistener
        btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btn0.addActionListener(this);
		bAdd.addActionListener(this);
		bSub.addActionListener(this);
		bMul.addActionListener(this);
		bDiv.addActionListener(this);
		bPoint.addActionListener(this);
		bEqual.addActionListener(this);
		bDel.addActionListener(this);
		bClr.addActionListener(this);
		bSqr.addActionListener(this);
		bSqrt.addActionListener(this);
		bCube.addActionListener(this);
		bPercent.addActionListener(this);
		bfact.addActionListener(this);
		bOneByN.addActionListener(this);
		bPlusMinus.addActionListener(this);
        // scientific button
        bSin.addActionListener(this);
		bCos.addActionListener(this);
		bTan.addActionListener(this);
		bAsin.addActionListener(this);
		bAcos.addActionListener(this);
		bAtan.addActionListener(this);
		bSinH.addActionListener(this);
		bCosH.addActionListener(this);
		bTanH.addActionListener(this);
		bPowerOfTen.addActionListener(this);
		bLog.addActionListener(this);
		bLn.addActionListener(this);
		bEx.addActionListener(this);
		bExit.addActionListener(this);

    }
    public static void main(String[] args){
        ScientificCalci frame = new ScientificCalci();
		frame.setTitle("Scientific Calculator");
		frame.setSize(360, 500);
        frame.getContentPane().setBackground(windowColor);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btn1){
            String number=txtfield.getText()+btn1.getText();
            txtfield.setText(number);
        }
        else if(e.getSource() == btn2){
            String number = txtfield.getText()+btn2.getText();
            txtfield.setText(number);
        }
        else if(e.getSource() == btn3){
            String number = txtfield.getText()+btn3.getText();
            txtfield.setText(number);
        }
        else if(e.getSource() == btn4){
            String number = txtfield.getText()+btn4.getText();
            txtfield.setText(number);
        }
        else if(e.getSource() == btn5){
            String number = txtfield.getText()+btn5.getText();
            txtfield.setText(number);
        }
        else if(e.getSource() == btn6){
            String number = txtfield.getText()+btn6.getText();
            txtfield.setText(number);
        }
        else if(e.getSource() == btn7){
            String number = txtfield.getText()+btn7.getText();
            txtfield.setText(number);
        }
        else if(e.getSource() == btn8){
            String number = txtfield.getText()+btn8.getText();
            txtfield.setText(number);
        }
        else if(e.getSource() == btn9){
            String number = txtfield.getText()+btn9.getText();
            txtfield.setText(number);
        }
        else if(e.getSource() == bClr){
            txtfield.setText(null);
        }
        else if(e.getSource() == btn0){
            String number =  txtfield.getText()+btn0.getText();
            txtfield.setText(number);
        }
        else if(e.getSource() == bPoint){
            String number = txtfield.getText()+bPoint.getText();
            txtfield.setText(number);
        }
        else if(e.getSource() == bAdd){
            first= Double.parseDouble(txtfield.getText());
            txtfield.setText("");
            operation = "+";
            
        }
        else if(e.getSource() == bSub){
            first= Double.parseDouble(txtfield.getText());
            txtfield.setText("");
            operation = "-";
            
        }
        else if(e.getSource() == bMul){
            first= Double.parseDouble(txtfield.getText());
            txtfield.setText("");
            operation = "*";
            
        }
        else if(e.getSource() == bDiv){
            first= Double.parseDouble(txtfield.getText());
            txtfield.setText("");
            operation = "/";
            
        }
        else if(e.getSource() == bPercent){
            first= Double.parseDouble(txtfield.getText());
            txtfield.setText("");
            operation = "%";
            
        }
        else if(e.getSource() == bEqual){
            second = Double.parseDouble(txtfield.getText());
            if(operation == "+"){
                result = first + second;
                ans=String.format("%.2f", result);
                txtfield.setText(ans);
            }
            else if(operation == "-"){
                result = first - second;
                ans=String.format("%.2f", result);
                txtfield.setText(ans);
            }
            else if(operation == "*"){
                result = first * second;
                ans=String.format("%.2f", result);
                txtfield.setText(ans);
            }
            else if(operation == "/"){
                result = first / second;
                ans=String.format("%.2f", result);
                txtfield.setText(ans);
            }
            else if(operation=="%"){
                result=first % second;
                ans=String.format("%.2f", result);
                txtfield.setText(ans);
            }   
  
        }
        else if(e.getSource() == bSqr){
            double a = (Double.parseDouble(txtfield.getText()));
            a = a * a;
            txtfield.setText("");
            txtfield.setText(txtfield.getText() +a);
        }
        else if(e.getSource() == bCube){
            double a = (Double.parseDouble(txtfield.getText()));
            a = a * a * a;
            txtfield.setText("");
            txtfield.setText(txtfield.getText() +a);
        }
        else if(e.getSource() == bOneByN){
            double a =1/ Math.sqrt(Double.parseDouble(txtfield.getText()));
            txtfield.setText("");
            txtfield.setText(txtfield.getText() +a);
        }
        else if(e.getSource() == bSqrt){
            double a = Math.sqrt(Double.parseDouble(txtfield.getText()));
            txtfield.setText("");
            txtfield.setText(txtfield.getText() +a);
        }
        else if(e.getSource() == bDel){
            String backSpace=null;
            if(txtfield.getText().length()>0){
                StringBuilder str = new StringBuilder(txtfield.getText());
                str.deleteCharAt(txtfield.getText().length() - 1);
                backSpace=str.toString();
                txtfield.setText(backSpace);
            }

        }
        else if(e.getSource() == bfact){
            double a =(Double.parseDouble(txtfield.getText()));
            double fact=1;
            for(int i = 1; i<= a; i++){
                fact = fact * i;
            }
            txtfield.setText("");
            txtfield.setText(txtfield.getText() +fact);
        }
        else if(e.getSource() == bPlusMinus){
            double a=Double.parseDouble(String.valueOf(txtfield.getText()));
            a = a * (-1);
            txtfield.setText(String.valueOf(a));
        }
        else if (e.getSource() == bLog){
            first= Double.parseDouble(txtfield.getText());
            result = Math.log10(first);
            txtfield.setText(""+result);
            first = result;

        }
        else if (e.getSource() == bSin){
            first = Double.parseDouble(txtfield.getText());
			if(first == 30)
			{
				result = Math.sin(Math.toRadians(first)) + 0.0000000000000001;
			}
			else
			{
				result = Math.sin(Math.toRadians(first));
			}
            txtfield.setText("" +result);
        }
        else if (e.getSource() == bCos){
            first = Double.parseDouble(txtfield.getText());
			if(first == 60)
			{
				result = Math.cos(Math.toRadians(first)) - 0.0000000000000001;
			}
			else if (first == 90)
			{
				result = 0;
			}
			else 
			{
				result = Math.cos(Math.toRadians(first));
			}
            txtfield.setText("" +result);
        }
        else if (e.getSource() == bTan){
            first = Double.parseDouble(txtfield.getText());
			if(first == 45)
			{
				result = Math.tan(Math.toRadians(first)) + 0.0000000000000001;
			}
			else if(first == 90)
			{
				result = 0;
				txtfield.setText("Invalid");
			}
			else
			{
				result = Math.tan(Math.toRadians(first));
			}
            if(first!= 90)
			{
				txtfield.setText("" +result);
			}
            first = result;
        }
        else if (e.getSource() == bLn){
            first= Double.parseDouble(txtfield.getText());
			result = Math.log(first);
            txtfield.setText("" +result);
            first = result;
        }
        else if(e.getSource() == bAsin){
            first = Double.parseDouble(txtfield.getText());
			result = Math.asin(Math.toRadians(first));
            txtfield.setText("" +result);

        }
        else if(e.getSource() == bAcos){
            first = Double.parseDouble(txtfield.getText());
			result = Math.acos(Math.toRadians(first));
            txtfield.setText("" +result);
        }
        else if(e.getSource() == bAtan){
            first = Double.parseDouble(txtfield.getText());
			result = Math.atan(Math.toRadians(first));
            txtfield.setText("" +result);
        }
        else if(e.getSource() == bSinH){
            first = Double.parseDouble(txtfield.getText());
			result = Math.sinh(Math.toRadians(first));
            txtfield.setText("" +result);
        }
        else if(e.getSource() == bCosH){
            first = Double.parseDouble(txtfield.getText());
			result = Math.cosh(Math.toRadians(first));
            txtfield.setText("" +result);
        }
        else if(e.getSource() == bTanH){
            first = Double.parseDouble(txtfield.getText());
			result = Math.tanh(Math.toRadians(first));
            txtfield.setText("" +result);
        }
        else if(e.getSource() == bEx){
            double a = Math.exp(Double.parseDouble(txtfield.getText()));
            txtfield.setText("");
            txtfield.setText(txtfield.getText() +a);
        }
        else if(e.getSource() == bPowerOfTen){
            first= Double.parseDouble(txtfield.getText());
			result = Math.pow(10, first);
            txtfield.setText("" +result);
        }
        else if(e.getSource() == bExit)
		{
			System.exit(0);
		}

    }
}

  

