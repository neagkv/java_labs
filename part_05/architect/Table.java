package part_05.architect;

public class Table {
    private int table_Height;
    private int table_length;
    private int table_width;

    public Table(int table_Height, int table_length, int table_width) {
        this.table_Height = table_Height;
        this.table_length = table_length;
        this.table_width = table_width;
    }

    public int getTable_Height() {
        return table_Height;
    }

    public void setTable_Height(int table_Height) {
        this.table_Height = table_Height;
    }

    public int getTable_length() {
        return table_length;
    }

    public void setTable_length(int table_length) {
        this.table_length = table_length;
    }

    public int getTable_width() {
        return table_width;
    }

    public void setTable_width(int table_width) {
        this.table_width = table_width;
    }
}
