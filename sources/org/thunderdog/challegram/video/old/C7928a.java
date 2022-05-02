package org.thunderdog.challegram.video.old;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.util.ArrayList;
import p345y8.C10453g;

@TargetApi(16)
public class C7928a {
    public C10453g f25776a = C10453g.f33523j;
    public ArrayList<C7932e> f25777b = new ArrayList<>();
    public File f25778c;
    public int f25779d;
    public int f25780e;

    public void m14104a(int i, long j, MediaCodec.BufferInfo bufferInfo) {
        if (i >= 0 && i < this.f25777b.size()) {
            this.f25777b.get(i).m14093b(j, bufferInfo);
        }
    }

    public int m14103b(MediaFormat mediaFormat, boolean z) {
        this.f25777b.add(new C7932e(this.f25777b.size(), mediaFormat, z));
        return this.f25777b.size() - 1;
    }

    public File m14102c() {
        return this.f25778c;
    }

    public C10453g m14101d() {
        return this.f25776a;
    }

    public ArrayList<C7932e> m14100e() {
        return this.f25777b;
    }

    public void m14099f(File file) {
        this.f25778c = file;
    }

    public void m14098g(int i) {
        if (i == 0) {
            this.f25776a = C10453g.f33523j;
        } else if (i == 90) {
            this.f25776a = C10453g.f33524k;
        } else if (i == 180) {
            this.f25776a = C10453g.f33525l;
        } else if (i == 270) {
            this.f25776a = C10453g.f33526m;
        }
    }

    public void m14097h(int i, int i2) {
        this.f25779d = i;
        this.f25780e = i2;
    }
}
