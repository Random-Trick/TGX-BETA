package g9;

import android.opengl.GLES20;
import f9.d;
import i9.f;
import ia.q;
import java.nio.FloatBuffer;
import ra.g;

public class c extends g9.a {
    public FloatBuffer f12172g;
    public static final a f12171i = new a(null);
    @Deprecated
    public static final float[] f12170h = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }
    }

    public c() {
        float[] fArr = f12170h;
        FloatBuffer b10 = m9.a.b(fArr.length);
        b10.put(fArr);
        b10.clear();
        q qVar = q.f14159a;
        this.f12172g = b10;
    }

    @Override
    public void a() {
        d.b("glDrawArrays start");
        GLES20.glDrawArrays(f.o(), 0, f());
        d.b("glDrawArrays end");
    }

    @Override
    public FloatBuffer d() {
        return this.f12172g;
    }
}
