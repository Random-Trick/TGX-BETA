package p086g1;

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
import p086g1.C4446b;

public abstract class AbstractC4443a extends BaseAdapter implements Filterable, C4446b.AbstractC4447a {
    public Context f14701M;
    public int f14702N;
    public C4444a f14703O;
    public DataSetObserver f14704P;
    public C4446b f14705Q;
    public boolean f14706a;
    public boolean f14707b;
    public Cursor f14708c;

    public class C4444a extends ContentObserver {
        public C4444a() {
            super(new Handler());
        }

        @Override
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override
        public void onChange(boolean z) {
            AbstractC4443a.this.m27648i();
        }
    }

    public class C4445b extends DataSetObserver {
        public C4445b() {
        }

        @Override
        public void onChanged() {
            AbstractC4443a aVar = AbstractC4443a.this;
            aVar.f14706a = true;
            aVar.notifyDataSetChanged();
        }

        @Override
        public void onInvalidated() {
            AbstractC4443a aVar = AbstractC4443a.this;
            aVar.f14706a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public AbstractC4443a(Context context, Cursor cursor, boolean z) {
        m27649f(context, cursor, z ? 1 : 2);
    }

    public void mo27646a(Cursor cursor) {
        Cursor j = m27647j(cursor);
        if (j != null) {
            j.close();
        }
    }

    @Override
    public Cursor mo27645b() {
        return this.f14708c;
    }

    public abstract CharSequence mo27644c(Cursor cursor);

    public abstract void mo27650e(View view, Context context, Cursor cursor);

    public void m27649f(Context context, Cursor cursor, int i) {
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f14707b = true;
        } else {
            this.f14707b = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f14708c = cursor;
        this.f14706a = z;
        this.f14701M = context;
        this.f14702N = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f14703O = new C4444a();
            this.f14704P = new C4445b();
        } else {
            this.f14703O = null;
            this.f14704P = null;
        }
        if (z) {
            C4444a aVar = this.f14703O;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f14704P;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View mo27642g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override
    public int getCount() {
        Cursor cursor;
        if (!this.f14706a || (cursor = this.f14708c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f14706a) {
            return null;
        }
        this.f14708c.moveToPosition(i);
        if (view == null) {
            view = mo27642g(this.f14701M, this.f14708c, viewGroup);
        }
        mo27650e(view, this.f14701M, this.f14708c);
        return view;
    }

    @Override
    public Filter getFilter() {
        if (this.f14705Q == null) {
            this.f14705Q = new C4446b(this);
        }
        return this.f14705Q;
    }

    @Override
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f14706a || (cursor = this.f14708c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f14708c;
    }

    @Override
    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f14706a || (cursor = this.f14708c) == null || !cursor.moveToPosition(i)) {
            return 0L;
        }
        return this.f14708c.getLong(this.f14702N);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f14706a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f14708c.moveToPosition(i)) {
            if (view == null) {
                view = mo27641h(this.f14701M, this.f14708c, viewGroup);
            }
            mo27650e(view, this.f14701M, this.f14708c);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    public abstract View mo27641h(Context context, Cursor cursor, ViewGroup viewGroup);

    public void m27648i() {
        Cursor cursor;
        if (this.f14707b && (cursor = this.f14708c) != null && !cursor.isClosed()) {
            this.f14706a = this.f14708c.requery();
        }
    }

    public Cursor m27647j(Cursor cursor) {
        Cursor cursor2 = this.f14708c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C4444a aVar = this.f14703O;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f14704P;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f14708c = cursor;
        if (cursor != null) {
            C4444a aVar2 = this.f14703O;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f14704P;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f14702N = cursor.getColumnIndexOrThrow("_id");
            this.f14706a = true;
            notifyDataSetChanged();
        } else {
            this.f14702N = -1;
            this.f14706a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
