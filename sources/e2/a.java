package e2;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class a {
    public final DataSetObservable f10445a = new DataSetObservable();
    public DataSetObserver f10446b;

    @Deprecated
    public void a(View view, int i10, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void b(ViewGroup viewGroup, int i10, Object obj) {
        a(viewGroup, i10, obj);
    }

    @Deprecated
    public void c(View view) {
    }

    public void d(ViewGroup viewGroup) {
        c(viewGroup);
    }

    public abstract int e();

    public int f(Object obj) {
        return -1;
    }

    public CharSequence g(int i10) {
        return null;
    }

    public float h(int i10) {
        return 1.0f;
    }

    @Deprecated
    public Object i(View view, int i10) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public Object j(ViewGroup viewGroup, int i10) {
        return i(viewGroup, i10);
    }

    public abstract boolean k(View view, Object obj);

    public void l() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f10446b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f10445a.notifyChanged();
    }

    public void m(DataSetObserver dataSetObserver) {
        this.f10445a.registerObserver(dataSetObserver);
    }

    public void n(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable o() {
        return null;
    }

    @Deprecated
    public void p(View view, int i10, Object obj) {
    }

    public void q(ViewGroup viewGroup, int i10, Object obj) {
        p(viewGroup, i10, obj);
    }

    public void r(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f10446b = dataSetObserver;
        }
    }

    @Deprecated
    public void s(View view) {
    }

    public void t(ViewGroup viewGroup) {
        s(viewGroup);
    }

    public void u(DataSetObserver dataSetObserver) {
        this.f10445a.unregisterObserver(dataSetObserver);
    }
}
