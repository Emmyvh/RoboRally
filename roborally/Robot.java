package roborally;

public class Robot {
    String name;
    int positionX;
    int positionY;
    String facing;
    int speed;

    public void initiateRobot(String n, int x, int y, String f) {
        name = n;
        positionX = x;
        positionY = y;
        facing = f;
    }

    public void display() {
        System.out.println(name + ": " + positionX + ", " + positionY + ", " + facing);
    }

    public void setSpeed(int robotSpeed) {
        speed = robotSpeed;
    }

    void turnLeft() {
        if (facing.equals("north")) {
            facing = facing.replace("north", "west");
            this.display();
        } else if (facing.equals("west")) {
            facing = facing.replace("west", "south");
            this.display();
        } else if (facing.equals("south")) {
            facing = facing.replace("south", "east");
            this.display();
        } else if (facing.equals("east")) {
            facing = facing.replace("east", "north");
            this.display();
        }
    }

    void turnRight() {
        if (facing.equals("north")) {
            facing = facing.replace("north", "east");
            this.display();
        } else if (facing.equals("east")) {
            facing = facing.replace("east", "south");
            this.display();
        } else if (facing.equals("south")) {
            facing = facing.replace("south", "west");
            this.display();
        } else if (facing.equals("west")) {
            facing = facing.replace("west", "north");
            this.display();
        }
    }

    void foreward() {
        if (facing.equals("north")) {
            positionY = positionY + speed;
            this.display();
        } else if (facing.equals("south")) {
            positionY = positionY - speed;
            this.display();
        } else if (facing.equals("east")) {
            positionX = positionX + speed;
            this.display();
        } else if (facing.equals("west")) {
            positionX = positionX - speed;
            this.display();
        }
    }

    void back() {
        if (facing.equals("north")) {
            positionY = positionY - speed;
            this.display();
        } else if (facing.equals("south")) {
            positionY = positionY + speed;
            this.display();
        } else if (facing.equals("east")) {
            positionX = positionX - speed;
            this.display();
        } else if (facing.equals("west")) {
            positionX = positionX + speed;
            this.display();
        }
    }
}
