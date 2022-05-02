package p174m3;

import android.os.Bundle;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.List;
import p020b5.C1190c;
import p020b5.C1213l;
import p032c5.C1607b0;
import p073f4.C4260a;
import p174m3.AbstractC6609h;
import p187n4.C7233t0;
import p199o3.C7602e;
import p217p4.C8032b;
import p343y6.C10432h;
import p356z4.C11272n;

public interface AbstractC6618i2 {

    public static final class C6620b implements AbstractC6609h {
        public static final C6620b f20683b = new C6621a().m19765e();
        public static final AbstractC6609h.AbstractC6610a<C6620b> f20684c = C6632j2.f20732a;
        public final C1213l f20685a;

        public static final class C6621a {
            public static final int[] f20686b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
            public final C1213l.C1215b f20687a = new C1213l.C1215b();

            public C6621a m19769a(int i) {
                this.f20687a.m38026a(i);
                return this;
            }

            public C6621a m19768b(C6620b bVar) {
                this.f20687a.m38025b(bVar.f20685a);
                return this;
            }

            public C6621a m19767c(int... iArr) {
                this.f20687a.m38024c(iArr);
                return this;
            }

            public C6621a m19766d(int i, boolean z) {
                this.f20687a.m38023d(i, z);
                return this;
            }

            public C6620b m19765e() {
                return new C6620b(this.f20687a.m38022e());
            }
        }

        public static C6620b m19771c(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(m19770d(0));
            if (integerArrayList == null) {
                return f20683b;
            }
            C6621a aVar = new C6621a();
            for (int i = 0; i < integerArrayList.size(); i++) {
                aVar.m19769a(integerArrayList.get(i).intValue());
            }
            return aVar.m19765e();
        }

        public static String m19770d(int i) {
            return Integer.toString(i, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6620b)) {
                return false;
            }
            return this.f20685a.equals(((C6620b) obj).f20685a);
        }

        public int hashCode() {
            return this.f20685a.hashCode();
        }

        public C6620b(C1213l lVar) {
            this.f20685a = lVar;
        }
    }

    @Deprecated
    public interface AbstractC6622c {
        void mo7370C(boolean z);

        void mo7368K(AbstractC6604g3 g3Var, int i);

        @Deprecated
        void mo7366M(boolean z, int i);

        void mo7365N(C6693s1 s1Var);

        void mo7364R(int i);

        void mo7361a0(boolean z, int i);

        void mo7359b0(C6660o1 o1Var, int i);

        void mo7358c(C6613h2 h2Var);

        void mo7357c0(AbstractC6618i2 i2Var, C6623d dVar);

        void mo7355e0(C6591e2 e2Var);

        void mo7352h(int i);

        void mo7351i0(C6620b bVar);

        @Deprecated
        void mo7348k(boolean z);

        @Deprecated
        void mo7347l(int i);

        void mo7346l0(C6591e2 e2Var);

        void mo7344m0(boolean z);

        void mo7343o(boolean z);

        @Deprecated
        void mo7342p();

        void mo7341q(C6644l3 l3Var);

        void mo7340s(C6625f fVar, C6625f fVar2, int i);

        @Deprecated
        void mo7339t(C7233t0 t0Var, C11272n nVar);

        void mo7223w(int i);
    }

    public static final class C6623d {
        public final C1213l f20688a;

        public C6623d(C1213l lVar) {
            this.f20688a = lVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6623d)) {
                return false;
            }
            return this.f20688a.equals(((C6623d) obj).f20688a);
        }

        public int hashCode() {
            return this.f20688a.hashCode();
        }
    }

    public interface AbstractC6624e extends AbstractC6622c {
        void mo7367L(int i, boolean z);

        void mo7363V(C7602e eVar);

        void mo7362a(boolean z);

        void mo7360b(C1607b0 b0Var);

        void mo7356d(C4260a aVar);

        void mo7252e();

        void mo7354f0(int i, int i2);

        void mo7353g(List<C8032b> list);

        void mo7349j0(C6658o oVar);

        void mo7338u(float f);
    }

    public static final class C6625f implements AbstractC6609h {
        public static final AbstractC6609h.AbstractC6610a<C6625f> f20689T = C6649m2.f20777a;
        public final C6660o1 f20690M;
        public final Object f20691N;
        public final int f20692O;
        public final long f20693P;
        public final long f20694Q;
        public final int f20695R;
        public final int f20696S;
        public final Object f20697a;
        @Deprecated
        public final int f20698b;
        public final int f20699c;

        public C6625f(Object obj, int i, C6660o1 o1Var, Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.f20697a = obj;
            this.f20698b = i;
            this.f20699c = i;
            this.f20690M = o1Var;
            this.f20691N = obj2;
            this.f20692O = i2;
            this.f20693P = j;
            this.f20694Q = j2;
            this.f20695R = i3;
            this.f20696S = i4;
        }

        public static C6625f m19763b(Bundle bundle) {
            return new C6625f(null, bundle.getInt(m19762c(0), -1), (C6660o1) C1190c.m38112e(C6660o1.f20810R, bundle.getBundle(m19762c(1))), null, bundle.getInt(m19762c(2), -1), bundle.getLong(m19762c(3), -9223372036854775807L), bundle.getLong(m19762c(4), -9223372036854775807L), bundle.getInt(m19762c(5), -1), bundle.getInt(m19762c(6), -1));
        }

        public static String m19762c(int i) {
            return Integer.toString(i, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C6625f.class != obj.getClass()) {
                return false;
            }
            C6625f fVar = (C6625f) obj;
            return this.f20699c == fVar.f20699c && this.f20692O == fVar.f20692O && this.f20693P == fVar.f20693P && this.f20694Q == fVar.f20694Q && this.f20695R == fVar.f20695R && this.f20696S == fVar.f20696S && C10432h.m5139a(this.f20697a, fVar.f20697a) && C10432h.m5139a(this.f20691N, fVar.f20691N) && C10432h.m5139a(this.f20690M, fVar.f20690M);
        }

        public int hashCode() {
            return C10432h.m5138b(this.f20697a, Integer.valueOf(this.f20699c), this.f20690M, this.f20691N, Integer.valueOf(this.f20692O), Long.valueOf(this.f20693P), Long.valueOf(this.f20694Q), Integer.valueOf(this.f20695R), Integer.valueOf(this.f20696S));
        }
    }

    int mo19316C();

    int mo19314D();

    void mo19312E(int i);

    @Deprecated
    int mo19781F();

    void mo19780G(int i, int i2);

    void mo19308H(int i, int i2, int i3);

    void mo19383I(AbstractC6624e eVar);

    @Deprecated
    C7233t0 mo19305J();

    int mo19303K();

    AbstractC6604g3 mo19301L();

    boolean mo19297N();

    void mo19375O(TextureView textureView);

    void mo19294P(AbstractC6624e eVar);

    long mo19292Q();

    void mo19281a();

    void mo19279b();

    void mo19779c(long j);

    void mo19275d(C6613h2 h2Var);

    void mo19360f(float f);

    long mo19267g();

    boolean mo19264h();

    long mo19261i();

    void mo19258j(int i, long j);

    boolean mo19255k();

    void mo19252l(boolean z);

    int mo19249m();

    int mo19246n();

    void mo19350o(SurfaceView surfaceView);

    void mo19778q(int i);

    int mo19777r();

    void mo19231t(int i, int i2);

    @Deprecated
    int mo19776u();

    void mo19340v(boolean z);

    void mo19775w(int i);

    long mo19222x();

    @Deprecated
    int mo19774y();

    int mo19217z();
}
