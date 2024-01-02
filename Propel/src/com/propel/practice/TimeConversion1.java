package com.propel.practice;

import java.util.Arrays;

public class TimeConversion1 {

	public static void main(String[] args) {
		String[] input1 = {"12:15PM-02:00PM", "09:00AM-10:00AM", "10:30AM-12:00PM"};
		String[] input2 = {"12:15PM-02:00PM", "09:00AM-12:11PM", "02:02PM-04:00PM"};
		String[] input3 = {"10:00AM-12:30PM", "02:00PM-02:45PM", "09:10AM-09:50AM"};

		String output1 = ArrayChallenge(input1);
		String output2 = ArrayChallenge(input2);
		String output3 = ArrayChallenge(input3);
		System.out.println(output1);
		System.out.println(output2);
		System.out.println(output3);
	}

	private static String ArrayChallenge(String[] strArr) {
		int[] startTimes = new int[strArr.length];
		int[] endTimes = new int[strArr.length];
		int idx = 0;
		for(String event: strArr) {
			String[] times = event.split("-");
			startTimes[idx] = convertToMinutes(times[0]);
			endTimes[idx] = convertToMinutes(times[1]);
			idx++;
		}
		Arrays.sort(startTimes);
		Arrays.sort(endTimes);
		
		int maxFreeTime = 0;
		for(int i=1;i<startTimes.length;i++) {
			int freeTime = startTimes[i] - endTimes[i - 1];
			if(freeTime > maxFreeTime) {
				maxFreeTime = freeTime;
			}
		}
		
		int hours = maxFreeTime / 60;
		int minutes = maxFreeTime % 60;
		return String.format("%02d:%02d", hours, minutes);
	}
	
	public static int convertToMinutes(String time) {
		String[] parts = time.split(":");
		int hours = Integer.parseInt(parts[0]);
		int minutes = Integer.parseInt(parts[1].substring(0,2));
		
		if(time.contains("PM") && hours != 12) {
			hours += 12;
		}else if(time.contains("AM") && hours == 12) {
			hours = 0;
		}
		
		return hours * 60 + minutes;
	}

}
