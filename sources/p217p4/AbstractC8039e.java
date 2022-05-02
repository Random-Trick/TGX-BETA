package p217p4;

import java.nio.ByteBuffer;
import org.thunderdog.challegram.Log;
import p020b5.C1186a;
import p216p3.AbstractC8029i;

public abstract class AbstractC8039e extends AbstractC8029i<C8046j, AbstractC8047k, C8043h> implements AbstractC8042g {
    public final String f26202n;

    public class C8040a extends AbstractC8047k {
        public C8040a() {
        }

        @Override
        public void release() {
            AbstractC8039e.this.mo13764t(this);
        }
    }

    public AbstractC8039e(String str) {
        super(new C8046j[2], new AbstractC8047k[2]);
        this.f26202n = str;
        m13761w(Log.TAG_CAMERA);
    }

    public final C8043h mo13727k(Throwable th) {
        return new C8043h("Unexpected decode error", th);
    }

    public abstract AbstractC8041f mo5207B(byte[] bArr, int i, boolean z);

    public final C8043h mo13726l(C8046j jVar, AbstractC8047k kVar, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) C1186a.m38188e(jVar.f26135c);
            kVar.m13720e(jVar.f26129N, mo5207B(byteBuffer.array(), byteBuffer.limit(), z), jVar.f26205R);
            kVar.clearFlag(Integer.MIN_VALUE);
            return null;
        } catch (C8043h e) {
            return e;
        }
    }

    @Override
    public final String mo13105b() {
        return this.f26202n;
    }

    @Override
    public void mo13073c(long j) {
    }

    public final C8046j mo13729i() {
        return new C8046j();
    }

    public final AbstractC8047k mo13728j() {
        return new C8040a();
    }
}
