class ABG
{
    public static void main(String[] args)
    {
        int alpha = min(156);
        int beta = min(265);
        int gamma = min(751);
        System.out.println((alpha*100) +( beta*10 )+ (gamma));
    }

    static int min(int num){
        

        int low=9;
        while (num>0){
            int digit=num%10;
            if(digit<low){
                low=digit;
            }
            num=num/10;
        }
        return low;
    }
}