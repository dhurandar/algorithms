/**
 * Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*'.
 *
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * The matching should cover the entire input string (not partial).
 *
 * Note:
 *
 * s could be empty and contains only lowercase letters a-z.
 * p could be empty and contains only lowercase letters a-z, and characters like . or *.
 */
public class Regexpresssion {

    public boolean match(String input,String pattern) {
        if(input.equals(pattern)) {
            return true;
        }
        if(pattern == null) return (input == null);
        if(pattern.isEmpty()) return input.isEmpty();

        for(int i = 0 ; i < input.length()-1;i++) {
            char curPattern = pattern.charAt(i);
            if(curPattern == input.charAt(i)) {
                continue;
            }else if()
            {
            }else if (curPattern == '.') {
                continue;
            }else if (curPattern == '*') {
                if(pattern.charAt(i-1) == '.')
                    return true;
                continue;
            } else if{
                return false;
            }
        }

        return true;

    }
}
