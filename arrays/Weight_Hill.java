class Weight_Hill
{   
    public static void main(String[] args)
    {
        int input1 = 5;   
        int input2 = 10;  
        int input3 = 2;   

        Weight_Hill obj = new Weight_Hill();
        int result = obj.hillWeight(input1, input2, input3);
        System.out.println(result);
    }

    public int hillWeight(int input1, int input2, int input3)
    {
        int totalWeight = 0;

        for (int i = 1; i <= input1; i++)
        {
            int weightPerStar = input2 + (i - 1) * input3;
            totalWeight = totalWeight + (i * weightPerStar);
        }

        return totalWeight;
    }
}