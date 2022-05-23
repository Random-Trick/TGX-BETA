package c6;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;

public final class o0 {
    public final String f4961a;
    public final m0 f4962b;
    public m0 f4963c;

    public o0(String str, n0 n0Var) {
        m0 m0Var = new m0(null);
        this.f4962b = m0Var;
        this.f4963c = m0Var;
        Objects.requireNonNull(str);
        this.f4961a = str;
    }

    public final o0 a(String str, @CheckForNull Object obj) {
        m0 m0Var = new m0(null);
        this.f4963c.f4959c = m0Var;
        this.f4963c = m0Var;
        m0Var.f4958b = obj;
        m0Var.f4957a = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f4961a);
        sb2.append('{');
        m0 m0Var = this.f4962b.f4959c;
        String str = "";
        while (m0Var != null) {
            Object obj = m0Var.f4958b;
            sb2.append(str);
            String str2 = m0Var.f4957a;
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
            m0Var = m0Var.f4959c;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
