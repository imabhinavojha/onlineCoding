package Strivers_A2Z_DSA_Course;

public class DataType {
    public static void main(String[] args) {
        int value = DataType.dataTypeSize("Character");
        System.out.println(value);
    }

    static int dataTypeSize(String str) {
        switch (str) {
            case "Character":
                return 2;  // In Java, char is 2 bytes
            case "Integer":
                return 4;  // int is 4 bytes
            case "Long":
                return 8;  // long is 8 bytes
            case "Float":
                return 4;  // float is 4 bytes
            case "Double":
                return 8;  // double is 8 bytes
            default:
                return -1; // Invalid data type
        }
    }
}
