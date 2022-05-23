package m3;

import android.net.Uri;
import android.os.Bundle;
import c5.l0;
import java.util.Arrays;
import java.util.List;
import m3.h;
import z6.i;

public final class c2 implements h {
    public static final c2 f16553q0 = new b().G();
    public static final h.a<c2> f16554r0 = b2.f16547a;
    public final CharSequence M;
    public final CharSequence N;
    public final CharSequence O;
    public final CharSequence P;
    public final Uri Q;
    public final z2 R;
    public final z2 S;
    public final byte[] T;
    public final Integer U;
    public final Uri V;
    public final Integer W;
    public final Integer X;
    public final Integer Y;
    public final Boolean Z;
    public final CharSequence f16555a;
    @Deprecated
    public final Integer f16556a0;
    public final CharSequence f16557b;
    public final Integer f16558b0;
    public final CharSequence f16559c;
    public final Integer f16560c0;
    public final Integer f16561d0;
    public final Integer f16562e0;
    public final Integer f16563f0;
    public final Integer f16564g0;
    public final CharSequence f16565h0;
    public final CharSequence f16566i0;
    public final CharSequence f16567j0;
    public final Integer f16568k0;
    public final Integer f16569l0;
    public final CharSequence f16570m0;
    public final CharSequence f16571n0;
    public final CharSequence f16572o0;
    public final Bundle f16573p0;

    public static final class b {
        public Integer A;
        public Integer B;
        public CharSequence C;
        public CharSequence D;
        public CharSequence E;
        public Bundle F;
        public CharSequence f16574a;
        public CharSequence f16575b;
        public CharSequence f16576c;
        public CharSequence f16577d;
        public CharSequence f16578e;
        public CharSequence f16579f;
        public CharSequence f16580g;
        public Uri f16581h;
        public z2 f16582i;
        public z2 f16583j;
        public byte[] f16584k;
        public Integer f16585l;
        public Uri f16586m;
        public Integer f16587n;
        public Integer f16588o;
        public Integer f16589p;
        public Boolean f16590q;
        public Integer f16591r;
        public Integer f16592s;
        public Integer f16593t;
        public Integer f16594u;
        public Integer f16595v;
        public Integer f16596w;
        public CharSequence f16597x;
        public CharSequence f16598y;
        public CharSequence f16599z;

        public b() {
        }

        public c2 G() {
            return new c2(this);
        }

        public b H(byte[] bArr, int i10) {
            if (this.f16584k == null || l0.c(Integer.valueOf(i10), 3) || !l0.c(this.f16585l, 3)) {
                this.f16584k = (byte[]) bArr.clone();
                this.f16585l = Integer.valueOf(i10);
            }
            return this;
        }

