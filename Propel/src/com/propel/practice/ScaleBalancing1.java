package com.propel.practice;

import java.util.Arrays;

public class ScaleBalancing1 {

	public static void main(String[] args) {
		String[] input1 = {"[3, 4]", "[1, 2, 7, 7]"};
        String[] input2 = {"[13, 4]", "[1, 2, 3, 6, 14]"};
        String out1 = scaleBalancing(input1);
        String out2 = scaleBalancing(input2);

        System.out.println(out1);
        System.out.println(out2);
	}

	private static String scaleBalancing(String[] strArr) {
		String[] weights = strArr[0].replaceAll("[\\[\\]]", "").split(", ");
		int leftWeight = Integer.parseInt(weights[0]);
		int rightWeight = Integer.parseInt(weights[1]);
		
		String[] availableWeightsStr = strArr[1].replaceAll("[\\[\\]]", "").split(", ");
		int[] availableWeights = new int[availableWeightsStr.length];
		for(int i=0;i<availableWeightsStr.length;i++) {
			availableWeights[i] = Integer.parseInt(availableWeightsStr[i]);
		}
		
		if(rightWeight == leftWeight) {
			return "";
		}
		
		//check for only one weight
		for(int weight: availableWeights) {
			if(leftWeight+weight == rightWeight || rightWeight+weight == leftWeight) {
				return Integer.toString(weight);
			}
		}
		
		for(int i=0;i<availableWeights.length-1;i++) {
			for(int j=i+1;j<availableWeights.length;j++) {
				int combinedWeight = availableWeights[i] + availableWeights[j];
				if(leftWeight+combinedWeight == rightWeight || rightWeight+combinedWeight == leftWeight) {
					int[] result = {availableWeights[i], availableWeights[j]};
					Arrays.sort(result);
					return result[0]+","+result[1];
				}
			}
		}
		return "not possible";
	}
	
}
