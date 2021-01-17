package com.gv.ssj.search;

public class BinarySearchRecursive {


    private boolean binarySearch(int[] array, int target, int left, int right) {

        if (left > right)
            return false;

        int mid = left + (right - left) / 2;
        int current = array[mid];

        if (target == current)
            return true;

        if (target > current)
            return binarySearch(array, target, mid + 1, right);
        else
            return binarySearch(array, target, left, mid - 1);

    }
}
