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
    public static final AbstractC10268n0.AbstractC10269a<Integer> f33115A;
    public static final AbstractC10268n0.AbstractC10269a<Integer> f33116B;
    public static final AbstractC10268n0.AbstractC10269a<Integer> f33117C;
    public static final AbstractC10268n0.AbstractC10269a<Integer> f33118D;
    public static final AbstractC10268n0.AbstractC10269a<Integer> f33119x;
    public static final AbstractC10268n0.AbstractC10269a<Integer> f33120y;
    public static final AbstractC10268n0.AbstractC10269a<Integer> f33121z;
    public final C10300t1 f33122w;

    static {
        Class cls = Integer.TYPE;
        f33119x = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.videoCapture.recordingFrameRate", cls);
        f33120y = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.videoCapture.bitRate", cls);
        f33121z = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.videoCapture.intraFrameInterval", cls);
        f33115A = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.videoCapture.audioBitRate", cls);
        f33116B = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.videoCapture.audioSampleRate", cls);
        f33117C = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.videoCapture.audioChannelCount", cls);
        f33118D = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.videoCapture.audioMinBufferSize", cls);
    }

    public C10285p2(C10300t1 t1Var) {
        this.f33122w = t1Var;
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

    public int m5564F() {
        return ((Integer) mo5424c(f33115A)).intValue();
    }

    public int m5563G() {
        return ((Integer) mo5424c(f33117C)).intValue();
    }

    public int m5562H() {
        return ((Integer) mo5424c(f33118D)).intValue();
    }

    public int m5561I() {
        return ((Integer) mo5424c(f33116B)).intValue();
    }

    public int m5560J() {
        return ((Integer) mo5424c(f33120y)).intValue();
    }

    public int m5559K() {
        return ((Integer) mo5424c(f33121z)).intValue();
    }

    public int m5558L() {
        return ((Integer) mo5424c(f33119x)).intValue();
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
        return this.f33122w;
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
