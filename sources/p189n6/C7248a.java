package p189n6;

import android.app.PendingIntent;

public class C7248a {
    public final String f23066a;
    public final int f23067b;
    public final int f23068c;
    public final int f23069d;
    public final Integer f23070e;
    public final int f23071f;
    public final long f23072g;
    public final long f23073h;
    public final long f23074i;
    public final long f23075j;
    public final PendingIntent f23076k;
    public final PendingIntent f23077l;
    public final PendingIntent f23078m;
    public final PendingIntent f23079n;
    public boolean f23080o = false;

    public C7248a(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        this.f23066a = str;
        this.f23067b = i;
        this.f23068c = i2;
        this.f23069d = i3;
        this.f23070e = num;
        this.f23071f = i4;
        this.f23072g = j;
        this.f23073h = j2;
        this.f23074i = j3;
        this.f23075j = j4;
        this.f23076k = pendingIntent;
        this.f23077l = pendingIntent2;
        this.f23078m = pendingIntent3;
        this.f23079n = pendingIntent4;
    }

    public static C7248a m17199i(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        return new C7248a(str, i, i2, i3, num, i4, j, j2, j3, j4, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4);
    }

    public int m17207a() {
        return this.f23067b;
    }

    public long m17206b() {
        return this.f23072g;
    }

    public int m17205c() {
        return this.f23069d;
    }

    public boolean m17204d(int i) {
        return m17200h(AbstractC7254d.m17190c(i)) != null;
    }

    public boolean m17203e(AbstractC7254d dVar) {
        return m17200h(dVar) != null;
    }

    public long m17202f() {
        return this.f23073h;
    }

    public int m17201g() {
        return this.f23068c;
    }

    public final PendingIntent m17200h(AbstractC7254d dVar) {
        if (dVar.mo17191b() == 0) {
            PendingIntent pendingIntent = this.f23077l;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (m17196l(dVar)) {
                return this.f23079n;
            }
            return null;
        }
        if (dVar.mo17191b() == 1) {
            PendingIntent pendingIntent2 = this.f23076k;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (m17196l(dVar)) {
                return this.f23078m;
            }
        }
        return null;
    }

    public final void m17198j() {
        this.f23080o = true;
    }

    public final boolean m17197k() {
        return this.f23080o;
    }

    public final boolean m17196l(AbstractC7254d dVar) {
        return dVar.mo17192a() && this.f23074i <= this.f23075j;
    }
}
