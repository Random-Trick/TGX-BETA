package g1;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import g1.b;

public abstract class a extends BaseAdapter implements Filterable, b.a {
    public Context M;
    public int N;
    public C0109a O;
    public DataSetObserver P;
    public g1.b Q;
    public boolean f12016a;
    public boolean f12017b;
    public Cursor f12018c;

    public class C0109a extends ContentObserver {
        public C0109a() {
            super(new Handler());
        }

        @Override
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override
        public void onChange(boolean z10) {
            a.this.i();
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        @Override
        public void onChanged() {
            a aVar = a.this;
            aVar.f12016a = true;
            aVar.notifyDataSetChanged();
        }

        @Override
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f12016a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        f(context, cursor, z10 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor j10 = j(cursor);
        if (j10 != null) {
            j10.close();
        }
    }

    @Override
    public Cursor b() {
        return this.f12018c;
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    public void f(Context context, Cursor cursor, int i10) {
        boolean z10 = false;
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f12017b = true;
        } else {
            this.f12017b = false;
        }
        if (cursor != null) {
            z10 = true;
        }
        this.f12018c = cursor;
        this.f12016a = z10;
        this.M = context;
        this.N = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.O = new C0109a();
            this.P = new b();
        } else {
            this.O = null;
            this.P = null;
        }
        if (z10) {
            C0109a aVar = this.O;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.P;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override
    public int getCount() {
        Cursor cursor;
        if (!this.f12016a || (cursor = this.f12018c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f12016a) {
            return null;
        }
        this.f12018c.moveToPosition(i10);
        if (view == null) {
            view = g(this.M, this.f12018c, viewGroup);
        }
        e(view, this.M, this.f12018c);
        return view;
    }

    @Override
    public Filter getFilter() {
        if (this.Q == null) {
            this.Q = new g1.b(this);
        }
        return this.Q;
    }

    @Override
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f12016a || (cursor = this.f12018c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f12018c;
    }

    @Override
    public long getItemId(int i10) {
        Cursor cursor;
        if (!this.f12016a || (cursor = this.f12018c) == null || !cursor.moveToPosition(i10)) {
            return 0L;
        }
        return this.f12018c.getLong(this.N);
    }

    @Override
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f12016a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f12018c.moveToPosition(i10)) {
            if (view == null) {
                view = h(this.M, this.f12018c, viewGroup);
            }
            e(view, this.M, this.f12018c);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i10);
        }
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    public void i() {
        Cursor cursor;
        if (this.f12017b && (cursor = this.f12018c) != null && !cursor.isClosed()) {
            this.f12016a = this.f12018c.requery();
        }
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f12018c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0109a aVar = this.O;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.P;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f12018c = cursor;
        if (cursor != null) {
            C0109a aVar2 = this.O;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.P;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.N = cursor.getColumnIndexOrThrow("_id");
            this.f12016a = true;
            notifyDataSetChanged();
        } else {
            this.N = -1;
            this.f12016a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
