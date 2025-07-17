public class MaxSubSum {

    static int maxSubSum(int[] arr)
    {
        int result = arr[0];
        int maxEnding = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]); //max compares which one is the largest

            result = Math.max(result, maxEnding);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubSum(arr));
    }
}
