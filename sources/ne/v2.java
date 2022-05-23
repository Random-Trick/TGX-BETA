package ne;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import gd.w;
import java.util.Map;
import org.thunderdog.challegram.widget.ViewPager;
import ud.c2;

public class v2 extends ViewPager implements c2 {
    public DataSetObserver Y0;
    public boolean Z0;
    public boolean f18401a1;
    public final Map<ViewPager.i, c> X0 = new k0.a(1);
    public boolean f18402b1 = w.G2();

    public static class a extends DataSetObserver {
        public final b f18403a;

        public a(b bVar) {
            this.f18403a = bVar;
        }

        @Override
        public void onChanged() {
            super.onChanged();
            this.f18403a.w();
            this.f18403a.y(true);
        }
    }

    public class b extends g2 {
        public int M;

        public b(e2.a aVar) {
            super(aVar);
            this.M = aVar.e();
        }

        @Override
        public void b(ViewGroup viewGroup, int i10, Object obj) {
            super.b(viewGroup, z(i10), obj);
        }

        @Override
        public int f(Object obj) {
            int f10 = super.f(obj);
            return f10 < 0 ? f10 : z(f10);
        }

        @Override
        public CharSequence g(int i10) {
            return super.g(z(i10));
        }

        @Override
        public float h(int i10) {
            return super.h(z(i10));
        }

        @Override
        public Object j(ViewGroup viewGroup, int i10) {
            return super.j(viewGroup, z(i10));
        }

        @Override
        public void q(ViewGroup viewGroup, int i10, Object obj) {
            super.q(viewGroup, (this.M - i10) - 1, obj);
        }

        public final void y(boolean z10) {
            int e10 = e();
            if (e10 != this.M) {
                v2 v2Var = v2.this;
                v2Var.setCurrentItemWithoutNotification(v2Var.getCurrentItem());
                this.M = e10;
            }
        }

        public final int z(int i10) {
            return (e() - i10) - 1;
        }
    }

    public class c implements ViewPager.i {
        public final ViewPager.i f18404a;
        public int f18405b;

        public c(ViewPager.i iVar) {
            this.f18404a = iVar;
            this.f18405b = -1;
        }

        @Override
        public void U3(int i10) {
            if (!v2.this.Z0) {
                this.f18404a.U3(i10);
            }
        }

        public final int a(int i10) {
            e2.a adapter = v2.this.getAdapter();
            return adapter == null ? i10 : (adapter.e() - i10) - 1;
        }

        @Override
        public void r4(int i10) {
            if (v2.this.Z0) {
                return;
            }
            if (v2.this.X()) {
                this.f18404a.r4(a(i10));
            } else {
                this.f18404a.r4(i10);
            }
        }

        @Override
        public void x(int i10, float f10, int i11) {
            if (v2.this.Z0) {
                return;
            }
            if (v2.this.X()) {
                int i12 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                if (i12 == 0 && i11 == 0) {
                    this.f18405b = a(i10);
                } else {
                    this.f18405b = a(i10 + 1);
                }
                ViewPager.i iVar = this.f18404a;
                int i13 = this.f18405b;
                if (i12 > 0) {
                    f10 = 1.0f - f10;
                }
                iVar.x(i13, f10, i11);
                return;
            }
            ViewPager.i iVar2 = this.f18404a;
            this.f18405b = i10;
            iVar2.x(i10, f10, i11);
        }
    }

    public v2(Context context) {
        super(context);
    }

    public void setCurrentItemWithoutNotification(int i10) {
        this.Z0 = true;
        N(i10, false);
        this.Z0 = false;
    }

    @Override
    public void N(int i10, boolean z10) {
        super.N(W(i10), z10);
    }

    public final int W(int i10) {
        if (i10 < 0 || !X()) {
            return i10;
        }
        if (getAdapter() == null) {
            return 0;
        }
        return (getAdapter().e() - i10) - 1;
    }

    public boolean X() {
        return this.f18402b1;
    }

    public final void Y(e2.a aVar) {
        if ((aVar instanceof b) && this.Y0 == null) {
            a aVar2 = new a((b) aVar);
            this.Y0 = aVar2;
            aVar.m(aVar2);
            ((b) aVar).y(false);
        }
    }

    public final void Z() {
        DataSetObserver dataSetObserver;
        e2.a adapter = super.getAdapter();
        if ((adapter instanceof b) && (dataSetObserver = this.Y0) != null) {
            adapter.u(dataSetObserver);
            this.Y0 = null;
        }
    }

    @Override
    public void c(ViewPager.i iVar) {
        c cVar = new c(iVar);
        this.X0.put(iVar, cVar);
        super.c(cVar);
    }

    @Override
    public e2.a getAdapter() {
        e2.a adapter = super.getAdapter();
        return adapter instanceof b ? ((b) adapter).v() : adapter;
    }

    @Override
    public int getCurrentItem() {
        return W(super.getCurrentItem());
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Y(super.getAdapter());
    }

    @Override
    public void onDetachedFromWindow() {
        Z();
        super.onDetachedFromWindow();
    }

    @Override
    public void onRestoreInstanceState(Parcelable parcelable) {
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.f18407a);
        if (dVar.f18409c != X()) {
            N(dVar.f18408b, false);
        }
    }

    @Override
    public Parcelable onSaveInstanceState() {
        return new d(super.onSaveInstanceState(), getCurrentItem(), X());
    }

    @Override
    public void s() {
        boolean z10 = !this.f18401a1 && w.G2();
        if (this.f18402b1 != z10) {
            e2.a adapter = getAdapter();
            int currentItem = adapter != null ? getCurrentItem() : -2;
            this.f18402b1 = z10;
            if (adapter != null) {
                setAdapter(adapter);
                setCurrentItem(currentItem);
            }
        }
    }

    @Override
    public void setAdapter(e2.a aVar) {
        Z();
        boolean z10 = aVar != null && X();
        if (z10) {
            b bVar = new b(aVar);
            Y(bVar);
            aVar = bVar;
        }
        super.setAdapter(aVar);
        if (z10) {
            setCurrentItemWithoutNotification(0);
        }
    }

    @Override
    public void setCurrentItem(int i10) {
        super.setCurrentItem(W(i10));
    }

    public void setDisableRtl(boolean z10) {
        if (this.f18401a1 != z10) {
            this.f18401a1 = z10;
            s();
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.ClassLoaderCreator<d> CREATOR = new a();
        public Parcelable f18407a;
        public int f18408b;
        public boolean f18409c;

        public class a implements Parcelable.ClassLoaderCreator<d> {
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            public d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(Parcelable parcelable, int i10, boolean z10) {
            this.f18407a = parcelable;
            this.f18408b = i10;
            this.f18409c = z10;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f18407a, i10);
            parcel.writeInt(this.f18408b);
            parcel.writeByte(this.f18409c ? (byte) 1 : (byte) 0);
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            this.f18407a = parcel.readParcelable(classLoader == null ? getClass().getClassLoader() : classLoader);
            this.f18408b = parcel.readInt();
            this.f18409c = parcel.readByte() != 0;
        }
    }
}
