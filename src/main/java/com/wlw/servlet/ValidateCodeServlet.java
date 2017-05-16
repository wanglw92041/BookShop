package com.wlw.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wlw.util.RandomColor;

public class ValidateCodeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 禁止页面缓存
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "No-cache");
		response.setDateHeader("Expires", 0);
		// 指定生成的响应是图片并且格式为Jpeg
		response.setContentType("image/jpeg");
		// 创建一个指定长宽的图像
		int width = 60, height = 20;
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics(); // 获取用于处理图形上下文对象
		Random random = new Random(); // 创建生成随机数的对象
		g.setColor(RandomColor.getRandomColor(200, 250)); // 设置图像背景色
		g.fillRect(0, 0, width, height); // 填充指定的矩形
		g.setFont(new Font("Times New Roman", Font.PLAIN, 18)); // 设置字体格式
		g.setColor(RandomColor.getRandomColor(160, 200));
		for (int i = 0; i < 130; i++) { // 产生130条干扰线
			int x = random.nextInt(width);
			int y = random.nextInt(height);
			int x1 = random.nextInt(12);
			int y1 = random.nextInt(12);
			g.drawLine(x, y, x + x1, y + y1);// 在图象的随机指定坐标之间画干扰线
		}
		String strCode = "";

		// 生成随机数,并将随机数字转换为字母
		/*
		 * String sRand=""; for (int i=0;i<6;i++) { int itmp =
		 * random.nextInt(26) + 65; char ctmp = (char)itmp; sRand +=
		 * String.valueOf(ctmp); g.setColor(new
		 * Color(20+random.nextInt(110),20+random.nextInt(110),20+random.nextInt
		 * (110))); g.drawString(String.valueOf(ctmp),15*i+10,16); }
		 */

		for (int i = 0; i < 4; i++) {
			String strNumber = String.valueOf((char) (random.nextInt(26) + 65)); // 将随机数转换成字符串
			strCode += strNumber;
			g.setColor(new Color(15 + random.nextInt(120), 15 + random.nextInt(120), 15 + random.nextInt(120)));
			g.drawString(strNumber, 13 * i + 6, 16); // 将验证码依次画到图像上
		}
		request.getSession().setAttribute("Code", strCode);
		g.dispose();
		ImageIO.write(image, "JPEG", response.getOutputStream()); // 输出JPEG格式图片到页面
		response.getOutputStream().flush(); // 刷新输出流
		response.getOutputStream().close(); // 关闭输出流
	}
}
