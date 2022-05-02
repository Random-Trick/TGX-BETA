package ba;

import p192n9.EnumC7313d;
import p316w9.C10007i;

public class C1302g extends C1298c {
    public static final C10007i f4697g = new C10007i("TrimDataSource");
    public final long f4698b;
    public final long f4699c;
    public long f4700d = 0;
    public long f4701e = Long.MIN_VALUE;
    public boolean f4702f = false;

    public C1302g(AbstractC1296b bVar, long j, long j2) {
        super(bVar);
        if (j < 0 || j2 < 0) {
            throw new IllegalArgumentException("Trim values cannot be negative.");
        }
        this.f4698b = j;
        this.f4699c = j2;
    }

    @Override
    public long mo6292c(long j) {
        return m37791a().mo6292c(this.f4698b + j) - this.f4698b;
    }

    @Override
    public long mo6291d() {
        return this.f4701e + this.f4700d;
    }

    @Override
    public void mo6290e() {
        super.mo6290e();
        long d = m37791a().mo6291d();
        if (this.f4698b + this.f4699c < d) {
            C10007i iVar = f4697g;
            iVar.m6267c("initialize(): duration=" + d + " trimStart=" + this.f4698b + " trimEnd=" + this.f4699c + " trimDuration=" + ((d - this.f4698b) - this.f4699c));
            this.f4701e = (d - this.f4698b) - this.f4699c;
            return;
        }
        C10007i iVar2 = f4697g;
        iVar2.m6260j("Trim values are too large! start=" + this.f4698b + ", end=" + this.f4699c + ", duration=" + d);
        throw new IllegalArgumentException("Trim values cannot be greater than media duration.");
    }

    @Override
    public long mo6288g() {
        return (super.mo6288g() - this.f4698b) + this.f4700d;
    }

    @Override
    public boolean mo6285j() {
        return super.mo6285j() || mo6288g() >= mo6291d();
    }

    @Override
    public boolean mo6284k(EnumC7313d dVar) {
        if (!this.f4702f) {
            long j = this.f4698b;
            if (j > 0) {
                this.f4700d = j - m37791a().mo6292c(this.f4698b);
                C10007i iVar = f4697g;
                iVar.m6267c("canReadTrack(): extraDurationUs=" + this.f4700d + " trimStartUs=" + this.f4698b + " source.seekTo(trimStartUs)=" + (this.f4700d - this.f4698b));
                this.f4702f = true;
            }
        }
        return super.mo6284k(dVar);
    }

    @Override
    public void mo6282m() {
        super.mo6282m();
        this.f4701e = Long.MIN_VALUE;
        this.f4702f = false;
    }

    @Override
    public boolean mo6279p() {
        return super.mo6279p() && this.f4701e != Long.MIN_VALUE;
    }
}
