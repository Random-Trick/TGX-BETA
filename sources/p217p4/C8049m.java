package p217p4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;
import java.util.List;
import p020b5.C1186a;
import p020b5.C1216l0;
import p020b5.C1230s;
import p020b5.C1234w;
import p174m3.AbstractC6593f;
import p174m3.C6600g1;
import p174m3.C6612h1;
import p174m3.C6701t2;

public final class C8049m extends AbstractC6593f implements Handler.Callback {
    public final Handler f26208V;
    public final AbstractC8048l f26209W;
    public final AbstractC8044i f26210X;
    public final C6612h1 f26211Y;
    public boolean f26212Z;
    public boolean f26213a0;
    public boolean f26214b0;
    public int f26215c0;
    public C6600g1 f26216d0;
    public AbstractC8042g f26217e0;
    public C8046j f26218f0;
    public AbstractC8047k f26219g0;
    public AbstractC8047k f26220h0;
    public int f26221i0;
    public long f26222j0;

    public C8049m(AbstractC8048l lVar, Looper looper) {
        this(lVar, looper, AbstractC8044i.f26204a);
    }

    @Override
    public void mo13718I() {
        this.f26216d0 = null;
        this.f26222j0 = -9223372036854775807L;
        m13715R();
        m13709X();
    }

    @Override
    public void mo13717K(long j, boolean z) {
        m13715R();
        this.f26212Z = false;
        this.f26213a0 = false;
        this.f26222j0 = -9223372036854775807L;
        if (this.f26215c0 != 0) {
            m13708Y();
            return;
        }
        m13710W();
        ((AbstractC8042g) C1186a.m38188e(this.f26217e0)).flush();
    }

    @Override
    public void mo13716O(C6600g1[] g1VarArr, long j, long j2) {
        this.f26216d0 = g1VarArr[0];
        if (this.f26217e0 != null) {
            this.f26215c0 = 1;
        } else {
            m13712U();
        }
    }

    public final void m13715R() {
        m13706a0(Collections.emptyList());
    }

    public final long m13714S() {
        if (this.f26221i0 == -1) {
            return Long.MAX_VALUE;
        }
        C1186a.m38188e(this.f26219g0);
        if (this.f26221i0 >= this.f26219g0.mo5197d()) {
            return Long.MAX_VALUE;
        }
        return this.f26219g0.mo5199b(this.f26221i0);
    }

