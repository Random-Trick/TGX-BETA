package q4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c5.a;
import c5.l0;
import c5.s;
import c5.w;
import java.util.Collections;
import java.util.List;
import m3.c3;
import m3.f;
import m3.q1;
import m3.r1;

public final class m extends f implements Handler.Callback {
    public final Handler W;
    public final l X;
    public final i Y;
    public final r1 Z;
    public boolean f21412a0;
    public boolean f21413b0;
    public boolean f21414c0;
    public int f21415d0;
    public q1 f21416e0;
    public g f21417f0;
    public j f21418g0;
    public k f21419h0;
    public k f21420i0;
    public int f21421j0;
    public long f21422k0;

    public m(l lVar, Looper looper) {
        this(lVar, looper, i.f21409a);
    }

    @Override
    public void J() {
        this.f21416e0 = null;
        this.f21422k0 = -9223372036854775807L;
        T();
        Z();
    }

    @Override
    public void L(long j10, boolean z10) {
        T();
        this.f21412a0 = false;
        this.f21413b0 = false;
        this.f21422k0 = -9223372036854775807L;
        if (this.f21415d0 != 0) {
            a0();
            return;
        }
        Y();
        ((g) a.e(this.f21417f0)).flush();
    }

    @Override
    public void P(q1[] q1VarArr, long j10, long j11) {
        this.f21416e0 = q1VarArr[0];
        if (this.f21417f0 != null) {
            this.f21415d0 = 1;
        } else {
            W();
        }
    }

    public final void T() {
        c0(Collections.emptyList());
    }

    public final long U() {
        if (this.f21421j0 == -1) {
            return Long.MAX_VALUE;
        }
        a.e(this.f21419h0);
        if (this.f21421j0 >= this.f21419h0.d()) {
            return Long.MAX_VALUE;
        }
        return this.f21419h0.b(this.f21421j0);
    }

    public final void V(h hVar) {
        String valueOf = String.valueOf(this.f21416e0);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 39);
        sb2.append("Subtitle decoding failed. streamFormat=");
        sb2.append(valueOf);
        s.d("TextRenderer", sb2.toString(), hVar);
        T();
        a0();
    }

    public final void W() {
        this.f21414c0 = true;
        this.f21417f0 = this.Y.b((q1) a.e(this.f21416e0));
    }

    public final void X(List<b> list) {
        this.X.r(list);
    }

    public final void Y() {
        this.f21418g0 = null;
        this.f21421j0 = -1;
        k kVar = this.f21419h0;
        if (kVar != null) {
            kVar.release();
            this.f21419h0 = null;
        }
        k kVar2 = this.f21420i0;
        if (kVar2 != null) {
            kVar2.release();
            this.f21420i0 = null;
        }
    }

    public final void Z() {
        Y();
        ((g) a.e(this.f21417f0)).a();
        this.f21417f0 = null;
        this.f21415d0 = 0;
    }

    @Override
    public int a(q1 q1Var) {
        if (this.Y.a(q1Var)) {
            return c3.a(q1Var.f16914n0 == 0 ? 4 : 2);
        } else if (w.j(q1Var.U)) {
            return c3.a(1);
        } else {
            return c3.a(0);
        }
    }

    public final void a0() {
        Z();
        W();
    }

    @Override
    public String b() {
        return "TextRenderer";
    }

    public void b0(long j10) {
        a.f(z());
        this.f21422k0 = j10;
    }

    public final void c0(List<b> list) {
        Handler handler = this.W;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            X(list);
        }
    }

    @Override
    public boolean e() {
        return this.f21413b0;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            X((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override
    public void r(long j10, long j11) {
        boolean z10;
        if (z()) {
            long j12 = this.f21422k0;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                Y();
                this.f21413b0 = true;
            }
        }
        if (!this.f21413b0) {
            if (this.f21420i0 == null) {
                ((g) a.e(this.f21417f0)).c(j10);
                try {
                    this.f21420i0 = ((g) a.e(this.f21417f0)).d();
                } catch (h e10) {
                    V(e10);
                    return;
                }
            }
            if (i() == 2) {
                if (this.f21419h0 != null) {
                    long U = U();
                    z10 = false;
                    while (U <= j10) {
                        this.f21421j0++;
                        U = U();
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
                k kVar = this.f21420i0;
                if (kVar != null) {
                    if (kVar.isEndOfStream()) {
                        if (!z10 && U() == Long.MAX_VALUE) {
                            if (this.f21415d0 == 2) {
                                a0();
                            } else {
                                Y();
                                this.f21413b0 = true;
                            }
                        }
                    } else if (kVar.timeUs <= j10) {
                        k kVar2 = this.f21419h0;
                        if (kVar2 != null) {
                            kVar2.release();
                        }
                        this.f21421j0 = kVar.a(j10);
                        this.f21419h0 = kVar;
                        this.f21420i0 = null;
                        z10 = true;
                    }
                }
                if (z10) {
                    a.e(this.f21419h0);
                    c0(this.f21419h0.c(j10));
                }
                if (this.f21415d0 != 2) {
                    while (!this.f21412a0) {
                        try {
                            j jVar = this.f21418g0;
                            if (jVar == null) {
                                jVar = ((g) a.e(this.f21417f0)).e();
                                if (jVar != null) {
                                    this.f21418g0 = jVar;
                                } else {
                                    return;
                                }
                            }
                            if (this.f21415d0 == 1) {
                                jVar.setFlags(4);
                                ((g) a.e(this.f21417f0)).f(jVar);
                                this.f21418g0 = null;
                                this.f21415d0 = 2;
                                return;
                            }
                            int Q = Q(this.Z, jVar, 0);
                            if (Q == -4) {
                                if (jVar.isEndOfStream()) {
                                    this.f21412a0 = true;
                                    this.f21414c0 = false;
                                } else {
                                    q1 q1Var = this.Z.f16947b;
                                    if (q1Var != null) {
                                        jVar.R = q1Var.Y;
                                        jVar.g();
                                        this.f21414c0 &= !jVar.isKeyFrame();
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.f21414c0) {
                                    ((g) a.e(this.f21417f0)).f(jVar);
                                    this.f21418g0 = null;
                                }
                            } else if (Q == -3) {
                                return;
                            }
                        } catch (h e11) {
                            V(e11);
                            return;
                        }
                    }
                }
            }
        }
    }

    public m(l lVar, Looper looper, i iVar) {
        super(3);
        this.X = (l) a.e(lVar);
        this.W = looper == null ? null : l0.t(looper, this);
        this.Y = iVar;
        this.Z = new r1();
        this.f21422k0 = -9223372036854775807L;
    }
}
