package p122i9;

import android.opengl.GLES20;
import p064e9.AbstractC4173e;
import p064e9.C4172d;
import p064e9.C4174f;
import p078f9.AbstractC4329b;
import p106h9.C5038f;
import p107ha.C5055m;
import p107ha.C5060q;
import pa.AbstractC8077a;
import qa.AbstractC8299l;
import qa.C8294g;
import qa.C8298k;

public class C5263a implements AbstractC4173e {
    public static final C5264a f17436e = new C5264a(null);
    public boolean f17437a;
    public final int f17438b;
    public final boolean f17439c;
    public final C5270d[] f17440d;

    public static final class C5264a {
        public C5264a() {
        }

        public final int m23485a(String str, String str2) {
            C8298k.m12934e(str, "vertexShaderSource");
            C8298k.m12934e(str2, "fragmentShaderSource");
            return m23484b(new C5270d(C5038f.m24206q(), str), new C5270d(C5038f.m24219d(), str2));
        }

        public final int m23484b(C5270d... dVarArr) {
            C8298k.m12934e(dVarArr, "shaders");
            int a = C5055m.m24187a(GLES20.glCreateProgram());
            C4172d.m28622b("glCreateProgram");
            if (a != 0) {
                for (C5270d dVar : dVarArr) {
                    GLES20.glAttachShader(a, C5055m.m24187a(dVar.m23478a()));
                    C4172d.m28622b("glAttachShader");
                }
                GLES20.glLinkProgram(a);
                int[] iArr = new int[1];
                GLES20.glGetProgramiv(a, C5038f.m24217f(), iArr, 0);
                if (iArr[0] == C5038f.m24207p()) {
                    return a;
                }
                String str = "Could not link program: " + GLES20.glGetProgramInfoLog(a);
                GLES20.glDeleteProgram(a);
                throw new RuntimeException(str);
            }
            throw new RuntimeException("Could not create program");
        }

        public C5264a(C8294g gVar) {
            this();
        }
    }

    public static final class C5265b extends AbstractC8299l implements AbstractC8077a<C5060q> {
        public final float[] f17441M;
        public final AbstractC4329b f17443c;

        public C5265b(AbstractC4329b bVar, float[] fArr) {
            super(0);
            this.f17443c = bVar;
            this.f17441M = fArr;
        }

        @Override
        public C5060q mo4925b() {
            m23483f();
            return C5060q.f17066a;
        }

        public final void m23483f() {
            C5263a.this.mo23473j(this.f17443c, this.f17441M);
            C5263a.this.m23486h(this.f17443c);
            C5263a.this.mo23474i(this.f17443c);
        }
    }

    public C5263a(int i, boolean z, C5270d... dVarArr) {
        C8298k.m12934e(dVarArr, "shaders");
        this.f17438b = i;
        this.f17439c = z;
        this.f17440d = dVarArr;
    }

    public static void m23489e(C5263a aVar, AbstractC4329b bVar, float[] fArr, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                fArr = bVar.m28268c();
            }
            aVar.m23490d(bVar, fArr);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw");
    }

    @Override
    public void mo21050a() {
        GLES20.glUseProgram(0);
    }

    @Override
    public void mo21049b() {
        GLES20.glUseProgram(C5055m.m24187a(this.f17438b));
        C4172d.m28622b("glUseProgram");
    }

    public final void m23491c(AbstractC4329b bVar) {
        m23489e(this, bVar, null, 2, null);
    }

    public final void m23490d(AbstractC4329b bVar, float[] fArr) {
        C8298k.m12934e(bVar, "drawable");
        C8298k.m12934e(fArr, "modelViewProjectionMatrix");
        C4172d.m28622b("draw start");
        C4174f.m28620a(this, new C5265b(bVar, fArr));
        C4172d.m28622b("draw end");
    }

    public final C5266b m23488f(String str) {
        C8298k.m12934e(str, "name");
        return C5266b.f17444d.m23480a(this.f17438b, str);
    }

    public final C5266b m23487g(String str) {
        C8298k.m12934e(str, "name");
        return C5266b.f17444d.m23479b(this.f17438b, str);
    }

    public void m23486h(AbstractC4329b bVar) {
        C8298k.m12934e(bVar, "drawable");
        bVar.mo28264a();
    }

    public void mo23474i(AbstractC4329b bVar) {
        C8298k.m12934e(bVar, "drawable");
    }

    public void mo23473j(AbstractC4329b bVar, float[] fArr) {
        C8298k.m12934e(bVar, "drawable");
        C8298k.m12934e(fArr, "modelViewProjectionMatrix");
    }

    public void mo23472k() {
        if (!this.f17437a) {
            if (this.f17439c) {
                GLES20.glDeleteProgram(C5055m.m24187a(this.f17438b));
            }
            for (C5270d dVar : this.f17440d) {
                dVar.m23477b();
            }
            this.f17437a = true;
        }
    }
}
