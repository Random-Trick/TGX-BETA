package org.thunderdog.challegram.video.old;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.coremedia.iso.boxes.AbstractMediaHeaderBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import com.coremedia.iso.boxes.VideoMediaHeaderBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.mp4parser.iso14496.part15.AvcConfigurationBox;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import p039d.C3563j;
import p249r8.C8377a;
import p249r8.C8383e;
import p249r8.C8386h;
import p249r8.C8392n;

@TargetApi(16)
public class C7932e {
    public static Map<Integer, Integer> f25784r;
    public long f25785a;
    public int[] f25788d;
    public String f25789e;
    public AbstractMediaHeaderBox f25790f;
    public SampleDescriptionBox f25791g;
    public LinkedList<Integer> f25792h;
    public int f25793i;
    public int f25795k;
    public int f25796l;
    public float f25797m;
    public long[] f25798n;
    public boolean f25800p;
    public ArrayList<C7930c> f25786b = new ArrayList<>();
    public long f25787c = 0;
    public Date f25794j = new Date();
    public ArrayList<C7933a> f25799o = new ArrayList<>();
    public boolean f25801q = true;

    public static class C7933a {
        public int f25802a;
        public long f25803b;
        public long f25804c;

        public C7933a(int i, long j) {
            this.f25802a = i;
            this.f25803b = j;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f25784r = hashMap;
        hashMap.put(96000, 0);
        f25784r.put(88200, 1);
        f25784r.put(64000, 2);
        f25784r.put(48000, 3);
        f25784r.put(44100, 4);
        f25784r.put(32000, 5);
        f25784r.put(24000, 6);
        f25784r.put(22050, 7);
        f25784r.put(16000, 8);
        f25784r.put(12000, 9);
        f25784r.put(11025, 10);
        f25784r.put(8000, 11);
    }

