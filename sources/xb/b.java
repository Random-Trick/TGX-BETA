package xb;

import ab.n;
import ac.c;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import ra.g;
import ra.k;
import ub.b0;
import ub.d;
import ub.d0;
import ub.v;

public final class b {
    public static final a f26204c = new a(null);
    public final b0 f26205a;
    public final d0 f26206b;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final boolean a(d0 d0Var, b0 b0Var) {
            k.e(d0Var, "response");
            k.e(b0Var, "request");
            int A0 = d0Var.A0();
            if (!(A0 == 200 || A0 == 410 || A0 == 414 || A0 == 501 || A0 == 203 || A0 == 204)) {
                if (A0 != 307) {
                    if (!(A0 == 308 || A0 == 404 || A0 == 405)) {
                        switch (A0) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (d0.E0(d0Var, "Expires", null, 2, null) == null && d0Var.s().c() == -1 && !d0Var.s().b() && !d0Var.s().a()) {
                    return false;
                }
            }
            return !d0Var.s().h() && !b0Var.b().h();
        }
    }

    public static final class C0244b {
        public Date f26207a;
        public String f26208b;
        public Date f26209c;
        public String f26210d;
        public Date f26211e;
        public long f26212f;
        public long f26213g;
        public String f26214h;
        public int f26215i;
        public final long f26216j;
        public final b0 f26217k;
        public final d0 f26218l;

        public C0244b(long j10, b0 b0Var, d0 d0Var) {
            k.e(b0Var, "request");
            this.f26216j = j10;
            this.f26217k = b0Var;
            this.f26218l = d0Var;
            this.f26215i = -1;
            if (d0Var != null) {
                this.f26212f = d0Var.O0();
                this.f26213g = d0Var.M0();
                v F0 = d0Var.F0();
                int size = F0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String g10 = F0.g(i10);
                    String r10 = F0.r(i10);
                    if (n.l(g10, "Date", true)) {
                        this.f26207a = c.a(r10);
                        this.f26208b = r10;
                    } else if (n.l(g10, "Expires", true)) {
                        this.f26211e = c.a(r10);
                    } else if (n.l(g10, "Last-Modified", true)) {
                        this.f26209c = c.a(r10);
                        this.f26210d = r10;
                    } else if (n.l(g10, "ETag", true)) {
                        this.f26214h = r10;
                    } else if (n.l(g10, "Age", true)) {
                        this.f26215i = vb.b.Q(r10, -1);
                    }
                }
            }
        }

        public final long a() {
            Date date = this.f26207a;
            long j10 = 0;
            if (date != null) {
                j10 = Math.max(0L, this.f26213g - date.getTime());
            }
            int i10 = this.f26215i;
            if (i10 != -1) {
                j10 = Math.max(j10, TimeUnit.SECONDS.toMillis(i10));
            }
            long j11 = this.f26213g;
            return j10 + (j11 - this.f26212f) + (this.f26216j - j11);
        }

        public final b b() {
            b c10 = c();
            return (c10.b() == null || !this.f26217k.b().i()) ? c10 : new b(null, null);
        }

        public final b c() {
            if (this.f26218l == null) {
                return new b(this.f26217k, null);
            }
            if (this.f26217k.f() && this.f26218l.C0() == null) {
                return new b(this.f26217k, null);
            }
            if (!b.f26204c.a(this.f26218l, this.f26217k)) {
                return new b(this.f26217k, null);
            }
            d b10 = this.f26217k.b();
            if (b10.g() || e(this.f26217k)) {
                return new b(this.f26217k, null);
            }
            d s10 = this.f26218l.s();
            long a10 = a();
            long d10 = d();
            if (b10.c() != -1) {
                d10 = Math.min(d10, TimeUnit.SECONDS.toMillis(b10.c()));
            }
            long j10 = 0;
            long millis = b10.e() != -1 ? TimeUnit.SECONDS.toMillis(b10.e()) : 0L;
            if (!s10.f() && b10.d() != -1) {
                j10 = TimeUnit.SECONDS.toMillis(b10.d());
            }
            if (!s10.g()) {
                long j11 = millis + a10;
                if (j11 < j10 + d10) {
                    d0.a J0 = this.f26218l.J0();
                    if (j11 >= d10) {
                        J0.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a10 > 86400000 && f()) {
                        J0.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new b(null, J0.c());
                }
            }
            String str = this.f26214h;
            String str2 = "If-Modified-Since";
            if (str != null) {
                str2 = "If-None-Match";
            } else if (this.f26209c != null) {
                str = this.f26210d;
            } else if (this.f26207a == null) {
                return new b(this.f26217k, null);
            } else {
                str = this.f26208b;
            }
            v.a m10 = this.f26217k.e().m();
            k.c(str);
            m10.c(str2, str);
            return new b(this.f26217k.h().c(m10.d()).a(), this.f26218l);
        }

        public final long d() {
            d0 d0Var = this.f26218l;
            k.c(d0Var);
            d s10 = d0Var.s();
            if (s10.c() != -1) {
                return TimeUnit.SECONDS.toMillis(s10.c());
            }
            Date date = this.f26211e;
            if (date != null) {
                Date date2 = this.f26207a;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f26213g);
                if (time > 0) {
                    return time;
                }
                return 0L;
            } else if (this.f26209c == null || this.f26218l.N0().i().m() != null) {
                return 0L;
            } else {
                Date date3 = this.f26207a;
                long time2 = date3 != null ? date3.getTime() : this.f26212f;
                Date date4 = this.f26209c;
                k.c(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / 10;
                }
                return 0L;
            }
        }

        public final boolean e(b0 b0Var) {
            return (b0Var.d("If-Modified-Since") == null && b0Var.d("If-None-Match") == null) ? false : true;
        }

        public final boolean f() {
            d0 d0Var = this.f26218l;
            k.c(d0Var);
            return d0Var.s().c() == -1 && this.f26211e == null;
        }
    }

    public b(b0 b0Var, d0 d0Var) {
        this.f26205a = b0Var;
        this.f26206b = d0Var;
    }

    public final d0 a() {
        return this.f26206b;
    }

    public final b0 b() {
        return this.f26205a;
    }
}
