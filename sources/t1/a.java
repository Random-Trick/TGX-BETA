package t1;

public class a implements d {
    public final d f22863a;
    public int f22864b = 0;
    public int f22865c = -1;
    public int M = -1;
    public Object N = null;

    public a(d dVar) {
        this.f22863a = dVar;
    }

    @Override
    public void F6(int i10, int i11, Object obj) {
        int i12;
        if (this.f22864b == 3) {
            int i13 = this.f22865c;
            int i14 = this.M;
            if (i10 <= i13 + i14 && (i12 = i10 + i11) >= i13 && this.N == obj) {
                this.f22865c = Math.min(i10, i13);
                this.M = Math.max(i14 + i13, i12) - this.f22865c;
                return;
            }
        }
        a();
        this.f22865c = i10;
        this.M = i11;
        this.N = obj;
        this.f22864b = 3;
    }

    @Override
    public void W1(int i10, int i11) {
        int i12;
        if (this.f22864b == 1 && i10 >= (i12 = this.f22865c)) {
            int i13 = this.M;
            if (i10 <= i12 + i13) {
                this.M = i13 + i11;
                this.f22865c = Math.min(i10, i12);
                return;
            }
        }
        a();
        this.f22865c = i10;
        this.M = i11;
        this.f22864b = 1;
    }

    @Override
    public void Z3(int i10, int i11) {
        int i12;
        if (this.f22864b != 2 || (i12 = this.f22865c) < i10 || i12 > i10 + i11) {
            a();
            this.f22865c = i10;
            this.M = i11;
            this.f22864b = 2;
            return;
        }
        this.M += i11;
        this.f22865c = i10;
    }

    public void a() {
        int i10 = this.f22864b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f22863a.W1(this.f22865c, this.M);
            } else if (i10 == 2) {
                this.f22863a.Z3(this.f22865c, this.M);
            } else if (i10 == 3) {
                this.f22863a.F6(this.f22865c, this.M, this.N);
            }
            this.N = null;
            this.f22864b = 0;
        }
    }

    @Override
    public void h0(int i10, int i11) {
        a();
        this.f22863a.h0(i10, i11);
    }
}
