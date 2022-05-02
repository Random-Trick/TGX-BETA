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
    public static final C10034a f32645c = new C10034a(null);
    public final C9069b0 f32646a;
    public final C9078d0 f32647b;

    public static final class C10034a {
        public C10034a() {
        }

        public final boolean m6178a(C9078d0 d0Var, C9069b0 b0Var) {
            C8298k.m12934e(d0Var, "response");
            C8298k.m12934e(b0Var, "request");
            int A0 = d0Var.m10528A0();
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
                if (C9078d0.m10524E0(d0Var, "Expires", null, 2, null) == null && d0Var.m10512t().m10542c() == -1 && !d0Var.m10512t().m10543b() && !d0Var.m10512t().m10544a()) {
                    return false;
                }
            }
            return !d0Var.m10512t().m10537h() && !b0Var.m10566b().m10537h();
        }

        public C10034a(C8294g gVar) {
            this();
        }
    }

    public static final class C10035b {
        public Date f32648a;
        public String f32649b;
        public Date f32650c;
        public String f32651d;
        public Date f32652e;
        public long f32653f;
        public long f32654g;
        public String f32655h;
        public int f32656i;
        public final long f32657j;
        public final C9069b0 f32658k;
        public final C9078d0 f32659l;

        public C10035b(long j, C9069b0 b0Var, C9078d0 d0Var) {
            C8298k.m12934e(b0Var, "request");
            this.f32657j = j;
            this.f32658k = b0Var;
            this.f32659l = d0Var;
            this.f32656i = -1;
            if (d0Var != null) {
                this.f32653f = d0Var.m10514O0();
                this.f32654g = d0Var.m10516M0();
                C9122v F0 = d0Var.m10523F0();
                int size = F0.size();
                for (int i = 0; i < size; i++) {
                    String i2 = F0.m10372i(i);
                    String r = F0.m10370r(i);
                    if (C11451n.m633l(i2, "Date", true)) {
                        this.f32648a = C11461c.m562a(r);
                        this.f32649b = r;
                    } else if (C11451n.m633l(i2, "Expires", true)) {
                        this.f32652e = C11461c.m562a(r);
                    } else if (C11451n.m633l(i2, "Last-Modified", true)) {
                        this.f32650c = C11461c.m562a(r);
                        this.f32651d = r;
                    } else if (C11451n.m633l(i2, "ETag", true)) {
                        this.f32655h = r;
                    } else if (C11451n.m633l(i2, "Age", true)) {
                        this.f32656i = C9489b.m8528Q(r, -1);
                    }
                }
            }
        }

        public final long m6177a() {
            Date date = this.f32648a;
            long j = 0;
            if (date != null) {
                j = Math.max(0L, this.f32654g - date.getTime());
            }
            int i = this.f32656i;
            if (i != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis(i));
            }
            long j2 = this.f32654g;
            return j + (j2 - this.f32653f) + (this.f32657j - j2);
        }

        public final C10033b m6176b() {
            C10033b c = m6175c();
            return (c.m6179b() == null || !this.f32658k.m10566b().m10536i()) ? c : new C10033b(null, null);
        }

        public final C10033b m6175c() {
            if (this.f32659l == null) {
                return new C10033b(this.f32658k, null);
            }
            if (this.f32658k.m10562f() && this.f32659l.m10526C0() == null) {
                return new C10033b(this.f32658k, null);
            }
            if (!C10033b.f32645c.m6178a(this.f32659l, this.f32658k)) {
                return new C10033b(this.f32658k, null);
            }
            C9075d b = this.f32658k.m10566b();
            if (b.m10538g() || m6173e(this.f32658k)) {
                return new C10033b(this.f32658k, null);
            }
            C9075d t = this.f32659l.m10512t();
            long a = m6177a();
            long d = m6174d();
            if (b.m10542c() != -1) {
                d = Math.min(d, TimeUnit.SECONDS.toMillis(b.m10542c()));
            }
            long j = 0;
            long millis = b.m10540e() != -1 ? TimeUnit.SECONDS.toMillis(b.m10540e()) : 0L;
            if (!t.m10539f() && b.m10541d() != -1) {
                j = TimeUnit.SECONDS.toMillis(b.m10541d());
            }
            if (!t.m10538g()) {
                long j2 = millis + a;
                if (j2 < j + d) {
                    C9078d0.C9079a J0 = this.f32659l.m10519J0();
                    if (j2 >= d) {
                        J0.m10509a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a > 86400000 && m6172f()) {
                        J0.m10509a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new C10033b(null, J0.m10507c());
                }
            }
            String str = this.f32655h;
            String str2 = "If-Modified-Since";
            if (str != null) {
                str2 = "If-None-Match";
            } else if (this.f32650c != null) {
                str = this.f32651d;
            } else if (this.f32648a == null) {
                return new C10033b(this.f32658k, null);
            } else {
                str = this.f32649b;
            }
            C9122v.C9123a m = this.f32658k.m10563e().m10371m();
            C8298k.m12936c(str);
            m.m10366c(str2, str);
            return new C10033b(this.f32658k.m10560h().m10556c(m.m10365d()).m10558a(), this.f32659l);
        }

        public final long m6174d() {
            C9078d0 d0Var = this.f32659l;
            C8298k.m12936c(d0Var);
            C9075d t = d0Var.m10512t();
            if (t.m10542c() != -1) {
                return TimeUnit.SECONDS.toMillis(t.m10542c());
            }
            Date date = this.f32652e;
            if (date != null) {
                Date date2 = this.f32648a;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f32654g);
                if (time > 0) {
                    return time;
                }
                return 0L;
            } else if (this.f32650c == null || this.f32659l.m10515N0().m10559i().m10342m() != null) {
                return 0L;
            } else {
                Date date3 = this.f32648a;
                long time2 = date3 != null ? date3.getTime() : this.f32653f;
                Date date4 = this.f32650c;
                C8298k.m12936c(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / 10;
                }
                return 0L;
            }
        }

        public final boolean m6173e(C9069b0 b0Var) {
            return (b0Var.m10564d("If-Modified-Since") == null && b0Var.m10564d("If-None-Match") == null) ? false : true;
        }

        public final boolean m6172f() {
            C9078d0 d0Var = this.f32659l;
            C8298k.m12936c(d0Var);
            return d0Var.m10512t().m10542c() == -1 && this.f32652e == null;
        }
    }

    public C10033b(C9069b0 b0Var, C9078d0 d0Var) {
        this.f32646a = b0Var;
        this.f32647b = d0Var;
    }

    public final C9078d0 m6180a() {
        return this.f32647b;
    }

    public final C9069b0 m6179b() {
        return this.f32646a;
    }
}
