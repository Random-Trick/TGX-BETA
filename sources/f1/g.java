package f1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

public class g {
    public static ColorStateList a(ImageView imageView) {
        return imageView.getImageTintList();
    }

    public static PorterDuff.Mode b(ImageView imageView) {
        return imageView.getImageTintMode();
    }

    public static void c(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        int i10 = Build.VERSION.SDK_INT;
        imageView.setImageTintList(colorStateList);
        if (i10 == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
        }
    }

    public static void d(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        int i10 = Build.VERSION.SDK_INT;
        imageView.setImageTintMode(mode);
        if (i10 == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
        }
    }
}
