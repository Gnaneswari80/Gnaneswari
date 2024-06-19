import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Grade extends Applet implements ActionListener
{
       int sum=0,avg=0,a=0;
      String str="Student Grade Calculator";
       TextField t1=new TextField(5); 
        TextField t2=new TextField(5); 
  TextField t3=new TextField(5); 
               Label tl1=new Label("Average percentage");
      Label tl2=new Label("Grade");
  Label tl3=new Label("Total");
      Label l1=new Label("maths");
      Label l2=new Label("computer science");
      Label l3=new Label("electronics");
      TextField  ma=new TextField(5);
      TextField  com=new TextField(5);
      TextField  el=new TextField(5);
      Button  enter=new Button("Enter"); 

        
      public void init()
      {
        
          l1.setBounds(50,50,100,20);
            add(l1);
            ma.setBounds(150,50,100,20);
            add(ma);
           
            l2.setBounds(50,70,100,20);
            add(l2);
            com.setBounds(150,70,100,20);
            add(com);

            l3.setBounds(50,90,100,20);
            add(l3);
             el.setBounds(150,100,100,20);
             add(el);

tl3.setBounds(50,110,100,20);
           add(tl3);
             t3.setBounds(150,130,100,20);
              add(t3);

           tl1.setBounds(50,130,100,20);
           add(tl1);
             t1.setBounds(150,160,100,20);
              add(t1);

              tl2.setBounds(50,160,100,20);
             add(tl2);
             t2.setBounds(150,190,100,20);
              add(t2);
           enter.setBounds(150,210,100,20);
              add(enter);
              enter.addActionListener(this);
             
               t1.setEditable(false);
                t2.setEditable(false);
             t3.setEditable(false);
     setBackground(Color.pink);
       
      }
public void paint(Graphics g){
g.drawString(str,10,100);}
  
     public void actionPerformed(ActionEvent e)
     {
 a=0;  
 int m,n,o;

if(ma.getText().equals("")||com.getText().equals("")||el.getText().equals(""))
a=1;

   if(a==0)
{       ////
                        m=Integer.parseInt(ma.getText());
                  n=Integer.parseInt(com.getText());
                      o=Integer.parseInt(el.getText());
                   if(m<101&&n<101&&o<101)
                      {//
                        
                                   t1.setEditable(true);
                                    t2.setEditable(true);
                                   t3.setEditable(true);
                                sum=Integer.parseInt(ma.getText())+Integer.parseInt(com.getText())+Integer.parseInt(el.getText());
                               t3.setText(Integer.toString(sum));
                              avg=sum/3;
                           if(avg>=97&&avg<=100)
                                      {
                                                t1.setText(Integer.toString(avg));
                                                    t2.setText("A+");
                                        }
                                  else  if(avg>=93&&avg<=96)
                                 {
                                 t1.setText(Integer.toString(avg));
                                           t2.setText("A");
                                }
                  
                              else  if(avg>=90&&avg<=92)
                               {
                                       t1.setText(Integer.toString(avg));
                                         t2.setText("A-");
                                 }
                                          else  if(avg>=87&&avg<=89)
                                    {
                                       t1.setText(Integer.toString(avg));
                                      t2.setText("B+");
                                   }
                               else  if(avg>=83&&avg<=86)
                                    {
                             t1.setText(Integer.toString(avg));
                            t2.setText("B");
                          }
                        else  if(avg>=80&&avg<=82)
                                      {
                             t1.setText(Integer.toString(avg));
                                 t2.setText("B-");
                                    }
                               else  if(avg>=77&&avg<=79)
                                      {
                                 t1.setText(Integer.toString(avg));
                          t2.setText("C+");
                             }
                              else  if(avg>=73&&avg<=76)
                                {
                                       t1.setText(Integer.toString(avg));
                                     t2.setText("C");
                                     }
                                                else  if(avg>=70&&avg<=72)
                                         {
                                         t1.setText(Integer.toString(avg));
                                     t2.setText("C-");
                                               }
                             else  if(avg>=67&&avg<=69)
                                 {
                                 t1.setText(Integer.toString(avg));
                               t2.setText("D+");
                         }
                               else  if(avg>=65&&avg<=66)
                                        {
                          t1.setText(Integer.toString(avg));
                            t2.setText("D");
                                 }
                                else
                                 {
                                   t1.setText(Integer.toString(avg));
                           t2.setText("F");
                               
                              }
    
                                      t1.setEditable(false);
                                    t2.setEditable(false);
                                    t3.setEditable(false);
                                     ma.setText("");
                                       com.setText("");
                                     el.setText("");
                 }//
        else{
                       t1.setText("");
                   t2.setText("");
                      t3.setText("");
                                str="Please check your marks..";
               }
    
    }////
    

}
}

/*<applet code="grade.class" width="500" height="500">
</applet>*/



