package com.wcy.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.imageio.ImageIO;

/**
 * 生成图片
* @Title: ImgUtil.java
* @Package com.wcy.util
* @author 晨阳 
* @date 2020年3月23日 下午3:14:31
* @Description: 
* @version V1.0
 */
public class ImgUtil {
	private static final int WIDTH = 200;
	private static final int HEIGHT = 100;
	private static final int PADDING = 10;
	
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("img/code.jpg");
		writeCodeToStream(randomStr(),fos);
	}
	
	/**
	 * 生成验证码图片
	 * @param code 验证码
	 * @param os 保存位置
	 * @throws Exception
	 */
	public static void writeCodeToStream(String code,OutputStream os) throws Exception {
		BufferedImage bi = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		Graphics g = bi.getGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		g.setColor(Color.BLACK);
		g.drawLine(0, 0, WIDTH, HEIGHT);
		g.setColor(Color.BLUE);
		g.setFont(new Font(Font.SERIF,Font.BOLD,HEIGHT-PADDING*2-20));
		g.drawString(code,10,HEIGHT-10);
		g.dispose();
//		FileOutputStream fos = new FileOutputStream("img/code.jpg");
		ImageIO.write(bi, "JPEG", os);
	}
	
	public static String randomStr() {
		StringBuffer result = new StringBuffer();
		for(int i = 0; i < 4; i++) {
			char c = (char) (Math.random()*26 + 'A');
			result.append(c);
		}
		
		return result.toString();
	}
	
}
