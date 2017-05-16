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
		// 设置3个0-255之间的随机颜色值
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		randomColor = new Color(r, g, b);
		return randomColor; // 返回具有指定红色、绿色和蓝色值的不透明的 sRGB 颜色
	}
}
