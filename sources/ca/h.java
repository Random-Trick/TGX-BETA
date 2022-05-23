package ca;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.util.Map;

public class h extends d {
    public final Context f5026m;
    public final Uri f5027n;

    public h(Context context, Uri uri) {
        this.f5026m = context.getApplicationContext();
        this.f5027n = uri;
    }

    @Override
    public void a(MediaExtractor mediaExtractor) {
        mediaExtractor.setDataSource(this.f5026m, this.f5027n, (Map<String, String>) null);
    }

    @Override
    public void b(MediaMetadataRetriever mediaMetadataRetriever) {
        mediaMetadataRetriever.setDataSource(this.f5026m, this.f5027n);
    }
}
