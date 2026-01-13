class Not_repeating
{
    public static void main(String[] args)
    {
        int num=1015;
        
        int result = Notrepeating(num);
        System.out.println(result);
    }

    static int Notrepeating(int n)

    {
        
        int[] seen=new int[10];
        while (n>0){
            int digit=n%10;
            seen[digit]++;
            n=n/10;
        }
        int count=0;
        for(int i=0;i<seen.length;i++){
            if(seen[i]==1){
                count++;
            }
        }
        return count;
        
    }
}