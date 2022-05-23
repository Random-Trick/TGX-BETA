package e5;

import android.opengl.GLES20;
import c5.m;
import e5.d;
import java.nio.Buffer;
import java.nio.FloatBuffer;

public final class f {
    public static final float[] f10599j = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] f10600k = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] f10601l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] f10602m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] f10603n = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};
    public int f10604a;
    public a f10605b;
    public a f10606c;
    public m.c f10607d;
    public int f10608e;
    public int f10609f;
    public int f10610g;
    public int f10611h;
    public int f10612i;

    public static class a {
        public final int f10613a;
        public final FloatBuffer f10614b;
        public final FloatBuffer f10615c;
        public final int f10616d;

        public a(d.b bVar) {
            this.f10613a = bVar.a();
            this.f10614b = m.i(bVar.f10597c);
            this.f10615c = m.i(bVar.f10598d);
            int i10 = bVar.f10596b;
            if (i10 == 1) {
                this.f10616d = 5;
            } else if (i10 != 2) {
                this.f10616d = 4;
            } else {
                this.f10616d = 6;
            }
        }
    }

    public static boolean c(d dVar) {
        d.a aVar = dVar.f10590a;
        d.a aVar2 = dVar.f10591b;
        return aVar.b() == 1 && aVar.a(0).f10595a == 0 && aVar2.b() == 1 && aVar2.a(0).f10595a == 0;
    }

    public void a(int i10, float[] fArr, boolean z10) {
        float[] fArr2;
        a aVar = z10 ? this.f10606c : this.f10605b;
        if (aVar != null) {
            int i11 = this.f10604a;
            if (i11 == 1) {
                fArr2 = z10 ? f10601l : f10600k;
            } else if (i11 == 2) {
                fArr2 = z10 ? f10603n : f10602m;
            } else {
                fArr2 = f10599j;
            }
            GLES20.glUniformMatrix3fv(this.f10609f, 1, false, fArr2, 0);
            GLES20.glUniformMatrix4fv(this.f10608e, 1, false, fArr, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i10);
            GLES20.glUniform1i(this.f10612i, 0);
            m.g();
            GLES20.glVertexAttribPointer(this.f10610g, 3, 5126, false, 12, (Buffer) aVar.f10614b);
            m.g();
            GLES20.glVertexAttribPointer(this.f10611h, 2, 5126, false, 8, (Buffer) aVar.f10615c);
            m.g();
            GLES20.glDrawArrays(aVar.f10616d, 0, aVar.f10613a);
            m.g();
        }
    }

    public void b() {
        m.c cVar = new m.c("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
        this.f10607d = cVar;
        this.f10608e = cVar.c("uMvpMatrix");
        this.f10609f = this.f10607d.c("uTexMatrix");
        this.f10610g = this.f10607d.a("aPosition");
        this.f10611h = this.f10607d.a("aTexCoords");
        this.f10612i = this.f10607d.c("uTexture");
    }

    public void d(d dVar) {
        if (c(dVar)) {
            this.f10604a = dVar.f10592c;
            a aVar = new a(dVar.f10590a.a(0));
            this.f10605b = aVar;
            if (!dVar.f10593d) {
                aVar = new a(dVar.f10591b.a(0));
            }
            this.f10606c = aVar;
        }
    }
}
