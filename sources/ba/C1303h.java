package ba;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.util.Map;

public class C1303h extends AbstractC1299d {
    public final Context f4703m;
    public final Uri f4704n;

    public C1303h(Context context, Uri uri) {
        this.f4703m = context.getApplicationContext();
        this.f4704n = uri;
    }

    @Override
    public void mo37786a(MediaExtractor mediaExtractor) {
        mediaExtractor.setDataSource(this.f4703m, this.f4704n, (Map<String, String>) null);
    }

    @Override
    public void mo37785b(MediaMetadataRetriever mediaMetadataRetriever) {
        mediaMetadataRetriever.setDataSource(this.f4703m, this.f4704n);
    }
}
