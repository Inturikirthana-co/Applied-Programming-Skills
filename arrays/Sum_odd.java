class  Sum_odd
{
    public static void main(String[] args)
    {
        int num = 26568;
        int result = sum(num);
        System.out.println(result);
    }

    static int sum(int num){
        int sum=0;
        while(num>0){
            int digit=num%10;
            if(digit%2!=0){
                sum=sum+digit;
                
                
            }
            num=num/10;
            
            
        }
        return sum;
    }
        

       
}
       