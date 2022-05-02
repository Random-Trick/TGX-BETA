package p122i9;

import android.opengl.GLES20;
import p064e9.C4172d;
import p107ha.C5046f;
import p107ha.C5055m;
import qa.C8294g;
import qa.C8298k;

public final class C5266b {
    public static final C5267a f17444d = new C5267a(null);
    public final int f17445a;
    public final int f17446b;
    public final String f17447c;

    public static final class C5267a {
        public C5267a() {
        }

        public final C5266b m23480a(int i, String str) {
            C8298k.m12934e(str, "name");
            return new C5266b(i, EnumC5268b.ATTRIB, str, null);
        }

        public final C5266b m23479b(int i, String str) {
            C8298k.m12934e(str, "name");
            return new C5266b(i, EnumC5268b.UNIFORM, str, null);
        }

        public C5267a(C8294g gVar) {
            this();
        }
    }

    public enum EnumC5268b {
        ATTRIB,
        UNIFORM
    }

    public C5266b(int i, EnumC5268b bVar, String str) {
        int i2;
        this.f17447c = str;
        int i3 = C5269c.f17451a[bVar.ordinal()];
        if (i3 == 1) {
            i2 = GLES20.glGetAttribLocation(C5055m.m24187a(i), str);
        } else if (i3 == 2) {
            i2 = GLES20.glGetUniformLocation(C5055m.m24187a(i), str);
        } else {
            throw new C5046f();
        }
        this.f17445a = i2;
        C4172d.m28621c(i2, str);
        this.f17446b = C5055m.m24187a(i2);
    }

    public final int m23482a() {
        return this.f17446b;
    }

    public final int m23481b() {
        return this.f17445a;
    }

    public C5266b(int i, EnumC5268b bVar, String str, C8294g gVar) {
        this(i, bVar, str);
    }
}
