package f1;

import android.widget.ListView;

public class h extends a {
    public final ListView f11779b0;

    public h(ListView listView) {
        super(listView);
        this.f11779b0 = listView;
    }

    @Override
    public boolean a(int i10) {
        return false;
    }

    @Override
    public boolean b(int i10) {
        ListView listView = this.f11779b0;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i11 = firstVisiblePosition + childCount;
        if (i10 > 0) {
            if (i11 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i10 >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void j(int i10, int i11) {
        i.b(this.f11779b0, i11);
    }
}
