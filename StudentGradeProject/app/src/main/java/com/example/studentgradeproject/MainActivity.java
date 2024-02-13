package com.example.studentgradeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button nextStudentButton;
    private  Button prevStudentButton;
    private  Button gradeAverage;
    private TextView studentNameText_View;
    private TextView gradeAverageText_View;
    private int currentIndex=0;
    public static String TAG="Course Project";
    public static String KEY_INDEX = "index";

    Grade student1 = new Grade(1, "Graham", "Bill", 69, 70, 98, 80, 90);
    Grade student2 = new Grade(2, "Sanchez", "Jim", 88, 72, 90, 83, 93);
    Grade student3 = new Grade(3, "White", "Peter", 85, 80, 45, 93, 70);
    Grade student4 = new Grade(4, "Phelp", "David", 70, 60, 60, 90, 70);
    Grade student5 = new Grade(5, "Lewis", "Sheila", 50, 76, 87, 59, 72);
    Grade student6 = new Grade(6, "James", "Thomas", 89, 99, 97, 98, 99);

    public Grade [] all_students=new Grade[]{student1,student2,student3,student4,student5,student6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState!=null)
        {
            currentIndex=savedInstanceState.getInt(KEY_INDEX);
        }

        //Get the view of student_name_text_view
        studentNameText_View=(TextView) findViewById(R.id.student_name_text_view);
        studentNameText_View.setText("Student: "+all_students[currentIndex].getStudent_fname()+" "+all_students[currentIndex].getStudent_lname());

        //Get the view of student_grade_average_text_view
        gradeAverageText_View=(TextView) findViewById(R.id.student_grade_average_text_view);


        //Get the view of next_student_button
        nextStudentButton =(Button)  findViewById(R.id.next_student_button);
        nextStudentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex=(currentIndex+1)%all_students.length;
                studentNameText_View.setText("Student: "+all_students[currentIndex].getStudent_fname()+" "+all_students[currentIndex].getStudent_lname());
            }
        });

        //Get the view of prev_student_button
        prevStudentButton =(Button)  findViewById(R.id.prev_student_button);
        prevStudentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex = (currentIndex - 1 + all_students.length) % all_students.length;
                studentNameText_View.setText("Student: "+all_students[currentIndex].getStudent_fname()+" "+all_students[currentIndex].getStudent_lname());
            }
        });

        //Get the view of student_grade_average_button
        gradeAverage =(Button)  findViewById(R.id.student_grade_average_button);
        gradeAverage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gradeAverageText_View.setText("Average: "+all_students[currentIndex].Calculate_GradeAverage());
                Toast.makeText(MainActivity.this, "Grade Average: "+all_students[currentIndex].Calculate_GradeAverage(), Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public  void onStart()
    {
        super.onStart();
        Log.d (TAG, "onStart is called");
    }
    @Override
    public  void onResume()
    {
        super.onResume();
        Log.d (TAG, "onResume is called");
    }
    @Override
    public  void onPause()
    {
        super.onPause();
        Log.d (TAG, "onPause is called");
    }
    @Override
    public  void onStop()
    {
        super.onStop();
        Log.d (TAG, "onStop is called");
    }
    @Override
    public  void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy is called");
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState)
    {
        super.onSaveInstanceState(savedInstanceState);
        Log.d(TAG, "onSaveInstanceState: called");
        savedInstanceState.putInt(KEY_INDEX,currentIndex);
    }
}