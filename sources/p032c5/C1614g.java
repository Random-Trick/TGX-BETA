package p032c5;

import java.util.Arrays;

public final class C1614g {
    public boolean f5945c;
    public boolean f5946d;
    public int f5948f;
    public C1615a f5943a = new C1615a();
    public C1615a f5944b = new C1615a();
    public long f5947e = -9223372036854775807L;

    public static final class C1615a {
        public long f5949a;
        public long f5950b;
        public long f5951c;
        public long f5952d;
        public long f5953e;
        public long f5954f;
        public final boolean[] f5955g = new boolean[15];
        public int f5956h;

        public static int m36233c(long j) {
            return (int) (j % 15);
        }

        public long m36235a() {
            long j = this.f5953e;
            if (j == 0) {
                return 0L;
            }
            return this.f5954f / j;
        }

        public long m36234b() {
            return this.f5954f;
        }

        public boolean m36232d() {
            long j = this.f5952d;
            if (j == 0) {
                return false;
            }
            return this.f5955g[m36233c(j - 1)];
        }

        public boolean m36231e() {
            return this.f5952d > 15 && this.f5956h == 0;
        }

        public void m36230f(long j) {
            long j2 = this.f5952d;
            if (j2 == 0) {
                this.f5949a = j;
            } else if (j2 == 1) {
                long j3 = j - this.f5949a;
                this.f5950b = j3;
                this.f5954f = j3;
                this.f5953e = 1L;
            } else {
                long j4 = j - this.f5951c;
                int c = m36233c(j2);
                if (Math.abs(j4 - this.f5950b) <= 1000000) {
                    this.f5953e++;
                    this.f5954f += j4;
                    boolean[] zArr = this.f5955g;
                    if (zArr[c]) {
                        zArr[c] = false;
                        this.f5956h--;
                    }
                } else {
                    boolean[] zArr2 = this.f5955g;
                    if (!zArr2[c]) {
                        zArr2[c] = true;
                        this.f5956h++;
                    }
                }
            }
            this.f5952d++;
            this.f5951c = j;
        }

        public void m36229g() {
            this.f5952d = 0L;
            this.f5953e = 0L;
            this.f5954f = 0L;
            this.f5956h = 0;
            Arrays.fill(this.f5955g, false);
        }
    }

    public long m36242a() {
        if (m36238e()) {
            return this.f5943a.m36235a();
        }
        return -9223372036854775807L;
    }

    public float m36241b() {
        if (m36238e()) {
            return (float) (1.0E9d / this.f5943a.m36235a());
        }
        return -1.0f;
    }

    public int m36240c() {
        return this.f5948f;
    }

    public long m36239d() {
        if (m36238e()) {
            return this.f5943a.m36234b();
        }
        return -9223372036854775807L;
    }

    public boolean m36238e() {
        return this.f5943a.m36231e();
    }

    public void m36237f(long j) {
        this.f5943a.m36230f(j);
        int i = 0;
        if (this.f5943a.m36231e() && !this.f5946d) {
            this.f5945c = false;
        } else if (this.f5947e != -9223372036854775807L) {
            if (!this.f5945c || this.f5944b.m36232d()) {
                this.f5944b.m36229g();
                this.f5944b.m36230f(this.f5947e);
            }
            this.f5945c = true;
            this.f5944b.m36230f(j);
        }
        if (this.f5945c && this.f5944b.m36231e()) {
            C1615a aVar = this.f5943a;
            this.f5943a = this.f5944b;
            this.f5944b = aVar;
            this.f5945c = false;
            this.f5946d = false;
        }
        this.f5947e = j;
        if (!this.f5943a.m36231e()) {
            i = this.f5948f + 1;
        }
        this.f5948f = i;
    }

    public void m36236g() {
        this.f5943a.m36229g();
        this.f5944b.m36229g();
        this.f5945c = false;
        this.f5947e = -9223372036854775807L;
        this.f5948f = 0;
    }
}