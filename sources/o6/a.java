package o6;

import android.app.PendingIntent;

public class a {
    public final String f19206a;
    public final int f19207b;
    public final int f19208c;
    public final int f19209d;
    public final Integer f19210e;
    public final int f19211f;
    public final long f19212g;
    public final long f19213h;
    public final long f19214i;
    public final long f19215j;
    public final PendingIntent f19216k;
    public final PendingIntent f19217l;
    public final PendingIntent f19218m;
    public final PendingIntent f19219n;
    public boolean f19220o = false;

    public a(String str, int i10, int i11, int i12, Integer num, int i13, long j10, long j11, long j12, long j13, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        this.f19206a = str;
        this.f19207b = i10;
        this.f19208c = i11;
        this.f19209d = i12;
        this.f19210e = num;
        this.f19211f = i13;
        this.f19212g = j10;
        this.f19213h = j11;
        this.f19214i = j12;
        this.f19215j = j13;
        this.f19216k = pendingIntent;
        this.f19217l = pendingIntent2;
        this.f19218m = pendingIntent3;
        this.f19219n = pendingIntent4;
    }

    public static a i(String str, int i10, int i11, int i12, Integer num, int i13, long j10, long j11, long j12, long j13, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        return new a(str, i10, i11, i12, num, i13, j10, j11, j12, j13, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4);
    }

    public int a() {
        return this.f19207b;
    }

    public long b() {
        return this.f19212g;
    }

    public int c() {
        return this.f19209d;
    }

    public boolean d(int i10) {
        return h(d.c(i10)) != null;
    }

    public boolean e(d dVar) {
        return h(dVar) != null;
    }

    public long f() {
        return this.f19213h;
    }

    public int g() {
        return this.f19208c;
    }

    public final PendingIntent h(d dVar) {
        if (dVar.b() == 0) {
            PendingIntent pendingIntent = this.f19217l;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (l(dVar)) {
                return this.f19219n;
            }
            return null;
        }
        if (dVar.b() == 1) {
            PendingIntent pendingIntent2 = this.f19216k;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (l(dVar)) {
                return this.f19218m;
            }
        }
        return null;
    }

    public final void j() {
        this.f19220o = true;
    }

    public final boolean k() {
        return this.f19220o;
    }

    public final boolean l(d dVar) {
        return dVar.a() && this.f19214i <= this.f19215j;
    }
}
