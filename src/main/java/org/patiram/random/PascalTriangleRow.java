package org.patiram.random;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleRow {
    private int getNum(int row, int col) {
        if (row == 0 || col == 0 || row == col) {
            return 1;
        }

        int a = getNum(row - 1, col - 1);
        int b = getNum(row - 1, col);
        return a+b;
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            ans.add(getNum(rowIndex, i));
        }

        return ans;
    }

    public static void main(String[] args) {
        PascalTriangleRow pascalTriangleRow = new PascalTriangleRow();
        System.out.println(pascalTriangleRow.getRow(4).toString());
    }
}
