package o4;

public class q {
    public final Object f19169a;
    public final int f19170b;
    public final int f19171c;
    public final long f19172d;
    public final int f19173e;

    public q(Object obj) {
        this(obj, -1L);
    }

    public q a(Object obj) {
        return this.f19169a.equals(obj) ? this : new q(obj, this.f19170b, this.f19171c, this.f19172d, this.f19173e);
    }

    public boolean b() {
        return this.f19170b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f19169a.equals(qVar.f19169a) && this.f19170b == qVar.f19170b && this.f19171c == qVar.f19171c && this.f19172d == qVar.f19172d && this.f19173e == qVar.f19173e;
    }

    public int hashCode() {
        return ((((((((527 + this.f19169a.hashCode()) * 31) + this.f19170b) * 31) + this.f19171c) * 31) + ((int) this.f19172d)) * 31) + this.f19173e;
    }

    public q(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public q(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    public q(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    public q(q qVar) {
        this.f19169a = qVar.f19169a;
        this.f19170b = qVar.f19170b;
        this.f19171c = qVar.f19171c;
        this.f19172d = qVar.f19172d;
        this.f19173e = qVar.f19173e;
    }

    public q(Object obj, int i10, int i11, long j10, int i12) {
        this.f19169a = obj;
        this.f19170b = i10;
        this.f19171c = i11;
        this.f19172d = j10;
        this.f19173e = i12;
    }
}
