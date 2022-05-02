package p318wb;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import p278tb.C9069b0;
import p278tb.C9075d;
import p278tb.C9078d0;
import p278tb.C9122v;
import p290ub.C9489b;
import p362zb.C11461c;
import qa.C8294g;
import qa.C8298k;
import za.C11451n;

public final class C10033b {
    public static final C10034a f32648c = new C10034a(null);
    public final C9069b0 f32649a;
    public final C9078d0 f32650b;

    public static final class C10034a {
        public C10034a() {
        }

        public final boolean m6178a(C9078d0 d0Var, C9069b0 b0Var) {
            C8298k.m12933e(d0Var, "response");
            C8298k.m12933e(b0Var, "request");
            int A0 = d0Var.m10527A0();
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
                if (C9078d0.m10523E0(d0Var, "Expires", null, 2, null) == null && d0Var.m10511t().m10541c() == -1 && !d0Var.m10511t().m10542b() && !d0Var.m10511t().m10543a()) {
                    return false;
                }
            }
            return !d0Var.m10511t().m10536h() && !b0Var.m10565b().m10536h();
        }

        public C10034a(C8294g gVar) {
            this();
        }
    }

    public static final class C10035b {
        public Date f32651a;
        public String f32652b;
        public Date f32653c;
        public String f32654d;
        public Date f32655e;
        public long f32656f;
        public long f32657g;
        public String f32658h;
        public int f32659i;
        public final long f32660j;
        public final C9069b0 f32661k;
        public final C9078d0 f32662l;

        public C10035b(long j, C9069b0 b0Var, C9078d0 d0Var) {
            C8298k.m12933e(b0Var, "request");
            this.f32660j = j;
            this.f32661k = b0Var;
            this.f32662l = d0Var;
            this.f32659i = -1;
            if (d0Var != null) {
                this.f32656f = d0Var.m10513O0();
                this.f32657g = d0Var.m10515M0();
                C9122v F0 = d0Var.m10522F0();
                int size = F0.size();
                for (int i = 0; i < size; i++) {
                    String i2 = F0.m10371i(i);
                    String r = F0.m10369r(i);
                    if (C11451n.m633l(i2, "Date", true)) {
                        this.f32651a = C11461c.m562a(r);
                        this.f32652b = r;
                    } else if (C11451n.m633l(i2, "Expires", true)) {
                        this.f32655e = C11461c.m562a(r);
                    } else if (C11451n.m633l(i2, "Last-Modified", true)) {
                        this.f32653c = C11461c.m562a(r);
                        this.f32654d = r;
                    } else if (C11451n.m633l(i2, "ETag", true)) {
                        this.f32658h = r;
                    } else if (C11451n.m633l(i2, "Age", true)) {
                        this.f32659i = C9489b.m8528Q(r, -1);
                    }
                }
            }
        }

        public final long m6177a() {
            Date date = this.f32651a;
            long j = 0;
            if (date != null) {
                j = Math.max(0L, this.f32657g - date.getTime());
            }
            int i = this.f32659i;
            if (i != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis(i));
            }
            long j2 = this.f32657g;
            return j + (j2 - this.f32656f) + (this.f32660j - j2);
        }

        public final C10033b m6176b() {
            C10033b c = m6175c();
            return (c.m6179b() == null || !this.f32661k.m10565b().m10535i()) ? c : new C10033b(null, null);
        }

        public final C10033b m6175c() {
            if (this.f32662l == null) {
                return new C10033b(this.f32661k, null);
            }
            if (this.f32661k.m10561f() && this.f32662l.m10525C0() == null) {
                return new C10033b(this.f32661k, null);
            }
            if (!C10033b.f32648c.m6178a(this.f32662l, this.f32661k)) {
                return new C10033b(this.f32661k, null);
            }
            C9075d b = this.f32661k.m10565b();
            if (b.m10537g() || m6173e(this.f32661k)) {
                return new C10033b(this.f32661k, null);
            }
            C9075d t = this.f32662l.m10511t();
            long a = m6177a();
            long d = m6174d();
            if (b.m10541c() != -1) {
                d = Math.min(d, TimeUnit.SECONDS.toMillis(b.m10541c()));
            }
            long j = 0;
            long millis = b.m10539e() != -1 ? TimeUnit.SECONDS.toMillis(b.m10539e()) : 0L;
            if (!t.m10538f() && b.m10540d() != -1) {
                j = TimeUnit.SECONDS.toMillis(b.m10540d());
            }
            if (!t.m10537g()) {
                long j2 = millis + a;
                if (j2 < j + d) {
                    C9078d0.C9079a J0 = this.f32662l.m10518J0();
                    if (j2 >= d) {
                        J0.m10508a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a > 86400000 && m6172f()) {
                        J0.m10508a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new C10033b(null, J0.m10506c());
                }
            }
            String str = this.f32658h;
            String str2 = "If-Modified-Since";
            if (str != null) {
                str2 = "If-None-Match";
            } else if (this.f32653c != null) {
                str = this.f32654d;
            } else if (this.f32651a == null) {
                return new C10033b(this.f32661k, null);
            } else {
                str = this.f32652b;
            }
            C9122v.C9123a m = this.f32661k.m10562e().m10370m();
            C8298k.m12935c(str);
            m.m10365c(str2, str);
            return new C10033b(this.f32661k.m10559h().m10555c(m.m10364d()).m10557a(), this.f32662l);
        }

        public final long m6174d() {
            C9078d0 d0Var = this.f32662l;
            C8298k.m12935c(d0Var);
            C9075d t = d0Var.m10511t();
            if (t.m10541c() != -1) {
                return TimeUnit.SECONDS.toMillis(t.m10541c());
            }
            Date date = this.f32655e;
            if (date != null) {
                Date date2 = this.f32651a;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f32657g);
                if (time > 0) {
                    return time;
                }
                return 0L;
            } else if (this.f32653c == null || this.f32662l.m10514N0().m10558i().m10341m() != null) {
                return 0L;
            } else {
                Date date3 = this.f32651a;
                long time2 = date3 != null ? date3.getTime() : this.f32656f;
                Date date4 = this.f32653c;
                C8298k.m12935c(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / 10;
                }
                return 0L;
            }
        }

        public final boolean m6173e(C9069b0 b0Var) {
            return (b0Var.m10563d("If-Modified-Since") == null && b0Var.m10563d("If-None-Match") == null) ? false : true;
        }

        public final boolean m6172f() {
            C9078d0 d0Var = this.f32662l;
            C8298k.m12935c(d0Var);
            return d0Var.m10511t().m10541c() == -1 && this.f32655e == null;
        }
    }

    public C10033b(C9069b0 b0Var, C9078d0 d0Var) {
        this.f32649a = b0Var;
        this.f32650b = d0Var;
    }

    public final C9078d0 m6180a() {
        return this.f32650b;
    }

    public final C9069b0 m6179b() {
        return this.f32649a;
    }
}
