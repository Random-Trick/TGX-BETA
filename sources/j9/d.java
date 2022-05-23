package j9;

import android.opengl.GLES20;
import i9.f;
import ia.m;
import ra.g;
import ra.k;

public final class d {
    public static final a f15142c = new a(null);
    public final int f15143a;
    public final int f15144b;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final int b(int i10, String str) {
            int a10 = m.a(GLES20.glCreateShader(m.a(i10)));
            f9.d.b("glCreateShader type=" + i10);
            GLES20.glShaderSource(a10, str);
            GLES20.glCompileShader(a10);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(a10, f.b(), iArr, 0);
            if (iArr[0] != 0) {
                return a10;
            }
            String str2 = "Could not compile shader " + i10 + ": '" + GLES20.glGetShaderInfoLog(a10) + "' source: " + str;
            GLES20.glDeleteShader(a10);
            throw new RuntimeException(str2);
        }
    }

    public d(int i10, int i11) {
        this.f15143a = i10;
        this.f15144b = i11;
    }

    public final int a() {
        return this.f15144b;
    }

    public final void b() {
        GLES20.glDeleteShader(m.a(this.f15144b));
    }

    public d(int i10, String str) {
        this(i10, f15142c.b(i10, str));
        k.e(str, "source");
    }
}
