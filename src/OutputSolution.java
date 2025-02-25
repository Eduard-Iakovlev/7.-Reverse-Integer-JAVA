public class OutputSolution {
    private int example, x, expected, result;

    public OutputSolution() {}

    public void setOutputSolution(int example, int x, int expected) {
        this.example = example;
        this.x = x;
        this.expected = expected;
    }

    private void setResult() {
        this.result = new Solution().reverse(x);
    }

    public void printResult() {
        setResult();
        System.out.println("============ Тест " + example + " ============");
        System.out.println(" Заданное число x = " + x);
        System.out.println(" Ожидаемый результат = " + expected);
        System.out.println("============ Проверка ============");
        printСheck();
        System.out.println("==================================\n");
    }

    void printСheck() {
        if (CheckSolution.check(result, expected)) {
            System.out.println(" Результат = " + result + " - OK");
        } else {
            System.out.println(" Результат = " + result + " - FAIL");
        }
    }
}
