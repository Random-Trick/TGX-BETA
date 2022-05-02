package qa;

import p332xa.AbstractC10168a;
import p332xa.AbstractC10175g;

public abstract class AbstractC8304q extends AbstractC8288c implements AbstractC10175g {
    public AbstractC8304q() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8304q) {
            AbstractC8304q qVar = (AbstractC8304q) obj;
            return m12945j().equals(qVar.m12945j()) && m12946i().equals(qVar.m12946i()) && m12943l().equals(qVar.m12943l()) && C8298k.m12936b(m12947h(), qVar.m12947h());
        } else if (obj instanceof AbstractC10175g) {
            return obj.equals(m12948f());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((m12945j().hashCode() * 31) + m12946i().hashCode()) * 31) + m12943l().hashCode();
    }

    public AbstractC10175g m12921m() {
        return (AbstractC10175g) super.m12944k();
    }

    public String toString() {
        AbstractC10168a f = m12948f();
        if (f != this) {
            return f.toString();
        }
        return "property " + m12946i() + " (Kotlin reflection is not available)";
    }

    public AbstractC8304q(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }
}
