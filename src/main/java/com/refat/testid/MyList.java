package com.refat.testid;

import java.awt.List;
import java.util.Collection;
import java.util.Collections;


public class MyList<T> {

    private static final int SIZE_FACTOR=5;
	
	private Object data[];
	
	private int index=0;
	
	private int size;
	
	public MyList(){
		this.data=new Object[SIZE_FACTOR];
		this.size=SIZE_FACTOR;
	}
	
	public void add(T obj){
		//System.out.println("index:"+this.index+"size:"+this.size+"data size:"+this.data.length);
		if(this.index==this.size-1){
			//we need to increase the size of data[]
			increaseSizeAndReallocate();
		}
		data[this.index]=obj;
		this.index++;
		
	}
	
	public void addAll(MyList<T> list) {
		
	}
	
	private void increaseSizeAndReallocate() {
		this.size=this.size+SIZE_FACTOR;
		Object newData[]=new Object[this.size];
		for(int i=0; i<data.length;i++){
			newData[i]=data[i];
		}
		this.data=newData;
		//System.out.println("***index:"+this.index+"size:"+this.size+"data size:"+this.data.length);
	}
	
	public T get(int i){
		
		return (T) this.data[i];
		
	}
	
	public void remove(int i){
	
		System.out.println("Object getting removed:"+this.data[i]);
		for(int x=i; x<this.data.length-1;x++){
			data[x]=data[x+1];
		}
		this.index--;
}
}
