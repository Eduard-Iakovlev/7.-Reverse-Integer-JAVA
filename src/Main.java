public class Main {
    public static void main(String[] args) {
        int example = 0;
        int x, expected;

        OutputSolution outputSolution = new OutputSolution();

        example++;
        x = 123;
        expected = 321;
        outputSolution.setOutputSolution(example, x, expected);
        outputSolution.printResult();

        example++;
        x = -123;
        expected = -321;
        outputSolution.setOutputSolution(example, x, expected);
        outputSolution.printResult();

        example++;
        x = 120;
        expected = 21;
        outputSolution.setOutputSolution(example, x, expected);
        outputSolution.printResult();

    }
}