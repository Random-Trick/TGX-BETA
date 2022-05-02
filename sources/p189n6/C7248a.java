package p189n6;

import android.app.PendingIntent;

public class C7248a {
    public final String f23069a;
    public final int f23070b;
    public final int f23071c;
    public final int f23072d;
    public final Integer f23073e;
    public final int f23074f;
    public final long f23075g;
    public final long f23076h;
    public final long f23077i;
    public final long f23078j;
    public final PendingIntent f23079k;
    public final PendingIntent f23080l;
    public final PendingIntent f23081m;
    public final PendingIntent f23082n;
    public boolean f23083o = false;

    public C7248a(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        this.f23069a = str;
        this.f23070b = i;
        this.f23071c = i2;
        this.f23072d = i3;
        this.f23073e = num;
        this.f23074f = i4;
        this.f23075g = j;
        this.f23076h = j2;
        this.f23077i = j3;
        this.f23078j = j4;
        this.f23079k = pendingIntent;
        this.f23080l = pendingIntent2;
        this.f23081m = pendingIntent3;
        this.f23082n = pendingIntent4;
    }

    public static C7248a m17199i(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        return new C7248a(str, i, i2, i3, num, i4, j, j2, j3, j4, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4);
    }

    public int m17207a() {
        return this.f23070b;
    }

    public long m17206b() {
        return this.f23075g;
    }

    public int m17205c() {
        return this.f23072d;
    }

    public boolean m17204d(int i) {
        return m17200h(AbstractC7254d.m17190c(i)) != null;
    }

    public boolean m17203e(AbstractC7254d dVar) {
        return m17200h(dVar) != null;
    }

    public long m17202f() {
        return this.f23076h;
    }

    public int m17201g() {
        return this.f23071c;
    }

    public final PendingIntent m17200h(AbstractC7254d dVar) {
        if (dVar.mo17191b() == 0) {
            PendingIntent pendingIntent = this.f23080l;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (m17196l(dVar)) {
                return this.f23082n;
            }
            return null;
        }
        if (dVar.mo17191b() == 1) {
            PendingIntent pendingIntent2 = this.f23079k;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (m17196l(dVar)) {
                return this.f23081m;
            }
        }
        return null;
    }

    public final void m17198j() {
        this.f23083o = true;
    }

    public final boolean m17197k() {
        return this.f23083o;
    }

    public final boolean m17196l(AbstractC7254d dVar) {
        return dVar.mo17192a() && this.f23077i <= this.f23078j;
    }
}
