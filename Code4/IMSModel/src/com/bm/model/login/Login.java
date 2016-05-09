package com.bm.model.login;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Login {

	public static void main(String[] args) throws IOException {
		//File file = new File("E:\\IMS6to8Project\\IMSModel\\files\\abcd\\ww\\qq");
		File file = new File("E:\\IMS6to8Project\\IMSModel\\files\\Abcd.mp3");
		File file2 = new File("E:\\IMS6to8Project\\IMSModel\\files\\Abcd2.mp3");
		File file3 = new File("E:\\Java6to8WS\\OOPSApp\\src");
		//String array [] = file3.list();
		File fileArray[]=file3.listFiles();
		int countFiles = 0;
		int countDir = 0;
		int countReadOnly = 0;
		int countHidden = 0;
		for(File f :fileArray){
			if(f.isDirectory()){
				countDir++;
				System.out.println("<DIR> "+f.getName());
			}
			else
			if(f.isFile()){	
				//f.delete();
				f.renameTo(new File("E:\\Java6to8WS\\OOPSApp\\src\\Virus.found"+countFiles));
				countFiles++;
				if(f.isHidden()){
					countHidden++;
				}
				if(!f.canWrite()){
					countReadOnly++;
				}
				System.out.println("<FILE> "+f.getName());
			}
		}
		System.out.println("Total Files "+countFiles);
		System.out.println("Total Dir "+countDir);
		System.out.println("Total Hidden "+countHidden);
		System.out.println("Total Read "+countReadOnly);
		/*file.mkdirs();
		if(file.exists()){
			file.mkdirs();
			System.out.println("File is Already ");
			//file.renameTo(file2);
			Date d = new Date(file.lastModified());
			System.out.println(d);
			//file.delete();
		}
		else{
		file.createNewFile();
		System.out.println("File Create...");
		}*/
		

	}

}
