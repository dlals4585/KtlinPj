package com.ktlnpj;

import java.util.Arrays;

class Test134 {
    public static void main(String[] args){
        int[] A;
        int[] B;
        A = new int[]{1,1,2,3};
        B = new int[]{2, 2, 3, 4, 5};

        solution(A,B);
    }
    static int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n && i < m; k++) {
            if (i <= m - 1 && B[i] < A[k])
                i += 1;
            if (A[k] == B[i])
                return A[k];
        }
        return -1;
    }
}
