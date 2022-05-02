package me;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import java.util.Map;
import org.thunderdog.challegram.widget.ViewPager;
import p057e2.AbstractC4117a;
import p082fd.C4403w;
import p143k0.C6024a;
import td.AbstractC9165c2;

public class C7045v2 extends ViewPager implements AbstractC9165c2 {
    public DataSetObserver f22352Y0;
    public boolean f22353Z0;
    public boolean f22354a1;
    public final Map<ViewPager.AbstractC1054i, C7048c> f22351X0 = new C6024a(1);
    public boolean f22355b1 = C4403w.m27984G2();

    public static class C7046a extends DataSetObserver {
        public final C7047b f22356a;

        public C7046a(C7047b bVar) {
            this.f22356a = bVar;
        }

        @Override
        public void onChanged() {
            super.onChanged();
            this.f22356a.m18581w();
            this.f22356a.m18015y(true);
        }
    }

    public class C7047b extends C6887g2 {
        public int f22357M;

        public C7047b(AbstractC4117a aVar) {
            super(aVar);
            this.f22357M = aVar.mo8825e();
        }

        @Override
        public void mo8826b(ViewGroup viewGroup, int i, Object obj) {
            super.mo8826b(viewGroup, m18014z(i), obj);
        }

        @Override
        public int mo8824f(Object obj) {
            int f = super.mo8824f(obj);
            return f < 0 ? f : m18014z(f);
        }

        @Override
        public CharSequence mo18019g(int i) {
            return super.mo18019g(m18014z(i));
        }

        @Override
        public float mo18018h(int i) {
            return super.mo18018h(m18014z(i));
        }

        @Override
        public Object mo8823j(ViewGroup viewGroup, int i) {
            return super.mo8823j(viewGroup, m18014z(i));
        }

        @Override
        public void mo18017q(ViewGroup viewGroup, int i, Object obj) {
            super.mo18017q(viewGroup, (this.f22357M - i) - 1, obj);
        }

        public final void m18015y(boolean z) {
            int e = mo8825e();
            if (e != this.f22357M) {
                C7045v2 v2Var = C7045v2.this;
                v2Var.setCurrentItemWithoutNotification(v2Var.getCurrentItem());
                this.f22357M = e;
            }
        }

        public final int m18014z(int i) {
            return (mo8825e() - i) - 1;
        }
    }

    public class C7048c implements ViewPager.AbstractC1054i {
        public final ViewPager.AbstractC1054i f22359a;
        public int f22360b;

        public C7048c(ViewPager.AbstractC1054i iVar) {
            this.f22359a = iVar;
            this.f22360b = -1;
        }

        public final int m18013a(int i) {
            AbstractC4117a adapter = C7045v2.this.getAdapter();
            return adapter == null ? i : (adapter.mo8825e() - i) - 1;
        }

        @Override
        public void mo8853h4(int i) {
            if (!C7045v2.this.f22353Z0) {
                this.f22359a.mo8853h4(i);
            }
        }

        @Override
        public void mo8833x(int i, float f, int i2) {
            if (C7045v2.this.f22353Z0) {
                return;
            }
            if (C7045v2.this.m18023X()) {
                int i3 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i3 == 0 && i2 == 0) {
                    this.f22360b = m18013a(i);
                } else {
                    this.f22360b = m18013a(i + 1);
                }
                ViewPager.AbstractC1054i iVar = this.f22359a;
                int i4 = this.f22360b;
                if (i3 > 0) {
                    f = 1.0f - f;
                }
                iVar.mo8833x(i4, f, i2);
                return;
            }
            ViewPager.AbstractC1054i iVar2 = this.f22359a;
            this.f22360b = i;
            iVar2.mo8833x(i, f, i2);
        }

