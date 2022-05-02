package p270t3;

import android.net.Uri;
import com.google.android.exoplayer2.ext.flac.C3452h;
import com.google.android.exoplayer2.ext.flac.C3454i;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p005a4.C0098g;
import p005a4.C0104k;
import p019b4.C1175d;
import p020b5.C1211k;
import p020b5.C1223o;
import p031c4.C1551a0;
import p031c4.C1553b;
import p031c4.C1559e;
import p031c4.C1566h;
import p031c4.C1567h0;
import p044d4.C3593b;
import p283u3.C9438b;
import p297v3.C9838c;
import p310w3.C9963c;
import p325x3.C10088a;
import p340y3.C10365e;
import p355z3.C11241f;

public final class C8955d implements AbstractC8965l {
    public static final int[] f28831n = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};
    public static final C8956a f28832o = new C8956a();
    public boolean f28833b;
    public boolean f28834c;
    public int f28835d;
    public int f28836e;
    public int f28837f;
    public int f28838g;
    public int f28839h;
    public int f28840i;
    public int f28841j;
    public int f28843l;
    public int f28842k = 1;
    public int f28844m = 112800;

    public static final class C8956a {
        public final AtomicBoolean f28845a = new AtomicBoolean(false);
        public Constructor<? extends AbstractC8958f> f28846b;

        public AbstractC8958f m10834a(int i) {
            Constructor<? extends AbstractC8958f> b = m10833b();
            if (b == null) {
                return null;
            }
            try {
                return b.newInstance(Integer.valueOf(i));
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
            }
        }

        public final Constructor<? extends AbstractC8958f> m10833b() {
            synchronized (this.f28845a) {
                if (this.f28845a.get()) {
                    return this.f28846b;
                }
                try {
                    Boolean bool = Boolean.TRUE;
                    C1223o oVar = C3454i.f11408a;
                    if (bool.equals(C3454i.class.getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                        AbstractC8965l lVar = C3452h.f11395k;
                        this.f28846b = C3452h.class.asSubclass(AbstractC8958f.class).getConstructor(Integer.TYPE);
                    }
                } catch (ClassNotFoundException unused) {
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating FLAC extension", e);
                }
                this.f28845a.set(true);
                return this.f28846b;
            }
        }
    }

    @Override
    public synchronized AbstractC8958f[] mo1155a() {
        return mo1154b(Uri.EMPTY, new HashMap());
    }

    @Override
    public synchronized AbstractC8958f[] mo1154b(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr;
        arrayList = new ArrayList(14);
        int b = C1211k.m38030b(map);
        if (b != -1) {
            m10836c(b, arrayList);
        }
        int c = C1211k.m38029c(uri);
        if (!(c == -1 || c == b)) {
            m10836c(c, arrayList);
        }
        for (int i : f28831n) {
            if (!(i == b || i == c)) {
                m10836c(i, arrayList);
            }
        }
        return (AbstractC8958f[]) arrayList.toArray(new AbstractC8958f[arrayList.size()]);
    }

    public final void m10836c(int i, List<AbstractC8958f> list) {
        int i2 = 2;
        switch (i) {
            case 0:
                list.add(new C1553b());
                return;
            case 1:
                list.add(new C1559e());
                return;
            case 2:
                int i3 = this.f28835d | (this.f28833b ? 1 : 0);
                if (!this.f28834c) {
                    i2 = 0;
                }
                list.add(new C1566h(i2 | i3));
                return;
            case 3:
                int i4 = this.f28836e | (this.f28833b ? 1 : 0);
                if (!this.f28834c) {
                    i2 = 0;
                }
                list.add(new C9438b(i2 | i4));
                return;
            case 4:
                AbstractC8958f a = f28832o.m10834a(this.f28837f);
                if (a != null) {
                    list.add(a);
                    return;
                } else {
                    list.add(new C9838c(this.f28837f));
                    return;
                }
            case 5:
                list.add(new C9963c());
                return;
            case 6:
                list.add(new C10365e(this.f28838g));
                return;
            case 7:
                int i5 = this.f28841j | (this.f28833b ? 1 : 0);
                if (!this.f28834c) {
                    i2 = 0;
                }
                list.add(new C11241f(i2 | i5));
                return;
            case 8:
                list.add(new C0098g(this.f28840i));
                list.add(new C0104k(this.f28839h));
                return;
            case 9:
                list.add(new C1175d());
                return;
            case 10:
                list.add(new C1551a0());
                return;
            case 11:
                list.add(new C1567h0(this.f28842k, this.f28843l, this.f28844m));
                return;
            case 12:
                list.add(new C3593b());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new C10088a());
                return;
        }
    }

    public synchronized C8955d m10835d(boolean z) {
        this.f28833b = z;
        return this;
    }
}
