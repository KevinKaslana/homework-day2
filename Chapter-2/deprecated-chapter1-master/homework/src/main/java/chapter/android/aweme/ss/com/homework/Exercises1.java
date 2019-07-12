package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * 作业1：
 * 打印出Activity屏幕切换 Activity会执行什么生命周期？
 *
 *
 * 屏幕旋转前，activity已处于resume状态
 * 旋转后：
 * onPause -> onStop -> onDestroy -> onCreate -> onStart -> onResume
 */
public class Exercises1 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercises1);
        System.out.println("oncreate");
    }

    @Override
    protected void onDestroy() {
        System.out.println("ondestroy");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        System.out.println("onpause");
        super.onPause();
    }

    @Override
    protected void onResume() {
        System.out.println("onresume");
        super.onResume();
    }

    @Override
    protected void onStart() {
        System.out.println("onstart");
        super.onStart();
    }

    @Override
    protected void onStop() {
        System.out.println("onstop");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        System.out.println("onrestart");
        super.onRestart();
    }
}
