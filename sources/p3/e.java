package p3;

import c5.l0;

public final class e {
    public int f20474a;
    public int f20475b;
    public int f20476c;
    public int f20477d;
    public int f20478e;
    public int f20479f;
    public int f20480g;
    public int f20481h;
    public int f20482i;
    public int f20483j;
    public long f20484k;
    public int f20485l;

    public void a(long j10) {
        b(j10, 1);
    }

    public final void b(long j10, int i10) {
        this.f20484k += j10;
        this.f20485l += i10;
    }

    public synchronized void c() {
    }

    public String toString() {
        return l0.z("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f20474a), Integer.valueOf(this.f20475b), Integer.valueOf(this.f20476c), Integer.valueOf(this.f20477d), Integer.valueOf(this.f20478e), Integer.valueOf(this.f20479f), Integer.valueOf(this.f20480g), Integer.valueOf(this.f20481h), Integer.valueOf(this.f20482i), Integer.valueOf(this.f20483j), Long.valueOf(this.f20484k), Integer.valueOf(this.f20485l));
    }
}