        public b I(c2 c2Var) {
            if (c2Var == null) {
                return this;
            }
            CharSequence charSequence = c2Var.f16555a;
            if (charSequence != null) {
                k0(charSequence);
            }
            CharSequence charSequence2 = c2Var.f16557b;
            if (charSequence2 != null) {
                N(charSequence2);
            }
            CharSequence charSequence3 = c2Var.f16559c;
            if (charSequence3 != null) {
                M(charSequence3);
            }
            CharSequence charSequence4 = c2Var.M;
            if (charSequence4 != null) {
                L(charSequence4);
            }
            CharSequence charSequence5 = c2Var.N;
            if (charSequence5 != null) {
                V(charSequence5);
            }
            CharSequence charSequence6 = c2Var.O;
            if (charSequence6 != null) {
                j0(charSequence6);
            }
            CharSequence charSequence7 = c2Var.P;
            if (charSequence7 != null) {
                T(charSequence7);
            }
            Uri uri = c2Var.Q;
            if (uri != null) {
                a0(uri);
            }
            z2 z2Var = c2Var.R;
            if (z2Var != null) {
                o0(z2Var);
            }
            z2 z2Var2 = c2Var.S;
            if (z2Var2 != null) {
                b0(z2Var2);
            }
            byte[] bArr = c2Var.T;
            if (bArr != null) {
                O(bArr, c2Var.U);
            }
            Uri uri2 = c2Var.V;
            if (uri2 != null) {
                P(uri2);
            }
            Integer num = c2Var.W;
            if (num != null) {
                n0(num);
            }
            Integer num2 = c2Var.X;
            if (num2 != null) {
                m0(num2);
            }
            Integer num3 = c2Var.Y;
            if (num3 != null) {
                X(num3);
            }
            Boolean bool = c2Var.Z;
            if (bool != null) {
                Z(bool);
            }
            Integer num4 = c2Var.f16556a0;
            if (num4 != null) {
                e0(num4);
            }
            Integer num5 = c2Var.f16558b0;
            if (num5 != null) {
                e0(num5);
            }
            Integer num6 = c2Var.f16560c0;
            if (num6 != null) {
                d0(num6);
            }
            Integer num7 = c2Var.f16561d0;
            if (num7 != null) {
                c0(num7);
            }
            Integer num8 = c2Var.f16562e0;
            if (num8 != null) {
                h0(num8);
            }
            Integer num9 = c2Var.f16563f0;
            if (num9 != null) {
                g0(num9);
            }
            Integer num10 = c2Var.f16564g0;
            if (num10 != null) {
                f0(num10);
            }
            CharSequence charSequence8 = c2Var.f16565h0;
            if (charSequence8 != null) {
                p0(charSequence8);
            }
            CharSequence charSequence9 = c2Var.f16566i0;
            if (charSequence9 != null) {
                R(charSequence9);
            }
            CharSequence charSequence10 = c2Var.f16567j0;
            if (charSequence10 != null) {
                S(charSequence10);
            }
            Integer num11 = c2Var.f16568k0;
            if (num11 != null) {
                U(num11);
            }
            Integer num12 = c2Var.f16569l0;
            if (num12 != null) {
                l0(num12);
            }
            CharSequence charSequence11 = c2Var.f16570m0;
            if (charSequence11 != null) {
                Y(charSequence11);
            }
            CharSequence charSequence12 = c2Var.f16571n0;
            if (charSequence12 != null) {
                Q(charSequence12);
            }
            CharSequence charSequence13 = c2Var.f16572o0;
            if (charSequence13 != null) {
                i0(charSequence13);
            }
            Bundle bundle = c2Var.f16573p0;
            if (bundle != null) {
                W(bundle);
            }
            return this;
        }

        public b J(f4.a aVar) {
            for (int i10 = 0; i10 < aVar.d(); i10++) {
                aVar.c(i10).populateMediaMetadata(this);
            }
            return this;
        }

