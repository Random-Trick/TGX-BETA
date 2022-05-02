package lc;

import p140jc.AbstractC5922b;

public class C6490g implements AbstractC5922b {
    public Class f20192a;
    public String f20193b;
    public int f20194c;

    public C6490g(Class cls, String str, int i) {
        this.f20192a = cls;
        this.f20193b = str;
        this.f20194c = i;
    }

    public String m20365a() {
        return this.f20193b;
    }

    public int m20364b() {
        return this.f20194c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(m20365a());
        stringBuffer.append(":");
        stringBuffer.append(m20364b());
        return stringBuffer.toString();
    }
}
