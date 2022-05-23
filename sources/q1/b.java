package q1;

import android.app.Application;
import android.content.Context;

public class b extends Application {
    @Override
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        a.l(this);
    }
}