    public C7932e(int i, MediaFormat mediaFormat, boolean z) {
        this.f25792h = null;
        this.f25797m = 0.0f;
        this.f25785a = i;
        this.f25800p = z;
        if (!z) {
            this.f25796l = mediaFormat.getInteger("width");
            this.f25795k = mediaFormat.getInteger("height");
            this.f25793i = 90000;
            this.f25792h = new LinkedList<>();
            this.f25789e = "vide";
            this.f25790f = new VideoMediaHeaderBox();
            this.f25791g = new SampleDescriptionBox();
            String string = mediaFormat.getString("mime");
            if (string.equals("video/avc")) {
                VisualSampleEntry visualSampleEntry = new VisualSampleEntry(VisualSampleEntry.TYPE3);
                visualSampleEntry.setDataReferenceIndex(1);
                visualSampleEntry.setDepth(24);
                visualSampleEntry.setFrameCount(1);
                visualSampleEntry.setHorizresolution(72.0d);
                visualSampleEntry.setVertresolution(72.0d);
                visualSampleEntry.setWidth(this.f25796l);
                visualSampleEntry.setHeight(this.f25795k);
                AvcConfigurationBox avcConfigurationBox = new AvcConfigurationBox();
                if (mediaFormat.getByteBuffer("csd-0") != null) {
                    ArrayList arrayList = new ArrayList();
                    ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
                    byteBuffer.position(4);
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    arrayList.add(bArr);
                    ArrayList arrayList2 = new ArrayList();
                    ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-1");
                    byteBuffer2.position(4);
                    byte[] bArr2 = new byte[byteBuffer2.remaining()];
                    byteBuffer2.get(bArr2);
                    arrayList2.add(bArr2);
                    avcConfigurationBox.setSequenceParameterSets(arrayList);
                    avcConfigurationBox.setPictureParameterSets(arrayList2);
                }
                if (mediaFormat.containsKey("level")) {
                    int integer = mediaFormat.getInteger("level");
                    if (integer == 1) {
                        avcConfigurationBox.setAvcLevelIndication(1);
                    } else if (integer == 32) {
                        avcConfigurationBox.setAvcLevelIndication(2);
                    } else if (integer == 4) {
                        avcConfigurationBox.setAvcLevelIndication(11);
                    } else if (integer == 8) {
                        avcConfigurationBox.setAvcLevelIndication(12);
                    } else if (integer == 16) {
                        avcConfigurationBox.setAvcLevelIndication(13);
                    } else if (integer == 64) {
                        avcConfigurationBox.setAvcLevelIndication(21);
                    } else if (integer == 128) {
                        avcConfigurationBox.setAvcLevelIndication(22);
                    } else if (integer == 256) {
                        avcConfigurationBox.setAvcLevelIndication(3);
                    } else if (integer == 512) {
                        avcConfigurationBox.setAvcLevelIndication(31);
                    } else if (integer == 1024) {
                        avcConfigurationBox.setAvcLevelIndication(32);
                    } else if (integer == 2048) {
                        avcConfigurationBox.setAvcLevelIndication(4);
                    } else if (integer == 4096) {
                        avcConfigurationBox.setAvcLevelIndication(41);
                    } else if (integer == 8192) {
                        avcConfigurationBox.setAvcLevelIndication(42);
                    } else if (integer == 16384) {
                        avcConfigurationBox.setAvcLevelIndication(5);
                    } else if (integer == 32768) {
                        avcConfigurationBox.setAvcLevelIndication(51);
                    } else if (integer == 65536) {
                        avcConfigurationBox.setAvcLevelIndication(52);
                    } else if (integer == 2) {
                        avcConfigurationBox.setAvcLevelIndication(27);
                    }
                } else {
                    avcConfigurationBox.setAvcLevelIndication(13);
                }
                if (mediaFormat.containsKey("profile")) {
                    int integer2 = mediaFormat.getInteger("profile");
                    if (integer2 == 1) {
                        avcConfigurationBox.setAvcProfileIndication(66);
                    } else if (integer2 == 2) {
                        avcConfigurationBox.setAvcProfileIndication(77);
                    } else if (integer2 == 4) {
                        avcConfigurationBox.setAvcProfileIndication(88);
                    } else if (integer2 == 8) {
                        avcConfigurationBox.setAvcProfileIndication(100);
                    } else if (integer2 == 16) {
                        avcConfigurationBox.setAvcProfileIndication(110);
                    } else if (integer2 == 32) {
                        avcConfigurationBox.setAvcProfileIndication(C3563j.f11967N0);
                    } else if (integer2 == 64) {
                        avcConfigurationBox.setAvcProfileIndication(244);
                    }
                } else {
                    avcConfigurationBox.setAvcProfileIndication(100);
                }
                avcConfigurationBox.setBitDepthLumaMinus8(-1);
                avcConfigurationBox.setBitDepthChromaMinus8(-1);
                avcConfigurationBox.setChromaFormat(-1);
                avcConfigurationBox.setConfigurationVersion(1);
                avcConfigurationBox.setLengthSizeMinusOne(3);
                avcConfigurationBox.setProfileCompatibility(0);
                visualSampleEntry.addBox(avcConfigurationBox);
                this.f25791g.addBox(visualSampleEntry);
            } else if (string.equals("video/mp4v")) {
                VisualSampleEntry visualSampleEntry2 = new VisualSampleEntry(VisualSampleEntry.TYPE1);
                visualSampleEntry2.setDataReferenceIndex(1);
                visualSampleEntry2.setDepth(24);
                visualSampleEntry2.setFrameCount(1);
                visualSampleEntry2.setHorizresolution(72.0d);
                visualSampleEntry2.setVertresolution(72.0d);
                visualSampleEntry2.setWidth(this.f25796l);
                visualSampleEntry2.setHeight(this.f25795k);
                this.f25791g.addBox(visualSampleEntry2);
            }
        } else {
            this.f25797m = 1.0f;
            this.f25793i = mediaFormat.getInteger("sample-rate");
            this.f25789e = "soun";
            this.f25790f = new SoundMediaHeaderBox();
            this.f25791g = new SampleDescriptionBox();
            AudioSampleEntry audioSampleEntry = new AudioSampleEntry(AudioSampleEntry.TYPE3);
            audioSampleEntry.setChannelCount(mediaFormat.getInteger("channel-count"));
            audioSampleEntry.setSampleRate(mediaFormat.getInteger("sample-rate"));
            audioSampleEntry.setDataReferenceIndex(1);
            audioSampleEntry.setSampleSize(16);
            ESDescriptorBox eSDescriptorBox = new ESDescriptorBox();
            C8386h hVar = new C8386h();
            hVar.m12596v(0);
            C8392n nVar = new C8392n();
            nVar.m12591h(2);
            hVar.m12595w(nVar);
            String string2 = mediaFormat.containsKey("mime") ? mediaFormat.getString("mime") : "audio/mp4-latm";
            C8383e eVar = new C8383e();
            if ("audio/mpeg".equals(string2)) {
                eVar.m12614u(105);
            } else {
                eVar.m12614u(64);
            }
            eVar.m12613v(5);
            eVar.m12616s(1536);
            if (mediaFormat.containsKey("max-bitrate")) {
                eVar.m12615t(mediaFormat.getInteger("max-bitrate"));
            } else {
                eVar.m12615t(96000L);
            }
            eVar.m12617r(this.f25793i);
            C8377a aVar = new C8377a();
            aVar.m12641p(2);
            aVar.m12639r(f25784r.get(Integer.valueOf((int) audioSampleEntry.getSampleRate())).intValue());
            aVar.m12640q(audioSampleEntry.getChannelCount());
            eVar.m12618q(aVar);
            hVar.m12597u(eVar);
            ByteBuffer s = hVar.m12599s();
            eSDescriptorBox.setEsDescriptor(hVar);
            eSDescriptorBox.setData(s);
            audioSampleEntry.addBox(eSDescriptorBox);
            this.f25791g.addBox(audioSampleEntry);
        }
    }

