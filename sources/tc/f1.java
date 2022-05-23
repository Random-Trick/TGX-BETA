package tc;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import kb.c;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;

public class f1 extends FrameLayoutFix implements c, TextureView.SurfaceTextureListener {
    public TextureView M;

    public f1(Context context) {
        super(context);
        setId(R.id.btn_camera);
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        setBackgroundColor(-16777216);
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-2, -2, 53);
        r12.topMargin = a0.i(6.0f);
        r12.rightMargin = a0.i(6.0f);
        TextureView textureView = new TextureView(context);
        this.M = textureView;
        textureView.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        this.M.setSurfaceTextureListener(this);
        addView(this.M);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.baseline_camera_alt_24);
        imageView.setColorFilter(-1);
        imageView.setLayoutParams(r12);
        addView(imageView);
    }

    @Override
    public void Q2() {
    }

    public void b() {
    }

    public void e() {
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i10);
    }

    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        z1();
    }

    @Override
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @TargetApi(21)
    public final void z1() {
    }
}
