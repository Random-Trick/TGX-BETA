package d5;

import java.util.Arrays;

public final class g {
    public boolean f6250c;
    public boolean f6251d;
    public int f6253f;
    public a f6248a = new a();
    public a f6249b = new a();
    public long f6252e = -9223372036854775807L;

    public static final class a {
        public long f6254a;
        public long f6255b;
        public long f6256c;
        public long f6257d;
        public long f6258e;
        public long f6259f;
        public final boolean[] f6260g = new boolean[15];
        public int f6261h;

        public static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f6258e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f6259f / j10;
        }

        public long b() {
            return this.f6259f;
        }

        public boolean d() {
            long j10 = this.f6257d;
            if (j10 == 0) {
                return false;
            }
            return this.f6260g[c(j10 - 1)];
        }

        public boolean e() {
            return this.f6257d > 15 && this.f6261h == 0;
        }

        public void f(long j10) {
            long j11 = this.f6257d;
            if (j11 == 0) {
                this.f6254a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f6254a;
                this.f6255b = j12;
                this.f6259f = j12;
                this.f6258e = 1L;
            } else {
                long j13 = j10 - this.f6256c;
                int c10 = c(j11);
                if (Math.abs(j13 - this.f6255b) <= 1000000) {
                    this.f6258e++;
                    this.f6259f += j13;
                    boolean[] zArr = this.f6260g;
                    if (zArr[c10]) {
                        zArr[c10] = false;
                        this.f6261h--;
                    }
                } else {
                    boolean[] zArr2 = this.f6260g;
                    if (!zArr2[c10]) {
                        zArr2[c10] = true;
                        this.f6261h++;
                    }
                }
            }
            this.f6257d++;
            this.f6256c = j10;
        }

        public void g() {
            this.f6257d = 0L;
            this.f6258e = 0L;
            this.f6259f = 0L;
            this.f6261h = 0;
            Arrays.fill(this.f6260g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f6248a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f6248a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f6253f;
    }

    public long d() {
        if (e()) {
            return this.f6248a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f6248a.e();
    }

    public void f(long j10) {
        this.f6248a.f(j10);
        int i10 = 0;
        if (this.f6248a.e() && !this.f6251d) {
            this.f6250c = false;
        } else if (this.f6252e != -9223372036854775807L) {
            if (!this.f6250c || this.f6249b.d()) {
                this.f6249b.g();
                this.f6249b.f(this.f6252e);
            }
            this.f6250c = true;
            this.f6249b.f(j10);
        }
        if (this.f6250c && this.f6249b.e()) {
            a aVar = this.f6248a;
            this.f6248a = this.f6249b;
            this.f6249b = aVar;
            this.f6250c = false;
            this.f6251d = false;
        }
        this.f6252e = j10;
        if (!this.f6248a.e()) {
            i10 = this.f6253f + 1;
        }
        this.f6253f = i10;
    }

    public void g() {
        this.f6248a.g();
        this.f6249b.g();
        this.f6250c = false;
        this.f6252e = -9223372036854775807L;
        this.f6253f = 0;
    }
}
