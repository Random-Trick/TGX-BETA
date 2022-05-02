package p126j$.util.concurrent;

public class C5506q {
    C5502m[] f18028a;
    C5502m f18029b = null;
    C5505p f18030c;
    C5505p f18031d;
    int f18032e;
    int f18033f;
    int f18034g;
    final int f18035h;

    public C5506q(C5502m[] mVarArr, int i, int i2, int i3) {
        this.f18028a = mVarArr;
        this.f18035h = i;
        this.f18032e = i2;
        this.f18033f = i2;
        this.f18034g = i3;
    }

    public final C5502m m22521b() {
        C5502m[] mVarArr;
        int length;
        int i;
        C5505p pVar;
        C5502m mVar = this.f18029b;
        if (mVar != null) {
            mVar = mVar.f18023d;
        }
        while (mVar == null) {
            if (this.f18033f >= this.f18034g || (mVarArr = this.f18028a) == null || (length = mVarArr.length) <= (i = this.f18032e) || i < 0) {
                this.f18029b = null;
                return null;
            }
            C5502m n = ConcurrentHashMap.m22539n(mVarArr, i);
            if (n == null || n.f18020a >= 0) {
                mVar = n;
            } else if (n instanceof C5497h) {
                this.f18028a = ((C5497h) n).f18013e;
                C5505p pVar2 = this.f18031d;
                if (pVar2 != null) {
                    this.f18031d = pVar2.f18027d;
                } else {
                    pVar2 = new C5505p();
                }
                pVar2.f18026c = mVarArr;
                pVar2.f18024a = length;
                pVar2.f18025b = i;
                pVar2.f18027d = this.f18030c;
                this.f18030c = pVar2;
                mVar = null;
            } else {
                mVar = n instanceof C5507r ? ((C5507r) n).f18039f : null;
            }
            if (this.f18030c != null) {
                while (true) {
                    pVar = this.f18030c;
                    if (pVar == null) {
                        break;
                    }
                    int i2 = this.f18032e;
                    int i3 = pVar.f18024a;
                    int i4 = i2 + i3;
                    this.f18032e = i4;
                    if (i4 < length) {
                        break;
                    }
                    this.f18032e = pVar.f18025b;
                    this.f18028a = pVar.f18026c;
                    pVar.f18026c = null;
                    C5505p pVar3 = pVar.f18027d;
                    pVar.f18027d = this.f18031d;
                    this.f18030c = pVar3;
                    this.f18031d = pVar;
                    length = i3;
                }
                if (pVar == null) {
                    int i5 = this.f18032e + this.f18035h;
                    this.f18032e = i5;
                    if (i5 >= length) {
                        int i6 = this.f18033f + 1;
                        this.f18033f = i6;
                        this.f18032e = i6;
                    }
                }
            } else {
                int i7 = i + this.f18035h;
                this.f18032e = i7;
                if (i7 >= length) {
                    int i8 = this.f18033f + 1;
                    this.f18033f = i8;
                    this.f18032e = i8;
                }
            }
        }
        this.f18029b = mVar;
        return mVar;
    }
}
