#include<stdio.h> 
#include<conio.h>
#include<math.h> 
int main() 
{     
int i,j,k,n,p;     
float a[20][20],c, term,pivot;
clrscr();
printf("Date:2074/11/30\n");
printf("\t\tName:Aasish Shah\n");
printf("\t\tRoll No.:01\n");
printf("\nEnter the size of matrix: ");     
scanf("%d",&n);                   
printf("\Read the coefficient of augmented matrix row-wise:\n");     
for(i=0; i<n; i++)
{         
for(j=0; j<n+1; j++)
{             
printf(" a[%d][%d]:", i,j);             
scanf("%f",&a[i][j]);         
}     
} 
for(k=0; k<n; k++)
//ellimination 
{        
pivot = a[k][k];         
for(p=0; p<n+1; p++)
{             
a[k][p] = a[k][p]/pivot; 
//Normalization         
}         
for(i=0; i<n; i++)
{             
term = a[i][k];             
if(k!=i)
{                 
for(j=0; j<n+1;j++)
{ 
                    a[i][j] = a[i][j]-a[k][j]*term;                 
}             
}         
}     
}     
printf("\nThe solution is:\n");     
for(i=0; i<n; i++) 
//Display solution vector 
{         
printf("\n x%d=%f\n",i,a[i][3]);     
}
getch();
 return 0; 
}
