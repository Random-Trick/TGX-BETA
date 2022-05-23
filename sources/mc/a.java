package mc;

public abstract class a extends d {
    public Class[] f17351k;
    public String[] f17352l;
    public Class[] f17353m;

    public a(int i10, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2) {
        super(i10, str, cls);
        this.f17351k = clsArr;
        this.f17352l = strArr;
        this.f17353m = clsArr2;
    }

    public Class[] l() {
        if (this.f17353m == null) {
            this.f17353m = e(5);
        }
        return this.f17353m;
    }

    public Class[] m() {
        if (this.f17351k == null) {
            this.f17351k = e(3);
        }
        return this.f17351k;
    }
}
