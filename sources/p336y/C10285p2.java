package p336y;

import android.util.Size;
import androidx.camera.core.AbstractC0688y2;
import androidx.camera.core.C0580i3;
import androidx.camera.core.C0653t;
import java.util.List;
import java.util.Set;
import p027c0.AbstractC1426k;
import p027c0.C1423h;
import p027c0.C1427l;
import p336y.AbstractC10268n0;
import p336y.C10200b2;
import p336y.C10245j0;

public final class C10285p2 implements AbstractC10273n2<C0580i3>, AbstractC10219e1, AbstractC1426k {
    public static final AbstractC10268n0.AbstractC10269a<Integer> f33112A;
    public static final AbstractC10268n0.AbstractC10269a<Integer> f33113B;
    public static final AbstractC10268n0.AbstractC10269a<Integer> f33114C;
    public static final AbstractC10268n0.AbstractC10269a<Integer> f33115D;
    public static final AbstractC10268n0.AbstractC10269a<Integer> f33116x;
    public static final AbstractC10268n0.AbstractC10269a<Integer> f33117y;
    public static final AbstractC10268n0.AbstractC10269a<Integer> f33118z;
    public final C10300t1 f33119w;

    static {
        Class cls = Integer.TYPE;
        f33116x = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.videoCapture.recordingFrameRate", cls);
        f33117y = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.videoCapture.bitRate", cls);
        f33118z = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.videoCapture.intraFrameInterval", cls);
        f33112A = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.videoCapture.audioBitRate", cls);
        f33113B = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.videoCapture.audioSampleRate", cls);
        f33114C = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.videoCapture.audioChannelCount", cls);
        f33115D = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.videoCapture.audioMinBufferSize", cls);
    }

    public C10285p2(C10300t1 t1Var) {
        this.f33119w = t1Var;
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
    public int mo5452E(int i) {
        return C10215d1.m5711f(this, i);
    }

    public int m5564F() {
        return ((Integer) mo5424c(f33112A)).intValue();
    }

    public int m5563G() {
        return ((Integer) mo5424c(f33114C)).intValue();
    }

    public int m5562H() {
        return ((Integer) mo5424c(f33115D)).intValue();
    }

    public int m5561I() {
        return ((Integer) mo5424c(f33113B)).intValue();
    }

    public int m5560J() {
        return ((Integer) mo5424c(f33117y)).intValue();
    }

    public int m5559K() {
        return ((Integer) mo5424c(f33118z)).intValue();
    }

    public int m5558L() {
        return ((Integer) mo5424c(f33116x)).intValue();
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
        return this.f33119w;
    }

    @Override
    public Set mo5436l(AbstractC10268n0.AbstractC10269a aVar) {
        return C10321y1.m5465d(this, aVar);
    }

    @Override
    public int mo5435m() {
        return 34;
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
        return C1423h.m36960a(this, str);
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
