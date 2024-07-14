package com.fhr.play.crescent;

public class PlayGroundOfAlgos {

	public static void main(String[] args) {
		System.out.println(11 / 2);
		int maxFloorNo = Integer.parseInt(args[0]);
		int ballBreakingFloorNo = Integer.parseInt(args[1]);
	}

	private static void findTheBallBreakingFloor(int maxFloorNo, int ballBreakingFloorNo) {
		int median = getMedianNo(maxFloorNo);
		if(median > ballBreakingFloorNo) {
			median = getMedianNo(median);
		}
		for (int i = median; i <= median; i++) {
			if (median != ballBreakingFloorNo) {
				median = getMedianNo(median);
			} else {
				break;
			}
		}
	}

	private static int getMedianNo(int number) {
		return number / 2;
	}
}
