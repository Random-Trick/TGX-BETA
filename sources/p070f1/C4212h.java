package p070f1;

import android.widget.ListView;

public class C4212h extends AbstractView$OnTouchListenerC4202a {
    public final ListView f14232b0;

    public C4212h(ListView listView) {
        super(listView);
        this.f14232b0 = listView;
    }

    @Override
    public boolean mo28430a(int i) {
        return false;
    }

    @Override
    public boolean mo28429b(int i) {
        ListView listView = this.f14232b0;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void mo28428j(int i, int i2) {
        C4213i.m28426b(this.f14232b0, i2);
    }
}
