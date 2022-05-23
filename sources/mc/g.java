package mc;

import kc.b;

public class g implements b {
    public Class f17381a;
    public String f17382b;
    public int f17383c;

    public g(Class cls, String str, int i10) {
        this.f17381a = cls;
        this.f17382b = str;
        this.f17383c = i10;
    }

    public String a() {
        return this.f17382b;
    }

    public int b() {
        return this.f17383c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(a());
        stringBuffer.append(":");
        stringBuffer.append(b());
        return stringBuffer.toString();
    }
}
