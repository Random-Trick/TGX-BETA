package p174m3;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.google.errorprone.annotations.InlineMe;
import p020b5.C1186a;
import p020b5.C1188b;
import p020b5.C1216l0;
import p174m3.AbstractC6609h;
import p174m3.C6660o1;
import p200o4.C7652c;
import p358z6.AbstractC11396q;

public abstract class AbstractC6604g3 implements AbstractC6609h {
    public static final AbstractC6604g3 f20630a = new C6605a();
    public static final AbstractC6609h.AbstractC6610a<AbstractC6604g3> f20631b = C6597f3.f20562a;

    public class C6605a extends AbstractC6604g3 {
        @Override
        public int mo17302f(Object obj) {
            return -1;
        }

        @Override
        public C6606b mo17301k(int i, C6606b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override
        public int mo17300m() {
            return 0;
        }

        @Override
        public Object mo17299s(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override
        public C6608d mo17298u(int i, C6608d dVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override
        public int mo17297v() {
            return 0;
        }
    }

    public static final class C6606b implements AbstractC6609h {
        public static final AbstractC6609h.AbstractC6610a<C6606b> f20632Q = C6614h3.f20674a;
        public long f20633M;
        public long f20634N;
        public boolean f20635O;
        public C7652c f20636P = C7652c.f24527P;
        public Object f20637a;
        public Object f20638b;
        public int f20639c;

        public static C6606b m19815c(Bundle bundle) {
            C7652c cVar;
            int i = bundle.getInt(m19801q(0), 0);
            long j = bundle.getLong(m19801q(1), -9223372036854775807L);
            long j2 = bundle.getLong(m19801q(2), 0L);
            boolean z = bundle.getBoolean(m19801q(3));
            Bundle bundle2 = bundle.getBundle(m19801q(4));
            if (bundle2 != null) {
                cVar = C7652c.f24529R.mo998a(bundle2);
            } else {
                cVar = C7652c.f24527P;
            }
            C7652c cVar2 = cVar;
            C6606b bVar = new C6606b();
            bVar.m19799s(null, null, i, j, j2, cVar2, z);
            return bVar;
        }

        public static String m19801q(int i) {
            return Integer.toString(i, 36);
        }

        public int m19814d(int i) {
            return this.f20636P.m15298c(i).f24542b;
        }

        public long m19813e(int i, int i2) {
            C7652c.C7653a c = this.f20636P.m15298c(i);
            if (c.f24542b != -1) {
                return c.f24538N[i2];
            }
            return -9223372036854775807L;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C6606b.class.equals(obj.getClass())) {
                return false;
            }
            C6606b bVar = (C6606b) obj;
            return C1216l0.m37985c(this.f20637a, bVar.f20637a) && C1216l0.m37985c(this.f20638b, bVar.f20638b) && this.f20639c == bVar.f20639c && this.f20633M == bVar.f20633M && this.f20634N == bVar.f20634N && this.f20635O == bVar.f20635O && C1216l0.m37985c(this.f20636P, bVar.f20636P);
        }

        public int m19812f(long j) {
            return this.f20636P.m15297d(j, this.f20633M);
        }

        public int m19811g(long j) {
            return this.f20636P.m15296e(j, this.f20633M);
        }

        public long m19810h(int i) {
            return this.f20636P.m15298c(i).f24541a;
        }

        public int hashCode() {
            Object obj = this.f20637a;
            int i = 0;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f20638b;
            if (obj2 != null) {
                i = obj2.hashCode();
            }
            long j = this.f20633M;
            long j2 = this.f20634N;
            return ((((((((((hashCode + i) * 31) + this.f20639c) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f20635O ? 1 : 0)) * 31) + this.f20636P.hashCode();
        }

        public long m19809i() {
            return this.f20636P.f24535c;
        }

        public long m19808j(int i) {
            return this.f20636P.m15298c(i).f24539O;
        }

        public long m19807k() {
            return this.f20633M;
        }

        public int m19806l(int i) {
            return this.f20636P.m15298c(i).m15289e();
        }

        public int m19805m(int i, int i2) {
            return this.f20636P.m15298c(i).m15288f(i2);
        }

        public long m19804n() {
            return C1216l0.m38009H0(this.f20634N);
        }

        public long m19803o() {
            return this.f20634N;
        }

        public boolean m19802p(int i) {
            return this.f20636P.m15298c(i).f24540P;
        }

        public C6606b m19800r(Object obj, Object obj2, int i, long j, long j2) {
            return m19799s(obj, obj2, i, j, j2, C7652c.f24527P, false);
        }

        public C6606b m19799s(Object obj, Object obj2, int i, long j, long j2, C7652c cVar, boolean z) {
            this.f20637a = obj;
            this.f20638b = obj2;
            this.f20639c = i;
            this.f20633M = j;
            this.f20634N = j2;
            this.f20636P = cVar;
            this.f20635O = z;
            return this;
        }
    }

    public static final class C6607c extends AbstractC6604g3 {
        public final AbstractC11396q<C6606b> f20640M;
        public final int[] f20641N;
        public final int[] f20642O;
        public final AbstractC11396q<C6608d> f20643c;

        public C6607c(AbstractC11396q<C6608d> qVar, AbstractC11396q<C6606b> qVar2, int[] iArr) {
            C1186a.m38192a(qVar.size() == iArr.length);
            this.f20643c = qVar;
            this.f20640M = qVar2;
            this.f20641N = iArr;
            this.f20642O = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f20642O[iArr[i]] = i;
            }
        }

        @Override
        public int mo17401e(boolean z) {
            if (m19820w()) {
                return -1;
            }
            if (z) {
                return this.f20641N[0];
            }
            return 0;
        }

        @Override
        public int mo17302f(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public int mo17400g(boolean z) {
            if (m19820w()) {
                return -1;
            }
            if (z) {
                return this.f20641N[mo17297v() - 1];
            }
            return mo17297v() - 1;
        }

        @Override
        public int mo17346i(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != mo17400g(z)) {
                return z ? this.f20641N[this.f20642O[i] + 1] : i + 1;
            }
            if (i2 == 2) {
                return mo17401e(z);
            }
            return -1;
        }

        @Override
        public C6606b mo17301k(int i, C6606b bVar, boolean z) {
            C6606b bVar2 = this.f20640M.get(i);
            bVar.m19799s(bVar2.f20637a, bVar2.f20638b, bVar2.f20639c, bVar2.f20633M, bVar2.f20634N, bVar2.f20636P, bVar2.f20635O);
            return bVar;
        }

        @Override
        public int mo17300m() {
            return this.f20640M.size();
        }

        @Override
        public int mo17345r(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != mo17401e(z)) {
                return z ? this.f20641N[this.f20642O[i] - 1] : i - 1;
            }
            if (i2 == 2) {
                return mo17400g(z);
            }
            return -1;
        }

        @Override
        public Object mo17299s(int i) {
            throw new UnsupportedOperationException();
        }

        @Override
        public C6608d mo17298u(int i, C6608d dVar, long j) {
            C6608d dVar2 = this.f20643c.get(i);
            dVar.m19789j(dVar2.f20662a, dVar2.f20664c, dVar2.f20648M, dVar2.f20649N, dVar2.f20650O, dVar2.f20651P, dVar2.f20652Q, dVar2.f20653R, dVar2.f20655T, dVar2.f20657V, dVar2.f20658W, dVar2.f20659X, dVar2.f20660Y, dVar2.f20661Z);
            dVar.f20656U = dVar2.f20656U;
            return dVar;
        }

        @Override
        public int mo17297v() {
            return this.f20643c.size();
        }
    }

    public static final class C6608d implements AbstractC6609h {
        public static final Object f20644a0 = new Object();
        public static final Object f20645b0 = new Object();
        public static final C6660o1 f20646c0 = new C6660o1.C6663c().m19636c("com.google.android.exoplayer2.Timeline").m19634e(Uri.EMPTY).m19638a();
        public static final AbstractC6609h.AbstractC6610a<C6608d> f20647d0 = C6626i3.f20700a;
        public Object f20648M;
        public long f20649N;
        public long f20650O;
        public long f20651P;
        public boolean f20652Q;
        public boolean f20653R;
        @Deprecated
        public boolean f20654S;
        public C6660o1.C6669g f20655T;
        public boolean f20656U;
        public long f20657V;
        public long f20658W;
        public int f20659X;
        public int f20660Y;
        public long f20661Z;
        @Deprecated
        public Object f20663b;
        public Object f20662a = f20644a0;
        public C6660o1 f20664c = f20646c0;

        public static C6608d m19797b(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(m19790i(1));
            C6660o1.C6669g gVar = null;
            C6660o1 a = bundle2 != null ? C6660o1.f20810R.mo998a(bundle2) : null;
            long j = bundle.getLong(m19790i(2), -9223372036854775807L);
            long j2 = bundle.getLong(m19790i(3), -9223372036854775807L);
            long j3 = bundle.getLong(m19790i(4), -9223372036854775807L);
            boolean z = bundle.getBoolean(m19790i(5), false);
            boolean z2 = bundle.getBoolean(m19790i(6), false);
            Bundle bundle3 = bundle.getBundle(m19790i(7));
            if (bundle3 != null) {
                gVar = C6660o1.C6669g.f20863P.mo998a(bundle3);
            }
            boolean z3 = bundle.getBoolean(m19790i(8), false);
            long j4 = bundle.getLong(m19790i(9), 0L);
            long j5 = bundle.getLong(m19790i(10), -9223372036854775807L);
            int i = bundle.getInt(m19790i(11), 0);
            int i2 = bundle.getInt(m19790i(12), 0);
            long j6 = bundle.getLong(m19790i(13), 0L);
            C6608d dVar = new C6608d();
            dVar.m19789j(f20645b0, a, null, j, j2, j3, z, z2, gVar, j4, j5, i, i2, j6);
            dVar.f20656U = z3;
            return dVar;
        }

        public static String m19790i(int i) {
            return Integer.toString(i, 36);
        }

        public long m19796c() {
            return C1216l0.m37996T(this.f20651P);
        }

        public long m19795d() {
            return C1216l0.m38009H0(this.f20657V);
        }

        public long m19794e() {
            return this.f20657V;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C6608d.class.equals(obj.getClass())) {
                return false;
            }
            C6608d dVar = (C6608d) obj;
            return C1216l0.m37985c(this.f20662a, dVar.f20662a) && C1216l0.m37985c(this.f20664c, dVar.f20664c) && C1216l0.m37985c(this.f20648M, dVar.f20648M) && C1216l0.m37985c(this.f20655T, dVar.f20655T) && this.f20649N == dVar.f20649N && this.f20650O == dVar.f20650O && this.f20651P == dVar.f20651P && this.f20652Q == dVar.f20652Q && this.f20653R == dVar.f20653R && this.f20656U == dVar.f20656U && this.f20657V == dVar.f20657V && this.f20658W == dVar.f20658W && this.f20659X == dVar.f20659X && this.f20660Y == dVar.f20660Y && this.f20661Z == dVar.f20661Z;
        }

        public long m19793f() {
            return C1216l0.m38009H0(this.f20658W);
        }

        public long m19792g() {
            return this.f20661Z;
        }

        public boolean m19791h() {
            C1186a.m38187f(this.f20654S == (this.f20655T != null));
            return this.f20655T != null;
        }

        public int hashCode() {
            int hashCode = (((217 + this.f20662a.hashCode()) * 31) + this.f20664c.hashCode()) * 31;
            Object obj = this.f20648M;
            int i = 0;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            C6660o1.C6669g gVar = this.f20655T;
            if (gVar != null) {
                i = gVar.hashCode();
            }
            long j = this.f20649N;
            long j2 = this.f20650O;
            long j3 = this.f20651P;
            long j4 = this.f20657V;
            long j5 = this.f20658W;
            long j6 = this.f20661Z;
            return ((((((((((((((((((((((hashCode2 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f20652Q ? 1 : 0)) * 31) + (this.f20653R ? 1 : 0)) * 31) + (this.f20656U ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f20659X) * 31) + this.f20660Y) * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }

        public C6608d m19789j(Object obj, C6660o1 o1Var, Object obj2, long j, long j2, long j3, boolean z, boolean z2, C6660o1.C6669g gVar, long j4, long j5, int i, int i2, long j6) {
            C6660o1.C6671h hVar;
            this.f20662a = obj;
            this.f20664c = o1Var != null ? o1Var : f20646c0;
            this.f20663b = (o1Var == null || (hVar = o1Var.f20816b) == null) ? null : hVar.f20882i;
            this.f20648M = obj2;
            this.f20649N = j;
            this.f20650O = j2;
            this.f20651P = j3;
            this.f20652Q = z;
            this.f20653R = z2;
            this.f20654S = gVar != null;
            this.f20655T = gVar;
            this.f20657V = j4;
            this.f20658W = j5;
            this.f20659X = i;
            this.f20660Y = i2;
            this.f20661Z = j6;
            this.f20656U = false;
            return this;
        }
    }

    public static AbstractC6604g3 m19831b(Bundle bundle) {
        AbstractC11396q c = m19830c(C6608d.f20647d0, C1188b.m38164a(bundle, m19818y(0)));
        AbstractC11396q c2 = m19830c(C6606b.f20632Q, C1188b.m38164a(bundle, m19818y(1)));
        int[] intArray = bundle.getIntArray(m19818y(2));
        if (intArray == null) {
            intArray = m19829d(c.size());
        }
        return new C6607c(c, c2, intArray);
    }

    public static <T extends AbstractC6609h> AbstractC11396q<T> m19830c(AbstractC6609h.AbstractC6610a<T> aVar, IBinder iBinder) {
        if (iBinder == null) {
            return AbstractC11396q.m768D();
        }
        AbstractC11396q.C11397a aVar2 = new AbstractC11396q.C11397a();
        AbstractC11396q<Bundle> a = BinderC6598g.m19904a(iBinder);
        for (int i = 0; i < a.size(); i++) {
            aVar2.m757d(aVar.mo998a(a.get(i)));
        }
        return aVar2.m756e();
    }

    public static int[] m19829d(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
        }
        return iArr;
    }

    public static String m19818y(int i) {
        return Integer.toString(i, 36);
    }

    public int mo17401e(boolean z) {
        return m19820w() ? -1 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC6604g3)) {
            return false;
        }
        AbstractC6604g3 g3Var = (AbstractC6604g3) obj;
        if (!(g3Var.mo17297v() == mo17297v() && g3Var.mo17300m() == mo17300m())) {
            return false;
        }
        C6608d dVar = new C6608d();
        C6606b bVar = new C6606b();
        C6608d dVar2 = new C6608d();
        C6606b bVar2 = new C6606b();
        for (int i = 0; i < mo17297v(); i++) {
            if (!m19821t(i, dVar).equals(g3Var.m19821t(i, dVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < mo17300m(); i2++) {
            if (!mo17301k(i2, bVar, true).equals(g3Var.mo17301k(i2, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public abstract int mo17302f(Object obj);

    public int mo17400g(boolean z) {
        if (m19820w()) {
            return -1;
        }
        return mo17297v() - 1;
    }

    public final int m19828h(int i, C6606b bVar, C6608d dVar, int i2, boolean z) {
        int i3 = m19827j(i, bVar).f20639c;
        if (m19821t(i3, dVar).f20660Y != i) {
            return i + 1;
        }
        int i4 = mo17346i(i3, i2, z);
        if (i4 == -1) {
            return -1;
        }
        return m19821t(i4, dVar).f20659X;
    }

    public int hashCode() {
        C6608d dVar = new C6608d();
        C6606b bVar = new C6606b();
        int v = 217 + mo17297v();
        for (int i = 0; i < mo17297v(); i++) {
            v = (v * 31) + m19821t(i, dVar).hashCode();
        }
        int m = (v * 31) + mo17300m();
        for (int i2 = 0; i2 < mo17300m(); i2++) {
            m = (m * 31) + mo17301k(i2, bVar, true).hashCode();
        }
        return m;
    }

    public int mo17346i(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 != 2) {
                throw new IllegalStateException();
            } else if (i == mo17400g(z)) {
                return mo17401e(z);
            } else {
                return i + 1;
            }
        } else if (i == mo17400g(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    public final C6606b m19827j(int i, C6606b bVar) {
        return mo17301k(i, bVar, false);
    }

    public abstract C6606b mo17301k(int i, C6606b bVar, boolean z);

    public C6606b mo19826l(Object obj, C6606b bVar) {
        return mo17301k(mo17302f(obj), bVar, true);
    }

    public abstract int mo17300m();

    @InlineMe(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs)")
    @Deprecated
    public final Pair<Object, Long> m19825n(C6608d dVar, C6606b bVar, int i, long j) {
        return m19823p(dVar, bVar, i, j);
    }

    @InlineMe(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs, defaultPositionProjectionUs)")
    @Deprecated
    public final Pair<Object, Long> m19824o(C6608d dVar, C6606b bVar, int i, long j, long j2) {
        return m19822q(dVar, bVar, i, j, j2);
    }

    public final Pair<Object, Long> m19823p(C6608d dVar, C6606b bVar, int i, long j) {
        return (Pair) C1186a.m38188e(m19824o(dVar, bVar, i, j, 0L));
    }

    public final Pair<Object, Long> m19822q(C6608d dVar, C6606b bVar, int i, long j, long j2) {
        C1186a.m38190c(i, 0, mo17297v());
        mo17298u(i, dVar, j2);
        if (j == -9223372036854775807L) {
            j = dVar.m19794e();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = dVar.f20659X;
        m19827j(i2, bVar);
        while (i2 < dVar.f20660Y && bVar.f20634N != j) {
            int i3 = i2 + 1;
            if (m19827j(i3, bVar).f20634N > j) {
                break;
            }
            i2 = i3;
        }
        mo17301k(i2, bVar, true);
        long j3 = j - bVar.f20634N;
        long j4 = bVar.f20633M;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        return Pair.create(C1186a.m38188e(bVar.f20638b), Long.valueOf(Math.max(0L, j3)));
    }

    public int mo17345r(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 != 2) {
                throw new IllegalStateException();
            } else if (i == mo17401e(z)) {
                return mo17400g(z);
            } else {
                return i - 1;
            }
        } else if (i == mo17401e(z)) {
            return -1;
        } else {
            return i - 1;
        }
    }

    public abstract Object mo17299s(int i);

    public final C6608d m19821t(int i, C6608d dVar) {
        return mo17298u(i, dVar, 0L);
    }

    public abstract C6608d mo17298u(int i, C6608d dVar, long j);

    public abstract int mo17297v();

    public final boolean m19820w() {
        return mo17297v() == 0;
    }

    public final boolean m19819x(int i, C6606b bVar, C6608d dVar, int i2, boolean z) {
        return m19828h(i, bVar, dVar, i2, z) == -1;
    }
}
