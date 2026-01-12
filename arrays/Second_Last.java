class Second_Last{
    public static void main(String[] args) {
        int num = -7;
        int result =secondlast(num);
        System.out.println(result);
 
    }
    static int secondlast(int num){
        if (Math.abs(num)>9){
            return Math.abs(num/10)%10;
        }
        else{
            return -1;
        }
    }
}