public class binarySearch {
        public static int binarySearch(int[] sortedArr , int searchKey) {
        int left = 0, right = sortedArr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (sortedArr[mid] == searchKey)
                return mid;
            if (sortedArr[mid] < searchKey)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main (String[] args) {
        int arr[] = [10,20,30,45,155,120];
        System.out.println(binarySearch(arr , 45));
    }
}