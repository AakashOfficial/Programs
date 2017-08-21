/* Calculation of CRC (Cyclic Redundancy Check)*/

#include< stdlib.h>
#include< conio.h>
#include< stdio.h>
void main()
{
int i,j,n,g,a,arr[20],gen[20],b[20],q[20],s;
clrscr();
printf("Transmitter side:");
printf("\nEnter no. of data bits:");
scanf("%d",&n);
printf("Enter data:");
for(i=0;i< n;i++)
scanf("%d",&arr[i]);

printf("Enter size of generator:");
scanf("%d",&g);
do{
printf("Enter generator:");
for(j=0;j< g;j++)
scanf("%d",&gen[j]);

}
while(gen[0]!=1);
printf("\n\tThe generator matrix:");
for(j=0;j< g;j++)
printf("%d",gen[j]);

a=n+(g-1);
printf("\n\tThe appended matrix is:");
for(i=0;i< j;++i)
arr[n+i]=0;

for(i=0;i< a;++i)

printf("%d",arr[i]);

for(i=0;i< n;++i)
q[i]= arr[i];

for(i=0;i< n;++i)
{
if(arr[i]==0)
{
for(j=i;j< g+i;++j)
arr[j] = arr[j]^0;
}
else
{
arr[i] = arr[i]^gen[0];
arr[i+1]=arr[i+1]^gen[1];
arr[i+2]=arr[i+2]^gen[2];
arr[i+3]=arr[i+3]^gen[3];
}
}
printf("\n\tThe CRC is :");
for(i=n;i < a;++i)
printf("%d",arr[i]);
s=n+a;
for(i=n;i< s;i++)
q[i]=arr[i];
printf("\n");
for(i=0;i< a;i++)
printf("%d",q[i]);
getch();
}