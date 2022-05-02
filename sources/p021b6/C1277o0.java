package p021b6;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;

public final class C1277o0 {
    public final String f4636a;
    public final C1273m0 f4637b;
    public C1273m0 f4638c;

    public C1277o0(String str, C1275n0 n0Var) {
        C1273m0 m0Var = new C1273m0(null);
        this.f4637b = m0Var;
        this.f4638c = m0Var;
        Objects.requireNonNull(str);
        this.f4636a = str;
    }

    public final C1277o0 m37805a(String str, @CheckForNull Object obj) {
        C1273m0 m0Var = new C1273m0(null);
        this.f4638c.f4634c = m0Var;
        this.f4638c = m0Var;
        m0Var.f4633b = obj;
        m0Var.f4632a = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f4636a);
        sb2.append('{');
        C1273m0 m0Var = this.f4637b.f4634c;
        String str = "";
        while (m0Var != null) {
            Object obj = m0Var.f4633b;
            sb2.append(str);
            String str2 = m0Var.f4632a;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            m0Var = m0Var.f4634c;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
