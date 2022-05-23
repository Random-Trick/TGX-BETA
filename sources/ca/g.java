package ca;

import o9.d;
import x9.i;

public class g extends c {
    public static final i f5020g = new i("TrimDataSource");
    public final long f5021b;
    public final long f5022c;
    public long f5023d = 0;
    public long f5024e = Long.MIN_VALUE;
    public boolean f5025f = false;

    public g(b bVar, long j10, long j11) {
        super(bVar);
        if (j10 < 0 || j11 < 0) {
            throw new IllegalArgumentException("Trim values cannot be negative.");
        }
        this.f5021b = j10;
        this.f5022c = j11;
    }

    @Override
    public long c(long j10) {
        return a().c(this.f5021b + j10) - this.f5021b;
    }

    @Override
    public long d() {
        return this.f5024e + this.f5023d;
    }

    @Override
    public void e() {
        super.e();
        long d10 = a().d();
        if (this.f5021b + this.f5022c < d10) {
            i iVar = f5020g;
            iVar.c("initialize(): duration=" + d10 + " trimStart=" + this.f5021b + " trimEnd=" + this.f5022c + " trimDuration=" + ((d10 - this.f5021b) - this.f5022c));
            this.f5024e = (d10 - this.f5021b) - this.f5022c;
            return;
        }
        i iVar2 = f5020g;
        iVar2.j("Trim values are too large! start=" + this.f5021b + ", end=" + this.f5022c + ", duration=" + d10);
        throw new IllegalArgumentException("Trim values cannot be greater than media duration.");
    }

    @Override
    public long g() {
        return (super.g() - this.f5021b) + this.f5023d;
    }

    @Override
    public boolean i(d dVar) {
        if (!this.f5025f) {
            long j10 = this.f5021b;
            if (j10 > 0) {
                this.f5023d = j10 - a().c(this.f5021b);
                i iVar = f5020g;
                iVar.c("canReadTrack(): extraDurationUs=" + this.f5023d + " trimStartUs=" + this.f5021b + " source.seekTo(trimStartUs)=" + (this.f5023d - this.f5021b));
                this.f5025f = true;
            }
        }
        return super.i(dVar);
    }

    @Override
    public boolean l() {
        return super.l() || g() >= d();
    }

    @Override
    public void m() {
        super.m();
        this.f5024e = Long.MIN_VALUE;
        this.f5025f = false;
    }

    @Override
    public boolean p() {
        return super.p() && this.f5024e != Long.MIN_VALUE;
    }
}