    public final void m13713T(C8043h hVar) {
        String valueOf = String.valueOf(this.f26216d0);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 39);
        sb2.append("Subtitle decoding failed. streamFormat=");
        sb2.append(valueOf);
        C1230s.m37889d("TextRenderer", sb2.toString(), hVar);
        m13715R();
        m13708Y();
    }

    public final void m13712U() {
        this.f26214b0 = true;
        this.f26217e0 = this.f26210X.mo13721b((C6600g1) C1186a.m38188e(this.f26216d0));
    }

    public final void m13711V(List<C8032b> list) {
        this.f26209W.mo13719g(list);
    }

    public final void m13710W() {
        this.f26218f0 = null;
        this.f26221i0 = -1;
        AbstractC8047k kVar = this.f26219g0;
        if (kVar != null) {
            kVar.release();
            this.f26219g0 = null;
        }
        AbstractC8047k kVar2 = this.f26220h0;
        if (kVar2 != null) {
            kVar2.release();
            this.f26220h0 = null;
        }
    }

    public final void m13709X() {
        m13710W();
        ((AbstractC8042g) C1186a.m38188e(this.f26217e0)).mo13074a();
        this.f26217e0 = null;
        this.f26215c0 = 0;
    }

    public final void m13708Y() {
        m13709X();
        m13712U();
    }

    public void m13707Z(long j) {
        C1186a.m38187f(mo19468z());
        this.f26222j0 = j;
    }

    @Override
    public int mo11838a(C6600g1 g1Var) {
        if (this.f26210X.mo13722a(g1Var)) {
            return C6701t2.m19438a(g1Var.f20597n0 == 0 ? 4 : 2);
        } else if (C1234w.m37862l(g1Var.f20575U)) {
            return C6701t2.m19438a(1);
        } else {
            return C6701t2.m19438a(0);
        }
    }

    public final void m13706a0(List<C8032b> list) {
        Handler handler = this.f26208V;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            m13711V(list);
        }
    }

    @Override
    public String mo11837b() {
        return "TextRenderer";
    }

    @Override
    public boolean mo13705e() {
        return this.f26213a0;
    }

    @Override
    public boolean mo13704f() {
        return true;
    }

    @Override
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m13711V((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override
    public void mo13703t(long j, long j2) {
        boolean z;
        if (mo19468z()) {
            long j3 = this.f26222j0;
            if (j3 != -9223372036854775807L && j >= j3) {
                m13710W();
                this.f26213a0 = true;
            }
        }
        if (!this.f26213a0) {
            if (this.f26220h0 == null) {
                ((AbstractC8042g) C1186a.m38188e(this.f26217e0)).mo13073c(j);
                try {
                    this.f26220h0 = ((AbstractC8042g) C1186a.m38188e(this.f26217e0)).mo13072d();
                } catch (C8043h e) {
                    m13713T(e);
                    return;
                }
            }
            if (mo19480i() == 2) {
                if (this.f26219g0 != null) {
                    long S = m13714S();
                    z = false;
                    while (S <= j) {
                        this.f26221i0++;
                        S = m13714S();
                        z = true;
                    }
                } else {
                    z = false;
                }
                AbstractC8047k kVar = this.f26220h0;
                if (kVar != null) {
                    if (kVar.isEndOfStream()) {
                        if (!z && m13714S() == Long.MAX_VALUE) {
                            if (this.f26215c0 == 2) {
                                m13708Y();
                            } else {
                                m13710W();
                                this.f26213a0 = true;
                            }
                        }
                    } else if (kVar.timeUs <= j) {
                        AbstractC8047k kVar2 = this.f26219g0;
                        if (kVar2 != null) {
                            kVar2.release();
                        }
                        this.f26221i0 = kVar.mo5200a(j);
                        this.f26219g0 = kVar;
                        this.f26220h0 = null;
                        z = true;
                    }
                }
                if (z) {
                    C1186a.m38188e(this.f26219g0);
                    m13706a0(this.f26219g0.mo5198c(j));
                }
                if (this.f26215c0 != 2) {
                    while (!this.f26212Z) {
                        try {
                            C8046j jVar = this.f26218f0;
                            if (jVar == null) {
                                jVar = ((AbstractC8042g) C1186a.m38188e(this.f26217e0)).mo13071e();
                                if (jVar != null) {
                                    this.f26218f0 = jVar;
                                } else {
                                    return;
                                }
                            }
                            if (this.f26215c0 == 1) {
                                jVar.setFlags(4);
                                ((AbstractC8042g) C1186a.m38188e(this.f26217e0)).mo13070f(jVar);
                                this.f26218f0 = null;
                                this.f26215c0 = 2;
                                return;
                            }
                            int P = m19918P(this.f26211Y, jVar, 0);
                            if (P == -4) {
                                if (jVar.isEndOfStream()) {
                                    this.f26212Z = true;
                                    this.f26214b0 = false;
                                } else {
                                    C6600g1 g1Var = this.f26211Y.f20668b;
                                    if (g1Var != null) {
                                        jVar.f26205R = g1Var.f20579Y;
                                        jVar.m13777g();
                                        this.f26214b0 &= !jVar.isKeyFrame();
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.f26214b0) {
                                    ((AbstractC8042g) C1186a.m38188e(this.f26217e0)).mo13070f(jVar);
                                    this.f26218f0 = null;
                                }
                            } else if (P == -3) {
                                return;
                            }
                        } catch (C8043h e2) {
                            m13713T(e2);
                            return;
                        }
                    }
                }
            }
        }
    }

    public C8049m(AbstractC8048l lVar, Looper looper, AbstractC8044i iVar) {
        super(3);
        this.f26209W = (AbstractC8048l) C1186a.m38188e(lVar);
        this.f26208V = looper == null ? null : C1216l0.m37951t(looper, this);
        this.f26210X = iVar;
        this.f26211Y = new C6612h1();
        this.f26222j0 = -9223372036854775807L;
    }
}
