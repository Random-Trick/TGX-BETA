package nd;

import org.thunderdog.challegram.Log;

public class a {
    public static final double[] f17829e = new double[Log.TAG_YOUTUBE];
    public final char[] f17830a;
    public final int f17831b;
    public char f17832c;
    public int f17833d;

    static {
        int i10 = 0;
        while (true) {
            double[] dArr = f17829e;
            if (i10 < dArr.length) {
                dArr[i10] = Math.pow(10.0d, i10);
                i10++;
            } else {
                return;
            }
        }
    }

    public a(String str, int i10) {
        try {
            char[] charArray = str.toCharArray();
            this.f17830a = charArray;
            this.f17833d = i10;
            this.f17831b = charArray.length;
            this.f17832c = charArray[i10];
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static float b(int i10, int i11) {
        if (i11 < -125 || i10 == 0) {
            return 0.0f;
        }
        if (i11 >= 128) {
            return i10 > 0 ? Float.POSITIVE_INFINITY : Float.NEGATIVE_INFINITY;
        }
        if (i11 == 0) {
            return i10;
        }
        if (i10 >= 67108864) {
            i10++;
        }
        double d10 = i10;
        double[] dArr = f17829e;
        return (float) (i11 > 0 ? d10 * dArr[i11] : d10 / dArr[-i11]);
    }

    public void a() {
        this.f17832c = e();
    }

    public float c() {
        h();
        float d10 = d();
        g();
        return d10;
    }

    public float d() {
        throw new UnsupportedOperationException("Method not decompiled: nd.a.d():float");
    }

    public final char e() {
        int i10 = this.f17833d;
        int i11 = this.f17831b;
        if (i10 < i11) {
            this.f17833d = i10 + 1;
        }
        int i12 = this.f17833d;
        if (i12 == i11) {
            return (char) 0;
        }
        return this.f17830a[i12];
    }

    public final void f(char c10) {
        throw new RuntimeException("Unexpected char '" + c10 + "'.");
    }

    public void g() {
        while (true) {
            int i10 = this.f17833d;
            if (i10 < this.f17831b) {
                char c10 = this.f17830a[i10];
                if (c10 == '\t' || c10 == '\n' || c10 == ' ' || c10 == ',') {
                    a();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public void h() {
        while (true) {
            int i10 = this.f17833d;
            if (i10 < this.f17831b && Character.isWhitespace(this.f17830a[i10])) {
                a();
            } else {
                return;
            }
        }
    }
}
