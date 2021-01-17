package com.gv.ssj.search;

public class BinarySearchIterative {

    public boolean binarySearch(int[] array, int target, int left, int right) {

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int current = array[mid];

            if (current == target)
                return true;
            if (current > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return false;
    }
}
