package p142k;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.AbstractC0359i;
import androidx.appcompat.view.menu.C0350d;
import androidx.appcompat.view.menu.C0351e;
import androidx.appcompat.view.menu.C0355g;

public abstract class AbstractC6020d implements AbstractC6022f, AbstractC0359i, AdapterView.OnItemClickListener {
    public Rect f19166a;

    public static int m21546o(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static boolean m21537x(C0351e eVar) {
        int size = eVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = eVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public static C0350d m21536y(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C0350d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C0350d) listAdapter;
    }

    @Override
    public boolean mo21552e(C0351e eVar, C0355g gVar) {
        return false;
    }

    @Override
    public boolean mo21551f(C0351e eVar, C0355g gVar) {
        return false;
    }

    @Override
    public void mo21550i(Context context, C0351e eVar) {
    }

    public abstract void mo21549l(C0351e eVar);

    public boolean mo21548m() {
        return true;
    }

    public Rect m21547n() {
        return this.f19166a;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m21536y(listAdapter).f1228a.m41715M((MenuItem) listAdapter.getItem(i), this, mo21548m() ? 0 : 4);
    }

    public abstract void mo21545p(View view);

    public void m21544q(Rect rect) {
        this.f19166a = rect;
    }

    public abstract void mo21543r(boolean z);

    public abstract void mo21542s(int i);

    public abstract void mo21541t(int i);

    public abstract void mo21540u(PopupWindow.OnDismissListener onDismissListener);

    public abstract void mo21539v(boolean z);

    public abstract void mo21538w(int i);
}
