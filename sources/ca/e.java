package ca;

import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import java.io.FileDescriptor;

public class e extends d {
    public final FileDescriptor f5015m;
    public final long f5016n;
    public final long f5017o;

    public e(FileDescriptor fileDescriptor) {
        this(fileDescriptor, 0L, 576460752303423487L);
    }

    @Override
    public void a(MediaExtractor mediaExtractor) {
        mediaExtractor.setDataSource(this.f5015m, this.f5016n, this.f5017o);
    }

    @Override
    public void b(MediaMetadataRetriever mediaMetadataRetriever) {
        mediaMetadataRetriever.setDataSource(this.f5015m, this.f5016n, this.f5017o);
    }

    public e(FileDescriptor fileDescriptor, long j10, long j11) {
        this.f5015m = fileDescriptor;
        this.f5016n = j10;
        this.f5017o = j11 <= 0 ? 576460752303423487L : j11;
    }
}
