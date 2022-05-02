package de;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import me.vkryl.android.widget.FrameLayoutFix;

public abstract class AbstractTextureView$SurfaceTextureListenerC4068w extends AbstractC4067v<C4058m0> implements TextureView.SurfaceTextureListener {
    public SurfaceTexture f13729c0;
    public int f13730d0;
    public int f13731e0;

    public AbstractTextureView$SurfaceTextureListenerC4068w(Context context, AbstractC4055l lVar) {
        super(context, lVar);
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f13729c0 = surfaceTexture;
        this.f13730d0 = i;
        this.f13731e0 = i2;
        mo28495u0(surfaceTexture, i, i2);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        mo28494v0(surfaceTexture);
        this.f13729c0 = null;
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f13730d0 = i;
        this.f13731e0 = i2;
        mo28493w0(surfaceTexture, i, i2);
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final SurfaceTexture m29057q0() {
        return this.f13729c0;
    }

    public final int m29056r0() {
        return this.f13731e0;
    }

    public final int m29055s0() {
        return this.f13730d0;
    }

    public final C4058m0 mo27775E() {
        C4058m0 m0Var = new C4058m0(this.f13724a);
        m0Var.setLayoutParams(FrameLayoutFix.m18007t1(-2, -2, 17));
        m0Var.setManager(this);
        m0Var.setSurfaceTextureListener(this);
        return m0Var;
    }

    public abstract void mo28495u0(SurfaceTexture surfaceTexture, int i, int i2);

    public abstract void mo28494v0(SurfaceTexture surfaceTexture);

    public abstract void mo28493w0(SurfaceTexture surfaceTexture, int i, int i2);

    public abstract void mo28492x0(int i, int i2);
}
