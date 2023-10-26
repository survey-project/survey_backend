package com.survey.Service.User.Inter;

import com.survey.DTO.SurveyDto;
import com.survey.DTO.User.UserSurveyQuestionDto;
import com.survey.DTO.User.UserSurveyRequestInfoDto;

public interface UserCommandSurveyService {
    /**
     * 사용자가 설문조사 응답을 제출할 때 사용하는 메서드입니다.
     * @param surveyId
     * @param userSurveyRequestInfoDto
     * @return SurveyDto
     * @throws Exception
     * @author 황시준
     * @since  1.0
     */
    SurveyDto submitSurvey(Long surveyId, UserSurveyRequestInfoDto userSurveyRequestInfoDto) throws Exception;
}