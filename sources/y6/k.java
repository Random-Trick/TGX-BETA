package y6;

import android.content.Context;
import android.content.res.Resources;
import java.util.Locale;
import java.util.Map;

public final class k {
    public final String f26588a;
    public final String f26589b;
    public final String f26590c;
    public final String f26591d;
    public final String f26592e;
    public final String f26593f;
    public final String f26594g;
    public final String f26595h;
    public final String f26596i;
    public final String f26597j;

    public k(Context context) {
        Resources resources = context.getResources();
        Map<String, String> a10 = u.a((resources == null || resources.getConfiguration() == null || resources.getConfiguration().locale == null) ? Locale.getDefault() : resources.getConfiguration().locale);
        this.f26588a = a10.get("error_initializing_player");
        this.f26589b = a10.get("get_youtube_app_title");
        this.f26590c = a10.get("get_youtube_app_text");
        this.f26591d = a10.get("get_youtube_app_action");
        this.f26592e = a10.get("enable_youtube_app_title");
        this.f26593f = a10.get("enable_youtube_app_text");
        this.f26594g = a10.get("enable_youtube_app_action");
        this.f26595h = a10.get("update_youtube_app_title");
        this.f26596i = a10.get("update_youtube_app_text");
        this.f26597j = a10.get("update_youtube_app_action");
    }
}
