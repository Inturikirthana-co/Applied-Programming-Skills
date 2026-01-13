class Unique_digit
{
    public static void main(String[] args)
    {
        int num=1015;
        
        int result = unique(num);
        System.out.println(result);
    }

    static int unique(int n)

    {
        int count=0;
        int[] seen=new int[10];
        while (n>0){
            int digit=n%10;
            if(seen[digit]==0){
                count++;
            }
            seen[digit]++;
            n=n/10;
        }
        return count;

       

        
    }
}