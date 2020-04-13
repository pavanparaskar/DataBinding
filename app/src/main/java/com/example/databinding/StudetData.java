package com.example.databinding;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class StudetData extends BaseObservable {

    // variables
    private String student;
    private String grade;

    public StudetData(String student, String grade) {
        this.student = student;
        this.grade = grade;
    }

    @Bindable
    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
        notifyPropertyChanged(BR.student);
    }

    @Bindable
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
        notifyPropertyChanged(BR.grade);
    }
}
