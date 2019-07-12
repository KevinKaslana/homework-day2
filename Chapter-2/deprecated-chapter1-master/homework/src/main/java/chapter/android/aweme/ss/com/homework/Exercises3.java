package chapter.android.aweme.ss.com.homework;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * 大作业:实现一个抖音消息页面,所需资源已放在res下面
 */
public class Exercises3 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercises3);
        ListView listview = findViewById(R.id.list_view);
        listview.setAdapter(new ListViewAdapter(this));
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int position = i + 1;
                Toast.makeText(Exercises3.this,"当前位置"+position,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Exercises3.this,Secondary.class);
                intent.putExtra("position",""+position);
                startActivity(intent);
            }
        });
    }

    public static class ListViewAdapter extends BaseAdapter{

        private Context mContext;

        public ListViewAdapter (Context context) {mContext = context;}

        @Override public int getCount() {
            return 100;
        }

        @Override public Object getItem(int position) {
            return null;
        }

        @Override public long getItemId(int position) {
            return 0;
        }

        @Override public View getView(int position, View convertView, ViewGroup parent)
        {
            View view;
            if (convertView == null)
            {
                LayoutInflater inflater = LayoutInflater.from(mContext);
                view = inflater.inflate(R.layout.im_list_item,null);
            }else{
                view = convertView;
            }
            return view;
        }
    }

}
