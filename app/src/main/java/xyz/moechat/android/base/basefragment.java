package xyz.moechat.android.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by timeloveboy on 16/4/6.
 * 作者：面条
 链接：https://www.zhihu.com/question/39662488/answer/82469372
 来源：知乎
 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public abstract class basefragment extends Fragment {
    protected View mRootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(null == mRootView){
            mRootView = inflater.inflate(getLayoutId(), container, false);
        }
        return mRootView;
    }


    protected abstract int getLayoutId();

}

