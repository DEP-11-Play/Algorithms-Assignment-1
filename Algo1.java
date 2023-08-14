public class Algo1{
    public static void main(String[] args) {
        //Fn=Fn-1 +Fn-2
       int x=4;
        int y=0;
        int[] f=new int[x];
        f[0]=0;
         f[1]=1;
       
            do{
                if(y==0) {f[y]=0; ;}
                else if (y==1){f[y]=1; ;}
                else  {
                    f[y]=f[y-1]+f[y-2];
                   
                }
               y++;
                System.out.println(f[y]+" "+f[y-1]+f[y-2]); 
            }while(y==x+1);
           
       
    }
    
}