package sec01.exam05;

public class ValueScopeExample01 {
    public static void main(String[] args) {
        int v1 = 0;
        if(true){
            int v2 = 0;
            if(true){
                int v3 = 0;
                v1 = 1;
                v2 = 1;
                v3 = 1;
            }
            v1 = v2 + v2;
        }
        System.out.println(v1);
    }
}
