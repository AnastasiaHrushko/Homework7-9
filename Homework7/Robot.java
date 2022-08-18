package Homework7;

public class Robot {

    private String name;
    Body body;
    Head head;
    Robot(String name, Body body, Head head){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "robot`s name is  " + name +
                ", robot consists of: " + body
                + ", "+ head + '}';
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
