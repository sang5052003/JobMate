package jobmate.service.logic;

import java.util.List;

import jobmate.domain.Question;
import jobmate.service.QuestionService;
import jobmate.store.QuestionStore;
import jobmate.store.logic.QuestionStoreLogic;

public class QuestionServiceLogic implements QuestionService{

	private QuestionStore store;
	
	public QuestionServiceLogic() {
		this.store = new QuestionStoreLogic();
	}
	
	@Override
	public boolean create(Question question) {
		return this.store.insert(question);
	}

	@Override
	public List<Question> findAll() {
		return this.store.readAll();
	}

	@Override
	public Question findByQuestionNo(int questionNo) {
		return this.store.readByQuestionNo(questionNo);
	}

	@Override
	public List<Question> findByContent(String content) {
		return this.store.readByContent(content);
	}

	@Override
	public boolean modify(Question question) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(int questionNo) {
		// TODO Auto-generated method stub
		return false;
	}

}
