package ba;

import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import java.io.FileDescriptor;

public class C1300e extends AbstractC1299d {
    public final FileDescriptor f4692m;
    public final long f4693n;
    public final long f4694o;

    public C1300e(FileDescriptor fileDescriptor) {
        this(fileDescriptor, 0L, 576460752303423487L);
    }

    @Override
    public void mo37786a(MediaExtractor mediaExtractor) {
        mediaExtractor.setDataSource(this.f4692m, this.f4693n, this.f4694o);
    }

    @Override
    public void mo37785b(MediaMetadataRetriever mediaMetadataRetriever) {
        mediaMetadataRetriever.setDataSource(this.f4692m, this.f4693n, this.f4694o);
    }

    public C1300e(FileDescriptor fileDescriptor, long j, long j2) {
        this.f4692m = fileDescriptor;
        this.f4693n = j;
        this.f4694o = j2 <= 0 ? 576460752303423487L : j2;
    }
}
