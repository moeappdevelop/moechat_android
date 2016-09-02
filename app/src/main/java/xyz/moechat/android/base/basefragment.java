package xyz.moechat.android.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.moechat.android.R;
import xyz.moechat.android.utils.MLog;

/**
 * Created by timeloveboy on 16/4/6.
 * 作者：面条
 链接：https://www.zhihu.com/question/39662488/answer/82469372
 来源：知乎
 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public abstract class Basefragment extends Fragment {
    protected View saveView;
    public boolean needSaveView = false;

    public Basefragment() {
        super();
        MLog.v(null,getClass().getName()+":new " +getClass().getSimpleName());
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MLog.v(null, getClass().getName() + ":onCreate("+")");
    }

    @Override
    public void onStart() {
        super.onStart();
        MLog.v(null, getClass().getName() + ":onStart()" );
    }

    @Override
    public void onResume() {
        super.onResume();
        MLog.v(null, getClass().getName() + ":onResume()");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        if(savedInstanceState!=null)
        MLog.v(null, getClass().getName() + ":onViewStateRestored(" + savedInstanceState.toString() + ")");
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if(savedInstanceState!=null)
        MLog.v(null, getClass().getName() + ":onViewCreated(" + savedInstanceState.toString() + ")");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if(outState!=null)
        MLog.v(null, getClass().getName() + ":onSaveInstanceState(" + outState.toString() + ")");
    }

    @Override
    public void onStop() {
        super.onStop();
        MLog.v(null, getClass().getName() + ":onStop()" );
    }

    @Override
    public void onPause() {
        super.onPause();
        MLog.v(null, getClass().getName() + ":onPause()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        MLog.v(null, getClass().getName() + ":onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        MLog.v(null, getClass().getName() + ":onDestroy()");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        MLog.v(null, getClass().getName() + ":onCreateView()");
        if (needSaveView && saveView != null) {
            return saveView;
        }
        else {
            saveView = inflater.inflate(getLayoutId(), container, false);
        }

        return saveView;
    }

    protected abstract int getLayoutId();
}

