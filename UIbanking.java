import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class  UIbanking extends Applet implements ActionListener
{
                      int amount,sum=0;
       int a=0,b=0,c=0;
       int ms=0;
       int pin=2024,pinc=0;
        int work=0,work2=0,work3=0;
        int count=0;
      int piem=0;
        String m1,m2,m3;
         String c1="",c2="",c3="";
       String str="",extra;
       TextField t1=new TextField(5); 
        TextField t2=new TextField("0",15); 
        Font fn=new Font("Times New Roman",Font.BOLD,20);
      Label l1=new Label("Enter Amount");
      Label l2=new Label("Balance");
      Label pinla=new Label("Enter your Pin");
      TextField pintf=new TextField(4);
      Button pinb=new Button("Login"); 
      Button with=new Button("withdraw");
       Button dep=new Button("deposite");
       Button mini=new Button("ministatement");
        
      public void init()
      {
          add(pinla);
          add(pintf);
          add(pinb);
          pinb.addActionListener(this);
                 setBackground(Color.magenta);
              
       
      }
   public void paint(Graphics g)
       {
     
                           g.setFont(fn);
                         //    g.setColor(Color.red);
                            g.drawString(str,10,200);
                         if(ms==1)
                              {
                              g.drawString(c1+"-->"+a,10,300);
                                g.drawString(c2+"-->"+b,10,320);
                           g.drawString(c3+"-->"+c,10,340);
                              ms=0;
                           }
                 

        }
     public void actionPerformed(ActionEvent e)
     {
 if(count<5)
    {  
                                          if(work==1)
                                          work2=1;

                                                                     

                                 if(work==0)
                                 {
                                                if(e.getSource()==pinb)
                                                 {
                                                           if(pin==Integer.parseInt(pintf.getText()))
                                                              {
          //PIN CHECK
                                                                            pintf.setText("");
                                                                           pintf.setEditable(false);
                                                                                   work=1;
                                                                             setBackground(Color.cyan);
                                                                            t1.setEditable(true);
                                                                             
                                                                              str=" Welcome User...";




                                                                           l1.setBounds(20,50,100,20);
            add(l1);
            t1.setBounds(150,50,100,20);
            add(t1);
         //  t1.setEditable(false);
            l2.setBounds(20,70,100,20);
            add(l2);
            t2.setBounds(150,70,100,20);
            add(t2);
             t2.setEditable(false);
             with.setBounds(150,100,100,20);
             add(with);
             dep.setBounds(150,130,100,20);
              add(dep);
             mini.setBounds(150,160,100,20);
              add(mini);
              with.addActionListener(this);
              dep.addActionListener(this);
              mini.addActionListener(this);





               
                                                                }
                                                               else
                                                              {
                                                                     str="Wrong Password Try again";
                                                                         pintf.setText("");
                                                                        count++;
                                                               }
                                            }
                             }
                         
                       

                                if(work2==1)
                             {
                                                 

                     
                                              extra=t1.getText();
                                            if(e.getSource()==pinb)
                                                     {     str="you are logined already..";
                                                         }    
                         
                                           else if(extra.equals(""))
                                           {
                                                     str="Please Enter The Amount";
                                                     work3=0;
                                              }
                                              else
                                                  {

                                                      ms=0;
                                                           amount=Integer.parseInt(t1.getText());

                                                                         if(e.getSource()==with)//withdraw block
                                                                              { 
     
                                                                                           if(sum>=amount&&amount>0)
                                                                                              {
                                                                                                        if(amount%100==0)
                                                                                                               {
                                                                                                                              sum=sum-amount;
                                                                                                                              setBackground(Color.pink);
                                                                                                                            str="your amount is deposited , total amount is "+sum;
                                                                                                                               a=b;b=c;c=amount;
                                                                                                                            c1=c2;c2=c3;c3="WithDraw";
                                                                                                                }
                                                                                                             else
                                                                                                             { str="Improper amount, total amount is "+sum;
                                                                                                            
                                                                                                                }
                                                                                          }
                                                                                       else
                                                                                          str=" Your balance is less Than Credit,Balance ="+sum;
                                                                                        
                                                                          t1.setText(""); 
                                                                              }
                                                            if(e.getSource()==dep)//deposite block
                                                         {
                    
                                                                    if(amount%100==0)
                                                                                   {
                                                                                                setBackground(Color.yellow);
                                                                                            sum=sum+amount;
                                                                                          str="your amount is deposited , total amount is"+sum;
                                                                                         a=b;b=c;c=amount;
                                                                                          c1=c2;c2=c3;c3="Deposite";
              
                                                                                   }
                                                                    else
                                                                str="Improper amount,total amount is "+sum;
                                                      t1.setText(""); 

                                                     }
                                       t2.setEditable(true);
                                   t2.setText(Integer.toString(sum));
                                   t2.setEditable(false);
                       }

                if(e.getSource()==mini)//ministatement
                     {
                                 ms=1;
                            str="";
                      }
      

                   }

   
 }//5 times only we can enter password
else
{
    
      pintf.setText(" ");
      pintf.setEditable(false);
  str="  your account is blocked...";
     
}
 repaint();
}
     
}
/*UIbanking.html
  <applet code="UIbanking.class" width="500" height="500">
  </applet>
 */






















