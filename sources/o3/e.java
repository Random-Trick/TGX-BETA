package o3;

import android.media.AudioAttributes;
import android.os.Bundle;
import c5.l0;
import m3.h;

public final class e implements h {
    public static final e P = new d().a();
    public static final h.a<e> Q = o3.d.f18751a;
    public final int M;
    public final int N;
    public AudioAttributes O;
    public final int f18764a;
    public final int f18765b;
    public final int f18766c;

    public static final class b {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setAllowedCapturePolicy(i10);
        }
    }

    public static final class c {
        public static void a(AudioAttributes.Builder builder, int i10) {
            try {
                builder.getClass().getMethod("setSpatializationBehavior", Integer.TYPE).invoke(builder, Integer.valueOf(i10));
            } catch (Exception unused) {
            }
        }
    }

    public static final class d {
        public int f18767a = 0;
        public int f18768b = 0;
        public int f18769c = 1;
        public int f18770d = 1;
        public int f18771e = 0;

        public e a() {
            return new e(this.f18767a, this.f18768b, this.f18769c, this.f18770d, this.f18771e);
        }

        public d b(int i10) {
            this.f18770d = i10;
            return this;
        }

        public d c(int i10) {
            this.f18767a = i10;
            return this;
        }

        public d d(int i10) {
            this.f18768b = i10;
            return this;
        }

        public d e(int i10) {
            this.f18771e = i10;
            return this;
        }

        public d f(int i10) {
            this.f18769c = i10;
            return this;
        }
    }

    public static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    public static e d(Bundle bundle) {
        d dVar = new d();
        if (bundle.containsKey(c(0))) {
            dVar.c(bundle.getInt(c(0)));
        }
        if (bundle.containsKey(c(1))) {
            dVar.d(bundle.getInt(c(1)));
        }
        if (bundle.containsKey(c(2))) {
            dVar.f(bundle.getInt(c(2)));
        }
        if (bundle.containsKey(c(3))) {
            dVar.b(bundle.getInt(c(3)));
        }
        if (bundle.containsKey(c(4))) {
            dVar.e(bundle.getInt(c(4)));
        }
        return dVar.a();
    }

    public AudioAttributes b() {
        if (this.O == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f18764a).setFlags(this.f18765b).setUsage(this.f18766c);
            int i10 = l0.f4841a;
            if (i10 >= 29) {
                b.a(usage, this.M);
            }
            if (i10 >= 32) {
                c.a(usage, this.N);
            }
            this.O = usage.build();
        }
        return this.O;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f18764a == eVar.f18764a && this.f18765b == eVar.f18765b && this.f18766c == eVar.f18766c && this.M == eVar.M && this.N == eVar.N;
    }

    public int hashCode() {
        return ((((((((527 + this.f18764a) * 31) + this.f18765b) * 31) + this.f18766c) * 31) + this.M) * 31) + this.N;
    }

    public e(int i10, int i11, int i12, int i13, int i14) {
        this.f18764a = i10;
        this.f18765b = i11;
        this.f18766c = i12;
        this.M = i13;
        this.N = i14;
    }
}
