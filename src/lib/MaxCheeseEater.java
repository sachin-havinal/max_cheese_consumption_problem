package lib;

public class MaxCheeseEater {

    public int getMaxCheeseConsumption(int[] arr, int N) {
        int consumed = arr[0];
        int skip    = 0;
        int skip_new = 0;

        for (int i = 1; i < N; i++) {
            skip_new = (consumed > skip) ? consumed : skip;
            consumed = skip + arr[i];
            skip = skip_new;
        }
        return ((consumed > skip) ? consumed : skip);
    }
}
