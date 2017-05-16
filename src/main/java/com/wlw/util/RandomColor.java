package com.wlw.util;

import java.awt.Color;
import java.util.Random;

public class RandomColor {
	public static Color getRandomColor(int fc, int bc) {
		Random random = new Random();
		Color randomColor = null;
		if (fc > 255) {
			fc = 255;
		}
		if (bc > 255) {
			bc = 255;
		}
		// ����3��0-255֮��������ɫֵ
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		randomColor = new Color(r, g, b);
		return randomColor; // ���ؾ���ָ����ɫ����ɫ����ɫֵ�Ĳ�͸���� sRGB ��ɫ
	}
}
