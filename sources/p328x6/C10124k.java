package p328x6;

import android.content.Context;
import android.content.res.Resources;
import java.util.Locale;
import java.util.Map;

public final class C10124k {
    public final String f32804a;
    public final String f32805b;
    public final String f32806c;
    public final String f32807d;
    public final String f32808e;
    public final String f32809f;
    public final String f32810g;
    public final String f32811h;
    public final String f32812i;
    public final String f32813j;

    public C10124k(Context context) {
        Resources resources = context.getResources();
        Map<String, String> a = C10147u.m5900a((resources == null || resources.getConfiguration() == null || resources.getConfiguration().locale == null) ? Locale.getDefault() : resources.getConfiguration().locale);
        this.f32804a = a.get("error_initializing_player");
        this.f32805b = a.get("get_youtube_app_title");
        this.f32806c = a.get("get_youtube_app_text");
        this.f32807d = a.get("get_youtube_app_action");
        this.f32808e = a.get("enable_youtube_app_title");
        this.f32809f = a.get("enable_youtube_app_text");
        this.f32810g = a.get("enable_youtube_app_action");
        this.f32811h = a.get("update_youtube_app_title");
        this.f32812i = a.get("update_youtube_app_text");
        this.f32813j = a.get("update_youtube_app_action");
    }
}
