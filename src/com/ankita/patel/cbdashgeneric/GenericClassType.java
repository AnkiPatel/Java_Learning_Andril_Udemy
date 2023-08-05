package com.ankita.patel.cbdashgeneric;

public class GenericClassType <T> {
	
	private T data;
	
	public T getData() {
		return data;
	}
	
	public void setData(T pdata) {
		data = pdata;
	}
	
	@Override
    public String toString() {
        return "Data value: " + this.data;
	}

}


