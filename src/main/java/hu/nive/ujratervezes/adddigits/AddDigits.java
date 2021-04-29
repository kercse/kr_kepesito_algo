package hu.nive.ujratervezes.adddigits;

public class AddDigits {
    public int addDigits(String input) {

        int result = -1;

        if (input != null) {

            input = input.replaceAll("[^0-9]", "");
            input.trim();

            if (input.length() > 0) {
                result = 0;
                char[] charArray;
                charArray = input.toCharArray();
                for (int i = 0; i < charArray.length; i++){
                    result = result + charArray[i];
                }
            }
        }
        return result;

    }


    //todo: implement your solution here
}
