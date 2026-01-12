class Secondlastdigit {

    static int Secondlastdigit() {
        int num = -197;     

        return Math.abs((num / 10) % 10);
    }

    public static void main(String[] args) {
        System.out.println(Secondlastdigit());
    }
}