    public static int m14077r(C7933a aVar, C7933a aVar2) {
        if (aVar.f25803b > aVar2.f25803b) {
            return 1;
        }
        return aVar.f25803b < aVar2.f25803b ? -1 : 0;
    }

    public void m14093b(long j, MediaCodec.BufferInfo bufferInfo) {
        boolean z = true;
        if (this.f25800p || (bufferInfo.flags & 1) == 0) {
            z = false;
        }
        this.f25786b.add(new C7930c(j, bufferInfo.size));
        LinkedList<Integer> linkedList = this.f25792h;
        if (linkedList != null && z) {
            linkedList.add(Integer.valueOf(this.f25786b.size()));
        }
        ArrayList<C7933a> arrayList = this.f25799o;
        arrayList.add(new C7933a(arrayList.size(), ((bufferInfo.presentationTimeUs * this.f25793i) + 500000) / 1000000));
    }

    public Date m14092c() {
        return this.f25794j;
    }

    public long m14091d() {
        return this.f25787c;
    }

    public String m14090e() {
        return this.f25789e;
    }

    public int m14089f() {
        return this.f25795k;
    }

    public AbstractMediaHeaderBox m14088g() {
        return this.f25790f;
    }

    public int[] m14087h() {
        return this.f25788d;
    }

    public SampleDescriptionBox m14086i() {
        return this.f25791g;
    }

    public long[] m14085j() {
        return this.f25798n;
    }

    public ArrayList<C7930c> m14084k() {
        return this.f25786b;
    }

    public long[] m14083l() {
        LinkedList<Integer> linkedList = this.f25792h;
        if (linkedList == null || linkedList.isEmpty()) {
            return null;
        }
        long[] jArr = new long[this.f25792h.size()];
        for (int i = 0; i < this.f25792h.size(); i++) {
            jArr[i] = this.f25792h.get(i).intValue();
        }
        return jArr;
    }

    public int m14082m() {
        return this.f25793i;
    }

    public long m14081n() {
        return this.f25785a;
    }

    public float m14080o() {
        return this.f25797m;
    }

    public int m14079p() {
        return this.f25796l;
    }

    public boolean m14078q() {
        return this.f25800p;
    }

    public void m14076s() {
        int i;
        ArrayList arrayList = new ArrayList(this.f25799o);
        Collections.sort(this.f25799o, C7931d.f25783a);
        this.f25798n = new long[this.f25799o.size()];
        long j = Long.MAX_VALUE;
        long j2 = 0;
        int i2 = 0;
        boolean z = false;
        while (true) {
            if (i2 >= this.f25799o.size()) {
                break;
            }
            C7933a aVar = this.f25799o.get(i2);
            long j3 = aVar.f25803b - j2;
            j2 = aVar.f25803b;
            this.f25798n[aVar.f25802a] = j3;
            long j4 = j;
            if (aVar.f25802a != 0) {
                this.f25787c += j3;
            }
            j = (j3 <= 0 || j3 >= 2147483647L) ? j4 : Math.min(j4, j3);
            if (aVar.f25802a != i2) {
                z = true;
            }
            i2++;
        }
        long[] jArr = this.f25798n;
        if (jArr.length > 0) {
            jArr[0] = j;
            this.f25787c += j;
        }
        for (i = 1; i < arrayList.size(); i++) {
            ((C7933a) arrayList.get(i)).f25804c = this.f25798n[i] + ((C7933a) arrayList.get(i - 1)).f25804c;
        }
        if (z) {
            this.f25788d = new int[this.f25799o.size()];
            for (int i3 = 0; i3 < this.f25799o.size(); i3++) {
                C7933a aVar2 = this.f25799o.get(i3);
                this.f25788d[aVar2.f25802a] = (int) (aVar2.f25803b - aVar2.f25804c);
            }
        }
    }
}
