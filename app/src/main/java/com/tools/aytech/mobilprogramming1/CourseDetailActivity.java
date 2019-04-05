package com.tools.aytech.mobilprogramming1;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class CourseDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_detail);

        ImageView courseImage = findViewById(R.id.courseImage);
        TextView courseName = findViewById(R.id.courseName);
        TextView courseLecturer = findViewById(R.id.courseLecturer);
        TextView courseGradeAvg = findViewById(R.id.courseGradeAvg);
        TextView courseGrade = findViewById(R.id.courseGrade);
        TextView courseStudentQuota = findViewById(R.id.courseStudentQuota);
        TextView courseTarget = findViewById(R.id.courseTarget);
        TextView courseContent = findViewById(R.id.courseContent);

        Intent incomingData = getIntent();

        if (incomingData.hasExtra("name"))
            courseName.setText(incomingData.getStringExtra("name"));
        if (incomingData.hasExtra("lecturer"))
            courseLecturer.setText(incomingData.getStringExtra("lecturer"));
        if (incomingData.hasExtra("gradeavg"))
            courseGradeAvg.setText(incomingData.getStringExtra("gradeavg"));
        if (incomingData.hasExtra("grade"))
            courseGrade.setText(incomingData.getStringExtra("grade"));
        if (incomingData.hasExtra("quota"))
            courseStudentQuota.setText(incomingData.getStringExtra("quota"));
        if (incomingData.hasExtra("target"))
            courseTarget.setText(incomingData.getStringExtra("target"));
        if (incomingData.hasExtra("content"))
            courseContent.setText(incomingData.getStringExtra("content"));
        if (incomingData.hasExtra("image"))
            courseImage.setImageResource(incomingData.getIntExtra("image", 0));
    }
}
