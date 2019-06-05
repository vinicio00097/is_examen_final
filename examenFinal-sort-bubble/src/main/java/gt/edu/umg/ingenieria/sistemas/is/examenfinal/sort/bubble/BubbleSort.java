package gt.edu.umg.ingenieria.sistemas.is.examenfinal.sort.bubble;

public class BubbleSort {

    public static int[] sortBasic(int[] numbers) {
        if (numbers == null) {
            return null;
        }
        
        for (int i = 0; i < numbers.length; i++) {            
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int aux = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = aux;
                }
            }
        }
        
        return numbers;
    }
    
}
