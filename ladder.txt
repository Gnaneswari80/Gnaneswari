#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<graphics.h>
#include<time.h>

//int player1
//static count;
struct node
{
int item;
struct  node *next;
};
int sneekers(int doop)
{
int yy=0;
   if(doop==17)
  { doop=7;yy=1;}
   else if(doop==62)
 {  doop=19;yy=1;}
   else if(doop==87)
{   doop=24;yy=1;}
   else if(doop==54)
 {  doop=34; yy=1;}
   else if(doop==93)
{   doop=73; yy=1;}
   else if(doop==98)
{   doop=79; yy=1;}
if(yy==1)
printf("\tYou got sneekerto %d",doop);
   return doop;
   }
   int ladder(int ladd)
   {
   int ll=0;
      if(ladd==2)
      {ladd=38;ll=1;}
      else if(ladd==4)
{      ladd=14;ll=1;}
      else if(ladd==9)
{      ladd=31;ll=1;}
      else if(ladd==21)
{      ladd=42;ll=1;}
      else if(ladd==28)
{      ladd=84;ll=1;}
      else if(ladd==51)
{      ladd=67;ll=1;}
if(ll==1)
printf("\tYou got ladder to %d..",ladd);
      return ladd;
      }
      int values()
      {
      struct node *ptr,*ptr1;
	int  value,
	*low,n,high=ptr-ptr1;

       srand(time(NULL));
	value =rand()%6;
      //	}while(value<7);
	printf("%d..dice",value);
	if(value==0)
	{
	 value=high%6;
	 printf("*****%d",value);}
	 if(value==0) //////
	value=high%4; /////////////
	 printf("////%d",value);
	return value;
	}

    void main()
    {
      int player1=0,player2=0,i,j,k,janu=0;
      char ch='1',ch2,ch3;
      int  cg,kk=0;
      clrscr();
      cg=1;
  //    printf("\n");
      do
      {

      for(i=100;i>=1;i--)
   {
   textbackground(2);



	    if(player1==i)
	    {
	    cprintf("  "); k=1;}
	    if(player2==i)
	    {
	    textbackground(5);
	      cprintf("  ");k=1;}
	    if(k==0)
	      printf("%d ",i);
	      k=0;
	      if(i%10==1)
	      printf("\n\n");
  }
      if(cg==1)
      {//
      printf("\nplayer 1.");
      textcolor(2);cprintf("  ");
      printf(". press y to throw DICE");
      scanf("%s",&ch2);
      if(ch2=='y')
      {
      k=values();
      k=player1+k;
      if(k<=100) //
      player1=k;//
      printf("\tpress any key to move coin");
      scanf(" %c",&ch3);
      }
      else
      goto last;
      }  //
      else
      {
      textbackground(5);              //to get rANDOM NUMBER
      printf("\nplayer 2");cprintf("  ");printf("..press enter y to throw DICE");
      scanf("%s",&ch2);
      if(ch2=='y')
      {
       k=values();
       k=player2+k;
       printf("\npress any key to move coin");
       scanf(" %c",&ch3);
       if(k<=100)
       player2=k;
       }
   else
   goto last;
   }
   /////////////////////////
   if(cg==1)
   player1=sneekers(player1);
   else if(cg==2)
   player2=sneekers(player2);
   if(cg==1)
   player1=ladder(player1);
   else if(cg==2)
   player2=ladder(player2);
   k=0;printf("\n");
/*   for(i=100;i>=1;i--)
   {
   textcolor(2);



	    if(player1==i)
	    {
	    cprintf("p1 "); k=1;}
	    if(player2==i)
	    {
	      cprintf("k ");k=1;}
	    if(k==0)
	      printf("%d ",i);
	      k=0;
	      if(i%10==1)
	      printf("\n\n");
  }*/
	      if(cg==1)
	      {
	      cg=2;
	      //janu=1;
	      }
	      else
	      {
	       cg=1;
	       }
	       if(player1==100)
	       {printf("\nPlayer 1 is the winner"); goto last;
	       }
	       if(player2==100)
	       {
		printf("\nPlayer2 is the winner");
		goto last;
		}
	       //}
	   }while(player1!=100||player2!=100);
	   last:
	   getch();
	   }






