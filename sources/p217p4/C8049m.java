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
    public final Handler f26205V;
    public final AbstractC8048l f26206W;
    public final AbstractC8044i f26207X;
    public final C6612h1 f26208Y;
    public boolean f26209Z;
    public boolean f26210a0;
    public boolean f26211b0;
    public int f26212c0;
    public C6600g1 f26213d0;
    public AbstractC8042g f26214e0;
    public C8046j f26215f0;
    public AbstractC8047k f26216g0;
    public AbstractC8047k f26217h0;
    public int f26218i0;
    public long f26219j0;

    public C8049m(AbstractC8048l lVar, Looper looper) {
        this(lVar, looper, AbstractC8044i.f26201a);
    }

    @Override
    public void mo13719I() {
        this.f26213d0 = null;
        this.f26219j0 = -9223372036854775807L;
        m13716R();
        m13710X();
    }

    @Override
    public void mo13718K(long j, boolean z) {
        m13716R();
        this.f26209Z = false;
        this.f26210a0 = false;
        this.f26219j0 = -9223372036854775807L;
        if (this.f26212c0 != 0) {
            m13709Y();
            return;
        }
        m13711W();
        ((AbstractC8042g) C1186a.m38185e(this.f26214e0)).flush();
    }

    @Override
    public void mo13717O(C6600g1[] g1VarArr, long j, long j2) {
        this.f26213d0 = g1VarArr[0];
        if (this.f26214e0 != null) {
            this.f26212c0 = 1;
        } else {
            m13713U();
        }
    }

    public final void m13716R() {
        m13707a0(Collections.emptyList());
    }

    public final long m13715S() {
        if (this.f26218i0 == -1) {
            return Long.MAX_VALUE;
        }
        C1186a.m38185e(this.f26216g0);
        if (this.f26218i0 >= this.f26216g0.mo5197d()) {
            return Long.MAX_VALUE;
        }
        return this.f26216g0.mo5199b(this.f26218i0);
    }

    public final void m13714T(C8043h hVar) {
        String valueOf = String.valueOf(this.f26213d0);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 39);
        sb2.append("Subtitle decoding failed. streamFormat=");
        sb2.append(valueOf);
        C1230s.m37886d("TextRenderer", sb2.toString(), hVar);
        m13716R();
        m13709Y();
    }

    public final void m13713U() {
        this.f26211b0 = true;
        this.f26214e0 = this.f26207X.mo13722b((C6600g1) C1186a.m38185e(this.f26213d0));
    }

    public final void m13712V(List<C8032b> list) {
        this.f26206W.mo13720g(list);
    }

    public final void m13711W() {
        this.f26215f0 = null;
        this.f26218i0 = -1;
        AbstractC8047k kVar = this.f26216g0;
        if (kVar != null) {
            kVar.release();
            this.f26216g0 = null;
        }
        AbstractC8047k kVar2 = this.f26217h0;
        if (kVar2 != null) {
            kVar2.release();
            this.f26217h0 = null;
        }
    }

    public final void m13710X() {
        m13711W();
        ((AbstractC8042g) C1186a.m38185e(this.f26214e0)).mo13075a();
        this.f26214e0 = null;
        this.f26212c0 = 0;
    }

    public final void m13709Y() {
        m13710X();
        m13713U();
    }

    public void m13708Z(long j) {
        C1186a.m38184f(mo19467z());
        this.f26219j0 = j;
    }

    @Override
    public int mo11839a(C6600g1 g1Var) {
        if (this.f26207X.mo13723a(g1Var)) {
            return C6701t2.m19437a(g1Var.f20597n0 == 0 ? 4 : 2);
        } else if (C1234w.m37859l(g1Var.f20575U)) {
            return C6701t2.m19437a(1);
        } else {
            return C6701t2.m19437a(0);
        }
    }

    public final void m13707a0(List<C8032b> list) {
        Handler handler = this.f26205V;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            m13712V(list);
        }
    }

    @Override
    public String mo11838b() {
        return "TextRenderer";
    }

    @Override
    public boolean mo13706e() {
        return this.f26210a0;
    }

    @Override
    public boolean mo13705f() {
        return true;
    }

    @Override
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m13712V((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override
    public void mo13704t(long j, long j2) {
        boolean z;
        if (mo19467z()) {
            long j3 = this.f26219j0;
            if (j3 != -9223372036854775807L && j >= j3) {
                m13711W();
                this.f26210a0 = true;
            }
        }
        if (!this.f26210a0) {
            if (this.f26217h0 == null) {
                ((AbstractC8042g) C1186a.m38185e(this.f26214e0)).mo13074c(j);
                try {
                    this.f26217h0 = ((AbstractC8042g) C1186a.m38185e(this.f26214e0)).mo13073d();
                } catch (C8043h e) {
                    m13714T(e);
                    return;
                }
            }
            if (mo19479i() == 2) {
                if (this.f26216g0 != null) {
                    long S = m13715S();
                    z = false;
                    while (S <= j) {
                        this.f26218i0++;
                        S = m13715S();
                        z = true;
                    }
                } else {
                    z = false;
                }
                AbstractC8047k kVar = this.f26217h0;
                if (kVar != null) {
                    if (kVar.isEndOfStream()) {
                        if (!z && m13715S() == Long.MAX_VALUE) {
                            if (this.f26212c0 == 2) {
                                m13709Y();
                            } else {
                                m13711W();
                                this.f26210a0 = true;
                            }
                        }
                    } else if (kVar.timeUs <= j) {
                        AbstractC8047k kVar2 = this.f26216g0;
                        if (kVar2 != null) {
                            kVar2.release();
                        }
                        this.f26218i0 = kVar.mo5200a(j);
                        this.f26216g0 = kVar;
                        this.f26217h0 = null;
                        z = true;
                    }
                }
                if (z) {
                    C1186a.m38185e(this.f26216g0);
                    m13707a0(this.f26216g0.mo5198c(j));
                }
                if (this.f26212c0 != 2) {
                    while (!this.f26209Z) {
                        try {
                            C8046j jVar = this.f26215f0;
                            if (jVar == null) {
                                jVar = ((AbstractC8042g) C1186a.m38185e(this.f26214e0)).mo13072e();
                                if (jVar != null) {
                                    this.f26215f0 = jVar;
                                } else {
                                    return;
                                }
                            }
                            if (this.f26212c0 == 1) {
                                jVar.setFlags(4);
                                ((AbstractC8042g) C1186a.m38185e(this.f26214e0)).mo13071f(jVar);
                                this.f26215f0 = null;
                                this.f26212c0 = 2;
                                return;
                            }
                            int P = m19917P(this.f26208Y, jVar, 0);
                            if (P == -4) {
                                if (jVar.isEndOfStream()) {
                                    this.f26209Z = true;
                                    this.f26211b0 = false;
                                } else {
                                    C6600g1 g1Var = this.f26208Y.f20668b;
                                    if (g1Var != null) {
                                        jVar.f26202R = g1Var.f20579Y;
                                        jVar.m13778g();
                                        this.f26211b0 &= !jVar.isKeyFrame();
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.f26211b0) {
                                    ((AbstractC8042g) C1186a.m38185e(this.f26214e0)).mo13071f(jVar);
                                    this.f26215f0 = null;
                                }
                            } else if (P == -3) {
                                return;
                            }
                        } catch (C8043h e2) {
                            m13714T(e2);
                            return;
                        }
                    }
                }
            }
        }
    }

    public C8049m(AbstractC8048l lVar, Looper looper, AbstractC8044i iVar) {
        super(3);
        this.f26206W = (AbstractC8048l) C1186a.m38185e(lVar);
        this.f26205V = looper == null ? null : C1216l0.m37948t(looper, this);
        this.f26207X = iVar;
        this.f26208Y = new C6612h1();
        this.f26219j0 = -9223372036854775807L;
    }
}
