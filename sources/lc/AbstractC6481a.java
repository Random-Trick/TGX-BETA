package lc;

public abstract class AbstractC6481a extends AbstractC6485d {
    public Class[] f20162k;
    public String[] f20163l;
    public Class[] f20164m;

    public AbstractC6481a(int i, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2) {
        super(i, str, cls);
        this.f20162k = clsArr;
        this.f20163l = strArr;
        this.f20164m = clsArr2;
    }

    public Class[] m20394l() {
        if (this.f20164m == null) {
            this.f20164m = m20374e(5);
        }
        return this.f20164m;
    }

    public Class[] m20393m() {
        if (this.f20162k == null) {
            this.f20162k = m20374e(3);
        }
        return this.f20162k;
    }
}
