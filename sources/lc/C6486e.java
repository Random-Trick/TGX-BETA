package lc;

import p140jc.AbstractC5921a;

public class C6486e extends AbstractC6481a implements AbstractC5921a {
    public Class f20180n;

    public C6486e(int i, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2) {
        super(i, str, cls, clsArr, strArr, clsArr2);
        this.f20180n = cls2;
    }

    @Override
    public String mo20378a(C6491h hVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(hVar.m20358e(m20370i()));
        if (hVar.f20199b) {
            stringBuffer.append(hVar.m20356g(m20379n()));
        }
        if (hVar.f20199b) {
            stringBuffer.append(" ");
        }
        stringBuffer.append(hVar.m20357f(m20373f(), m20372g()));
        stringBuffer.append(".");
        stringBuffer.append(m20369j());
        hVar.m20362a(stringBuffer, m20393m());
        hVar.m20361b(stringBuffer, m20394l());
        return stringBuffer.toString();
    }

    public Class m20379n() {
        if (this.f20180n == null) {
            this.f20180n = m20375d(6);
        }
        return this.f20180n;
    }
}
