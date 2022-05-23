package ee;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import me.vkryl.android.widget.FrameLayoutFix;

public abstract class w extends v<m0> implements TextureView.SurfaceTextureListener {
    public SurfaceTexture f11743c0;
    public int f11744d0;
    public int f11745e0;

    public w(Context context, l lVar) {
        super(context, lVar);
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f11743c0 = surfaceTexture;
        this.f11744d0 = i10;
        this.f11745e0 = i11;
        u0(surfaceTexture, i10, i11);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        v0(surfaceTexture);
        this.f11743c0 = null;
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f11744d0 = i10;
        this.f11745e0 = i11;
        w0(surfaceTexture, i10, i11);
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final SurfaceTexture q0() {
        return this.f11743c0;
    }

    public final int r0() {
        return this.f11745e0;
    }

    public final int s0() {
        return this.f11744d0;
    }

    public final m0 E() {
        m0 m0Var = new m0(this.f11738a);
        m0Var.setLayoutParams(FrameLayoutFix.r1(-2, -2, 17));
        m0Var.setManager(this);
        m0Var.setSurfaceTextureListener(this);
        return m0Var;
    }

    public abstract void u0(SurfaceTexture surfaceTexture, int i10, int i11);

    public abstract void v0(SurfaceTexture surfaceTexture);

    public abstract void w0(SurfaceTexture surfaceTexture, int i10, int i11);

    public abstract void x0(int i10, int i11);
}
