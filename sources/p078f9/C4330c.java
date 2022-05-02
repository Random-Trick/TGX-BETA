package p078f9;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import p064e9.C4172d;
import p106h9.C5038f;
import p107ha.C5060q;
import p167l9.C6429a;
import qa.C8294g;

public class C4330c extends AbstractC4328a {
    public FloatBuffer f14403g;
    public static final C4331a f14402i = new C4331a(null);
    @Deprecated
    public static final float[] f14401h = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    public static final class C4331a {
        public C4331a() {
        }

        public C4331a(C8294g gVar) {
            this();
        }
    }

    public C4330c() {
        float[] fArr = f14401h;
        FloatBuffer b = C6429a.m20409b(fArr.length);
        b.put(fArr);
        b.clear();
        C5060q qVar = C5060q.f17066a;
        this.f14403g = b;
    }

    @Override
    public void mo28264a() {
        C4172d.m28622b("glDrawArrays start");
        GLES20.glDrawArrays(C5038f.m24208o(), 0, m28266f());
        C4172d.m28622b("glDrawArrays end");
    }

    @Override
    public FloatBuffer mo28263d() {
        return this.f14403g;
    }
}
