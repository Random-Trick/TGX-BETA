package p255s;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.AbstractC0688y2;
import androidx.camera.core.C0653t;
import androidx.camera.core.C0662u1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import p001a0.C0003a;
import p015b0.AbstractC1107c;
import p015b0.C1111f;
import p027c0.C1423h;
import p027c0.C1427l;
import p266t.C8927z;
import p336y.AbstractC10268n0;
import p336y.AbstractC10273n2;
import p336y.AbstractC10287q0;
import p336y.C10199b1;
import p336y.C10200b2;
import p336y.C10237h1;
import p336y.C10245j0;
import p336y.C10266m2;
import p336y.C10284p1;
import p336y.C10321y1;

public class C8450c2 {
    public AbstractC10287q0 f27423a;
    public final C10200b2 f27424b;

    public class C8451a implements AbstractC1107c<Void> {
        public final Surface f27425a;
        public final SurfaceTexture f27426b;

        public C8451a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f27425a = surface;
            this.f27426b = surfaceTexture;
        }

        @Override
        public void mo5502b(Throwable th) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }

        public void mo5503a(Void r1) {
            this.f27425a.release();
            this.f27426b.release();
        }
    }

    public static class C8452b implements AbstractC10273n2<AbstractC0688y2> {
        public final AbstractC10268n0 f27428w;

        public C8452b() {
            C10284p1 J = C10284p1.m5569J();
            J.mo5566n(AbstractC10273n2.f33093s, new C8449c1());
            this.f27428w = J;
        }

        @Override
        public C10200b2.AbstractC10204d mo5456A(C10200b2.AbstractC10204d dVar) {
            return C10266m2.m5584e(this, dVar);
        }

        @Override
        public C10245j0 mo5455B(C10245j0 j0Var) {
            return C10266m2.m5586c(this, j0Var);
        }

        @Override
        public C0653t mo5454C(C0653t tVar) {
            return C10266m2.m5588a(this, tVar);
        }

        @Override
        public AbstractC0688y2.AbstractC0690b mo5453D(AbstractC0688y2.AbstractC0690b bVar) {
            return C1427l.m36958a(this, bVar);
        }

        @Override
        public Object mo5426a(AbstractC10268n0.AbstractC10269a aVar, Object obj) {
            return C10321y1.m5462g(this, aVar, obj);
        }

        @Override
        public Set mo5425b() {
            return C10321y1.m5464e(this);
        }

        @Override
        public Object mo5424c(AbstractC10268n0.AbstractC10269a aVar) {
            return C10321y1.m5463f(this, aVar);
        }

        @Override
        public AbstractC10268n0.EnumC10271c mo5423d(AbstractC10268n0.AbstractC10269a aVar) {
            return C10321y1.m5466c(this, aVar);
        }

        @Override
        public boolean mo5422e(AbstractC10268n0.AbstractC10269a aVar) {
            return C10321y1.m5468a(this, aVar);
        }

        @Override
        public void mo5439g(String str, AbstractC10268n0.AbstractC10270b bVar) {
            C10321y1.m5467b(this, str, bVar);
        }

        @Override
        public C10245j0.AbstractC10247b mo5437j(C10245j0.AbstractC10247b bVar) {
            return C10266m2.m5587b(this, bVar);
        }

        @Override
        public AbstractC10268n0 mo5421k() {
            return this.f27428w;
        }

        @Override
        public Set mo5436l(AbstractC10268n0.AbstractC10269a aVar) {
            return C10321y1.m5465d(this, aVar);
        }

        @Override
        public int mo5435m() {
            return C10199b1.m5770a(this);
        }

        @Override
        public String mo5432q(String str) {
            return C1423h.m36960a(this, str);
        }

        @Override
        public C10200b2 mo5431t(C10200b2 b2Var) {
            return C10266m2.m5585d(this, b2Var);
        }

        @Override
        public int mo5429v(int i) {
            return C10266m2.m5583f(this, i);
        }

        @Override
        public Object mo5427x(AbstractC10268n0.AbstractC10269a aVar, AbstractC10268n0.EnumC10271c cVar) {
            return C10321y1.m5461h(this, aVar, cVar);
        }
    }

    public C8450c2(C8927z zVar) {
        C8452b bVar = new C8452b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size c = m12441c(zVar);
        C0662u1.m40653a("MeteringRepeating", "MerteringSession SurfaceTexture size: " + c);
        surfaceTexture.setDefaultBufferSize(c.getWidth(), c.getHeight());
        Surface surface = new Surface(surfaceTexture);
        C10200b2.C10202b o = C10200b2.C10202b.m5745o(bVar);
        o.m5742r(1);
        C10237h1 h1Var = new C10237h1(surface);
        this.f27423a = h1Var;
        C1111f.m38357b(h1Var.m5545i(), new C8451a(surface, surfaceTexture), C0003a.m42611a());
        o.m5749k(this.f27423a);
        this.f27424b = o.m5747m();
    }

    public static int m12438f(Size size, Size size2) {
        return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
    }

    public void m12442b() {
        C0662u1.m40653a("MeteringRepeating", "MeteringRepeating clear!");
        AbstractC10287q0 q0Var = this.f27423a;
        if (q0Var != null) {
            q0Var.m5551c();
        }
        this.f27423a = null;
    }

    public final Size m12441c(C8927z zVar) {
        Size[] sizeArr;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) zVar.m10952a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            C0662u1.m40651c("MeteringRepeating", "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP.");
            return new Size(0, 0);
        }
        if (Build.VERSION.SDK_INT < 23) {
            sizeArr = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        } else {
            sizeArr = streamConfigurationMap.getOutputSizes(34);
        }
        if (sizeArr != null) {
            return (Size) Collections.min(Arrays.asList(sizeArr), C8445b2.f27417a);
        }
        C0662u1.m40651c("MeteringRepeating", "Can not get output size list.");
        return new Size(0, 0);
    }

    public String m12440d() {
        return "MeteringRepeating";
    }

    public C10200b2 m12439e() {
        return this.f27424b;
    }
}
