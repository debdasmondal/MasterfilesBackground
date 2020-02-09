package com.ubs.mf.util.pojo;

import java.util.List;

public class TableData {
	
	private List<String> columns;
	
	private List<List<String>> data;

	public List<String> getColumns() {
		return columns;
	}

	public void setColumns(List<String> columns) {
		this.columns = columns;
	}

	public List<List<String>> getData() {
		return data;
	}

	public void setData(List<List<String>> data) {
		this.data = data;
	}

}
