package j9;

import android.opengl.GLES20;
import f9.d;
import f9.e;
import i9.f;
import ia.m;
import ia.q;
import ra.g;
import ra.k;
import ra.l;

public class a implements e {
    public static final C0127a f15127e = new C0127a(null);
    public boolean f15128a;
    public final int f15129b;
    public final boolean f15130c;
    public final d[] f15131d;

    public static final class C0127a {
        public C0127a() {
        }

        public C0127a(g gVar) {
            this();
        }

        public final int a(String str, String str2) {
            k.e(str, "vertexShaderSource");
            k.e(str2, "fragmentShaderSource");
            return b(new d(f.q(), str), new d(f.d(), str2));
        }

        public final int b(d... dVarArr) {
            k.e(dVarArr, "shaders");
            int a10 = m.a(GLES20.glCreateProgram());
            d.b("glCreateProgram");
            if (a10 != 0) {
                for (d dVar : dVarArr) {
                    GLES20.glAttachShader(a10, m.a(dVar.a()));
                    d.b("glAttachShader");
                }
                GLES20.glLinkProgram(a10);
                int[] iArr = new int[1];
                GLES20.glGetProgramiv(a10, f.f(), iArr, 0);
                if (iArr[0] == f.p()) {
                    return a10;
                }
                String str = "Could not link program: " + GLES20.glGetProgramInfoLog(a10);
                GLES20.glDeleteProgram(a10);
                throw new RuntimeException(str);
            }
            throw new RuntimeException("Could not create program");
        }
    }

    public static final class b extends l implements qa.a<q> {
        public final float[] M;
        public final g9.b f15133c;

        public b(g9.b bVar, float[] fArr) {
            super(0);
            this.f15133c = bVar;
            this.M = fArr;
        }

        @Override
        public q b() {
            f();
            return q.f14159a;
        }

        public final void f() {
            a.this.j(this.f15133c, this.M);
            a.this.h(this.f15133c);
            a.this.i(this.f15133c);
        }
    }

    public a(int i10, boolean z10, d... dVarArr) {
        k.e(dVarArr, "shaders");
        this.f15129b = i10;
        this.f15130c = z10;
        this.f15131d = dVarArr;
    }

    public static void e(a aVar, g9.b bVar, float[] fArr, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                fArr = bVar.c();
            }
            aVar.d(bVar, fArr);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw");
    }

    @Override
    public void a() {
        GLES20.glUseProgram(0);
    }

    @Override
    public void b() {
        GLES20.glUseProgram(m.a(this.f15129b));
        d.b("glUseProgram");
    }

    public final void c(g9.b bVar) {
        e(this, bVar, null, 2, null);
    }

    public final void d(g9.b bVar, float[] fArr) {
        k.e(bVar, "drawable");
        k.e(fArr, "modelViewProjectionMatrix");
        d.b("draw start");
        f9.f.a(this, new b(bVar, fArr));
        d.b("draw end");
    }

    public final j9.b f(String str) {
        k.e(str, "name");
        return j9.b.f15134d.a(this.f15129b, str);
    }

    public final j9.b g(String str) {
        k.e(str, "name");
        return j9.b.f15134d.b(this.f15129b, str);
    }

    public void h(g9.b bVar) {
        k.e(bVar, "drawable");
        bVar.a();
    }

    public void i(g9.b bVar) {
        k.e(bVar, "drawable");
    }

    public void j(g9.b bVar, float[] fArr) {
        k.e(bVar, "drawable");
        k.e(fArr, "modelViewProjectionMatrix");
    }

    public void k() {
        if (!this.f15128a) {
            if (this.f15130c) {
                GLES20.glDeleteProgram(m.a(this.f15129b));
            }
            for (d dVar : this.f15131d) {
                dVar.b();
            }
            this.f15128a = true;
        }
    }
}
