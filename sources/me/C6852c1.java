package me;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import be.C1357a0;
import be.C1362c;
import be.C1410y;
import ie.C5386e;
import nc.C7389v0;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p108hb.C5070i;
import p364zd.C11524j;

public class C6852c1 extends View {
    public int f21487M;
    public int f21488N;
    public int f21489O;
    public StaticLayout f21490P;
    public C5386e f21491a;
    public C5386e f21492b;
    public Drawable f21493c;

    public C6852c1(Context context) {
        super(context);
    }

    public final void m18778a(int i) {
        StaticLayout staticLayout;
        C5386e eVar = this.f21491a;
        this.f21489O = eVar != null ? (int) C7389v0.m16680T1(eVar.f17711a, C1410y.m37065P(16.0f, eVar.f17712b)) : 0;
        if (this.f21492b != null) {
            String str = this.f21492b.f17711a;
            TextPaint j0 = C1410y.m37035j0();
            if (this.f21487M == 14) {
                i -= C1357a0.m37544i(8.0f) * 2;
            }
            staticLayout = new StaticLayout(str, j0, i, Layout.Alignment.ALIGN_CENTER, 1.0f, C1357a0.m37544i(2.5f), false);
        } else {
            staticLayout = null;
        }
        this.f21490P = staticLayout;
    }

    public void m18777b(int i, boolean z, String str) {
        int i2;
        if (this.f21487M != i) {
            int i3 = R.drawable.baseline_group_96;
            int i4 = R.string.NoMembersToShow;
            switch (i) {
                case 1:
                    i4 = R.string.NoMediaToShow;
                    i2 = z ? R.string.NoMediaToShowInChannel : R.string.NoMediaToShowInChat;
                    i3 = R.drawable.baseline_image_96;
                    break;
                case 2:
                    i4 = R.string.NoDocumentsToShow;
                    i2 = z ? R.string.NoDocumentsToShowInChannel : R.string.NoDocumentsToShowInChat;
                    i3 = R.drawable.baseline_insert_drive_file_96;
                    break;
                case 3:
                    i4 = R.string.NoMusicToShow;
                    i2 = z ? R.string.NoMusicToShowInChannel : R.string.NoMusicToShowInChat;
                    i3 = R.drawable.baseline_music_note_96;
                    break;
                case 4:
                    i4 = R.string.NoLinksToShow;
                    i2 = z ? R.string.NoLinksToShowInChannel : R.string.NoLinksToShowInChat;
                    i3 = R.drawable.baseline_language_96;
                    break;
                case 5:
                    i2 = R.string.NoMembersToShowDesc;
                    i3 = R.drawable.baseline_search_96;
                    break;
                case 6:
                    i4 = R.string.NoGroupsToShow;
                    i2 = R.string.GroupsWillBeShownHere;
                    break;
                case 7:
                case 8:
                    if (i != 8) {
                        i2 = R.string.RestrictedWillBeShownHere;
                        break;
                    } else {
                        i2 = R.string.BannedWillBeShownHere;
                        break;
                    }
                case 9:
                    i4 = R.string.NoGifsToShow;
                    i2 = z ? R.string.NoGifsToShowInChannel : R.string.NoGifsToShowInChat;
                    i3 = R.drawable.baseline_gif_96;
                    break;
                case 10:
                    i4 = R.string.NoVoiceToShow;
                    i2 = z ? R.string.NoVoiceToShowInChannel : R.string.NoVoiceToShowInChat;
                    i3 = R.drawable.baseline_mic_96;
                    break;
                case 11:
                    i4 = R.string.NoVideoToShow;
                    i2 = z ? R.string.NoVideoToShowInChannel : R.string.NoVideoToShowInChat;
                    i3 = R.drawable.deproko_baseline_msg_video_96;
                    break;
                case 12:
                    i4 = R.string.NoPhotosToShow;
                    i2 = z ? R.string.NoPhotosToShowInChannel : R.string.NoPhotosToShowInChat;
                    i3 = R.drawable.baseline_camera_alt_96;
                    break;
                case 13:
                    i4 = R.string.NoVideosToShow;
                    i2 = z ? R.string.NoVideosToShowInChannel : R.string.NoVideosToShowInChat;
                    i3 = R.drawable.baseline_video_library_96;
                    break;
                case 14:
                    i4 = R.string.MediaRestricted;
                    i2 = 0;
                    if (!C5070i.m24062i(str)) {
                        this.f21492b = new C5386e(str);
                    } else {
                        this.f21492b = null;
                    }
                    i3 = R.drawable.baseline_block_96;
                    break;
                default:
                    return;
            }
            this.f21487M = i;
            if (i4 != 0) {
                this.f21491a = new C5386e(C4403w.m27871i1(i4));
            }
            if (i2 != 0) {
                this.f21492b = new C5386e(C4403w.m27871i1(i2));
            }
            this.f21493c = C1362c.m37486f(i3);
            invalidate();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f21491a != null && this.f21492b != null && this.f21493c != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight() - getPaddingTop();
            int minimumHeight = this.f21493c.getMinimumHeight() + C1357a0.m37544i(38.0f) + C1357a0.m37544i(18.0f) + this.f21490P.getHeight() + C1357a0.m37544i(24.0f);
            int max = Math.max(minimumHeight, measuredHeight - getTop());
            canvas.save();
            canvas.translate(0.0f, (getPaddingTop() + (max / 2)) - (minimumHeight / 2));
            Drawable drawable = this.f21493c;
            int i = measuredWidth / 2;
            C1362c.m37490b(canvas, drawable, i - (drawable.getMinimumWidth() / 2), C1357a0.m37544i(12.0f), C1410y.m37038i());
            C5386e eVar = this.f21491a;
            if (eVar != null) {
                canvas.drawText(eVar.f17711a, i - (this.f21489O / 2), this.f21493c.getMinimumHeight() + C1357a0.m37544i(32.0f) + C1357a0.m37544i(12.0f), C1410y.m37066O(16.0f, C11524j.m215T0(), this.f21491a.f17712b));
            }
            if (this.f21490P != null) {
                C1410y.m37033k0(C11524j.m215T0());
                canvas.translate(i - (this.f21490P.getWidth() / 2), (minimumHeight - this.f21490P.getHeight()) - C1357a0.m37544i(12.0f));
                this.f21490P.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (this.f21488N != measuredWidth) {
            this.f21488N = measuredWidth;
            m18778a(measuredWidth);
        }
    }
}
