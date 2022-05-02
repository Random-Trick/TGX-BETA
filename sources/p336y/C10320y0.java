package p336y;

import android.util.Size;
import androidx.camera.core.AbstractC0618m1;
import androidx.camera.core.AbstractC0688y2;
import androidx.camera.core.C0599k0;
import androidx.camera.core.C0653t;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p027c0.AbstractC1426k;
import p027c0.C1423h;
import p027c0.C1425j;
import p027c0.C1427l;
import p336y.AbstractC10268n0;
import p336y.C10200b2;
import p336y.C10245j0;

public final class C10320y0 implements AbstractC10273n2<C0599k0>, AbstractC10219e1, AbstractC1426k {
    public final C10300t1 f33178w;
    public static final AbstractC10268n0.AbstractC10269a<Integer> f33175x = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.imageAnalysis.backpressureStrategy", C0599k0.AbstractC0601b.class);
    public static final AbstractC10268n0.AbstractC10269a<Integer> f33176y = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);
    public static final AbstractC10268n0.AbstractC10269a<AbstractC0618m1> f33177z = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.imageAnalysis.imageReaderProxyProvider", AbstractC0618m1.class);
    public static final AbstractC10268n0.AbstractC10269a<Integer> f33172A = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.imageAnalysis.outputImageFormat", C0599k0.AbstractC0604e.class);
    public static final AbstractC10268n0.AbstractC10269a<Boolean> f33173B = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class);
    public static final AbstractC10268n0.AbstractC10269a<Boolean> f33174C = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class);

    public C10320y0(C10300t1 t1Var) {
        this.f33178w = t1Var;
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

    public Executor m5475F(Executor executor) {
        return C1425j.m36962a(this, executor);
    }

    public int m5474G(int i) {
        return ((Integer) mo5426a(f33175x, Integer.valueOf(i))).intValue();
    }

    public int m5473H(int i) {
        return ((Integer) mo5426a(f33176y, Integer.valueOf(i))).intValue();
    }

    public AbstractC0618m1 m5472I() {
        return (AbstractC0618m1) mo5426a(f33177z, null);
    }

    public Boolean m5471J(Boolean bool) {
        return (Boolean) mo5426a(f33173B, bool);
    }

    public int m5470K(int i) {
        return ((Integer) mo5426a(f33172A, Integer.valueOf(i))).intValue();
    }

    public Boolean m5469L(Boolean bool) {
        return (Boolean) mo5426a(f33174C, bool);
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
        return this.f33178w;
    }

    @Override
    public Set mo5436l(AbstractC10268n0.AbstractC10269a aVar) {
        return C10321y1.m5465d(this, aVar);
    }

    @Override
    public int mo5435m() {
        return 35;
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
