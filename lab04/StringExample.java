class StringExample {
    public static void main(String[] args) {
        String varStr1 = "строка 1";
        String varStr2 = "Строка 1 ";

        char[] charData = {'w', 'e', 'l', 'c', 'o', 'm', 'e'};
        String varStr100 = new String(charData, 3, 4);
        //System.out.println(varStr2);

        char[] chars = new char[varStr1.length()];
        varStr1.getChars(0, chars.length-2, chars, 2);

        for (int i = 0; i < chars.length; ++i) {
            System.out.print((int)chars[i]);
        }


        System.out.println();

        String pushkin = "Мой дядя самых честных правил ...";

        System.out.println(pushkin.indexOf("Дядя"));
    }
}