package j9;

import android.opengl.GLES20;
import f9.d;
import ia.f;
import ia.m;
import ra.g;
import ra.k;

public final class b {
    public static final a f15134d = new a(null);
    public final int f15135a;
    public final int f15136b;
    public final String f15137c;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final b a(int i10, String str) {
            k.e(str, "name");
            return new b(i10, EnumC0128b.ATTRIB, str, null);
        }

        public final b b(int i10, String str) {
            k.e(str, "name");
            return new b(i10, EnumC0128b.UNIFORM, str, null);
        }
    }

    public enum EnumC0128b {
        ATTRIB,
        UNIFORM
    }

    public b(int i10, EnumC0128b bVar, String str) {
        int i11;
        this.f15137c = str;
        int i12 = c.f15141a[bVar.ordinal()];
        if (i12 == 1) {
            i11 = GLES20.glGetAttribLocation(m.a(i10), str);
        } else if (i12 == 2) {
            i11 = GLES20.glGetUniformLocation(m.a(i10), str);
        } else {
            throw new f();
        }
        this.f15135a = i11;
        d.c(i11, str);
        this.f15136b = m.a(i11);
    }

    public final int a() {
        return this.f15136b;
    }

    public final int b() {
        return this.f15135a;
    }

    public b(int i10, EnumC0128b bVar, String str, g gVar) {
        this(i10, bVar, str);
    }
}
