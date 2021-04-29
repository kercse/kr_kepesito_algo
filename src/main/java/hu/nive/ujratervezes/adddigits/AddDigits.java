package hu.nive.ujratervezes.adddigits;

public class AddDigits {
    public int addDigits(String input) {

        int result = -1;
        if (input.equals("") || input.equals(null)) {
            return -1;
        }else {
            result = 0;
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (Character.isDigit(c)) {
                    int digit = Integer.parseInt(String.valueOf(c));
                    result = result + digit;
                }

            }
        }
        return result;
    }
}

