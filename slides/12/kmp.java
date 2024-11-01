import java.util.*;

class kmp {
    char[] T, P;        // T = text, P = pattern
    int n, m;           // n = length of T, m = length of P
    int [] b;           // b = back table

    void naiveMatching() {
        for (int i = 0; i < n; i++) { // try all potential starting indices
            Boolean found = true;
            for (int j = 0; j < m && found; j++)    // use boolean flag `found'
                if (i + j >= n || P[j] != T[i + j]) // if mismatch found
                    found = false;  // abort this, shift starting index i by +1
            if (found) // if P[0 .. m - 1] == T[i .. i + m - 1]
                System.out.printf("P is found at index %d in T\n", i);
        }
    }

    void kmpPreprocess() {      // call this before calling kmpSearch()
        int i = 0, j = -1;
        b[0] = -1;              // starting values
        while (i < m) {         // pre-process the pattern string P
            while (j >= 0 && P[i] != P[j]) 
                j = b[j];       // if different, reset j using b
            i++;
            j++;                // if same, advance both pointers
            b[i] = j;   // observe i = 8, 9, 10, 11, 12 with j = 0, 1, 2, 3, 4
        }
    }           

    void kmpSearch() {    // this is similar as kmpPreprocess(), but on string T
        int i = 0, j = 0; // starting values
        while (i < n) {   // search through string T
            while (j >= 0 && T[i] != P[j]) 
                j = b[j]; // if different, reset j using b
            i++;
            j++;          // if same, advance both pointers
            if (j == m) { // a match found when j == m
                System.out.printf("P is found at index %d in T\n", i - j);
                j = b[j]; // prepare j for the next possible match
            }
        }
    }

    void run() {
        String Tstr = "I DO NOT LIKE SEVENTY SEV BUT SEVENTY SEVENTY SEVEN";
        String Pstr = "SEVENTY SEVEN";
        T = new String(Tstr).toCharArray();
        P = new String(Pstr).toCharArray();
        n = T.length;
        m = P.length;

        System.out.println(T);
        System.out.println(P);
        System.out.println();

        System.out.printf("Naive Mathing\n");
        naiveMatching();
        System.out.println();

        System.out.printf("KMP\n");
        b = new int[100010];
        kmpPreprocess();
        kmpSearch();
        System.out.println();

        System.out.printf("String Library\n");
        int pos = Tstr.indexOf(Pstr);
        while (pos != -1) {
            System.out.printf("P is found at index %d in T\n", pos);
            pos = Tstr.indexOf(Pstr, pos + 1);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new ch6_02_kmp().run();
    }
}

