package Homework7;

public enum Body {
    SQUARE_BODY ("square body"),
    CIRCLE_BODY ("circle body"),
    TRIANGLE_BODY ("triangle body");

    private String body;

    Body(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}
