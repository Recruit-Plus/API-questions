package com.RecruitPlus.QuizPlatform.repository;
import com.RecruitPlus.QuizPlatform.model.Question;
import com.RecruitPlus.QuizPlatform.model.Topic;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface QuestionRepository extends MongoRepository<Question, String>
{
    //Query for filtering questions based on topic,type,difficulty level
    @Query("{'topics':{$all:?0},'type' :?1,'difficulty_level': ?2 }")
    Optional<Question> byFilters(String[] topics,String type,String difficulty_level);


}