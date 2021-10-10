package com.latrosoft.l_earning.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.latrosoft.l_earning.Adapter.CourseAdapter;
import com.latrosoft.l_earning.Model.Course;
import com.latrosoft.l_earning.R;

import java.util.ArrayList;

public class CourseFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<Course> mCourseList ;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.course,container,false);
        mCourseList = new ArrayList<>();
        recyclerView = view.findViewById(R.id.course_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        mCourseList.add(new Course("101","Web Development","https://i.ytimg.com/vi/nqMiCdfrIx8/maxresdefault.jpg","2000","3000","dis"));
        mCourseList.add(new Course("101","Web Development","https://i.ytimg.com/vi/g1k9Xo2fQpw/maxresdefault.jpg","2000","3000","dis"));
        mCourseList.add(new Course("101","Web Development","https://i.ytimg.com/vi/VaqLRdel5FE/maxresdefault.jpg","2000","3000","dis"));
        mCourseList.add(new Course("101","Web Development","https://i.ytimg.com/vi/UHNcLUek7bA/hqdefault.jpg?sqp=-oaymwEjCPYBEIoBSFryq4qpAxUIARUAAAAAGAElAADIQj0AgKJDeAE=&rs=AOn4CLDLJbJ06zHJ1T6mB5EpmS0m779wYA","2000","3000","dis"));
        recyclerView.setAdapter(new CourseAdapter(mCourseList,getContext()));
        return view;

    }
}
