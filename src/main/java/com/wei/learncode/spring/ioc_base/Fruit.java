package com.wei.learncode.spring.ioc_base;

interface Fruit{
	public abstract void eat();
}

class Apple implements Fruit{
	@Override
	public void eat() {
		System.out.println("吃苹果");
	}
}

class Orange implements Fruit{
	@Override
	public void eat() {
		System.out.println("吃橘子");
	}
}

/*class Factory{
	public static Fruit getInstance(String name){
		Fruit f = null;
		if("apple".equals(name)){
			f = new Apple();
		}
		if("orange".equals(name)){
			f = new Orange();
		}
		return f;
	}
}*/
/*class Factory{
	public static Fruit getInstance(String className){
		Fruit f = null;
		try {
			f = (Fruit) Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}*/
/*class Factory{
	static Map<String,Class<?>> map = Maps.newHashMap();
	static {
		map.put("apple",Apple.class );
		map.put("orange",Orange.class );
	}
	public static Fruit getInstance(String className){
		try {
			Class<?> clazz =  map.get(className);
			Fruit o = (Fruit) clazz.newInstance();
			return o;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}*/
interface FruitFactory {
	//创建水果
	public Fruit createFruit();
}
