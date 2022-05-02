package p336y;

import android.util.Size;
import androidx.camera.core.AbstractC0618m1;
import androidx.camera.core.AbstractC0688y2;
import androidx.camera.core.C0532e1;
import androidx.camera.core.C0653t;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p027c0.AbstractC1422g;
import p027c0.C1423h;
import p027c0.C1427l;
import p336y.AbstractC10268n0;
import p336y.C10200b2;
import p336y.C10245j0;

public final class C10324z0 implements AbstractC10273n2<C0532e1>, AbstractC10219e1, AbstractC1422g {
    public static final AbstractC10268n0.AbstractC10269a<Integer> f33184F;
    public static final AbstractC10268n0.AbstractC10269a<Integer> f33185G;
    public static final AbstractC10268n0.AbstractC10269a<Integer> f33186x;
    public static final AbstractC10268n0.AbstractC10269a<Integer> f33187y;
    public final C10300t1 f33189w;
    public static final AbstractC10268n0.AbstractC10269a<AbstractC10240i0> f33188z = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.imageCapture.captureBundle", AbstractC10240i0.class);
    public static final AbstractC10268n0.AbstractC10269a<AbstractC10251k0> f33179A = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.imageCapture.captureProcessor", AbstractC10251k0.class);
    public static final AbstractC10268n0.AbstractC10269a<Integer> f33180B = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.imageCapture.bufferFormat", Integer.class);
    public static final AbstractC10268n0.AbstractC10269a<Integer> f33181C = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.imageCapture.maxCaptureStages", Integer.class);
    public static final AbstractC10268n0.AbstractC10269a<AbstractC0618m1> f33182D = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.imageCapture.imageReaderProxyProvider", AbstractC0618m1.class);
    public static final AbstractC10268n0.AbstractC10269a<Boolean> f33183E = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);

    static {
        Class cls = Integer.TYPE;
        f33186x = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.imageCapture.captureMode", cls);
        f33187y = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.imageCapture.flashMode", cls);
        f33184F = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.imageCapture.flashType", cls);
        f33185G = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.imageCapture.jpegCompressionQuality", cls);
    }

    public C10324z0(C10300t1 t1Var) {
        this.f33189w = t1Var;
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
        return C1427l.m36961a(this, bVar);
    }

    @Override
    public int mo5452E(int i) {
        return C10215d1.m5711f(this, i);
    }

    public AbstractC10240i0 m5451F(AbstractC10240i0 i0Var) {
        return (AbstractC10240i0) mo5426a(f33188z, i0Var);
    }

    public int m5450G() {
        return ((Integer) mo5424c(f33186x)).intValue();
    }

    public AbstractC10251k0 m5449H(AbstractC10251k0 k0Var) {
        return (AbstractC10251k0) mo5426a(f33179A, k0Var);
    }

    public int m5448I(int i) {
        return ((Integer) mo5426a(f33187y, Integer.valueOf(i))).intValue();
    }

    public int m5447J(int i) {
        return ((Integer) mo5426a(f33184F, Integer.valueOf(i))).intValue();
    }

    public AbstractC0618m1 m5446K() {
        return (AbstractC0618m1) mo5426a(f33182D, null);
    }

    public Executor m5445L(Executor executor) {
        return (Executor) mo5426a(AbstractC1422g.f5242a, executor);
    }

    public int m5444M() {
        return ((Integer) mo5424c(f33185G)).intValue();
    }

    public int m5443N(int i) {
        return ((Integer) mo5426a(f33181C, Integer.valueOf(i))).intValue();
    }

    public boolean m5442O() {
        return mo5422e(f33186x);
    }

    public boolean m5441P() {
        return ((Boolean) mo5426a(f33183E, Boolean.FALSE)).booleanValue();
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
    public Size mo5440f(Size size) {
        return C10215d1.m5715b(this, size);
    }

    @Override
    public void mo5439g(String str, AbstractC10268n0.AbstractC10270b bVar) {
        C10321y1.m5467b(this, str, bVar);
    }

    @Override
    public List mo5438i(List list) {
        return C10215d1.m5714c(this, list);
    }

    @Override
    public C10245j0.AbstractC10247b mo5437j(C10245j0.AbstractC10247b bVar) {
        return C10266m2.m5587b(this, bVar);
    }

    @Override
    public AbstractC10268n0 mo5421k() {
        return this.f33189w;
    }

    @Override
    public Set mo5436l(AbstractC10268n0.AbstractC10269a aVar) {
        return C10321y1.m5465d(this, aVar);
    }

    @Override
    public int mo5435m() {
        return ((Integer) mo5424c(AbstractC10210c1.f32976j)).intValue();
    }

    @Override
    public Size mo5434o(Size size) {
        return C10215d1.m5716a(this, size);
    }

    @Override
    public Size mo5433p(Size size) {
        return C10215d1.m5712e(this, size);
    }

    @Override
    public String mo5432q(String str) {
        return C1423h.m36963a(this, str);
    }

    @Override
    public C10200b2 mo5431t(C10200b2 b2Var) {
        return C10266m2.m5585d(this, b2Var);
    }

    @Override
    public boolean mo5430u() {
        return C10215d1.m5710g(this);
    }

    @Override
    public int mo5429v(int i) {
        return C10266m2.m5583f(this, i);
    }

    @Override
    public int mo5428w() {
        return C10215d1.m5713d(this);
    }

    @Override
    public Object mo5427x(AbstractC10268n0.AbstractC10269a aVar, AbstractC10268n0.EnumC10271c cVar) {
        return C10321y1.m5461h(this, aVar, cVar);
    }
}
