package ra;

import ya.a;
import ya.d;

public class i extends c implements h, d {
    public final int Q;
    public final int R;

    public i(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.Q = i10;
        this.R = i11 >> 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return i().equals(iVar.i()) && l().equals(iVar.l()) && this.R == iVar.R && this.Q == iVar.Q && k.b(h(), iVar.h()) && k.b(j(), iVar.j());
        } else if (obj instanceof d) {
            return obj.equals(f());
        } else {
            return false;
        }
    }

    @Override
    public a g() {
        return t.a(this);
    }

    public int hashCode() {
        return (((j() == null ? 0 : j().hashCode() * 31) + i().hashCode()) * 31) + l().hashCode();
    }

    public String toString() {
        a f10 = f();
        if (f10 != this) {
            return f10.toString();
        }
        if ("<init>".equals(i())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + i() + " (Kotlin reflection is not available)";
    }
}
