package q4;

import com.google.android.exoplayer2.decoder.a;
import java.util.List;

public abstract class k extends a implements f {
    public f f21410a;
    public long f21411b;

    @Override
    public int a(long j10) {
        return ((f) c5.a.e(this.f21410a)).a(j10 - this.f21411b);
    }

    @Override
    public long b(int i10) {
        return ((f) c5.a.e(this.f21410a)).b(i10) + this.f21411b;
    }

    @Override
    public List<b> c(long j10) {
        return ((f) c5.a.e(this.f21410a)).c(j10 - this.f21411b);
    }

    @Override
    public void clear() {
        super.clear();
        this.f21410a = null;
    }

    @Override
    public int d() {
        return ((f) c5.a.e(this.f21410a)).d();
    }

    public void e(long j10, f fVar, long j11) {
        this.timeUs = j10;
        this.f21410a = fVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f21411b = j10;
    }
}
