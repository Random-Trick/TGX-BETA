package h8;

import j8.a;

public class m {
    public final float f12623a;
    public final float f12624b;

    public m(float f10, float f11) {
        this.f12623a = f10;
        this.f12624b = f11;
    }

    public static float a(m mVar, m mVar2, m mVar3) {
        float f10 = mVar2.f12623a;
        float f11 = mVar2.f12624b;
        return ((mVar3.f12623a - f10) * (mVar.f12624b - f11)) - ((mVar3.f12624b - f11) * (mVar.f12623a - f10));
    }

    public static float b(m mVar, m mVar2) {
        return a.a(mVar.f12623a, mVar.f12624b, mVar2.f12623a, mVar2.f12624b);
    }

    public static void e(m[] mVarArr) {
        m mVar;
        m mVar2;
        m mVar3;
        float b10 = b(mVarArr[0], mVarArr[1]);
        float b11 = b(mVarArr[1], mVarArr[2]);
        float b12 = b(mVarArr[0], mVarArr[2]);
        if (b11 >= b10 && b11 >= b12) {
            mVar3 = mVarArr[0];
            mVar2 = mVarArr[1];
            mVar = mVarArr[2];
        } else if (b12 < b11 || b12 < b10) {
            mVar3 = mVarArr[2];
            mVar2 = mVarArr[0];
            mVar = mVarArr[1];
        } else {
            mVar3 = mVarArr[1];
            mVar2 = mVarArr[0];
            mVar = mVarArr[2];
        }
        if (a(mVar2, mVar3, mVar) < 0.0f) {
            mVar2 = mVar;
            mVar = mVar2;
        }
        mVarArr[0] = mVar2;
        mVarArr[1] = mVar3;
        mVarArr[2] = mVar;
    }

    public final float c() {
        return this.f12623a;
    }

    public final float d() {
        return this.f12624b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f12623a == mVar.f12623a && this.f12624b == mVar.f12624b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f12623a) * 31) + Float.floatToIntBits(this.f12624b);
    }

    public final String toString() {
        return "(" + this.f12623a + ',' + this.f12624b + ')';
    }
}
