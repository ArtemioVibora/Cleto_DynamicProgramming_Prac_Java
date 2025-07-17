public class MaxProdArray {

    static int findMaxProd(int[] arr)
    {
        int result = arr[0];
        int maxProd = arr[0];
        int minProd = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            int temp = maxProd;

            maxProd = Math.max(Math.max(arr[i], maxProd * arr[i]), minProd * arr[i]);
            minProd = Math.min(Math.min(arr[i], temp * arr[i]), minProd * arr[i]);

            result = Math.max(result, maxProd);

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 6, -3, -10, 0, 2 };
        System.out.println(findMaxProd(arr));
    }
}
