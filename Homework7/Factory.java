package Homework7;

public class Factory {

    public Body creatingBody(int numberOfBody){
        return switch (numberOfBody){
            case 1 -> Body.CIRCLE_BODY;
            case 2 -> Body.SQUARE_BODY;
            case 3 -> Body.TRIANGLE_BODY;
            default -> null;
        };
    }

    public Head creatingHead(int numberOfHead){
        return switch (numberOfHead){
            case 1 -> Head.CIRCLE_HEAD;
            case 2 -> Head.SQUARE_HEAD;
            case 3 -> Head.TRIANGLE_HEAD;
            default -> null;
        };
    }
}
