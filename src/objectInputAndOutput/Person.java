package objectInputAndOutput;

import java.io.Serializable;

/**
 * 	Person��Ķ������л�/�����л���ǰ����Person��ʵ��Serializable�ӿ�
 * 			�ýӿ�û���κη���
 * 	һ�������,��ʵ����Serializable�ӿں�,���ֶ����һ��SerialVersionUID���л��汾���ֶ�
 * 		(��Ϊһ���淶)
 * @author life-1
 * @project_name IOStream
 * @type_name Person
 * @creation_time 2019��6��17�� ����10:09:32
 */
public class Person	implements	Serializable {
	String	name;
	int		age;
	String	agender;
	int		height;
	//�ֶ����һ�����л��汾���ֶ�
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
