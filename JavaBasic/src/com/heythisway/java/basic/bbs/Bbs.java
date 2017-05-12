package com.heythisway.java.basic.bbs;

import java.text.SimpleDateFormat;

public class Bbs {

		public String author;
		public String date;
		public String title;
		public String content;
	
		public void initDate(){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
			date = sdf.format(System.currentTimeMillis());
		}
}
