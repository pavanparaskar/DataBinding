package com.example.databinding;

public interface MainActivityContract {
    public interface Presenter {
        void onShowData(StudetData studetData);

    }
    public interface View{
        void showData(StudetData studetData);
    }
}
