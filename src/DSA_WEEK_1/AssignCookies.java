package DSA_WEEK_1;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        System.out.println(noOfChildrensSatisfy(g, s));
    }

    public static int noOfChildrensSatisfy(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0; // pointer for children [] g
        int j = 0; // pointer for cookies  [] s

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++; // move to the next children
            }
            j++; // move to the new cookie
        }
        return i;

    }
}
