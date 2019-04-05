package com.tools.aytech.mobilprogramming1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;

public class ListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView = findViewById(R.id.recyclerView);
        CourseAdapter courseAdapter = new CourseAdapter(getApplicationContext(), Course.getData(), new CourseAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Course item) {
                Intent detailIntent = new Intent(getApplicationContext(), CourseDetailActivity.class);
                detailIntent.putExtra("name", item.getCourseName());
                detailIntent.putExtra("gradeavg", item.getCourseGradeAvg());
                detailIntent.putExtra("grade", item.getCourseGrade());
                detailIntent.putExtra("quota", item.getCourseStudentQuota());
                detailIntent.putExtra("image", item.getImageID());
                detailIntent.putExtra("lecturer", item.getCourseLecturer());
                detailIntent.putExtra("target", item.getCourseTarget());
                detailIntent.putExtra("content", item.getCourseContent());
                startActivity(detailIntent);
            }
        });

        recyclerView.setAdapter(courseAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.layout_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        LinearLayoutManager linearLayoutManager;
        switch(id){
            case R.id.linearViewVertical:
                linearLayoutManager = new LinearLayoutManager(this);
                linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(linearLayoutManager);
                break;
            case R.id.gridView:
                GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
                recyclerView.setLayoutManager(gridLayoutManager);
                break;
            case R.id.staggeredGridView:
                StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(staggeredGridLayoutManager);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