        public b K(List<f4.a> list) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                f4.a aVar = list.get(i10);
                for (int i11 = 0; i11 < aVar.d(); i11++) {
                    aVar.c(i11).populateMediaMetadata(this);
                }
            }
            return this;
        }

        public b L(CharSequence charSequence) {
            this.f16577d = charSequence;
            return this;
        }

        public b M(CharSequence charSequence) {
            this.f16576c = charSequence;
            return this;
        }

        public b N(CharSequence charSequence) {
            this.f16575b = charSequence;
            return this;
        }

        public b O(byte[] bArr, Integer num) {
            this.f16584k = bArr == null ? null : (byte[]) bArr.clone();
            this.f16585l = num;
            return this;
        }

        public b P(Uri uri) {
            this.f16586m = uri;
            return this;
        }

        public b Q(CharSequence charSequence) {
            this.D = charSequence;
            return this;
        }

        public b R(CharSequence charSequence) {
            this.f16598y = charSequence;
            return this;
        }

        public b S(CharSequence charSequence) {
            this.f16599z = charSequence;
            return this;
        }

        public b T(CharSequence charSequence) {
            this.f16580g = charSequence;
            return this;
        }

        public b U(Integer num) {
            this.A = num;
            return this;
        }

        public b V(CharSequence charSequence) {
            this.f16578e = charSequence;
            return this;
        }

        public b W(Bundle bundle) {
            this.F = bundle;
            return this;
        }

        public b X(Integer num) {
            this.f16589p = num;
            return this;
        }

        public b Y(CharSequence charSequence) {
            this.C = charSequence;
            return this;
        }

        public b Z(Boolean bool) {
            this.f16590q = bool;
            return this;
        }

        public b a0(Uri uri) {
            this.f16581h = uri;
            return this;
        }

        public b b0(z2 z2Var) {
            this.f16583j = z2Var;
            return this;
        }

        public b c0(Integer num) {
            this.f16593t = num;
            return this;
        }

        public b d0(Integer num) {
            this.f16592s = num;
            return this;
        }

        public b e0(Integer num) {
            this.f16591r = num;
            return this;
        }

        public b f0(Integer num) {
            this.f16596w = num;
            return this;
        }

        public b g0(Integer num) {
            this.f16595v = num;
            return this;
        }

        public b h0(Integer num) {
            this.f16594u = num;
            return this;
        }

        public b i0(CharSequence charSequence) {
            this.E = charSequence;
            return this;
        }

        public b j0(CharSequence charSequence) {
            this.f16579f = charSequence;
            return this;
        }

        public b k0(CharSequence charSequence) {
            this.f16574a = charSequence;
            return this;
        }

        public b l0(Integer num) {
            this.B = num;
            return this;
        }

        public b m0(Integer num) {
            this.f16588o = num;
            return this;
        }

        public b n0(Integer num) {
            this.f16587n = num;
            return this;
        }

        public b o0(z2 z2Var) {
            this.f16582i = z2Var;
            return this;
        }

        public b p0(CharSequence charSequence) {
            this.f16597x = charSequence;
            return this;
        }

        public b(c2 c2Var) {
            this.f16574a = c2Var.f16555a;
            this.f16575b = c2Var.f16557b;
            this.f16576c = c2Var.f16559c;
            this.f16577d = c2Var.M;
            this.f16578e = c2Var.N;
            this.f16579f = c2Var.O;
            this.f16580g = c2Var.P;
            this.f16581h = c2Var.Q;
            this.f16582i = c2Var.R;
            this.f16583j = c2Var.S;
            this.f16584k = c2Var.T;
            this.f16585l = c2Var.U;
            this.f16586m = c2Var.V;
            this.f16587n = c2Var.W;
            this.f16588o = c2Var.X;
            this.f16589p = c2Var.Y;
            this.f16590q = c2Var.Z;
            this.f16591r = c2Var.f16558b0;
            this.f16592s = c2Var.f16560c0;
            this.f16593t = c2Var.f16561d0;
            this.f16594u = c2Var.f16562e0;
            this.f16595v = c2Var.f16563f0;
            this.f16596w = c2Var.f16564g0;
            this.f16597x = c2Var.f16565h0;
            this.f16598y = c2Var.f16566i0;
            this.f16599z = c2Var.f16567j0;
            this.A = c2Var.f16568k0;
            this.B = c2Var.f16569l0;
            this.C = c2Var.f16570m0;
            this.D = c2Var.f16571n0;
            this.E = c2Var.f16572o0;
            this.F = c2Var.f16573p0;
        }
    }

    public static c2 c(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        b bVar = new b();
        bVar.k0(bundle.getCharSequence(d(0))).N(bundle.getCharSequence(d(1))).M(bundle.getCharSequence(d(2))).L(bundle.getCharSequence(d(3))).V(bundle.getCharSequence(d(4))).j0(bundle.getCharSequence(d(5))).T(bundle.getCharSequence(d(6))).a0((Uri) bundle.getParcelable(d(7))).O(bundle.getByteArray(d(10)), bundle.containsKey(d(29)) ? Integer.valueOf(bundle.getInt(d(29))) : null).P((Uri) bundle.getParcelable(d(11))).p0(bundle.getCharSequence(d(22))).R(bundle.getCharSequence(d(23))).S(bundle.getCharSequence(d(24))).Y(bundle.getCharSequence(d(27))).Q(bundle.getCharSequence(d(28))).i0(bundle.getCharSequence(d(30))).W(bundle.getBundle(d(1000)));
        if (bundle.containsKey(d(8)) && (bundle3 = bundle.getBundle(d(8))) != null) {
            bVar.o0(z2.f17117a.a(bundle3));
        }
        if (bundle.containsKey(d(9)) && (bundle2 = bundle.getBundle(d(9))) != null) {
            bVar.b0(z2.f17117a.a(bundle2));
        }
        if (bundle.containsKey(d(12))) {
            bVar.n0(Integer.valueOf(bundle.getInt(d(12))));
        }
        if (bundle.containsKey(d(13))) {
            bVar.m0(Integer.valueOf(bundle.getInt(d(13))));
        }
        if (bundle.containsKey(d(14))) {
            bVar.X(Integer.valueOf(bundle.getInt(d(14))));
        }
        if (bundle.containsKey(d(15))) {
            bVar.Z(Boolean.valueOf(bundle.getBoolean(d(15))));
        }
        if (bundle.containsKey(d(16))) {
            bVar.e0(Integer.valueOf(bundle.getInt(d(16))));
        }
        if (bundle.containsKey(d(17))) {
            bVar.d0(Integer.valueOf(bundle.getInt(d(17))));
        }
        if (bundle.containsKey(d(18))) {
            bVar.c0(Integer.valueOf(bundle.getInt(d(18))));
        }
        if (bundle.containsKey(d(19))) {
            bVar.h0(Integer.valueOf(bundle.getInt(d(19))));
        }
        if (bundle.containsKey(d(20))) {
            bVar.g0(Integer.valueOf(bundle.getInt(d(20))));
        }
        if (bundle.containsKey(d(21))) {
            bVar.f0(Integer.valueOf(bundle.getInt(d(21))));
        }
        if (bundle.containsKey(d(25))) {
            bVar.U(Integer.valueOf(bundle.getInt(d(25))));
        }
        if (bundle.containsKey(d(26))) {
            bVar.l0(Integer.valueOf(bundle.getInt(d(26))));
        }
        return bVar.G();
    }

    public static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    public b b() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c2.class != obj.getClass()) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return l0.c(this.f16555a, c2Var.f16555a) && l0.c(this.f16557b, c2Var.f16557b) && l0.c(this.f16559c, c2Var.f16559c) && l0.c(this.M, c2Var.M) && l0.c(this.N, c2Var.N) && l0.c(this.O, c2Var.O) && l0.c(this.P, c2Var.P) && l0.c(this.Q, c2Var.Q) && l0.c(this.R, c2Var.R) && l0.c(this.S, c2Var.S) && Arrays.equals(this.T, c2Var.T) && l0.c(this.U, c2Var.U) && l0.c(this.V, c2Var.V) && l0.c(this.W, c2Var.W) && l0.c(this.X, c2Var.X) && l0.c(this.Y, c2Var.Y) && l0.c(this.Z, c2Var.Z) && l0.c(this.f16558b0, c2Var.f16558b0) && l0.c(this.f16560c0, c2Var.f16560c0) && l0.c(this.f16561d0, c2Var.f16561d0) && l0.c(this.f16562e0, c2Var.f16562e0) && l0.c(this.f16563f0, c2Var.f16563f0) && l0.c(this.f16564g0, c2Var.f16564g0) && l0.c(this.f16565h0, c2Var.f16565h0) && l0.c(this.f16566i0, c2Var.f16566i0) && l0.c(this.f16567j0, c2Var.f16567j0) && l0.c(this.f16568k0, c2Var.f16568k0) && l0.c(this.f16569l0, c2Var.f16569l0) && l0.c(this.f16570m0, c2Var.f16570m0) && l0.c(this.f16571n0, c2Var.f16571n0) && l0.c(this.f16572o0, c2Var.f16572o0);
    }

    public int hashCode() {
        return i.b(this.f16555a, this.f16557b, this.f16559c, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, Integer.valueOf(Arrays.hashCode(this.T)), this.U, this.V, this.W, this.X, this.Y, this.Z, this.f16558b0, this.f16560c0, this.f16561d0, this.f16562e0, this.f16563f0, this.f16564g0, this.f16565h0, this.f16566i0, this.f16567j0, this.f16568k0, this.f16569l0, this.f16570m0, this.f16571n0, this.f16572o0);
    }

    public c2(b bVar) {
        this.f16555a = bVar.f16574a;
        this.f16557b = bVar.f16575b;
        this.f16559c = bVar.f16576c;
        this.M = bVar.f16577d;
        this.N = bVar.f16578e;
        this.O = bVar.f16579f;
        this.P = bVar.f16580g;
        this.Q = bVar.f16581h;
        this.R = bVar.f16582i;
        this.S = bVar.f16583j;
        this.T = bVar.f16584k;
        this.U = bVar.f16585l;
        this.V = bVar.f16586m;
        this.W = bVar.f16587n;
        this.X = bVar.f16588o;
        this.Y = bVar.f16589p;
        this.Z = bVar.f16590q;
        this.f16556a0 = bVar.f16591r;
        this.f16558b0 = bVar.f16591r;
        this.f16560c0 = bVar.f16592s;
        this.f16561d0 = bVar.f16593t;
        this.f16562e0 = bVar.f16594u;
        this.f16563f0 = bVar.f16595v;
        this.f16564g0 = bVar.f16596w;
        this.f16565h0 = bVar.f16597x;
        this.f16566i0 = bVar.f16598y;
        this.f16567j0 = bVar.f16599z;
        this.f16568k0 = bVar.A;
        this.f16569l0 = bVar.B;
        this.f16570m0 = bVar.C;
        this.f16571n0 = bVar.D;
        this.f16572o0 = bVar.E;
        this.f16573p0 = bVar.F;
    }
}
