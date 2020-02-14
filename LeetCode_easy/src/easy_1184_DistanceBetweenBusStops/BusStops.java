package easy_1184_DistanceBetweenBusStops;

import java.util.ArrayList;
import java.util.List;

// distance[i] = i 와 (i+1) % n 의 거리


class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int total = 0;
        int d1 = 0;
        for (int i = start; ; ) {
            total += distance[i];
            i = (i + 1) % distance.length;
            if (i == destination) d1 = total;
            if (i == start) break;
        }
        return Math.min(total - d1, d1);
    }
}

public class BusStops {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] distance = { 7, 10, 1, 12, 11, 14, 5, 0 };
		int start = 7;
		int destination = 2;

		st.distanceBetweenBusStops(distance, start, destination);
	}
}

//	효율 5%... ㅠ
//class Solution {
//	public int distanceBetweenBusStops(int[] distance, int start, int destination) {
//		List<Integer> list = new ArrayList<Integer>();
//
//		for (int i = 0; i < distance.length; i++) {
//			list.add(distance[i]);
//		}
//
//		int count = 0;
//		int clock = 0;
//		int counter = 0;
//		
//		if (start > destination) {
//			count = start - destination;
//
//			for (int i = start - 1; count > 0; i--) {
//				counter += list.get(i);
//				list.set(i, 0);
//				count--;
//			}
//			for (int i = 0; i < list.size(); i++) {
//				clock += list.get(i);
//			}
//
//			System.out.println("clock : " + clock);
//			System.out.println("counter : " + counter);
//			System.out.println("result >> " + Math.min(clock, counter));
//			return Math.min(clock, counter);
//		} else {
//			count = destination - start;
//
//			for (int i = start; i < destination; i++) {
//				clock += list.get(i);
//				list.set(i, 0);
//			}
//			for (int i = 0; i < list.size(); i++) {
//				counter += list.get(i);
//			}
//
//			System.out.println("clock : " + clock);
//			System.out.println("counter : " + counter);
//			System.out.println("result >> " + Math.min(clock, counter));
//			return Math.min(clock, counter);
//		}
//	}
//}