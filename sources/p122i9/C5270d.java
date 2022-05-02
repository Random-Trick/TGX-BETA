package p122i9;

import android.opengl.GLES20;
import p064e9.C4172d;
import p106h9.C5038f;
import p107ha.C5055m;
import qa.C8294g;
import qa.C8298k;

public final class C5270d {
    public static final C5271a f17452c = new C5271a(null);
    public final int f17453a;
    public final int f17454b;

    public static final class C5271a {
        public C5271a() {
        }

        public final int m23476b(int i, String str) {
            int a = C5055m.m24188a(GLES20.glCreateShader(C5055m.m24188a(i)));
            C4172d.m28624b("glCreateShader type=" + i);
            GLES20.glShaderSource(a, str);
            GLES20.glCompileShader(a);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(a, C5038f.m24222b(), iArr, 0);
            if (iArr[0] != 0) {
                return a;
            }
            String str2 = "Could not compile shader " + i + ": '" + GLES20.glGetShaderInfoLog(a) + "' source: " + str;
            GLES20.glDeleteShader(a);
            throw new RuntimeException(str2);
        }

        public C5271a(C8294g gVar) {
            this();
        }
    }

    public C5270d(int i, int i2) {
        this.f17453a = i;
        this.f17454b = i2;
    }

    public final int m23479a() {
        return this.f17454b;
    }

    public final void m23478b() {
        GLES20.glDeleteShader(C5055m.m24188a(this.f17454b));
    }

    public C5270d(int i, String str) {
        this(i, f17452c.m23476b(i, str));
        C8298k.m12933e(str, "source");
    }
}
