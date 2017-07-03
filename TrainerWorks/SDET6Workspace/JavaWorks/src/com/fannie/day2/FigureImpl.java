package com.fannie.day2;

abstract class Figure{
	public abstract  void area();
}
class Rect extends Figure{
	/// reston - US 
	public void myarea(){
		System.out.println("hey we are calculating area of rect ");
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}
}

class Sqr extends Figure{
	public void area1(){
		System.out.println("area of sqr is getting calc ");
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}
}

public class FigureImpl {
	public static void main(String[] args) {
		Figure f =null; // = new Figure();
//		f.area();
		
		f = new Rect();
		f.area();
		
		f = new Sqr();
		f.area();
		
		
		
		
		
		
		
		
		
		
	}
}
