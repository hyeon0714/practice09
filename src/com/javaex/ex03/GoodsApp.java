package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	
    	ArrayList<Goods> gList=new ArrayList<Goods>();
    	boolean run=true;
    	int r=0;
    	
    	System.out.println("상품을 입력해주세요(종료:q)");
    	
    	Scanner sc=new Scanner(System.in);
    	
    	
    	
    	while(run) {
    		String goods=sc.nextLine();
    		if(goods.equals("q")) {
    			run=false;
    		}else {
    		String[] a=goods.split(",");
    		Goods g01=new Goods(a[0], Integer.parseInt(a[1]), Integer.parseInt(a[2]));
    		gList.add(g01);
    		}
    	}
    	System.out.println("[입력 완료]");
    	System.out.println("===========");
    	
    	for(int i=0; i<gList.size(); i++) {
    		gList.get(i).showInfo();
    		r+=gList.get(i).getCount();
    	}System.out.println("모든 상품의 개수는 "+r+"개입니다");
    sc.close();	
    }

}
