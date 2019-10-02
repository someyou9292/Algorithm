package CanPlaceFlowers;

/*
 화단에 꽃을 심는 문제입니다.
 화단에는 일부 꽃이 심어져 있습니다. 바로 인접한 곳에는 꽃을 심을 수 없습니다.
 화단과 심을 꽃이 주어지면 인접하지 않게 꽃을 심을 수 있는지 알려주세요.
 * 1은 꽃이 심어진 것을 의미하며 0 은 비어있는 자리입니다.
 
 ex)
 input [1,0,0,0,1], n = 1
 -> true
 
 input [1,0,0,0,1], n = 2
 -> false
  
 * */

class Solution {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		int remindFlower = n;
		if (n == 0) {
			return true;
		}
		if (flowerbed.length == 1) {
			if (flowerbed[0] == 0) {
				if (n > 1) {
					return false;
				} else {
					return true;
				}
			} else {
				if (n < 1) {
					return true;
				} else {
					return false;
				}
			}
		}

		for (int i = 0; i < flowerbed.length; i++) {

			if (i == 0) {
				if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
					flowerbed[i] = 1;
					remindFlower--;
				}
			} else if (i > 0 && i < flowerbed.length - 1) {
				if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
					flowerbed[i] = 1;
					remindFlower--;
				}
			} else {
				if (flowerbed[i - 1] == 0 && flowerbed[i] == 0) {
					flowerbed[i] = 1;
					remindFlower--;
				}
			}
			if (remindFlower == 0) {
				return true;
			}
		}

		return false;
	}
}

public class Flowers {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] flowerbed = { 1, 0, 0, 0, 0, 0, 1 };
		int n = 2;

		System.out.println(st.canPlaceFlowers(flowerbed, n));
	}
}
