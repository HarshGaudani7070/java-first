class harsh9 {
    public static void main(String[] harsh) {

        int num = 10;
        int i, fact = 1;

        for (i = 1; i <= num; i++) {
            fact = i * fact;
        }
        System.out.println("Ans=" + fact);
    }
}