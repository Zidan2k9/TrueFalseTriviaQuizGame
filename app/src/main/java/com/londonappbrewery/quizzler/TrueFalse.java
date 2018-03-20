package com.londonappbrewery.quizzler;

/**
 * Created by zainu on 25/02/2018.
 */

public class TrueFalse
{
    private  int mQuestionId;
    private boolean mAnswer;

    public TrueFalse(int questionid, boolean trueFalse){
        mQuestionId = questionid;
        mAnswer = trueFalse;
    }

    public int getQuestionId() {
        return mQuestionId;
    }

    public void setQuestionId(int questionId) {
        mQuestionId = questionId;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
