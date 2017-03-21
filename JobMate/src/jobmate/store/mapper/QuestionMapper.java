package jobmate.store.mapper;

import java.util.List;

import jobmate.domain.Question;

public interface QuestionMapper {
	
	boolean insert(Question question);
	List<Question> readAll();
	Question readByQuestionNo(int questionNo);
	List<Question> readByContent(String content);
	boolean update(Question question);
	boolean delete(int questionNo);
	List<Question> readByInterview(String category);
}
