package o3;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import c5.l0;

public final class v {
    public final a f18903a;
    public int f18904b;
    public long f18905c;
    public long f18906d;
    public long f18907e;
    public long f18908f;

    public static final class a {
        public final AudioTrack f18909a;
        public final AudioTimestamp f18910b = new AudioTimestamp();
        public long f18911c;
        public long f18912d;
        public long f18913e;

        public a(AudioTrack audioTrack) {
            this.f18909a = audioTrack;
        }

        public long a() {
            return this.f18913e;
        }

        public long b() {
            return this.f18910b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.f18909a.getTimestamp(this.f18910b);
            if (timestamp) {
                long j10 = this.f18910b.framePosition;
                if (this.f18912d > j10) {
                    this.f18911c++;
                }
                this.f18912d = j10;
                this.f18913e = j10 + (this.f18911c << 32);
            }
            return timestamp;
        }
    }

    public v(AudioTrack audioTrack) {
        if (l0.f4841a >= 19) {
            this.f18903a = new a(audioTrack);
            g();
            return;
        }
        this.f18903a = null;
        h(3);
    }

    public void a() {
        if (this.f18904b == 4) {
            g();
        }
    }

    @TargetApi(19)
    public long b() {
        a aVar = this.f18903a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    @TargetApi(19)
    public long c() {
        a aVar = this.f18903a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        return this.f18904b == 2;
    }

    @TargetApi(19)
    public boolean e(long j10) {
        a aVar = this.f18903a;
        if (aVar == null || j10 - this.f18907e < this.f18906d) {
            return false;
        }
        this.f18907e = j10;
        boolean c10 = aVar.c();
        int i10 = this.f18904b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (c10) {
                        g();
                    }
                } else if (!c10) {
                    g();
                }
            } else if (!c10) {
                g();
            } else if (this.f18903a.a() > this.f18908f) {
                h(2);
            }
        } else if (c10) {
            if (this.f18903a.b() < this.f18905c) {
                return false;
            }
            this.f18908f = this.f18903a.a();
            h(1);
        } else if (j10 - this.f18905c > 500000) {
            h(3);
        }
        return c10;
    }

    public void f() {
        h(4);
    }

    public void g() {
        if (this.f18903a != null) {
            h(0);
        }
    }

    public final void h(int i10) {
        this.f18904b = i10;
        if (i10 == 0) {
            this.f18907e = 0L;
            this.f18908f = -1L;
            this.f18905c = System.nanoTime() / 1000;
            this.f18906d = 10000L;
        } else if (i10 == 1) {
            this.f18906d = 10000L;
        } else if (i10 == 2 || i10 == 3) {
            this.f18906d = 10000000L;
        } else if (i10 == 4) {
            this.f18906d = 500000L;
        } else {
            throw new IllegalStateException();
        }
    }
}
