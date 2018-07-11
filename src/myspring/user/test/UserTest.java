package myspring.user.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import myspring.di.vo.UserVO;
import myspring.user.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:myspring/di/xmlconfig/config/hellobeans.xml")
public class UserTest {
	
	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	@Autowired
	SqlSession sqlSession;
	
	@Autowired
	UserService service;

	@Test @Ignore
	public void insert() {
		UserVO user = new UserVO("kakaoya", "편집", "수정", "ㅁㅁㅁ");
		int cnt = sqlSession.insert("userNS.insertUser", user);
		System.out.println(cnt+"��");
	}
	
	@Test @Ignore
	public void select() {
		UserVO result = sqlSession.selectOne("userNS.selectUserById", "kakaoya");
		System.out.println(result);

		List<UserVO> list = sqlSession.selectList("userNS.selectUserList");
		
		for (UserVO userVO : list) {
			System.out.println(userVO);
			
		}
	}
	
	@Test
	public void sss() {
		List<UserVO> list = service.getUserList();
		for (UserVO userVO : list) {
			System.out.println(userVO);
		}
	}
	
	@Test @Ignore
	public void factory() {
		System.out.println(sqlSessionFactory);
		System.out.println(sqlSession);
	}

}
