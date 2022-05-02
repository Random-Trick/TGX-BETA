package p199o3;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import p020b5.C1216l0;

public final class C7643v {
    public final C7644a f24471a;
    public int f24472b;
    public long f24473c;
    public long f24474d;
    public long f24475e;
    public long f24476f;

    public static final class C7644a {
        public final AudioTrack f24477a;
        public final AudioTimestamp f24478b = new AudioTimestamp();
        public long f24479c;
        public long f24480d;
        public long f24481e;

        public C7644a(AudioTrack audioTrack) {
            this.f24477a = audioTrack;
        }

        public long m15344a() {
            return this.f24481e;
        }

        public long m15343b() {
            return this.f24478b.nanoTime / 1000;
        }

        public boolean m15342c() {
            boolean timestamp = this.f24477a.getTimestamp(this.f24478b);
            if (timestamp) {
                long j = this.f24478b.framePosition;
                if (this.f24480d > j) {
                    this.f24479c++;
                }
                this.f24480d = j;
                this.f24481e = j + (this.f24479c << 32);
            }
            return timestamp;
        }
    }

    public C7643v(AudioTrack audioTrack) {
        if (C1216l0.f4526a >= 19) {
            this.f24471a = new C7644a(audioTrack);
            m15346g();
            return;
        }
        this.f24471a = null;
        m15345h(3);
    }

    public void m15352a() {
        if (this.f24472b == 4) {
            m15346g();
        }
    }

    @TargetApi(19)
    public long m15351b() {
        C7644a aVar = this.f24471a;
        if (aVar != null) {
            return aVar.m15344a();
        }
        return -1L;
    }

    @TargetApi(19)
    public long m15350c() {
        C7644a aVar = this.f24471a;
        if (aVar != null) {
            return aVar.m15343b();
        }
        return -9223372036854775807L;
    }

    public boolean m15349d() {
        return this.f24472b == 2;
    }

    @TargetApi(19)
    public boolean m15348e(long j) {
        C7644a aVar = this.f24471a;
        if (aVar == null || j - this.f24475e < this.f24474d) {
            return false;
        }
        this.f24475e = j;
        boolean c = aVar.m15342c();
        int i = this.f24472b;
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
            } else if (this.f24471a.m15344a() > this.f24476f) {
                m15345h(2);
            }
        } else if (c) {
            if (this.f24471a.m15343b() < this.f24473c) {
                return false;
            }
            this.f24476f = this.f24471a.m15344a();
            m15345h(1);
        } else if (j - this.f24473c > 500000) {
            m15345h(3);
        }
        return c;
    }

    public void m15347f() {
        m15345h(4);
    }

    public void m15346g() {
        if (this.f24471a != null) {
            m15345h(0);
        }
    }

    public final void m15345h(int i) {
        this.f24472b = i;
        if (i == 0) {
            this.f24475e = 0L;
            this.f24476f = -1L;
            this.f24473c = System.nanoTime() / 1000;
            this.f24474d = 10000L;
        } else if (i == 1) {
            this.f24474d = 10000L;
        } else if (i == 2 || i == 3) {
            this.f24474d = 10000000L;
        } else if (i == 4) {
            this.f24474d = 500000L;
        } else {
            throw new IllegalStateException();
        }
    }
}
