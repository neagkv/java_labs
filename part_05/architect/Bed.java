package part_05.architect;

public class Bed {

    private char bedSize;
    private char sheet_Color;

    public Bed(char bedSize, char sheet_Color) {
        this.bedSize = bedSize;
        this.sheet_Color = sheet_Color;
    }

    public char getBedSize() {
        return bedSize;
    }

    public void setBedSize(char bedSize) {
        this.bedSize = bedSize;
    }

    public char getSheet_Color() {
        return sheet_Color;
    }

    public void setSheet_Color(char sheet_Color) {
        sheet_Color = sheet_Color;
    }
}
