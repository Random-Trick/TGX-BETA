package j$.util.stream;

public class E1 extends F1 {
    public final int f14518c;
    private final Object f14519d;

    public E1(P0 p02, Object obj) {
        this(p02, obj, 0);
        this.f14518c = 0;
    }

    @Override
    final void a() {
        switch (this.f14518c) {
            case 0:
                ((P0) this.f14526a).j(this.f14519d, this.f14527b);
                return;
            default:
                this.f14526a.q((Object[]) this.f14519d, this.f14527b);
                return;
        }
    }

    @Override
    final F1 b(int i10, int i11) {
        switch (this.f14518c) {
            case 0:
                return new E1(this, ((P0) this.f14526a).f(i10), i11);
            default:
                return new E1(this, this.f14526a.f(i10), i11);
        }
    }

    public E1(Q0 q02, Object obj, int i10) {
        super(q02);
        this.f14518c = i10;
        this.f14519d = obj;
    }

    public E1(Q0 q02, Object[] objArr) {
        this(q02, objArr, 1);
        this.f14518c = 1;
    }

    public E1(E1 e12, P0 p02, int i10) {
        super(e12, p02, i10);
        this.f14518c = 0;
        this.f14519d = e12.f14519d;
    }

    public E1(E1 e12, Q0 q02, int i10) {
        super(e12, q02, i10);
        this.f14518c = 1;
        this.f14519d = (Object[]) e12.f14519d;
    }
}
