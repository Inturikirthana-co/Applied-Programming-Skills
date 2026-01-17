class  Sum_of_digit
{
    public static void main(String[] args)
    {
        int num = 26568;
        int result = sum(num);
        System.out.println(result);
    }

    static int sum(int num){
        int sign=1;

        if(num<0){
            sign=-1;
            num=Math.abs(num);

        }
        while(num>9){
            int sum=0;
            while(num>0){
                int digit=num%10;
                sum=sum+digit;
                num=num/10;
            }
            num=sum;
        }
        return sign*num;

       
    }
       
}