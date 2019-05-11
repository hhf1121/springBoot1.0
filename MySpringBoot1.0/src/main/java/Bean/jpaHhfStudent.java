package Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name="hhfStudent")//用hhf_student表
public class jpaHhfStudent {
	
	@Id
	//自动生成id策略，如果不需自动生成，可注释掉
//	@GeneratedValue(strategy=GenerationType.ANTO)//需要mysql表的id自增
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TestSequence")
    //@GeneratedValue(strategy=GenerationType.IDENTITY) // MYSQL时可以这样使用自增
	//@SequenceGenerator(name = "TestSequence", sequenceName = "SEQ_Test", allocationSize=1)
	private int id;
	@Column
	private String name;
	@Column
	private int age;
	@Column	
	private String sex;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "jpaTest [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
	
	
}
