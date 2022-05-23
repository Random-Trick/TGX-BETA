package ra;

import ya.a;
import ya.g;

public abstract class q extends c implements g {
    public q() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return j().equals(qVar.j()) && i().equals(qVar.i()) && l().equals(qVar.l()) && k.b(h(), qVar.h());
        } else if (obj instanceof g) {
            return obj.equals(f());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((j().hashCode() * 31) + i().hashCode()) * 31) + l().hashCode();
    }

    public g m() {
        return (g) super.k();
    }

    public String toString() {
        a f10 = f();
        if (f10 != this) {
            return f10.toString();
        }
        return "property " + i() + " (Kotlin reflection is not available)";
    }

    public q(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
    }
}
