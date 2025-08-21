package sec01.exam04;

public class VariableScopeExample {
    public static void main(String[] args) {
        int v1 = 15;
        if(v1 > 10){
            int v2;
            v2 = v1 - 10;
        }
        int v3 = v1 + v2 + 5;
        // v2 이거 로컬이라 안되는거 테스트 한거임
        // 나중에 보고 "이거 뭐지" 금지
    }
}
