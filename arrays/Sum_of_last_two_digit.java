class   Sum_of_last_two_digit{
    public static void main(String[] args) {
        int num1 = 26;
        int num2=32;
        int result =sum(num1,num2);
        System.out.println(result);
 
    }
    static int sum(int num1 , int num2){
        
        return Math.abs(num1%10) + Math.abs(num2%10);

    }
}