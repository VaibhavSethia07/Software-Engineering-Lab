import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class jUnitTesting {

	public long addNumbers(long num1, long num2) {
		if (num1 > Long.MAX_VALUE || num2 > Long.MAX_VALUE) {
			System.out.print("Overflow during additon\n");
			return -1;
		}
		return num1 + num2;
	}

	public String addStrings(String S1, String S2) {
		return S1 + S2;
	}

	public static void main(String[] args) throws Exception {
		jUnitTesting unitTest = new jUnitTesting();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long num1 = Long.parseLong(br.readLine());
		long num2 = Long.parseLong(br.readLine());
		String S1 = br.readLine();
		String S2 = br.readLine();
		long result = unitTest.addNumbers(num1, num2);
		if (result != -1)
			bw.write("Addition of " + num1 + " and " + num2 + ": " + result + "\n");

		bw.write("Concatennation of " + S1 + " and " + S2 + ": " + unitTest.addStrings(S1, S2) + "\n");
		;
		bw.flush();
		bw.close();
	}

}
