package Homework7;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Factory firstFactory = new Factory();
        Factory secondFactory = new Factory();

        List<Robot> robots = new ArrayList<>();
        robots.add(new Robot("version1",firstFactory.creatingBody(1), secondFactory.creatingHead(1)));
        robots.add(new Robot("version2",firstFactory.creatingBody(1), secondFactory.creatingHead(2)));
        robots.add(new Robot("version3",firstFactory.creatingBody(1), secondFactory.creatingHead(3)));
        robots.add(new Robot("version4",firstFactory.creatingBody(2), secondFactory.creatingHead(1)));
        robots.add(new Robot("version5",firstFactory.creatingBody(2), secondFactory.creatingHead(2)));
        robots.add(new Robot("version6",firstFactory.creatingBody(2), secondFactory.creatingHead(3)));
        robots.add(new Robot("version7",firstFactory.creatingBody(3), secondFactory.creatingHead(1)));
        robots.add(new Robot("version8",firstFactory.creatingBody(3), secondFactory.creatingHead(2)));
        robots.add(new Robot("version9",firstFactory.creatingBody(3), secondFactory.creatingHead(3)));
        for (Robot robot: robots)
            System.out.println(robot);
    }
}
