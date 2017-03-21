package store;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import jobmate.domain.Question;
import jobmate.domain.QuestionCategory;
import jobmate.store.QuestionStore;
import jobmate.store.logic.QuestionStoreLogic;

public class QuestionStoreLogicTest {

	private QuestionStore store;
	
	@Before
	public void setUp(){
		this.store = new QuestionStoreLogic();
	}
	
//	@Test
//	public void testInsert() {
//		
//		boolean b = this.store.insert(new Question("sang", QuestionCategory.personality, "질문내용임10", 0));
//		
//		assertEquals(true, b);
//		
//		List<Question> list = this.store.readAll();
//		assertEquals(3, list.size());
//	}
//
//	@Test
//	public void testReadAll() {
//		
//		List<Question> list = this.store.readAll();
//		
//		assertEquals(2, list.size());
//		
//	}
//
//	@Test
//	public void testReadByQuestionNo() {
//		
//		Question q = this.store.readByQuestionNo(2);
//		
//		assertEquals(QuestionCategory.technology, q.getCategory());
//		assertEquals("sang", q.getCustomerID());
//	}
//
//	@Test
//	public void testReadByContent() {
//		
//		List<Question> list = this.store.readByContent("2");
//		
//		assertEquals(1, list.size());
//	}
//
//	@Test
//	public void testUpdate() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDelete() {
//		fail("Not yet implemented");
//	}
//
	@Test
	public void testReadByInterview() {
		
		System.out.println(QuestionCategory.technology.toString());
		System.out.println(QuestionCategory.technology);
		List<Question> list = this.store.readByInterview(QuestionCategory.technology.toString());

		assertEquals(1, list.size());
	}

}
