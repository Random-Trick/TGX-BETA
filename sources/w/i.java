package w;

import v.d;
import y.x1;

public class i {
    public final boolean f25684a;
    public boolean f25685b = false;

    public i(x1 x1Var) {
        boolean z10 = false;
        this.f25684a = x1Var.b(d.class) != null ? true : z10;
    }

    public void a() {
        this.f25685b = false;
    }

    public void b() {
        this.f25685b = true;
    }

    public boolean c(int i10) {
        return this.f25685b && i10 == 0 && this.f25684a;
    }
}
