package qa;

import p332xa.AbstractC10168a;
import p332xa.AbstractC10171d;

public class C8296i extends AbstractC8288c implements AbstractC8295h, AbstractC10171d {
    public final int f26782Q;
    public final int f26783R;

    public C8296i(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f26782Q = i;
        this.f26783R = i2 >> 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8296i) {
            C8296i iVar = (C8296i) obj;
            return C8298k.m12937b(m12946j(), iVar.m12946j()) && m12947i().equals(iVar.m12947i()) && m12944l().equals(iVar.m12944l()) && this.f26783R == iVar.f26783R && this.f26782Q == iVar.f26782Q && C8298k.m12937b(m12948h(), iVar.m12948h());
        } else if (obj instanceof AbstractC10171d) {
            return obj.equals(m12949f());
        } else {
            return false;
        }
    }

    @Override
    public AbstractC10168a mo12924g() {
        return C8307t.m12921a(this);
    }

    public int hashCode() {
        return (((m12946j() == null ? 0 : m12946j().hashCode() * 31) + m12947i().hashCode()) * 31) + m12944l().hashCode();
    }

    public String toString() {
        AbstractC10168a f = m12949f();
        if (f != this) {
            return f.toString();
        }
        if ("<init>".equals(m12947i())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + m12947i() + " (Kotlin reflection is not available)";
    }
}
