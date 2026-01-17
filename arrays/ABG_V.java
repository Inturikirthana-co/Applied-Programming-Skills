class ABG_V
{
    public static void main(String[] args)
    {
        int input1=123;
        int input2=582;
        int input3=175;
        int  one =Math.min(input1%10,Math.min(input2%10,input3%10)); 
        int  ten= Math.min((input1/10)%10,Math.min((input2/10)%10,(input3/10)%10));
        int hun =Math.min((input1/100)%10,Math.min((input2/100)%10,(input3/100)%10));

        int max=0;
        max=Math.max(max,getmax(input1));
        max=Math.max(max,getmax(input2));
        max=Math.max(max,getmax(input3));
        System.out.println((max*1000)+(hun*100) +( ten*10 )+ (one));
    }

    static int getmax(int num){
        

        int max=0;
        while (num>0){
            int digit=num%10;
            if(digit>max){
                max=digit;
            }
            num=num/10;
        }
        return max;
    }
}