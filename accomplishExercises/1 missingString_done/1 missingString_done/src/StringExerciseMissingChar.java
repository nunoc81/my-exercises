class StringExerciseMissingChar {
    public static void main(String[] args) {

        String word = "Robocop";
        int characterIndex = 3;

        if (args.length >=2) {
            word = args[0];
            characterIndex=Integer.parseInt(args[1]);
        }

        // Robocop
        // 0123456

        // cut all the chars till the characters Index
        //Rob
        String front = word.substring(0,characterIndex);
        // cut all chars beginning at character Index plus one
        // "cop"
        String back = word.substring(characterIndex +1);

        System.out.println(word);
        System.out.println(front+back);
    }
}