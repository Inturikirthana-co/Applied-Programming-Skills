public class Is_odd {
    public static int isEven() {
        int input1 = 18;   

        if (input1 % 2 != 0) {
             return 2;   
        } else {
            return 1;   
        }
    }

        public static void main(String[] args) {
            System.out.println(isEven());
        }
    }