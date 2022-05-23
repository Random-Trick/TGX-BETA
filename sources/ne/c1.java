package ne;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import ce.a0;
import ce.c;
import ce.y;
import gd.w;
import ib.i;
import je.e;
import oc.v0;
import org.thunderdog.challegram.R;

public class c1 extends View {
    public int M;
    public int N;
    public int O;
    public StaticLayout P;
    public e f17908a;
    public e f17909b;
    public Drawable f17910c;

    public c1(Context context) {
        super(context);
    }

    public final void a(int i10) {
        StaticLayout staticLayout;
        e eVar = this.f17908a;
        this.O = eVar != null ? (int) v0.T1(eVar.f15363a, y.P(16.0f, eVar.f15364b)) : 0;
        if (this.f17909b != null) {
            String str = this.f17909b.f15363a;
            TextPaint j02 = y.j0();
            if (this.M == 14) {
                i10 -= a0.i(8.0f) * 2;
            }
            staticLayout = new StaticLayout(str, j02, i10, Layout.Alignment.ALIGN_CENTER, 1.0f, a0.i(2.5f), false);
        } else {
            staticLayout = null;
        }
        this.P = staticLayout;
    }

    public void b(int i10, boolean z10, String str) {
        int i11;
        if (this.M != i10) {
            int i12 = R.drawable.baseline_group_96;
            int i13 = R.string.NoMembersToShow;
            switch (i10) {
                case 1:
                    i13 = R.string.NoMediaToShow;
                    i11 = z10 ? R.string.NoMediaToShowInChannel : R.string.NoMediaToShowInChat;
                    i12 = R.drawable.baseline_image_96;
                    break;
                case 2:
                    i13 = R.string.NoDocumentsToShow;
                    i11 = z10 ? R.string.NoDocumentsToShowInChannel : R.string.NoDocumentsToShowInChat;
                    i12 = R.drawable.baseline_insert_drive_file_96;
                    break;
                case 3:
                    i13 = R.string.NoMusicToShow;
                    i11 = z10 ? R.string.NoMusicToShowInChannel : R.string.NoMusicToShowInChat;
                    i12 = R.drawable.baseline_music_note_96;
                    break;
                case 4:
                    i13 = R.string.NoLinksToShow;
                    i11 = z10 ? R.string.NoLinksToShowInChannel : R.string.NoLinksToShowInChat;
                    i12 = R.drawable.baseline_language_96;
                    break;
                case 5:
                    i11 = R.string.NoMembersToShowDesc;
                    i12 = R.drawable.baseline_search_96;
                    break;
                case 6:
                    i13 = R.string.NoGroupsToShow;
                    i11 = R.string.GroupsWillBeShownHere;
                    break;
                case 7:
                case 8:
                    if (i10 != 8) {
                        i11 = R.string.RestrictedWillBeShownHere;
                        break;
                    } else {
                        i11 = R.string.BannedWillBeShownHere;
                        break;
                    }
                case 9:
                    i13 = R.string.NoGifsToShow;
                    i11 = z10 ? R.string.NoGifsToShowInChannel : R.string.NoGifsToShowInChat;
                    i12 = R.drawable.baseline_gif_96;
                    break;
                case 10:
                    i13 = R.string.NoVoiceToShow;
                    i11 = z10 ? R.string.NoVoiceToShowInChannel : R.string.NoVoiceToShowInChat;
                    i12 = R.drawable.baseline_mic_96;
                    break;
                case 11:
                    i13 = R.string.NoVideoToShow;
                    i11 = z10 ? R.string.NoVideoToShowInChannel : R.string.NoVideoToShowInChat;
                    i12 = R.drawable.deproko_baseline_msg_video_96;
                    break;
                case 12:
                    i13 = R.string.NoPhotosToShow;
                    i11 = z10 ? R.string.NoPhotosToShowInChannel : R.string.NoPhotosToShowInChat;
                    i12 = R.drawable.baseline_camera_alt_96;
                    break;
                case 13:
                    i13 = R.string.NoVideosToShow;
                    i11 = z10 ? R.string.NoVideosToShowInChannel : R.string.NoVideosToShowInChat;
                    i12 = R.drawable.baseline_video_library_96;
                    break;
                case 14:
                    i13 = R.string.MediaRestricted;
                    i11 = 0;
                    if (!i.i(str)) {
                        this.f17909b = new e(str);
                    } else {
                        this.f17909b = null;
                    }
                    i12 = R.drawable.baseline_block_96;
                    break;
                default:
                    return;
            }
            this.M = i10;
            if (i13 != 0) {
                this.f17908a = new e(w.i1(i13));
            }
            if (i11 != 0) {
                this.f17909b = new e(w.i1(i11));
            }
            this.f17910c = c.f(i12);
            invalidate();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f17908a != null && this.f17909b != null && this.f17910c != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight() - getPaddingTop();
            int minimumHeight = this.f17910c.getMinimumHeight() + a0.i(38.0f) + a0.i(18.0f) + this.P.getHeight() + a0.i(24.0f);
            int max = Math.max(minimumHeight, measuredHeight - getTop());
            canvas.save();
            canvas.translate(0.0f, (getPaddingTop() + (max / 2)) - (minimumHeight / 2));
            Drawable drawable = this.f17910c;
            int i10 = measuredWidth / 2;
            c.b(canvas, drawable, i10 - (drawable.getMinimumWidth() / 2), a0.i(12.0f), y.i());
            e eVar = this.f17908a;
            if (eVar != null) {
                canvas.drawText(eVar.f15363a, i10 - (this.O / 2), this.f17910c.getMinimumHeight() + a0.i(32.0f) + a0.i(12.0f), y.O(16.0f, j.Q0(), this.f17908a.f15364b));
            }
            if (this.P != null) {
                y.k0(j.Q0());
                canvas.translate(i10 - (this.P.getWidth() / 2), (minimumHeight - this.P.getHeight()) - a0.i(12.0f));
                this.P.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        if (this.N != measuredWidth) {
            this.N = measuredWidth;
            a(measuredWidth);
        }
    }
}
