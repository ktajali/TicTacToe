package com.utm.csc;

import java.io.IOException;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HTMLParser {

	public static void main(String[] args) throws IOException {
	
		//getting results of all urls through while loop
		for(String url : args){
			
			//creating a Jsoup doc object to process url
			Document doc = Jsoup.connect(url).get();
		    System.out.println("##########################");
			System.out.println("title : " + doc.title());
			
			Elements links = doc.select("a[href]");
			
		    //processing links in the url
			for(Element link : links)
			{
				System.out.println("");
				
				System.out.println("link : " + link.attr("href"));
				
				System.out.println("text : " + link.text());
			}
		}
		
		
		
	}
}
