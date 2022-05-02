package p070f1;

import android.widget.ListView;

public class C4212h extends AbstractView$OnTouchListenerC4202a {
    public final ListView f14232b0;

    public C4212h(ListView listView) {
        super(listView);
        this.f14232b0 = listView;
    }

    @Override
    public boolean mo28428a(int i) {
        return false;
    }

    @Override
    public boolean mo28427b(int i) {
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
    public void mo28426j(int i, int i2) {
        C4213i.m28424b(this.f14232b0, i2);
    }
}
