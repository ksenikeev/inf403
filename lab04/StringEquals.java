class StringEquals {
    public static void main(String[] args) {
        String varStr1 = new String("Строка 1");
        String varStr2 = new String("Строка 1");

        //varStr1 = varStr1 + "";
        //varStr2 = varStr2 + "";

        System.out.println(varStr1.equals(varStr2));
    }
}