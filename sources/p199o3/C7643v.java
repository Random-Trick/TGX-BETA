package p199o3;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import p020b5.C1216l0;

public final class C7643v {
    public final C7644a f24468a;
    public int f24469b;
    public long f24470c;
    public long f24471d;
    public long f24472e;
    public long f24473f;

    public static final class C7644a {
        public final AudioTrack f24474a;
        public final AudioTimestamp f24475b = new AudioTimestamp();
        public long f24476c;
        public long f24477d;
        public long f24478e;

        public C7644a(AudioTrack audioTrack) {
            this.f24474a = audioTrack;
        }

        public long m15344a() {
            return this.f24478e;
        }

        public long m15343b() {
            return this.f24475b.nanoTime / 1000;
        }

        public boolean m15342c() {
            boolean timestamp = this.f24474a.getTimestamp(this.f24475b);
            if (timestamp) {
                long j = this.f24475b.framePosition;
                if (this.f24477d > j) {
                    this.f24476c++;
                }
                this.f24477d = j;
                this.f24478e = j + (this.f24476c << 32);
            }
            return timestamp;
        }
    }

    public C7643v(AudioTrack audioTrack) {
        if (C1216l0.f4526a >= 19) {
            this.f24468a = new C7644a(audioTrack);
            m15346g();
            return;
        }
        this.f24468a = null;
        m15345h(3);
    }

    public void m15352a() {
        if (this.f24469b == 4) {
            m15346g();
        }
    }

    @TargetApi(19)
    public long m15351b() {
        C7644a aVar = this.f24468a;
        if (aVar != null) {
            return aVar.m15344a();
        }
        return -1L;
    }

    @TargetApi(19)
    public long m15350c() {
        C7644a aVar = this.f24468a;
        if (aVar != null) {
            return aVar.m15343b();
        }
        return -9223372036854775807L;
    }

    public boolean m15349d() {
        return this.f24469b == 2;
    }

    @TargetApi(19)
    public boolean m15348e(long j) {
        C7644a aVar = this.f24468a;
        if (aVar == null || j - this.f24472e < this.f24471d) {
            return false;
        }
        this.f24472e = j;
        boolean c = aVar.m15342c();
        int i = this.f24469b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (c) {
                        m15346g();
                    }
                } else if (!c) {
                    m15346g();
                }
            } else if (!c) {
                m15346g();
            } else if (this.f24468a.m15344a() > this.f24473f) {
                m15345h(2);
            }
        } else if (c) {
            if (this.f24468a.m15343b() < this.f24470c) {
                return false;
            }
            this.f24473f = this.f24468a.m15344a();
            m15345h(1);
        } else if (j - this.f24470c > 500000) {
            m15345h(3);
        }
        return c;
    }

    public void m15347f() {
        m15345h(4);
    }

    public void m15346g() {
        if (this.f24468a != null) {
            m15345h(0);
        }
    }

    public final void m15345h(int i) {
        this.f24469b = i;
        if (i == 0) {
            this.f24472e = 0L;
            this.f24473f = -1L;
            this.f24470c = System.nanoTime() / 1000;
            this.f24471d = 10000L;
        } else if (i == 1) {
            this.f24471d = 10000L;
        } else if (i == 2 || i == 3) {
            this.f24471d = 10000000L;
        } else if (i == 4) {
            this.f24471d = 500000L;
        } else {
            throw new IllegalStateException();
        }
    }
}
