package view;

import java.util.ArrayList;

import control.NetflixAPP;
import model.NetflixMovie;
import model.NetflixContent;
import model.NetflixSerie;
import processing.core.PApplet;



public class Netflix_Main extends PApplet {
	
	private ArrayList<NetflixContent> content2;

	
	public static NetflixAPP NApp;

	public Netflix_Main() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.Netflix_Main");
	}
	
	
	public void draw() {
		
		
		for (int i=0; i< content2.size() ; i++) {
			content2.get(i).getImageURL();
		}
		
		PImage 
	}

	public void settings() {
		size(600,600);
		content2 = NApp.getContent();
	}
	
	
	
	public void setup() {
		
		NApp = new NetflixAPP();
		
		
	}
}
