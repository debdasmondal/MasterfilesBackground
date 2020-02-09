package com.ubs.mf.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import com.ubs.mf.util.pojo.TableData;

public class FileWriter {
	
	public String writeFile(List<String> columnMetaData, TableData tableData, String fileFullName){
		
		try {
			File fout = new File(fileFullName);
			FileOutputStream fos;
			fos = new FileOutputStream(fout);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
			
			for (int i = 0; i < 10; i++) {
				bw.write("something");
				bw.newLine();
			}
		 
			bw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
		return "SUCCESS";
	}

}
