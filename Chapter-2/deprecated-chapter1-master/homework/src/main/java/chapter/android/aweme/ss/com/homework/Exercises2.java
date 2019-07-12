package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
public class Exercises2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View inflate = LayoutInflater.from(this).inflate(R.layout.im_list_item,null);
        System.out.println(getViewCount(inflate));
    }

    public static int getViewCount(View view) {
        return getThisCount(view);
    }

    public static int getViewCount2(View view) {
       if(view==null){
           return 0;
       }
       if(view instanceof ViewGroup){
           ViewGroup vg = (ViewGroup)view;
           int size = 1;
           for(int index=0;index<vg.getChildCount();index++){
               size+=getViewCount2(vg.getChildAt(index));
           }
           return size;
       }else{
           return 1;
       }
    }


    public static int getThisCount (View view)
    {
        boolean type = view instanceof ViewGroup;
        if (!type)
            return 0;
        ViewGroup viewgroup = (ViewGroup)view;
        int childcount = viewgroup.getChildCount();
        int position = 0;
        for (position = 0; position < childcount; position = position + 1)
        {
            childcount = childcount + getThisCount(viewgroup.getChildAt(position));
        }
        return childcount;
    }

}
