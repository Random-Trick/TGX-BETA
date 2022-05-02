package p199o3;

import android.media.AudioAttributes;
import android.os.Bundle;
import p020b5.C1216l0;
import p174m3.AbstractC6609h;

public final class C7602e implements AbstractC6609h {
    public static final C7602e f24329O = new C7604b().m15532a();
    public static final AbstractC6609h.AbstractC6610a<C7602e> f24330P = C7600d.f24325a;
    public final int f24331M;
    public AudioAttributes f24332N;
    public final int f24333a;
    public final int f24334b;
    public final int f24335c;

    public static final class C7604b {
        public int f24336a = 0;
        public int f24337b = 0;
        public int f24338c = 1;
        public int f24339d = 1;

        public C7602e m15532a() {
            return new C7602e(this.f24336a, this.f24337b, this.f24338c, this.f24339d);
        }

        public C7604b m15531b(int i) {
            this.f24339d = i;
            return this;
        }

        public C7604b m15530c(int i) {
            this.f24336a = i;
            return this;
        }

        public C7604b m15529d(int i) {
            this.f24337b = i;
            return this;
        }

        public C7604b m15528e(int i) {
            this.f24338c = i;
            return this;
        }
    }

    public static String m15534c(int i) {
        return Integer.toString(i, 36);
    }

    public static C7602e m15533d(Bundle bundle) {
        C7604b bVar = new C7604b();
        if (bundle.containsKey(m15534c(0))) {
            bVar.m15530c(bundle.getInt(m15534c(0)));
        }
        if (bundle.containsKey(m15534c(1))) {
            bVar.m15529d(bundle.getInt(m15534c(1)));
        }
        if (bundle.containsKey(m15534c(2))) {
            bVar.m15528e(bundle.getInt(m15534c(2)));
        }
        if (bundle.containsKey(m15534c(3))) {
            bVar.m15531b(bundle.getInt(m15534c(3)));
        }
        return bVar.m15532a();
    }

    public AudioAttributes m15535b() {
        if (this.f24332N == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f24333a).setFlags(this.f24334b).setUsage(this.f24335c);
            if (C1216l0.f4526a >= 29) {
                usage.setAllowedCapturePolicy(this.f24331M);
            }
            this.f24332N = usage.build();
        }
        return this.f24332N;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7602e.class != obj.getClass()) {
            return false;
        }
        C7602e eVar = (C7602e) obj;
        return this.f24333a == eVar.f24333a && this.f24334b == eVar.f24334b && this.f24335c == eVar.f24335c && this.f24331M == eVar.f24331M;
    }

    public int hashCode() {
        return ((((((527 + this.f24333a) * 31) + this.f24334b) * 31) + this.f24335c) * 31) + this.f24331M;
    }

    public C7602e(int i, int i2, int i3, int i4) {
        this.f24333a = i;
        this.f24334b = i2;
        this.f24335c = i3;
        this.f24331M = i4;
    }
}
