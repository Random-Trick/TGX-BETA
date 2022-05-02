package org.thunderdog.challegram.video.old;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.util.ArrayList;
import p345y8.C10453g;

@TargetApi(16)
public class C7928a {
    public C10453g f25779a = C10453g.f33526j;
    public ArrayList<C7932e> f25780b = new ArrayList<>();
    public File f25781c;
    public int f25782d;
    public int f25783e;

    public void m14103a(int i, long j, MediaCodec.BufferInfo bufferInfo) {
        if (i >= 0 && i < this.f25780b.size()) {
            this.f25780b.get(i).m14092b(j, bufferInfo);
        }
    }

    public int m14102b(MediaFormat mediaFormat, boolean z) {
        this.f25780b.add(new C7932e(this.f25780b.size(), mediaFormat, z));
        return this.f25780b.size() - 1;
    }

    public File m14101c() {
        return this.f25781c;
    }

    public C10453g m14100d() {
        return this.f25779a;
    }

    public ArrayList<C7932e> m14099e() {
        return this.f25780b;
    }

    public void m14098f(File file) {
        this.f25781c = file;
    }

    public void m14097g(int i) {
        if (i == 0) {
            this.f25779a = C10453g.f33526j;
        } else if (i == 90) {
            this.f25779a = C10453g.f33527k;
        } else if (i == 180) {
            this.f25779a = C10453g.f33528l;
        } else if (i == 270) {
            this.f25779a = C10453g.f33529m;
        }
    }

    public void m14096h(int i, int i2) {
        this.f25782d = i;
        this.f25783e = i2;
    }
}
