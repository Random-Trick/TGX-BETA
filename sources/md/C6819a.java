package md;

import org.thunderdog.challegram.Log;

public class C6819a {
    public static final double[] f21352e = new double[Log.TAG_YOUTUBE];
    public final char[] f21353a;
    public final int f21354b;
    public char f21355c;
    public int f21356d;

    static {
        int i = 0;
        while (true) {
            double[] dArr = f21352e;
            if (i < dArr.length) {
                dArr[i] = Math.pow(10.0d, i);
                i++;
            } else {
                return;
            }
        }
    }

    public C6819a(String str, int i) {
        try {
            char[] charArray = str.toCharArray();
            this.f21353a = charArray;
            this.f21356d = i;
            this.f21354b = charArray.length;
            this.f21355c = charArray[i];
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static float m18898b(int i, int i2) {
        if (i2 < -125 || i == 0) {
            return 0.0f;
        }
        if (i2 >= 128) {
            return i > 0 ? Float.POSITIVE_INFINITY : Float.NEGATIVE_INFINITY;
        }
        if (i2 == 0) {
            return i;
        }
        if (i >= 67108864) {
            i++;
        }
        double d = i;
        double[] dArr = f21352e;
        return (float) (i2 > 0 ? d * dArr[i2] : d / dArr[-i2]);
    }

    public void m18899a() {
        this.f21355c = m18895e();
    }

    public float m18897c() {
        m18892h();
        float d = m18896d();
        m18893g();
        return d;
    }

    public float m18896d() {
        throw new UnsupportedOperationException("Method not decompiled: md.C6819a.m18896d():float");
    }

    public final char m18895e() {
        int i = this.f21356d;
        int i2 = this.f21354b;
        if (i < i2) {
            this.f21356d = i + 1;
        }
        int i3 = this.f21356d;
        if (i3 == i2) {
            return (char) 0;
        }
        return this.f21353a[i3];
    }

    public final void m18894f(char c) {
        throw new RuntimeException("Unexpected char '" + c + "'.");
    }

    public void m18893g() {
        while (true) {
            int i = this.f21356d;
            if (i < this.f21354b) {
                char c = this.f21353a[i];
                if (c == '\t' || c == '\n' || c == ' ' || c == ',') {
                    m18899a();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public void m18892h() {
        while (true) {
            int i = this.f21356d;
            if (i < this.f21354b && Character.isWhitespace(this.f21353a[i])) {
                m18899a();
            } else {
                return;
            }
        }
    }
}
