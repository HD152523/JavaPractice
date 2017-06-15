package org.dimigo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Writer;

public class ArakoMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Writer writer = new BufferedWriter(new FileWriter("files/menu.txt"));
			BufferedReader reader = new BufferedReader(new FileReader("files/menu.txt"));){
			PrintStream os = System.out;
			String str;
			
			while((str = br.readLine()) != null){
				writer.write(str + " ");
			}
			System.out.println("<<메뉴 출력>> ");
			writer.flush();
			while((str = reader.readLine()) != null){
				os.println(str);
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
