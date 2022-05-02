package p045d5;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import p020b5.C1186a;
import p020b5.C1217m;
import p045d5.C3604d;

public final class C3608f {
    public static final String[] f12296j = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};
    public static final String[] f12297k = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};
    public static final float[] f12298l = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] f12299m = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] f12300n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] f12301o = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] f12302p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};
    public int f12303a;
    public C3609a f12304b;
    public C3609a f12305c;
    public C1217m.C1219b f12306d;
    public int f12307e;
    public int f12308f;
    public int f12309g;
    public int f12310h;
    public int f12311i;

    public static class C3609a {
        public final int f12312a;
        public final FloatBuffer f12313b;
        public final FloatBuffer f12314c;
        public final int f12315d;

        public C3609a(C3604d.C3606b bVar) {
            this.f12312a = bVar.m29879a();
            this.f12313b = C1217m.m37931d(bVar.f12294c);
            this.f12314c = C1217m.m37931d(bVar.f12295d);
            int i = bVar.f12293b;
            if (i == 1) {
                this.f12315d = 5;
            } else if (i != 2) {
                this.f12315d = 4;
            } else {
                this.f12315d = 6;
            }
        }
    }

    public static boolean m29869c(C3604d dVar) {
        C3604d.C3605a aVar = dVar.f12287a;
        C3604d.C3605a aVar2 = dVar.f12288b;
        return aVar.m29880b() == 1 && aVar.m29881a(0).f12292a == 0 && aVar2.m29880b() == 1 && aVar2.m29881a(0).f12292a == 0;
    }

    public void m29871a(int i, float[] fArr, boolean z) {
        float[] fArr2;
        C3609a aVar = z ? this.f12305c : this.f12304b;
        if (aVar != null) {
            ((C1217m.C1219b) C1186a.m38185e(this.f12306d)).m37923d();
            C1217m.m37933b();
            GLES20.glEnableVertexAttribArray(this.f12309g);
            GLES20.glEnableVertexAttribArray(this.f12310h);
            C1217m.m37933b();
            int i2 = this.f12303a;
            if (i2 == 1) {
                fArr2 = z ? f12300n : f12299m;
            } else if (i2 == 2) {
                fArr2 = z ? f12302p : f12301o;
            } else {
                fArr2 = f12298l;
            }
            GLES20.glUniformMatrix3fv(this.f12308f, 1, false, fArr2, 0);
            GLES20.glUniformMatrix4fv(this.f12307e, 1, false, fArr, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(this.f12311i, 0);
            C1217m.m37933b();
            GLES20.glVertexAttribPointer(this.f12309g, 3, 5126, false, 12, (Buffer) aVar.f12313b);
            C1217m.m37933b();
            GLES20.glVertexAttribPointer(this.f12310h, 2, 5126, false, 8, (Buffer) aVar.f12314c);
            C1217m.m37933b();
            GLES20.glDrawArrays(aVar.f12315d, 0, aVar.f12312a);
            C1217m.m37933b();
            GLES20.glDisableVertexAttribArray(this.f12309g);
            GLES20.glDisableVertexAttribArray(this.f12310h);
        }
    }

    public void m29870b() {
        C1217m.C1219b bVar = new C1217m.C1219b(f12296j, f12297k);
        this.f12306d = bVar;
        this.f12307e = bVar.m37924c("uMvpMatrix");
        this.f12308f = this.f12306d.m37924c("uTexMatrix");
        this.f12309g = this.f12306d.m37925b("aPosition");
        this.f12310h = this.f12306d.m37925b("aTexCoords");
        this.f12311i = this.f12306d.m37924c("uTexture");
    }

    public void m29868d(C3604d dVar) {
        if (m29869c(dVar)) {
            this.f12303a = dVar.f12289c;
            C3609a aVar = new C3609a(dVar.f12287a.m29881a(0));
            this.f12304b = aVar;
            if (!dVar.f12290d) {
                aVar = new C3609a(dVar.f12288b.m29881a(0));
            }
            this.f12305c = aVar;
        }
    }
}
