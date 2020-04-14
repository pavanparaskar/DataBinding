package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Toast;

import com.example.databinding.databinding.ActivityMainBinding;

import static com.example.databinding.BR.grade;
import static com.example.databinding.BR.grader;
import static com.example.databinding.BR.student;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Step 1: Adding dependency


        //Step 2 : Creating layout for databinding confuguration

        // Step 3 : Assigning variables to widgets
        // Step 4 : create model class
        // Step 5 : Crating MAinactivity Presenter activity in order to present data
        // Step 6 : Create MainActivitContract interface
        // Step 7 : Adding to code MainActivity and display into correct widget

        // Step 8 : Lets run application    pavan


        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainActivityPresenter mainActivityPresenter = new MainActivityPresenter(this, getApplicationContext());
        StudetData studetData=new StudetData("Pavan","B+");
        mainBinding.setGrader(studetData);
        mainBinding.setPresenter(mainActivityPresenter);

    }

    @Override
    public void showData(StudetData studetData) {
        String grade=studetData.getGrade();
        Toast.makeText(this, "Data"+grade, Toast.LENGTH_SHORT).show();

    }
}
