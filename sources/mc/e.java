package mc;

import kc.a;

public class e extends a implements a {
    public Class f17369n;

    public e(int i10, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2) {
        super(i10, str, cls, clsArr, strArr, clsArr2);
        this.f17369n = cls2;
    }

    @Override
    public String a(h hVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(hVar.e(i()));
        if (hVar.f17388b) {
            stringBuffer.append(hVar.g(n()));
        }
        if (hVar.f17388b) {
            stringBuffer.append(" ");
        }
        stringBuffer.append(hVar.f(f(), g()));
        stringBuffer.append(".");
        stringBuffer.append(j());
        hVar.a(stringBuffer, m());
        hVar.b(stringBuffer, l());
        return stringBuffer.toString();
    }

    public Class n() {
        if (this.f17369n == null) {
            this.f17369n = d(6);
        }
        return this.f17369n;
    }
}
