package j$.util.concurrent;

public class q {
    m[] f14420a;
    m f14421b = null;
    p f14422c;
    p f14423d;
    int f14424e;
    int f14425f;
    int f14426g;
    final int f14427h;

    public q(m[] mVarArr, int i10, int i11, int i12) {
        this.f14420a = mVarArr;
        this.f14427h = i10;
        this.f14424e = i11;
        this.f14425f = i11;
        this.f14426g = i12;
    }

    public final m b() {
        m[] mVarArr;
        int length;
        int i10;
        p pVar;
        m mVar = this.f14421b;
        if (mVar != null) {
            mVar = mVar.f14415d;
        }
        while (mVar == null) {
            if (this.f14425f >= this.f14426g || (mVarArr = this.f14420a) == null || (length = mVarArr.length) <= (i10 = this.f14424e) || i10 < 0) {
                this.f14421b = null;
                return null;
            }
            m n10 = ConcurrentHashMap.n(mVarArr, i10);
            if (n10 == null || n10.f14412a >= 0) {
                mVar = n10;
            } else if (n10 instanceof h) {
                this.f14420a = ((h) n10).f14405e;
                p pVar2 = this.f14423d;
                if (pVar2 != null) {
                    this.f14423d = pVar2.f14419d;
                } else {
                    pVar2 = new p();
                }
                pVar2.f14418c = mVarArr;
                pVar2.f14416a = length;
                pVar2.f14417b = i10;
                pVar2.f14419d = this.f14422c;
                this.f14422c = pVar2;
                mVar = null;
            } else {
                mVar = n10 instanceof r ? ((r) n10).f14431f : null;
            }
            if (this.f14422c != null) {
                while (true) {
                    pVar = this.f14422c;
                    if (pVar == null) {
                        break;
                    }
                    int i11 = this.f14424e;
                    int i12 = pVar.f14416a;
                    int i13 = i11 + i12;
                    this.f14424e = i13;
                    if (i13 < length) {
                        break;
                    }
                    this.f14424e = pVar.f14417b;
                    this.f14420a = pVar.f14418c;
                    pVar.f14418c = null;
                    p pVar3 = pVar.f14419d;
                    pVar.f14419d = this.f14423d;
                    this.f14422c = pVar3;
                    this.f14423d = pVar;
                    length = i12;
                }
                if (pVar == null) {
                    int i14 = this.f14424e + this.f14427h;
                    this.f14424e = i14;
                    if (i14 >= length) {
                        int i15 = this.f14425f + 1;
                        this.f14425f = i15;
                        this.f14424e = i15;
                    }
                }
            } else {
                int i16 = i10 + this.f14427h;
                this.f14424e = i16;
                if (i16 >= length) {
                    int i17 = this.f14425f + 1;
                    this.f14425f = i17;
                    this.f14424e = i17;
                }
            }
        }
        this.f14421b = mVar;
        return mVar;
    }
}
