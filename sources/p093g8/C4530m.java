package p093g8;

import p121i8.C5262a;

public class C4530m {
    public final float f14948a;
    public final float f14949b;

    public C4530m(float f, float f2) {
        this.f14948a = f;
        this.f14949b = f2;
    }

    public static float m27491a(C4530m mVar, C4530m mVar2, C4530m mVar3) {
        float f = mVar2.f14948a;
        float f2 = mVar2.f14949b;
        return ((mVar3.f14948a - f) * (mVar.f14949b - f2)) - ((mVar3.f14949b - f2) * (mVar.f14948a - f));
    }

    public static float m27490b(C4530m mVar, C4530m mVar2) {
        return C5262a.m23495a(mVar.f14948a, mVar.f14949b, mVar2.f14948a, mVar2.f14949b);
    }

    public static void m27487e(C4530m[] mVarArr) {
        C4530m mVar;
        C4530m mVar2;
        C4530m mVar3;
        float b = m27490b(mVarArr[0], mVarArr[1]);
        float b2 = m27490b(mVarArr[1], mVarArr[2]);
        float b3 = m27490b(mVarArr[0], mVarArr[2]);
        if (b2 >= b && b2 >= b3) {
            mVar3 = mVarArr[0];
            mVar2 = mVarArr[1];
            mVar = mVarArr[2];
        } else if (b3 < b2 || b3 < b) {
            mVar3 = mVarArr[2];
            mVar2 = mVarArr[0];
            mVar = mVarArr[1];
        } else {
            mVar3 = mVarArr[1];
            mVar2 = mVarArr[0];
            mVar = mVarArr[2];
        }
        if (m27491a(mVar2, mVar3, mVar) < 0.0f) {
            mVar2 = mVar;
            mVar = mVar2;
        }
        mVarArr[0] = mVar2;
        mVarArr[1] = mVar3;
        mVarArr[2] = mVar;
    }

    public final float m27489c() {
        return this.f14948a;
    }

    public final float m27488d() {
        return this.f14949b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4530m) {
            C4530m mVar = (C4530m) obj;
            if (this.f14948a == mVar.f14948a && this.f14949b == mVar.f14949b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f14948a) * 31) + Float.floatToIntBits(this.f14949b);
    }

    public final String toString() {
        return "(" + this.f14948a + ',' + this.f14949b + ')';
    }
}
