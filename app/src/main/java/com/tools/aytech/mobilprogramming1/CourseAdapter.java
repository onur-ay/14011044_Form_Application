package com.tools.aytech.mobilprogramming1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.MyViewHolder> {

    private final OnItemClickListener listener;
    private ArrayList<Course> courseList;
    private LayoutInflater inflater;

    CourseAdapter(Context context, ArrayList<Course> courseList, OnItemClickListener listener) {
        this.courseList = courseList;
        inflater = LayoutInflater.from(context);
        this.listener = listener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = inflater.inflate(R.layout.item_course_card, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position){
        Course selectedCourse = courseList.get(position);
        holder.setData(selectedCourse);
        holder.bind(courseList.get(position), listener);
}

    @Override
    public int getItemCount(){
        return courseList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView courseName, courseLecturer, courseGrade;
        ImageView courseImage;

        MyViewHolder(View itemView){
            super(itemView);
            courseName = itemView.findViewById(R.id.courseName);
            courseLecturer = itemView.findViewById(R.id.courseLecturer);
            courseGrade = itemView.findViewById(R.id.courseGrade);
            courseImage = itemView.findViewById(R.id.courseImage);
        }

        void setData(Course selectedCourse){
            this.courseName.setText(selectedCourse.getCourseName());
            this.courseLecturer.setText(selectedCourse.getCourseLecturer());
            this.courseGrade.setText(selectedCourse.getCourseGrade());
            this.courseImage.setImageResource(selectedCourse.getImageID());
        }

        @Override
        public void onClick(View v){

        }

        public void bind(final Course item, final OnItemClickListener listener){
            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    listener.onItemClick(item);
                }
            });
        }
    }

    public interface OnItemClickListener{
        void onItemClick(Course item);
    }
}
