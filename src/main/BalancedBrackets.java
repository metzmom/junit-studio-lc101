package main;


public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;// SETS brackets to zero
        boolean hitLeft = false;
        boolean hitRight = false;

        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                hitLeft = true;
                brackets++;
            } else if (ch == ']') {
                hitRight = true;
                brackets--;
            }
            if (hitLeft == false && hitRight == true) {
                return false; //returns false if hits right  bracket before left bracket
            }
            if (hitLeft == true && hitRight == true){
                hitLeft = false;
                hitRight = false;
            }
        }//end of  for loop
        return brackets == 0;//COMPARES brackets to zero equal is true, not equal is false
    }//end of method

}//end of class


















