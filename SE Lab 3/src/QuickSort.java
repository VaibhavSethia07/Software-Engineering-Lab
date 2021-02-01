import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class QuickSort {

	private void quickSort(long nums[], int start, int end) {
		if (start >= end)
			return;

		int p = partition(nums, start, end);
		quickSort(nums, start, p - 1);
		quickSort(nums, p + 1, end);
	}

	private int partition(long nums[], int start, int end) {
		int ind = start - 1;

		for (int i = start; i < end; i++) {
			if (nums[i] <= nums[end]) {
				ind++;
				swap(nums, ind, start);
			}
		}
		ind++;
		swap(nums, ind, end);

		return ind;
	}

	private void swap(long nums[], int i, int j) {
		long temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	private void printNums(long nums[], int N) throws Exception {
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int i = 0; i < N; i++) {
			out.write(nums[i] + " ");
		}

		out.close();
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		long nums[] = Arrays.stream(br.readLine().split("\\s+")).mapToLong(Long::parseLong).toArray();

		QuickSort qs = new QuickSort();
		qs.quickSort(nums, 0, N - 1);
		qs.printNums(nums, N);

	}

}
