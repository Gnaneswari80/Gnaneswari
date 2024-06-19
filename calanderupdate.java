import java.util.Scanner;
class calanderupdate
{
 public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
  int date,month=0,year;
int temp,rem;
int total,ks,i,j,last=0;
  int F,m,D,c,d,k=0,ka;
  System.out.println("Enter Year:");
  year=sc.nextInt();
temp=year;
temp=temp-1;
for(total=1;total<=12;total++)
{/////////////////////////////////////////////////////////////////////////
  ka=1;//date
if(total==1)
m=11;
else if(total==2)
m=12;
else
m=total-2;

if(total<=2)
{
 D=temp%100;
 c=temp/100;
}
else
{
D=year%100;
c=year/100;
}
F=ka+((13*m-1)/5)+D+(D/4)+(c/4)-2*c;
rem=F%7;
if(rem<0)
rem=rem+7;    
if(total==1)
  System.out.println("Jan");
   if(total==2)
  System.out.println("Feb");
if(total==3)
  System.out.println("Mar");
if(total==4)
  System.out.println("Apr");
if(total==5)
  System.out.println("May");
if(total==6)
  System.out.println("Jun");
if(total==7)
  System.out.println("Jul");
if(total==8)
  System.out.println("Aug");
if(total==9)
  System.out.println("Sep");
if(total==10)
  System.out.println("Act");
if(total==11)
  System.out.println("Nov");
if(total==12)
  System.out.println("Dec");
  System.out.println("");

if(rem==0)
{
k=6;}//sun
else if(rem==1){
k=0;}//mon
else if(rem==2){
k=1;}//tue
else if(rem==3){
k=2;}//wed
else if(rem==4){
k=3;}//thur
else if(rem==5){
k=4;}//fri
else if(rem==6){
k=5;}//sat
////
month=total;
if(month==1)
last=31;
if(month==2)
{
    if((year%400==0)||((year%100!=0)&&(year%4==0)))
    last=29;
    else
    last=28;

}
if(month==3)
last=31;
if(month==4)
last=30;
if(month==5)
last=31;
if(month==6)
last=30;
if(month==7)
last=31;
if(month==8)
last=31;
if(month==9)
last=30;
if(month==10)
last=31;
if(month==11)
last=30;
if(month==12)
last=31;
System.out.println("mon  tue  wed  thu  fri  sat  sun");
for(i=0;i<k;i++)
{
System.out.print("     ");
}
ks=i;
k=1;
for(i=1;i<=last;i++)
{
if(i<10)
System.out.print(i+"    ");
else///////////to get gap for1to 9
System.out.print(i+"   ");
if(k==1)
{
   if(ks>0)//0 vastheh line break so
   { 
   if(ks%6==0)
   {
    System.out.println();ks=0;k=0;
   }
  }
   
}
if(k==0)
{
if(ks%7==0)
{
System.out.println();ks=0;
}
}
ks++;

}
System.out.println();
  System.out.println();
}//////////////////////////////////////////////////////

}
}