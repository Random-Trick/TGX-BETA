package p070f1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

public class C4211g {
    public static ColorStateList m28434a(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintList();
        }
        if (imageView instanceof AbstractC4221n) {
            return ((AbstractC4221n) imageView).getSupportImageTintList();
        }
        return null;
    }

    public static PorterDuff.Mode m28433b(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintMode();
        }
        if (imageView instanceof AbstractC4221n) {
            return ((AbstractC4221n) imageView).getSupportImageTintMode();
        }
        return null;
    }

    public static void m28432c(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            imageView.setImageTintList(colorStateList);
            if (i == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof AbstractC4221n) {
            ((AbstractC4221n) imageView).setSupportImageTintList(colorStateList);
        }
    }

    public static void m28431d(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            imageView.setImageTintMode(mode);
            if (i == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof AbstractC4221n) {
            ((AbstractC4221n) imageView).setSupportImageTintMode(mode);
        }
    }
}
