package java07_inherit.practice.controller;

import java07_inherit.practice.model.Circle;
import java07_inherit.practice.model.Point;
import java07_inherit.practice.model.Rectangle;

public class Main {
	public static void main(String[] args) {
		
		
		Circle[] cir = new Circle[3];
		Rectangle[] rec = new Rectangle[3];
		
		cir[0] = new Circle(4, 5, 3);
		cir[0].draw();
		
		cir[1] = new Circle(6, 7, 8);
		cir[1].draw();
		
		cir[2] = new Circle(1, 2, 3);
		cir[2].draw();
		
		rec[0] = new Rectangle(1, 2, 3, 4);
		rec[0].draw();
		
		rec[1] = new Rectangle(4, 5, 6, 7);
		rec[1].draw();
		
		rec[2] = new Rectangle(3, 4, 5, 6);
		rec[2].draw();
		
		
		
		Point[] p = new Point[5];
		
		p[0] = new Rectangle(1, 2, 3, 4);
		p[1] = new Circle(2, 3, 4);
		p[2] = new Rectangle(2, 3, 4, 5);
		p[3] = new Circle(3, 4, 5);
		p[4] = new Rectangle(3, 4, 5, 6);
		
		for(int i=0;i<p.length;i++) {
			System.out.println((i+1) + "번째");
			p[i].draw();
		}		

	}
	

}
