package com.shop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shop.bean.Shop;

public class ShopApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Shop shop1 = (Shop) context.getBean("shop1");
		System.out.println(shop1);
		Shop shop2 = (Shop) context.getBean("shop2");
		System.out.println(shop2);
		Shop shop3 = (Shop) context.getBean("shop3");
		System.out.println(shop3);
		Shop shop4 = (Shop) context.getBean("shop4");
		System.out.println(shop4);
	}

}
