package Homework7;

public enum Head {
    SQUARE_HEAD ("square head"),
    CIRCLE_HEAD ("circle head"),
    TRIANGLE_HEAD ("triangle head");

    private String head;

    Head(String head){
        this.head = head;
    }

    public String getHead() {
        return head;
    }
}
