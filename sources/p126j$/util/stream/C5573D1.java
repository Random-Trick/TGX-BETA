package p126j$.util.stream;

public class C5573D1 extends AbstractC5578E1 {
    public final int f18123c;
    private final Object f18124d;

    public C5573D1(AbstractC5627O0 o0, Object obj, int i, AbstractC5637Q0 q0) {
        this(o0, obj, i, 0);
        this.f18123c = 0;
    }

    @Override
    void mo22397a() {
        switch (this.f18123c) {
            case 0:
                ((AbstractC5627O0) this.f18131a).mo22158i(this.f18124d, this.f18132b);
                return;
            default:
                this.f18131a.mo22155n((Object[]) this.f18124d, this.f18132b);
                return;
        }
    }

    @Override
    AbstractC5578E1 mo22396b(int i, int i2) {
        switch (this.f18123c) {
            case 0:
                return new C5573D1(this, ((AbstractC5627O0) this.f18131a).mo22159f(i), i2);
            default:
                return new C5573D1(this, this.f18131a.mo22159f(i), i2);
        }
    }

    public C5573D1(AbstractC5632P0 p0, Object obj, int i, int i2) {
        super(p0, i);
        this.f18123c = i2;
        this.f18124d = obj;
    }

    public C5573D1(AbstractC5632P0 p0, Object[] objArr, int i, AbstractC5637Q0 q0) {
        super(p0, i);
        this.f18123c = 1;
        this.f18123c = 1;
        this.f18124d = objArr;
    }

    public C5573D1(C5573D1 d1, AbstractC5627O0 o0, int i) {
        super(d1, o0, i);
        this.f18123c = 0;
        this.f18124d = d1.f18124d;
    }

    public C5573D1(C5573D1 d1, AbstractC5632P0 p0, int i) {
        super(d1, p0, i);
        this.f18123c = 1;
        this.f18124d = (Object[]) d1.f18124d;
    }
}
