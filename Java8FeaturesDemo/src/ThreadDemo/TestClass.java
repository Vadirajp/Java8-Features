package ThreadDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestClass {
	
	static int minParkingSpaces(int[][] parkingStartEndTimes) {
        int count=1; int release=0;
        int startTime = parkingStartEndTimes[0][0];
        int endTime = parkingStartEndTimes[0][1];
		for(int i=1;i<parkingStartEndTimes.length;i++) {
			int start1 = parkingStartEndTimes[i][0];
			int end1 = parkingStartEndTimes[i][1];
			
			
			//List<Integer> betweenNo = getNumbers(start1,end1);
			List<Integer> betweenNo = getNumbersUsingIntStreamRangeClosed(start1, end1);
			//System.out.println(betweenNo);
			if(betweenNo.contains(startTime)) {
				count++;
			}else if(betweenNo.contains(endTime)) {
				count++;
			}else {
				release++;
			}
			
			startTime = start1;
			endTime=end1;
			
		}
		if(count-release>0)
			return count-release;
		else
			return count;
	}
	
	public static List<Integer> getNumbers(int start1, int end1) {
		List<Integer> nums = new ArrayList<Integer>();
		for(int i=start1;i<=end1;i++) {
			nums.add(i);
		}
		return nums;
	}
	
	public static List<Integer> getNumbersUsingIntStreamRangeClosed(int start, int end) {
	    return IntStream.rangeClosed(start, end)
	      .boxed()
	      .collect(Collectors.toList());
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		int[][] parkingStartEndTimeList = new int[n][2];
		String[] parkingStartEndTimes = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
		String[] parkingStartEndTime = parkingStartEndTimes[i].split(",");
		for (int j = 0; j < parkingStartEndTime.length; j++) {
		parkingStartEndTimeList[i][j] = Integer.parseInt(parkingStartEndTime[j]);
		}
		}

		int out = minParkingSpaces(parkingStartEndTimeList);
		System.out.println(out);

		wr.close();
		br.close();
	}
	
}
