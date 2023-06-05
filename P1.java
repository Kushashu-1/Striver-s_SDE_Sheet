//Set Matrix Zero
//Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix.

import java.io.*;
import java.util.*;

public class P1 {
    public static void setZeros(int mat[][]) {
        int frow = 0;
        int fcol = 0;
        int n = mat.length;
        int m = mat[0].length;
        for (int i = 0; i < n; i++)
            if (mat[i][0] == 0)
                fcol = 1;
        for (int i = 0; i < m; i++)
            if (mat[0][i] == 0)
                frow = 1;
        for (int i = 1; i < n; i++)
            for (int j = 1; j < m; j++)
                if (mat[i][j] == 0)
                    mat[i][0] = mat[0][j] = 0;
        for (int i = 1; i < n; i++)
            for (int j = 1; j < m; j++)
                if (mat[i][0] == 0 || mat[0][j] == 0)
                    mat[i][j] = 0;

        for (int i = 0; i < n && fcol == 1; i++)
            mat[i][0] = 0;
        for (int i = 0; i < m && frow == 1; i++)
            mat[0][i] = 0;
    }
}