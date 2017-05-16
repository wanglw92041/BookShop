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
		// ��ֹҳ�滺��
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "No-cache");
		response.setDateHeader("Expires", 0);
		// ָ�����ɵ���Ӧ��ͼƬ���Ҹ�ʽΪJpeg
		response.setContentType("image/jpeg");
		// ����һ��ָ�������ͼ��
		int width = 60, height = 20;
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics(); // ��ȡ���ڴ���ͼ�������Ķ���
		Random random = new Random(); // ��������������Ķ���
		g.setColor(RandomColor.getRandomColor(200, 250)); // ����ͼ�񱳾�ɫ
		g.fillRect(0, 0, width, height); // ���ָ���ľ���
		g.setFont(new Font("Times New Roman", Font.PLAIN, 18)); // ���������ʽ
		g.setColor(RandomColor.getRandomColor(160, 200));
		for (int i = 0; i < 130; i++) { // ����130��������
			int x = random.nextInt(width);
			int y = random.nextInt(height);
			int x1 = random.nextInt(12);
			int y1 = random.nextInt(12);
			g.drawLine(x, y, x + x1, y + y1);// ��ͼ������ָ������֮�仭������
		}
		String strCode = "";

		// ���������,�����������ת��Ϊ��ĸ
		/*
		 * String sRand=""; for (int i=0;i<6;i++) { int itmp =
		 * random.nextInt(26) + 65; char ctmp = (char)itmp; sRand +=
		 * String.valueOf(ctmp); g.setColor(new
		 * Color(20+random.nextInt(110),20+random.nextInt(110),20+random.nextInt
		 * (110))); g.drawString(String.valueOf(ctmp),15*i+10,16); }
		 */

		for (int i = 0; i < 4; i++) {
			String strNumber = String.valueOf((char) (random.nextInt(26) + 65)); // �������ת�����ַ���
			strCode += strNumber;
			g.setColor(new Color(15 + random.nextInt(120), 15 + random.nextInt(120), 15 + random.nextInt(120)));
			g.drawString(strNumber, 13 * i + 6, 16); // ����֤�����λ���ͼ����
		}
		request.getSession().setAttribute("Code", strCode);
		g.dispose();
		ImageIO.write(image, "JPEG", response.getOutputStream()); // ���JPEG��ʽͼƬ��ҳ��
		response.getOutputStream().flush(); // ˢ�������
		response.getOutputStream().close(); // �ر������
	}
}
