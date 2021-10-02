import java.util.HashSet;
public class Distinct {
    public int solution(int[] A) {
        HashSet<Integer> zeki = new HashSet<>();
        if(A.length==0){
            return 0;
        }
        for(int a:A){
            zeki.add(a);
        }
        return  zeki.size();
    }
    public static void main(String[] args) {
        Distinct distinct = new Distinct();
        System.out.println(distinct.solution(new int[]{1,2,1,2,3}));
    }
}
