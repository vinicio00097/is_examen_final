package gt.edu.umg.ingenieria.sistemas.is.examenfinal.pascal.triangle;

import java.util.Arrays;

public class PascalTriangle {

    public String build(int levels) {
        StringBuilder stringBuilder = new StringBuilder();
        
        if (levels <= 0) {            
            return Arrays.toString(new long[0]);
        }
        
        long[] previousLevel = new long[]{1};

        stringBuilder.append(Arrays.toString(previousLevel));
        stringBuilder.append(System.lineSeparator());
        
        for (int i = 2; i <= levels; i++) {            
            long[] newLevel = new long[previousLevel.length + 1];
            
            if (previousLevel.length < 2) {
                newLevel[0] = previousLevel[0];
                newLevel[1] = previousLevel[0];
            } else {
                newLevel[0] = previousLevel[0];
                
                for (int j = 1; j < previousLevel.length; j++) {
                    newLevel[j] = previousLevel[j-1] + previousLevel[j];
                }
                
                newLevel[newLevel.length - 1] = previousLevel[previousLevel.length - 1];
            }
                        
            stringBuilder.append(Arrays.toString(newLevel));
            stringBuilder.append(System.lineSeparator());
            
            previousLevel = newLevel;
        }
        
        return stringBuilder.toString();
    }
    
}
