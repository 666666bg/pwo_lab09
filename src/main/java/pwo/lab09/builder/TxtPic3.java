package pwo.lab09.builder;
import java.io.File;

import static java.lang.System.exit;

public class TxtPic3 extends TxtPic2 {
    private boolean NameCheck() {
        if (fileName != null) {
            return !fileName.isBlank();
        }
        return false;
    }

    private boolean Sizecheck() {
        return size > 0;
    }

    @Override
    public TxtPic2 createTxtPic() {
        if (!Sizecheck()) {
            throw new ValidationFailedException("Size not valid!");
        }
        if (!NameCheck()) {
            throw new ValidationFailedException("File name not valid!");
        }
        return super.createTxtPic();
    }
}
