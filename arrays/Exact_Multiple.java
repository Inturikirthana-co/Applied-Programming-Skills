class   Exact_Multiple{
    public static void main(String[] args) {
        int num1 = 6;
        int num2=3;
        int result = exactMultiple( num1 ,  num2);
        System.out.println(result);
 
    }
    static int exactMultiple(int num1 , int num2){
        
        if(num1==0 || num2==0){
            return 3;
        }
        else if(num1%num2==0){
                return 2;
            }
            else{
                return 1;
            }

        }

    }

