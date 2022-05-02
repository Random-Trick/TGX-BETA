package p217p4;

import com.google.android.exoplayer2.decoder.AbstractC3437a;
import java.util.List;
import p020b5.C1186a;

public abstract class AbstractC8047k extends AbstractC3437a implements AbstractC8041f {
    public AbstractC8041f f26206a;
    public long f26207b;

    @Override
    public int mo5200a(long j) {
        return ((AbstractC8041f) C1186a.m38188e(this.f26206a)).mo5200a(j - this.f26207b);
    }

    @Override
    public long mo5199b(int i) {
        return ((AbstractC8041f) C1186a.m38188e(this.f26206a)).mo5199b(i) + this.f26207b;
    }

    @Override
    public List<C8032b> mo5198c(long j) {
        return ((AbstractC8041f) C1186a.m38188e(this.f26206a)).mo5198c(j - this.f26207b);
    }

    @Override
    public void clear() {
        super.clear();
        this.f26206a = null;
    }

    @Override
    public int mo5197d() {
        return ((AbstractC8041f) C1186a.m38188e(this.f26206a)).mo5197d();
    }

    public void m13720e(long j, AbstractC8041f fVar, long j2) {
        this.timeUs = j;
        this.f26206a = fVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f26207b = j;
    }
}
