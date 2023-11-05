import io.github.pixee.security.BoundedLineReader;
import java.util.*;
import java.io.*;
public class MergeSort {
	
	private void mergeSort(long num[],int start,int end) {
		if(start>=end)
				return;
		
		int mid=start+(end-start)/2;
		mergeSort(num,start,mid);
		mergeSort(num,mid+1,end);
		merge(num,start,mid,end);
	}
	
	private void merge(long nums[],int start,int mid,int end) {
		int N1=mid-start+1;
		int N2=end-mid;
		long left[] = new long[N1];
		long right[] = new long[N2];
		
		for(int i=0;i<N1;i++) {
			left[i]=nums[start+i];
		}
		
		for(int i=0;i<N2;i++) {
			right[i]=nums[mid+1+i];
		}
		
		int p=0,q=0,k=start;
		while(p<N1 && q<N2) {
			if(left[p]<right[q]) {
				nums[k++]=left[p++];
			}else {
				nums[k++]=right[q++];
			}
				
		}
		
		while(p<N1) {
			nums[k++]=left[p++];
		}
		
		while(q<N2) {
			nums[k++]=right[q++];
		}
 	}
	
	private void printNums(long nums[],int N) throws Exception {
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0;i<N;i++) {
			out.write(nums[i]+" ");
		}
		out.close();
	}
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(BoundedLineReader.readLine(br, 5_000_000));
		long nums[] = Arrays.stream(BoundedLineReader.readLine(br, 5_000_000).split("\\s+")).mapToLong(Long::parseLong).toArray();
		
		MergeSort ms = new MergeSort();
		ms.mergeSort(nums, 0, N-1);
		ms.printNums(nums, N);
	}

}
