package p364zd;

import p108hb.C5064d;

public final class C11516d0 implements AbstractC11531p {
    public final AbstractC11531p f36562a;
    public final AbstractC11531p f36563b;
    public float f36564c;

    public C11516d0(AbstractC11531p pVar, AbstractC11531p pVar2) {
        this.f36562a = pVar;
        this.f36563b = pVar2;
    }

    @Override
    public int mo96a() {
        return -1;
    }

    @Override
    public String mo95b() {
        return this.f36563b.mo95b();
    }

    @Override
    public boolean mo94c() {
        return this.f36563b.mo94c();
    }

    @Override
    public float mo93d(int i) {
        if (this.f36564c == 1.0f || C11541z.m0z(i)) {
            return this.f36563b.mo93d(i);
        }
        if (this.f36564c == 0.0f) {
            return this.f36562a.mo93d(i);
        }
        float d = this.f36562a.mo93d(i);
        return d + ((this.f36563b.mo93d(i) - d) * this.f36564c);
    }

    @Override
    public int mo92e(int i) {
        float f = this.f36564c;
        if (f == 0.0f) {
            return this.f36562a.mo92e(i);
        }
        if (f == 1.0f) {
            return this.f36563b.mo92e(i);
        }
        return C5064d.m24129d(this.f36562a.mo92e(i), this.f36563b.mo92e(i), this.f36564c);
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC11531p) && this.f36563b.equals(obj);
    }

    @Override
    public boolean mo91f() {
        return C11530o.m115b(this);
    }

    public float m340g() {
        return this.f36564c;
    }

    public AbstractC11531p m339h() {
        AbstractC11531p pVar = this.f36562a;
        return pVar instanceof C11516d0 ? ((C11516d0) pVar).m338i() : pVar;
    }

    public AbstractC11531p m338i() {
        return this.f36563b;
    }

    public boolean m337j(float f) {
        if (this.f36564c == f) {
            return false;
        }
        this.f36564c = f;
        return true;
    }
}
