public class containertask4 {
    public static void main(String[] args) {

        int numberofblocks = 90;
        int containermeasure = 8;

        int containersUnfilled = numberofblocks % containermeasure;
        System.out.println("The number of unfilled container will be " + containersUnfilled);

        int filledContainers = numberofblocks / containermeasure;
        System.out.printf("Number of filled containers :" + filledContainers);

        System.out.println("  ");
        int totalContainers = filledContainers + containersUnfilled;
        System.out.println("Number of containers in total are " + totalContainers);
    }
}
