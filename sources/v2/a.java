package v2;

import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import java.util.AbstractList;
import java.util.List;
import o8.f;
import s2.d;
import t2.b;

public class a extends AbstractList<f> {
    public List<f> f24679a;

    public a(TrackBox trackBox, d... dVarArr) {
        b parent = ((t2.a) trackBox.getParent()).getParent();
        if (!trackBox.getParent().getBoxes(MovieExtendsBox.class).isEmpty()) {
            this.f24679a = new q8.b(trackBox.getTrackHeaderBox().getTrackId(), parent, dVarArr);
        } else if (dVarArr.length <= 0) {
            this.f24679a = new q8.a(trackBox.getTrackHeaderBox().getTrackId(), parent);
        } else {
            throw new RuntimeException("The TrackBox comes from a standard MP4 file. Only use the additionalFragments param if you are dealing with ( fragmented MP4 files AND additional fragments in standalone files )");
        }
    }

    public f get(int i10) {
        return this.f24679a.get(i10);
    }

    @Override
    public int size() {
        return this.f24679a.size();
    }
}
