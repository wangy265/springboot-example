package com.wangy265.java.reflect;

public class SmallPineapple {
	
	public String name;
    public int age;
    private double weight; // 体重只有自己知道
    
    public SmallPineapple() {}
    
    public SmallPineapple(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void getInfo() {
        System.out.print("["+ name + " 的年龄是：" + age + "]");
    }
    
    public void getInfo(String xx,String zz) {
      System.out.println(xx+zz);;
    }

}
