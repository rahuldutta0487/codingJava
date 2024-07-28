package com.Rahul;

public class Sortedmatrix {
    public static void main(String[] args) {

    }

    //search in the row provided between the colowm provided
    static int[] binarySearch(int[] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrs, int target) {
        int rows = matrs.length;
        int cln = matrs[0].length;

        if (rows == 1) {
            return binarySearch(matrs, 0, 0, cln - 1, target);
        }
        // run the loop till two rows are remaining
        int rowstart = 0;
        int rowend = rows - 1;
        int cMid = cln / 2;
        while (rowstart < (rowend - 1)) {
            int mid = rowstart + (rowend - rowstart) / 2;
            if (matrs[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrs[mid][cMid] < target) {
                rowstart = mid;
            } else {
                rowend = mid;
            }
        }
        //now we have two rows


    }
}
