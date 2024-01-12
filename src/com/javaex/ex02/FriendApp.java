package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.javaex.ex01.Rectangle;

public class FriendApp {

    public static void main(String[] args) {

    	ArrayList<Friend> fList=new ArrayList<Friend>();
    	
    	System.out.println("친구를 3명 등록해주세요");
    	
    	Scanner sc=new Scanner(System.in);
    	
    	String no1=sc.nextLine();
    	String no2=sc.nextLine();
    	String no3=sc.nextLine();
    	
    	String[] no=no1.split(" ");
    	String[] noo=no2.split(" ");
    	String[] nooo=no3.split(" ");
    	
    	Friend f01=new Friend(no[0], no[1], no[2]); 
    	Friend f02=new Friend(noo[0], noo[1], noo[2]); 
    	Friend f03=new Friend(nooo[0], nooo[1], nooo[2]); 
    	
    	fList.add(f01);
    	fList.add(f02);
    	fList.add(f03);
    	
    	fList.get(0).showInfo();
    	fList.get(1).showInfo();
    	fList.get(2).showInfo();
    		
    	
    }

}
