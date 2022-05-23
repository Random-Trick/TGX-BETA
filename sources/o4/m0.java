package o4;

import android.net.Uri;
import c5.a;
import m3.o3;
import m3.y1;

public final class m0 extends o3 {
    public static final Object Y = new Object();
    public static final y1 Z = new y1.c().c("SinglePeriodTimeline").e(Uri.EMPTY).a();
    public final long M;
    public final long N;
    public final long O;
    public final long P;
    public final long Q;
    public final long R;
    public final boolean S;
    public final boolean T;
    public final boolean U;
    public final Object V;
    public final y1 W;
    public final y1.g X;
    public final long f19144c;

    public m0(long j10, boolean z10, boolean z11, boolean z12, Object obj, y1 y1Var) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, y1Var);
    }

    @Override
    public int f(Object obj) {
        return Y.equals(obj) ? 0 : -1;
    }

    @Override
    public o3.b k(int i10, o3.b bVar, boolean z10) {
        a.c(i10, 0, 1);
        return bVar.v(null, z10 ? Y : null, 0, this.O, -this.Q);
    }

    @Override
    public int m() {
        return 1;
    }

    @Override
    public Object q(int i10) {
        a.c(i10, 0, 1);
        return Y;
    }

    @Override
    public m3.o3.d s(int r25, m3.o3.d r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: o4.m0.s(int, m3.o3$d, long):m3.o3$d");
    }

    @Override
    public int t() {
        return 1;
    }

    public m0(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, y1 y1Var) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, false, obj, y1Var, z12 ? y1Var.M : null);
    }

    public m0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, y1 y1Var, y1.g gVar) {
        this.f19144c = j10;
        this.M = j11;
        this.N = j12;
        this.O = j13;
        this.P = j14;
        this.Q = j15;
        this.R = j16;
        this.S = z10;
        this.T = z11;
        this.U = z12;
        this.V = obj;
        this.W = (y1) a.e(y1Var);
        this.X = gVar;
    }
}
