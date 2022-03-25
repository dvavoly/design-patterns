package patterns.facade;

import java.util.Objects;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (Objects.equals(type, "mp4")) {
            System.out.println("CodecFactory extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        } else {
            System.out.println("CodecFactory extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
