import processing.core.PApplet;

public class fourBallOOPS extends PApplet {

//    global constants
    public static final int HEIGHT = 600;
    public static final int WIDTH = 600;
    public static final int BGCOLOR = 255;
    public static final int distanceDivisor = 6;
    public static final int NUMBER_OF_BALLS = 4;
    Ball[] arrOfBalls;

    public static void main(String[] args) {
        PApplet.main("fourBallOOPS",args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        arrOfBalls = new Ball[4];
        int i ;

//        instantiate all the balls from Ball class with proper parameter
        for (i=0;i<4;i++){
            arrOfBalls[i] = new Ball(i+1,i+1);
        }
    }

    @Override
    public void draw() {
//        uncomment following line to remove trails left by balls
//        getBackground();
        
        int i;
//        draws and moves 4 balls per frame/loop
        for (i=0; i< NUMBER_OF_BALLS; i++){
            arrOfBalls[i].drawBall();
            arrOfBalls[i].moveBall();
        }

    }

    private void getBackground() {
        background(BGCOLOR);
    }

    public class Ball {
        int distance;
        int speed;
        final int radius = 10;
        int displacementVector;

        Ball(int DISTANCE, int SPEED){
            distance = DISTANCE;
            speed = SPEED;
            displacementVector = 0;
        }

        public void drawBall(){
            ellipse(displacementVector,(HEIGHT*distance)/ distanceDivisor,radius,radius);
        }

        public void moveBall(){
            displacementVector += speed;
        }
    }

}

