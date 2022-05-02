package lc;

import p140jc.AbstractC5921a;

public class C6486e extends AbstractC6481a implements AbstractC5921a {
    public Class f20180n;

    public C6486e(int i, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2) {
        super(i, str, cls, clsArr, strArr, clsArr2);
        this.f20180n = cls2;
    }

    @Override
    public String mo20379a(C6491h hVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(hVar.m20359e(m20371i()));
        if (hVar.f20199b) {
            stringBuffer.append(hVar.m20357g(m20380n()));
        }
        if (hVar.f20199b) {
            stringBuffer.append(" ");
        }
        stringBuffer.append(hVar.m20358f(m20374f(), m20373g()));
        stringBuffer.append(".");
        stringBuffer.append(m20370j());
        hVar.m20363a(stringBuffer, m20394m());
        hVar.m20362b(stringBuffer, m20395l());
        return stringBuffer.toString();
    }

    public Class m20380n() {
        if (this.f20180n == null) {
            this.f20180n = m20376d(6);
        }
        return this.f20180n;
    }
}
