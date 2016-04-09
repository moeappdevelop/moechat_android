package xyz.moechat.android.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.moechat.android.R;

/**
 * Created by timeloveboy on 16/4/6.
 * 作者：面条
 链接：https://www.zhihu.com/question/39662488/answer/82469372
 来源：知乎
 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public abstract class basefragment extends Fragment {
    protected View saveView;
    public boolean needSaveView = false;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        if (needSaveView && saveView != null) {
            return saveView;
        }
        else {
            saveView = inflater.inflate(getLayoutId(), container, false);
        }

        return saveView;
    }

    protected abstract int getLayoutId();

    public void gotofragment(basefragment fragment,boolean NeedSaveView){
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.setCustomAnimations(R.anim.in_from_right,R.anim.out_to_left, R.anim.in_from_left, R.anim.out_to_right);
        transaction.addToBackStack(null);
        transaction.replace(R.id.linearlayout_blank,fragment);

        fragment.needSaveView=NeedSaveView;
        transaction.commit();
    }
}

