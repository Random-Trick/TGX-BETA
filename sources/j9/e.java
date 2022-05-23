package j9;

import android.graphics.RectF;
import android.opengl.GLES20;
import f9.d;
import g9.b;
import i9.f;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import ra.g;
import ra.k;

public class e extends j9.a {
    public static final a f15145p = new a(null);
    public float[] f15146f;
    public final b f15147g;
    public FloatBuffer f15148h;
    public final b f15149i;
    public final b f15150j;
    public final b f15151k;
    public final RectF f15152l;
    public int f15153m;
    public g9.a f15154n;
    public l9.a f15155o;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }
    }

    public e() {
        this(null, null, null, null, null, null, 63, null);
    }

    public e(int i10, boolean z10, String str, String str2, String str3, String str4) {
        super(i10, z10, new d[0]);
        k.e(str, "vertexPositionName");
        k.e(str2, "vertexMvpMatrixName");
        this.f15146f = i9.g.c(d.f11871a);
        b bVar = null;
        this.f15147g = str4 != null ? g(str4) : null;
        this.f15148h = m9.a.b(8);
        this.f15149i = str3 != null ? f(str3) : bVar;
        this.f15150j = f(str);
        this.f15151k = g(str2);
        this.f15152l = new RectF();
        this.f15153m = -1;
    }

    @Override
    public void i(b bVar) {
        k.e(bVar, "drawable");
        super.i(bVar);
        GLES20.glDisableVertexAttribArray(this.f15150j.a());
        b bVar2 = this.f15149i;
        if (bVar2 != null) {
            GLES20.glDisableVertexAttribArray(bVar2.a());
        }
        l9.a aVar = this.f15155o;
        if (aVar != null) {
            aVar.a();
        }
        d.b("onPostDraw end");
    }

    @Override
    public void j(b bVar, float[] fArr) {
        k.e(bVar, "drawable");
        k.e(fArr, "modelViewProjectionMatrix");
        super.j(bVar, fArr);
        if (bVar instanceof g9.a) {
            l9.a aVar = this.f15155o;
            if (aVar != null) {
                aVar.b();
            }
            GLES20.glUniformMatrix4fv(this.f15151k.b(), 1, false, fArr, 0);
            d.b("glUniformMatrix4fv");
            b bVar2 = this.f15147g;
            if (bVar2 != null) {
                GLES20.glUniformMatrix4fv(bVar2.b(), 1, false, this.f15146f, 0);
                d.b("glUniformMatrix4fv");
            }
            b bVar3 = this.f15150j;
            GLES20.glEnableVertexAttribArray(bVar3.a());
            d.b("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(bVar3.a(), 2, f.c(), false, bVar.g(), (Buffer) bVar.d());
            d.b("glVertexAttribPointer");
            b bVar4 = this.f15149i;
            if (bVar4 != null) {
                if ((!k.b(bVar, this.f15154n)) || bVar.e() != this.f15153m) {
                    g9.a aVar2 = (g9.a) bVar;
                    this.f15154n = aVar2;
                    this.f15153m = bVar.e();
                    aVar2.h(this.f15152l);
                    int f10 = bVar.f() * 2;
                    if (this.f15148h.capacity() < f10) {
                        m9.b.a(this.f15148h);
                        this.f15148h = m9.a.b(f10);
                    }
                    this.f15148h.clear();
                    this.f15148h.limit(f10);
                    for (int i10 = 0; i10 < f10; i10++) {
                        boolean z10 = i10 % 2 == 0;
                        float f11 = bVar.d().get(i10);
                        RectF rectF = this.f15152l;
                        float f12 = z10 ? rectF.left : rectF.bottom;
                        RectF rectF2 = this.f15152l;
                        this.f15148h.put(l(i10 / 2, aVar2, f11, f12, z10 ? rectF2.right : rectF2.top, z10));
                    }
                }
                this.f15148h.rewind();
                GLES20.glEnableVertexAttribArray(bVar4.a());
                d.b("glEnableVertexAttribArray");
                GLES20.glVertexAttribPointer(bVar4.a(), 2, f.c(), false, bVar.g(), (Buffer) this.f15148h);
                d.b("glVertexAttribPointer");
                return;
            }
            return;
        }
        throw new RuntimeException("GlTextureProgram only supports 2D drawables.");
    }

    @Override
    public void k() {
        super.k();
        m9.b.a(this.f15148h);
        l9.a aVar = this.f15155o;
        if (aVar != null) {
            aVar.i();
        }
        this.f15155o = null;
    }

    public float l(int i10, g9.a aVar, float f10, float f11, float f12, boolean z10) {
        k.e(aVar, "drawable");
        return (((f10 - f11) / (f12 - f11)) * 1.0f) + 0.0f;
    }

    public final float[] m() {
        return this.f15146f;
    }

    public final void n(l9.a aVar) {
        this.f15155o = aVar;
    }

    public e(String str, String str2, String str3, String str4, String str5, String str6, int i10, g gVar) {
        this((i10 & 1) != 0 ? "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n" : str, (i10 & 2) != 0 ? "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n" : str2, (i10 & 4) != 0 ? "aPosition" : str3, (i10 & 8) != 0 ? "uMVPMatrix" : str4, (i10 & 16) != 0 ? "aTextureCoord" : str5, (i10 & 32) != 0 ? "uTexMatrix" : str6);
    }

    public e(String str, String str2, String str3, String str4, String str5, String str6) {
        this(j9.a.f15127e.a(str, str2), true, str3, str4, str5, str6);
        k.e(str, "vertexShader");
        k.e(str2, "fragmentShader");
        k.e(str3, "vertexPositionName");
        k.e(str4, "vertexMvpMatrixName");
    }
}
