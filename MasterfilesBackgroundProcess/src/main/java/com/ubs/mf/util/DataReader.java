package com.ubs.mf.util;

import java.util.ArrayList;
import java.util.List;

import com.ubs.mf.util.pojo.TableData;

public class DataReader {
	
	public TableData readData() {
		
		TableData tableData =  new TableData();
		
		List<String> columns = new ArrayList<>();
		
		columns.add("Roll_No");
		columns.add("Name");
		columns.add("Surname");
		
		List<List<String>> data = new ArrayList<>();
		
		List<String> row1 = new ArrayList<>();
		row1.add("1");
		row1.add("Name1");
		row1.add("Surname1");
		
		data.add(row1);
		
		List<String> row2 = new ArrayList<>();
		row2.add("2");
		row2.add("Name2");
		row2.add("Surname3");
		
		data.add(row2);
		
		tableData.setColumns(columns);
		tableData.setData(data);
		
		return tableData;
		
	}

}
