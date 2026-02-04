// Last updated: 2/4/2026, 1:29:40 PM
class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums);
        return nums;
    }

    void mergeSort(int[] a) {
        if (a.length <= 1) return;

        int mid = a.length / 2;

        int[] left = new int[mid];
        int[] right = new int[a.length - mid];

        for (int i = 0; i < mid; i++)
            left[i] = a[i];
        for (int i = mid; i < a.length; i++)
            right[i - mid] = a[i];

        mergeSort(left);
        mergeSort(right);

        merge(a, left, right);
    }

    void merge(int[] a, int[] l, int[] r) {
        int i = 0, j = 0, k = 0;

        while (i < l.length && j < r.length) {
            if (l[i] < r[j])
                a[k++] = l[i++];
            else
                a[k++] = r[j++];
        }

        while (i < l.length)
            a[k++] = l[i++];

        while (j < r.length)
            a[k++] = r[j++];
    }
}