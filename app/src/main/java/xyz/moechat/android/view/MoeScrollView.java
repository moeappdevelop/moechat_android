package xyz.moechat.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class MoeScrollView extends ScrollView {

	private OnScrollListener onScrollListener = null;

	public MoeScrollView(Context context) {
		super(context);
	}

	public MoeScrollView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public MoeScrollView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public void setScrollViewListener(OnScrollListener scrollViewListener) {
		this.onScrollListener = scrollViewListener;
	}

	@Override
	protected void onScrollChanged(int x, int y, int oldx, int oldy) {
		super.onScrollChanged(x, y, oldx, oldy);
		if (onScrollListener != null) {
			onScrollListener.onScroll(y);
		}
	}

	public interface OnScrollListener {
		public void onScroll(int y);
	}

}
