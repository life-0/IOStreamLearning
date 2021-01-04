package objectInputAndOutput;

import java.io.Serializable;

/**
 * 	Person类的对象序列化/反序列化的前提是Person类实现Serializable接口
 * 			该接口没有任何方法
 * 	一般情况下,类实现了Serializable接口后,会手动添加一个SerialVersionUID序列化版本号字段
 * 		(作为一个规范)
 * @author life-1
 * @project_name IOStream
 * @type_name Person
 * @creation_time 2019年6月17日 下午10:09:32
 */
public class Person	implements	Serializable {
	String	name;
	int		age;
	String	agender;
	int		height;
	//手动添加一个序列化版本号字段
	private static final long serialVersionUID = -68497470754667710L;
	/**
	 * @param name
	 * @param age
	 * @param agender
	 * @param height
	 */
	public Person(String name, int age, String agender, int height) {
		super();
		this.name = name;
		this.age = age;
		this.agender = agender;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", agender=" + agender + ", height=" + height + "]";
	}

	
}
