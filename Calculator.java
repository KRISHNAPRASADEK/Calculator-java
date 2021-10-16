import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class Calculator implements ActionListener {

    Boolean isOperatorClicked=false;
    Boolean isNumberClicked=false;

    double etemp,value2,value1;

    double atemp;


    double oldValue1,oldValue2,oldValueMinus,oldValueDiv,oldValueMul,oldValueAdd;
    double resultMinus,resultAdd,resultMul,resultDiv;
    double oldValueAddDemo;
    String temp;

    String trial;
    double newValueAdd,newValueMinus,newValueDiv,newValueMul;
    double minus,add,mul,div;

    JFrame jf;
    JLabel displayLabel;
    JLabel displayLabel2;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton threeButton;
    JButton twoButton;
    JButton oneButton;
    JButton dotButton;
    JButton zeroButton;
    JButton equalButton;
    JButton divButton;
    JButton mulButton;
    JButton minusButton;
    JButton addButton;
    JButton clearButton;
    JButton backButton;
    JButton plusMinusButton;

    public Calculator() {
        jf=new JFrame("CALCULATOR");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(300, 120);

        displayLabel2 = new JLabel();
        displayLabel2.setBounds(30, 20, 540, 40);
        displayLabel2.setBackground(Color.blue);
        displayLabel2.setOpaque(true);
        displayLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel2.setForeground(Color.WHITE);
        displayLabel2.setFont(new Font("Arial", Font.PLAIN, 15));
        jf.add(displayLabel2);

        displayLabel = new JLabel();
        displayLabel.setBounds(30,71, 540, 40);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.WHITE);
        displayLabel.setFont(new Font("Times New Roman", Font.PLAIN, 19));
        jf.add(displayLabel);

        sevenButton = new JButton("7");
        sevenButton.setBounds(30, 120, 80, 80);
        sevenButton.addActionListener(this);
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setBounds(130, 120, 80, 80);
        eightButton.addActionListener(this);
        eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setBounds(230, 120, 80, 80);
        nineButton.addActionListener(this);
        nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(nineButton);

        fourButton = new JButton("4");
        fourButton.setBounds(30, 220, 80, 80);
        fourButton.addActionListener(this);
        fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.setBounds(130, 220, 80, 80);
        fiveButton.addActionListener(this);
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setBounds(230, 220, 80, 80);
        sixButton.addActionListener(this);
        sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(sixButton);

        oneButton = new JButton("1");
        oneButton.setBounds(30, 320, 80, 80);
        oneButton.addActionListener(this);
        oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(oneButton);

        twoButton = new JButton("2");
        twoButton.setBounds(130, 320, 80, 80);
        twoButton.addActionListener(this);
        twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setBounds(230, 320, 80, 80);
        threeButton.addActionListener(this);
        threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(threeButton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(30, 420, 80, 80);
        zeroButton.addActionListener(this);
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(zeroButton);

        dotButton = new JButton(".");
        dotButton.setBounds(130, 420, 80, 80);
        dotButton.addActionListener(this);
        dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(dotButton);

        equalButton = new JButton("=");
        equalButton.setBounds(230, 420, 80, 80);
        equalButton.addActionListener(this);
        equalButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(equalButton);

        divButton = new JButton("/");
        divButton.setBounds(330, 120, 80, 80);
        divButton.addActionListener(this);
        divButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(divButton);

        mulButton = new JButton("*");
        mulButton.setBounds(330, 220, 80, 80);
        mulButton.addActionListener(this);
        mulButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(mulButton);

        minusButton = new JButton("-");
        minusButton.setBounds(330, 320, 80, 80);
        minusButton.addActionListener(this);
        minusButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(minusButton);

        addButton = new JButton("+");
        addButton.setBounds(330, 420, 80, 80);
        addButton.addActionListener(this);
        addButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(addButton);

        clearButton = new JButton("CLEAR");
        clearButton.setBounds(430, 420, 140, 80);
        clearButton.addActionListener(this);
        clearButton.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(clearButton);

        backButton = new JButton("BACK");
        backButton.setBounds(430, 320, 140, 80);
        backButton.addActionListener(this);
        backButton.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(backButton);

        plusMinusButton = new JButton("+/-");
        plusMinusButton.setBounds(430, 120, 140, 80);
        plusMinusButton.addActionListener(this);
        plusMinusButton.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(plusMinusButton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sevenButton){

            if(isNumberClicked){
                displayLabel.setText("7");
                isNumberClicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"7");
            }
        }
        else if(e.getSource()==eightButton){
            if(isNumberClicked){
                displayLabel.setText("8");
                isNumberClicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"8");
            }

        }
        else if(e.getSource()==nineButton){
            if(isNumberClicked){
                displayLabel.setText("9");
                isNumberClicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"9");
            }

        }
        else if(e.getSource()==fourButton){
            if(isNumberClicked){
                displayLabel.setText("4");
                isNumberClicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"4");
            }

        }
        else if(e.getSource()==fiveButton){
            if(isNumberClicked){
                displayLabel.setText("5");
                isNumberClicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"5");
            }
        }
        else if(e.getSource()==sixButton){
            if(isNumberClicked){
                displayLabel.setText("6");
                isNumberClicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"6");
            }
        }
        else if(e.getSource()==oneButton){
            if(isNumberClicked){
                displayLabel.setText("1");
                isNumberClicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"1");
            }

        }
        else if(e.getSource()==twoButton){
            if(isNumberClicked){
                displayLabel.setText("2");
                isNumberClicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"2");
            }

        }
        else if(e.getSource()==threeButton){
            if(isNumberClicked){
                displayLabel.setText("3");
                isNumberClicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"3");
            }

        }
        else if(e.getSource()==zeroButton){
            if(isNumberClicked){
                displayLabel.setText("0");
                isNumberClicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"0");
            }

        }

        else if(e.getSource()==dotButton){
            if(isNumberClicked){
                String dotValueChecker=displayLabel.getText();
                if(dotValueChecker.contains(".")==false && dotValueChecker!=""){
                    displayLabel.setText(".");
                    isNumberClicked=false;
                }
                else if(dotValueChecker.contains(".")==false && dotValueChecker==""){
                    displayLabel.setText("0.");
                    isNumberClicked=false;
                    }
                
            }
            else{
                String dotValueChecker=displayLabel.getText();
                if(dotValueChecker.contains(".")==false && dotValueChecker!=""){
                    displayLabel.setText(displayLabel.getText()+".");
                }
                else if(dotValueChecker.contains(".")==false && dotValueChecker==""){
                    displayLabel.setText(displayLabel.getText()+"0.");
                }

            }

        }
        else if(e.getSource()==equalButton){

            if(temp=="-"){
                

                if(newValueMinus==0){

                    isNumberClicked=true;
                    newValueMinus=Double.parseDouble(displayLabel.getText());

                    if(minus==0){

                        double minus1=newValueMinus;
                        double mi=oldValueMinus;
                        resultMinus=mi-minus1;
                        String answerMinus=String.format("%.2f",resultMinus);
                        displayLabel.setText(answerMinus);
                        
                        displayLabel2.setText(mi+"-"+minus1);

                    
                       }
                    }
                    else if(newValueMinus!=0){
                        isNumberClicked=true;
                        double minus2=newValueMinus;
                        displayLabel2.setText(resultMinus+"-"+minus2);
                        resultMinus=resultMinus-minus2;
                        String answerMinus=String.format("%.2f",resultMinus);
                        displayLabel.setText(answerMinus);

                        
                    }
                
            }
    
                else if(temp=="+"){

                    if(newValueAdd==0){

                        isNumberClicked=true;
                        newValueAdd=Double.parseDouble(displayLabel.getText());

                        if(add==0){

                            double add1=newValueAdd;
                            double a=oldValueAdd;
                            resultAdd=a+add1;
                            String answerAdd=String.format("%.2f",resultAdd);
                            displayLabel.setText(answerAdd);
                            
                            displayLabel2.setText(a+"+"+add1);

                        
                           }
                        }
                        else if(newValueAdd!=0){
                            isNumberClicked=true;
                            double add2=newValueAdd;
                            displayLabel2.setText(resultAdd+"+"+add2);
                            resultAdd=resultAdd+add2;
                            String answerAdd=String.format("%.2f",resultAdd);
                            displayLabel.setText(answerAdd);

                            
                        }
                    
                }
    
                else if(temp=="*"){

                    if(newValueMul==0){

                        isNumberClicked=true;
                        newValueMul=Double.parseDouble(displayLabel.getText());

                        if(mul==0){

                            double mul1=newValueMul;
                            double m=oldValueMul;
                            resultMul=m*mul1;
                            String answerMul=String.format("%.2f",resultMul);
                            displayLabel.setText(answerMul);
                            
                            displayLabel2.setText(m+"*"+mul1);

                        
                           }
                        }
                        else if(newValueMul!=0){
                            isNumberClicked=true;
                            double mul2=newValueMul;
                            displayLabel2.setText(resultMul+"*"+mul2);
                            resultMul=resultMul*mul2;
                            String answerMul=String.format("%.2f",resultMul);
                            displayLabel.setText(answerMul);

                            
                        }
                    
                }
    
                else if(temp=="/"){

                    if(newValueDiv==0){

                        isNumberClicked=true;
                        newValueDiv=Double.parseDouble(displayLabel.getText());

                        if(div==0){

                            double div1=newValueDiv;
                            double d=oldValueDiv;
                            resultDiv=d/div1;
                            String answerDiv=String.format("%.2f",resultDiv);
                            displayLabel.setText(answerDiv);
                            
                            displayLabel2.setText(d+"/"+div1);

                        
                           }
                        }
                        else if(newValueDiv!=0){
                            isNumberClicked=true;
                            double div2=newValueDiv;
                            displayLabel2.setText(resultDiv+"/"+div2);
                            resultDiv=resultDiv/div2;
                            String answerDiv=String.format("%.2f",resultDiv);
                            displayLabel.setText(answerDiv);

                            
                        }
                    
                }
                else{
                
                    String equalValueChecker=displayLabel.getText();
                    if(equalValueChecker.contains("")==false){
                        
                        if(etemp==0 && value1==0){
                            oldValue1=Double.parseDouble(displayLabel.getText());
                            value1=oldValue1;
                            String answer1=String.format("%.2f",value1);
                            displayLabel.setText(answer1);
                            etemp=value1;
                        }
                        else if(etemp!=0 && etemp!=value1) {
                            oldValue2=Double.parseDouble(displayLabel.getText());
                            value2=oldValue2;
                            String answer2=String.format("%.2f",value2);
                            displayLabel.setText(answer2);
                        }
                    }
                }

        

        }
        else if(e.getSource()==divButton){  
                    

            String z=displayLabel.getText();
            
            if(z!=""){
                newValueDiv=0;
                oldValueDiv=0;
                
                if(oldValueDiv==0){
                    isOperatorClicked=true;
                    isNumberClicked=true;  
                    temp="/";
                    div=0;
                    double q=0;
                    q=Double.parseDouble(displayLabel.getText());
                    oldValueDiv=q;
                    q=0;
                    displayLabel2.setText(oldValueDiv+"/  ");
                }
            }

        }
        else if(e.getSource()==mulButton){          

            String z=displayLabel.getText();
            if(z!=""){
                newValueMul=0;
                oldValueMul=0;
                
                if(oldValueMul==0){
                    isOperatorClicked=true;
                    isNumberClicked=true;  
                    temp="*";
                    mul=0;
                    double q=0;
                    q=Double.parseDouble(displayLabel.getText());
                    oldValueMul=q;
                    q=0;
                    displayLabel2.setText(oldValueMul+"*  ");
                }
            }

        }
        else if(e.getSource()==minusButton){

            String z=displayLabel.getText();
            if(z!=""){
                newValueMinus=0;
                oldValueMinus=0;

                if(oldValueMinus==0){
                    isOperatorClicked=true;
                    isNumberClicked=true;
                    temp="-";
                    newValueMinus=0;
                    minus=0;
                    double q=0;
                    q=Double.parseDouble(displayLabel.getText());
                    oldValueMinus=q;
                    q=0;
                    displayLabel2.setText(oldValueMinus+"-  ");
                }
            }

        }
        else if(e.getSource()==addButton){

            String z=displayLabel.getText();
            if(z!=""){
                newValueAdd=0;
                oldValueAdd=0;

                if(oldValueAdd==0){
                    isOperatorClicked=true;
                    isNumberClicked=true;
                    temp="+";
                    newValueAdd=0;
                    add=0;
                    double q=0;
                    q=Double.parseDouble(displayLabel.getText());
                    oldValueAdd=q;
                    q=0;
                    displayLabel2.setText(oldValueAdd+"+  ");
                }
            }

        }
        else if(e.getSource()==clearButton){
        
            displayLabel.setText("");
            displayLabel2.setText("");

            etemp=0;

            temp=null;

            oldValue1=0;
            oldValue2=0;
            value1=0;
            value2=0;


    

            oldValueMinus=0;
            oldValueDiv=0;
            oldValueAdd=0;
            oldValueMul=0;

            resultMinus=0;
            resultAdd=0;
            resultMul=0;
            resultDiv=0;

            newValueAdd=0;
            newValueMinus=0;
            newValueDiv=0;
            newValueMul=0;
            div=0;
            mul=0;
            add=0;
            minus=0;
            isOperatorClicked=false;
            isNumberClicked=true;
            trial="";

        }

        else if(e.getSource()==backButton){
            String mincheck1=displayLabel.getText();
            if(mincheck1.contains("-")==true){
                String bb=displayLabel.getText();
                StringBuffer sb=new StringBuffer(bb);
                sb.deleteCharAt(0);
                String ss=sb.toString();
                displayLabel.setText(ss);
            }
            else{
                trial=displayLabel.getText();
                if( trial!=""){
                
                    String bb=displayLabel.getText();
                    StringBuffer sb=new StringBuffer(bb);
                    sb.deleteCharAt(sb.length()-1);
    
                    String ss=sb.toString();
                    displayLabel.setText(ss);
    
                    bb="";
                    trial="";
    
                    displayLabel2.setText("");
                    
    
                    
    
                }
    
                
                else if(trial==""){
    
                    displayLabel.setText("");
                    displayLabel2.setText("");
    
                }
            }
            

        }

        else if(e.getSource()==plusMinusButton){
            String mincheck=displayLabel.getText();
            if(mincheck.contains("-")==true){
                String bb=displayLabel.getText();
                StringBuffer sb=new StringBuffer(bb);
                sb.deleteCharAt(0);
                String ss=sb.toString();
                displayLabel.setText(ss);
            }
            else{
                if(isNumberClicked){
                    String minValueChecker=displayLabel.getText();
                    if(minValueChecker.contains("-")==false && minValueChecker!=""){
                        displayLabel.setText("-");
                        isNumberClicked=false;
                    }
                    else if(minValueChecker.contains("-")==false && minValueChecker==""){
                        displayLabel.setText("-0");
                        isNumberClicked=false;
                        }
                    
                }
                else{
                    String minValueChecker=displayLabel.getText();
                    if(minValueChecker.contains("-")==false && minValueChecker!=""){
                        displayLabel.setText("-"+displayLabel.getText());
                    }
                    else if(minValueChecker.contains("-")==false && minValueChecker==""){
                        displayLabel.setText("-0"+displayLabel.getText());
                    }
    
                }

            }


        }

    }
}