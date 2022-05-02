package qa;

import p332xa.AbstractC10168a;
import p332xa.AbstractC10171d;

public class C8296i extends AbstractC8288c implements AbstractC8295h, AbstractC10171d {
    public final int f26785Q;
    public final int f26786R;

    public C8296i(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f26785Q = i;
        this.f26786R = i2 >> 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8296i) {
            C8296i iVar = (C8296i) obj;
            return C8298k.m12936b(m12945j(), iVar.m12945j()) && m12946i().equals(iVar.m12946i()) && m12943l().equals(iVar.m12943l()) && this.f26786R == iVar.f26786R && this.f26785Q == iVar.f26785Q && C8298k.m12936b(m12947h(), iVar.m12947h());
        } else if (obj instanceof AbstractC10171d) {
            return obj.equals(m12948f());
        } else {
            return false;
        }
    }

    @Override
    public AbstractC10168a mo12923g() {
        return C8307t.m12920a(this);
    }

    public int hashCode() {
        return (((m12945j() == null ? 0 : m12945j().hashCode() * 31) + m12946i().hashCode()) * 31) + m12943l().hashCode();
    }

    public String toString() {
        AbstractC10168a f = m12948f();
        if (f != this) {
            return f.toString();
        }
        if ("<init>".equals(m12946i())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + m12946i() + " (Kotlin reflection is not available)";
    }
}
