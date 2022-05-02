package p057e2;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class AbstractC4117a {
    public final DataSetObservable f13881a = new DataSetObservable();
    public DataSetObserver f13882b;

    @Deprecated
    public void m28893a(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void mo8826b(ViewGroup viewGroup, int i, Object obj) {
        m28893a(viewGroup, i, obj);
    }

    @Deprecated
    public void m28892c(View view) {
    }

    public void mo18588d(ViewGroup viewGroup) {
        m28892c(viewGroup);
    }

    public abstract int mo8825e();

    public int mo8824f(Object obj) {
        return -1;
    }

    public CharSequence mo18019g(int i) {
        return null;
    }

    public float mo18018h(int i) {
        return 1.0f;
    }

    @Deprecated
    public Object m28891i(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public Object mo8823j(ViewGroup viewGroup, int i) {
        return m28891i(viewGroup, i);
    }

    public abstract boolean mo8822k(View view, Object obj);

    public void m28890l() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f13882b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f13881a.notifyChanged();
    }

    public void mo18587m(DataSetObserver dataSetObserver) {
        this.f13881a.registerObserver(dataSetObserver);
    }

    public void mo18586n(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable mo18585o() {
        return null;
    }

    @Deprecated
    public void m28889p(View view, int i, Object obj) {
    }

    public void mo18017q(ViewGroup viewGroup, int i, Object obj) {
        m28889p(viewGroup, i, obj);
    }

    public void m28888r(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f13882b = dataSetObserver;
        }
    }

    @Deprecated
    public void m28887s(View view) {
    }

    public void mo18584t(ViewGroup viewGroup) {
        m28887s(viewGroup);
    }

    public void mo18583u(DataSetObserver dataSetObserver) {
        this.f13881a.unregisterObserver(dataSetObserver);
    }
}
