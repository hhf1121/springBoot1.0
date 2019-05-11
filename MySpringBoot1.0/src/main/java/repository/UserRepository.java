package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Bean.jpaHhfStudent;
/**
 * 整合jpa的接口类,用这个接口去调方法、操作注解@Entity的实体类
 * @author hhf
 *
 */
public interface UserRepository  extends JpaRepository<jpaHhfStudent,Integer>{

	
}
