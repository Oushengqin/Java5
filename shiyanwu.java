package Wenben;


import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.FileWriter;

public class shiyanwu {
	static void main(String args[]) {
		try {//防止文件读取失败，用catch捕捉
			String pathname = "E:\\Shiyanwu_txt";
			File filename = new File(pathname);//读取以上路径的Shiyanwu_txt文件；
			InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
			 
		}
	}
	
}
