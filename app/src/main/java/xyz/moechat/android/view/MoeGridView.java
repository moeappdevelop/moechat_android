package xyz.moechat.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

public class MoeGridView extends GridView {

	public MoeGridView(Context context) {
		super(context);
	}

	public MoeGridView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public MoeGridView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		super.onMeasure(widthMeasureSpec, MeasureSpec.makeMeasureSpec(
				Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST));
	}

}
