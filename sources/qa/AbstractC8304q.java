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
            return m12946j().equals(qVar.m12946j()) && m12947i().equals(qVar.m12947i()) && m12944l().equals(qVar.m12944l()) && C8298k.m12937b(m12948h(), qVar.m12948h());
        } else if (obj instanceof AbstractC10175g) {
            return obj.equals(m12949f());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((m12946j().hashCode() * 31) + m12947i().hashCode()) * 31) + m12944l().hashCode();
    }

    public AbstractC10175g m12922m() {
        return (AbstractC10175g) super.m12945k();
    }

    public String toString() {
        AbstractC10168a f = m12949f();
        if (f != this) {
            return f.toString();
        }
        return "property " + m12947i() + " (Kotlin reflection is not available)";
    }

    public AbstractC8304q(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }
}
