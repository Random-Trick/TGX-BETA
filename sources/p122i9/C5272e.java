package p122i9;

import android.graphics.RectF;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import p064e9.C4172d;
import p078f9.AbstractC4328a;
import p078f9.AbstractC4329b;
import p106h9.C5038f;
import p106h9.C5039g;
import p152k9.C6218a;
import p167l9.C6429a;
import p167l9.C6430b;
import qa.C8294g;
import qa.C8298k;

public class C5272e extends C5263a {
    public static final C5273a f17455p = new C5273a(null);
    public float[] f17456f;
    public final C5266b f17457g;
    public FloatBuffer f17458h;
    public final C5266b f17459i;
    public final C5266b f17460j;
    public final C5266b f17461k;
    public final RectF f17462l;
    public int f17463m;
    public AbstractC4328a f17464n;
    public C6218a f17465o;

    public static final class C5273a {
        public C5273a() {
        }

        public C5273a(C8294g gVar) {
            this();
        }
    }

    public C5272e() {
        this(null, null, null, null, null, null, 63, null);
    }

    public C5272e(int i, boolean z, String str, String str2, String str3, String str4) {
        super(i, z, new C5270d[0]);
        C8298k.m12934e(str, "vertexPositionName");
        C8298k.m12934e(str2, "vertexMvpMatrixName");
        this.f17456f = C5039g.m24203c(C4172d.f14075a);
        C5266b bVar = null;
        this.f17457g = str4 != null ? m23487g(str4) : null;
        this.f17458h = C6429a.m20409b(8);
        this.f17459i = str3 != null ? m23488f(str3) : bVar;
        this.f17460j = m23488f(str);
        this.f17461k = m23487g(str2);
        this.f17462l = new RectF();
        this.f17463m = -1;
    }

    @Override
    public void mo23474i(AbstractC4329b bVar) {
        C8298k.m12934e(bVar, "drawable");
        super.mo23474i(bVar);
        GLES20.glDisableVertexAttribArray(this.f17460j.m23482a());
        C5266b bVar2 = this.f17459i;
        if (bVar2 != null) {
            GLES20.glDisableVertexAttribArray(bVar2.m23482a());
        }
        C6218a aVar = this.f17465o;
        if (aVar != null) {
            aVar.mo21050a();
        }
        C4172d.m28622b("onPostDraw end");
    }

    @Override
    public void mo23473j(AbstractC4329b bVar, float[] fArr) {
        C8298k.m12934e(bVar, "drawable");
        C8298k.m12934e(fArr, "modelViewProjectionMatrix");
        super.mo23473j(bVar, fArr);
        if (bVar instanceof AbstractC4328a) {
            C6218a aVar = this.f17465o;
            if (aVar != null) {
                aVar.mo21049b();
            }
            GLES20.glUniformMatrix4fv(this.f17461k.m23481b(), 1, false, fArr, 0);
            C4172d.m28622b("glUniformMatrix4fv");
            C5266b bVar2 = this.f17457g;
            if (bVar2 != null) {
                GLES20.glUniformMatrix4fv(bVar2.m23481b(), 1, false, this.f17456f, 0);
                C4172d.m28622b("glUniformMatrix4fv");
            }
            C5266b bVar3 = this.f17460j;
            GLES20.glEnableVertexAttribArray(bVar3.m23482a());
            C4172d.m28622b("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(bVar3.m23482a(), 2, C5038f.m24220c(), false, bVar.m28265g(), (Buffer) bVar.mo28263d());
            C4172d.m28622b("glVertexAttribPointer");
            C5266b bVar4 = this.f17459i;
            if (bVar4 != null) {
                if ((!C8298k.m12937b(bVar, this.f17464n)) || bVar.m28267e() != this.f17463m) {
                    AbstractC4328a aVar2 = (AbstractC4328a) bVar;
                    this.f17464n = aVar2;
                    this.f17463m = bVar.m28267e();
                    aVar2.m28270h(this.f17462l);
                    int f = bVar.m28266f() * 2;
                    if (this.f17458h.capacity() < f) {
                        C6430b.m20408a(this.f17458h);
                        this.f17458h = C6429a.m20409b(f);
                    }
                    this.f17458h.clear();
                    this.f17458h.limit(f);
                    for (int i = 0; i < f; i++) {
                        boolean z = i % 2 == 0;
                        float f2 = bVar.mo28263d().get(i);
                        RectF rectF = this.f17462l;
                        float f3 = z ? rectF.left : rectF.bottom;
                        RectF rectF2 = this.f17462l;
                        this.f17458h.put(m23471l(i / 2, aVar2, f2, f3, z ? rectF2.right : rectF2.top, z));
                    }
                }
                this.f17458h.rewind();
                GLES20.glEnableVertexAttribArray(bVar4.m23482a());
                C4172d.m28622b("glEnableVertexAttribArray");
                GLES20.glVertexAttribPointer(bVar4.m23482a(), 2, C5038f.m24220c(), false, bVar.m28265g(), (Buffer) this.f17458h);
                C4172d.m28622b("glVertexAttribPointer");
                return;
            }
            return;
        }
        throw new RuntimeException("GlTextureProgram only supports 2D drawables.");
    }

    @Override
    public void mo23472k() {
        super.mo23472k();
        C6430b.m20408a(this.f17458h);
        C6218a aVar = this.f17465o;
        if (aVar != null) {
            aVar.m21042i();
        }
        this.f17465o = null;
    }

    public float m23471l(int i, AbstractC4328a aVar, float f, float f2, float f3, boolean z) {
        C8298k.m12934e(aVar, "drawable");
        return (((f - f2) / (f3 - f2)) * 1.0f) + 0.0f;
    }

    public final float[] m23470m() {
        return this.f17456f;
    }

    public final void m23469n(C6218a aVar) {
        this.f17465o = aVar;
    }

    public C5272e(String str, String str2, String str3, String str4, String str5, String str6, int i, C8294g gVar) {
        this((i & 1) != 0 ? "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n" : str, (i & 2) != 0 ? "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n" : str2, (i & 4) != 0 ? "aPosition" : str3, (i & 8) != 0 ? "uMVPMatrix" : str4, (i & 16) != 0 ? "aTextureCoord" : str5, (i & 32) != 0 ? "uTexMatrix" : str6);
    }

    public C5272e(String str, String str2, String str3, String str4, String str5, String str6) {
        this(C5263a.f17436e.m23485a(str, str2), true, str3, str4, str5, str6);
        C8298k.m12934e(str, "vertexShader");
        C8298k.m12934e(str2, "fragmentShader");
        C8298k.m12934e(str3, "vertexPositionName");
        C8298k.m12934e(str4, "vertexMvpMatrixName");
    }
}
