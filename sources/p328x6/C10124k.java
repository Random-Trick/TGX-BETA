package p328x6;

import android.content.Context;
import android.content.res.Resources;
import java.util.Locale;
import java.util.Map;

public final class C10124k {
    public final String f32807a;
    public final String f32808b;
    public final String f32809c;
    public final String f32810d;
    public final String f32811e;
    public final String f32812f;
    public final String f32813g;
    public final String f32814h;
    public final String f32815i;
    public final String f32816j;

    public C10124k(Context context) {
        Resources resources = context.getResources();
        Map<String, String> a = C10147u.m5900a((resources == null || resources.getConfiguration() == null || resources.getConfiguration().locale == null) ? Locale.getDefault() : resources.getConfiguration().locale);
        this.f32807a = a.get("error_initializing_player");
        this.f32808b = a.get("get_youtube_app_title");
        this.f32809c = a.get("get_youtube_app_text");
        this.f32810d = a.get("get_youtube_app_action");
        this.f32811e = a.get("enable_youtube_app_title");
        this.f32812f = a.get("enable_youtube_app_text");
        this.f32813g = a.get("enable_youtube_app_action");
        this.f32814h = a.get("update_youtube_app_title");
        this.f32815i = a.get("update_youtube_app_text");
        this.f32816j = a.get("update_youtube_app_action");
    }
}
