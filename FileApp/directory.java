package Code;

import java.io.Writer;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class directory {
	
	public static void FileFinder(String s,ArrayList list) {
		File f = new File(s);
		String nm[]=f.list();
		for(int i=0;i<nm.length;i++) {
			File f2=new File(s+"\\"+nm[i]);
			if(f2.isDirectory()) {
				FileFinder(f2.getAbsolutePath(),list);
			}
			else {
				list.add(f2);
			}
		}
	}
	static public void main(String[] args)  {
	
		
			try {	ArrayList<File> list=new ArrayList<File>();
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
				
					FileWriter w=new FileWriter("C:\\Users\\VipS\\Desktop\\project.txt");
					w.write(str);
					w.write("	");
					w.write("C:\\Users\\VipS\\Desktop\\list.csv");
					
					w.close();
					FileFinder(str,list);
					FileWriter output=new FileWriter("C:\\Users\\VipS\\Desktop\\list.csv");
				    for(int i=0;i<list.size();i++) {
					output.write("Name: "+list.get(i).getName());
			   		output.write(',');
			   		output.write("Path: "+list.get(i).getAbsolutePath());
			   		output.write(10);
			   		output.flush();
				}
				    System.out.println("Complete");
				}
				catch(IOException e) {
					System.out.println("Wrong Input");
				}
				
		
	}

}