        @Override
        public void mo8832x4(int i) {
            if (C7045v2.this.f22353Z0) {
                return;
            }
            if (C7045v2.this.m18023X()) {
                this.f22359a.mo8832x4(m18013a(i));
            } else {
                this.f22359a.mo8832x4(i);
            }
        }
    }

    public C7045v2(Context context) {
        super(context);
    }

    public void setCurrentItemWithoutNotification(int i) {
        this.f22353Z0 = true;
        mo18027N(i, false);
        this.f22353Z0 = false;
    }

    @Override
    public void mo18027N(int i, boolean z) {
        super.mo18027N(m18024W(i), z);
    }

    public final int m18024W(int i) {
        if (i < 0 || !m18023X()) {
            return i;
        }
        if (getAdapter() == null) {
            return 0;
        }
        return (getAdapter().mo8825e() - i) - 1;
    }

    public boolean m18023X() {
        return this.f22355b1;
    }

    public final void m18022Y(AbstractC4117a aVar) {
        if ((aVar instanceof C7047b) && this.f22352Y0 == null) {
            C7046a aVar2 = new C7046a((C7047b) aVar);
            this.f22352Y0 = aVar2;
            aVar.mo18587m(aVar2);
            ((C7047b) aVar).m18015y(false);
        }
    }

    public final void m18021Z() {
        DataSetObserver dataSetObserver;
        AbstractC4117a adapter = super.getAdapter();
        if ((adapter instanceof C7047b) && (dataSetObserver = this.f22352Y0) != null) {
            adapter.mo18583u(dataSetObserver);
            this.f22352Y0 = null;
        }
    }

    @Override
    public void mo18020c(ViewPager.AbstractC1054i iVar) {
        C7048c cVar = new C7048c(iVar);
        this.f22351X0.put(iVar, cVar);
        super.mo18020c(cVar);
    }

    @Override
    public AbstractC4117a getAdapter() {
        AbstractC4117a adapter = super.getAdapter();
        return adapter instanceof C7047b ? ((C7047b) adapter).m18582v() : adapter;
    }

    @Override
    public int getCurrentItem() {
        return m18024W(super.getCurrentItem());
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m18022Y(super.getAdapter());
    }

    @Override
    public void onDetachedFromWindow() {
        m18021Z();
        super.onDetachedFromWindow();
    }

    @Override
    public void onRestoreInstanceState(Parcelable parcelable) {
        C7049d dVar = (C7049d) parcelable;
        super.onRestoreInstanceState(dVar.f22362a);
        if (dVar.f22364c != m18023X()) {
            mo18027N(dVar.f22363b, false);
        }
    }

    @Override
    public Parcelable onSaveInstanceState() {
        return new C7049d(super.onSaveInstanceState(), getCurrentItem(), m18023X());
    }

    @Override
    public void mo8255s() {
        boolean z = !this.f22354a1 && C4403w.m27984G2();
        if (this.f22355b1 != z) {
            AbstractC4117a adapter = getAdapter();
            int currentItem = adapter != null ? getCurrentItem() : -2;
            this.f22355b1 = z;
            if (adapter != null) {
                setAdapter(adapter);
                setCurrentItem(currentItem);
            }
        }
    }

    @Override
    public void setAdapter(AbstractC4117a aVar) {
        m18021Z();
        boolean z = aVar != null && m18023X();
        if (z) {
            C7047b bVar = new C7047b(aVar);
            m18022Y(bVar);
            aVar = bVar;
        }
        super.setAdapter(aVar);
        if (z) {
            setCurrentItemWithoutNotification(0);
        }
    }

    @Override
    public void setCurrentItem(int i) {
        super.setCurrentItem(m18024W(i));
    }

    public void setDisableRtl(boolean z) {
        if (this.f22354a1 != z) {
            this.f22354a1 = z;
            mo8255s();
        }
    }

    public static class C7049d implements Parcelable {
        public static final Parcelable.ClassLoaderCreator<C7049d> CREATOR = new C7050a();
        public Parcelable f22362a;
        public int f22363b;
        public boolean f22364c;

        public class C7050a implements Parcelable.ClassLoaderCreator<C7049d> {
            public C7049d createFromParcel(Parcel parcel) {
                return new C7049d(parcel, null);
            }

            public C7049d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C7049d(parcel, classLoader);
            }

            public C7049d[] newArray(int i) {
                return new C7049d[i];
            }
        }

        public C7049d(Parcelable parcelable, int i, boolean z) {
            this.f22362a = parcelable;
            this.f22363b = i;
            this.f22364c = z;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f22362a, i);
            parcel.writeInt(this.f22363b);
            parcel.writeByte(this.f22364c ? (byte) 1 : (byte) 0);
        }

        public C7049d(Parcel parcel, ClassLoader classLoader) {
            this.f22362a = parcel.readParcelable(classLoader == null ? getClass().getClassLoader() : classLoader);
            this.f22363b = parcel.readInt();
            this.f22364c = parcel.readByte() != 0;
        }
    }
}
