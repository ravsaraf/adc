import java.util.*;

 public class Res{

public static void main(String[] args){

Scanner reader=new Scanner(System.in); 
int a[]=new int[45];
int num=reader.nextInt();
int i=0;
while(num>0){

a[i]=num%2;
num=num/2;
i++;
}

for(int j=i-1;j>=0;j--){

System.out.print(a[j]);

}
}
}