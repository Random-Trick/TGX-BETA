package sc;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.TextureView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import p139jb.AbstractC5911c;

public class TextureView$SurfaceTextureListenerC8761f1 extends FrameLayoutFix implements AbstractC5911c, TextureView.SurfaceTextureListener {
    public TextureView f28266M;

    public TextureView$SurfaceTextureListenerC8761f1(Context context) {
        super(context);
        setId(R.id.btn_camera);
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        setBackgroundColor(-16777216);
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-2, -2, 53);
        t1.topMargin = C1357a0.m37544i(6.0f);
        t1.rightMargin = C1357a0.m37544i(6.0f);
        if (Build.VERSION.SDK_INT >= 21) {
            TextureView textureView = new TextureView(context);
            this.f28266M = textureView;
            textureView.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
            this.f28266M.setSurfaceTextureListener(this);
            addView(this.f28266M);
        }
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.baseline_camera_alt_24);
        imageView.setColorFilter(-1);
        imageView.setLayoutParams(t1);
        addView(imageView);
    }

    @TargetApi(21)
    public final void m11486C1() {
    }

    @Override
    public void mo4501a3() {
    }

    public void m11485b() {
    }

    public void m11484f() {
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }

    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        m11486C1();
    }

    @Override
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
